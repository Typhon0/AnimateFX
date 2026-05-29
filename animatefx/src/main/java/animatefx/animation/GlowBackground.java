package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.util.Duration;

/**
 * Makes the node's background "glow" alternating between two colors.
 * If the node has a {@link Background}, then the {@link CornerRadii} and {@link Insets}
 * of the last of its {@link BackgroundFill}s are used for the glowing background
 *
 * @author negste
 */
public class GlowBackground extends AnimationFX {

    private Background originalBackground;
    private CornerRadii originalRadii;
    private Insets originalInsets;
    private Color colorA;
    private Color colorB;
    private int colorSteps;

    /**
     * Constructs the animation
     *
     * @param node       the node to animate
     * @param colorA     the color to start with
     * @param colorB     the other color
     * @param colorSteps how many interpolations between the two colors
     */
    public GlowBackground(Region node, Color colorA, Color colorB, int colorSteps) {
        this.colorA = colorA;
        this.colorB = colorB;
        this.colorSteps = colorSteps;
        setNode(node);
    }

    public GlowBackground(Background originalBackground) {
        this.originalBackground = originalBackground;
    }

    public Color getColorA() {
        return colorA;
    }

    public GlowBackground setColorA(Color colorA) {
        this.colorA = colorA;
        if (getNode() != null) {
            initTimeline();
        }
        return this;
    }

    public Color getColorB() {
        return colorB;
    }

    public GlowBackground setColorB(Color colorB) {
        this.colorB = colorB;
        if (getNode() != null) {
            initTimeline();
        }
        return this;
    }

    public int getColorSteps() {
        return colorSteps;
    }

    public GlowBackground setColorSteps(int colorSteps) {
        this.colorSteps = colorSteps;
        if (getNode() != null) {
            initTimeline();
        }
        return this;
    }

    @Override
    public Region getNode() {
        return (Region) super.getNode();
    }

    @Override
    protected AnimationFX resetNode() {
        getNode().setBackground(originalBackground);
        return this;
    }

    @Override
    protected void initTimeline() {
        Timeline timeline = new Timeline();
        setTimeline(timeline);
        if (getNode() == null || colorA == null || colorB == null || colorSteps <= 0) {
            return;
        }

        Background currentBackground = getNode().backgroundProperty().get();
        if (originalBackground == null) {
            originalBackground = currentBackground;
        }

        Background bgToParse = originalBackground != null ? originalBackground : currentBackground;
        if (bgToParse != null && !bgToParse.getFills().isEmpty()) {
            BackgroundFill lastFill = bgToParse.getFills().get(bgToParse.getFills().size() - 1);
            originalRadii = lastFill.getRadii();
            originalInsets = lastFill.getInsets();
        } else {
            originalRadii = CornerRadii.EMPTY;
            originalInsets = Insets.EMPTY;
        }

        int totalFrames = colorSteps * 2;
        double millisPerFrame = 1000.0 / totalFrames;
        for (int i = 0; i < totalFrames; i++) {
            Color color;
            double frac = i * 2.0 / totalFrames;
            Duration dur = Duration.millis(i * millisPerFrame);
            if (i <= colorSteps) {
                color = colorA.interpolate(colorB, frac);
            } else {
                color = colorB.interpolate(colorA, frac - 1);
            }
            timeline.getKeyFrames().add(
                    new KeyFrame(dur,
                            new KeyValue(getNode().backgroundProperty(),
                                    new Background(new BackgroundFill(color, originalRadii, originalInsets)))));
        }
    }

}
