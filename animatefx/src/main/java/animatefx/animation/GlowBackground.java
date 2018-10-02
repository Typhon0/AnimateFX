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
 * Makes the node's background "glow" alternating between two colors
 *
 * @author negste
 */
public class GlowBackground extends AnimationFX {

    private final Background originalBackground;

    /**
     * Constructs the animation
     *
     * @param node the node to animate
     * @param colorA the color to start with
     * @param colorB the other color
     * @param colorSteps how many interpolations between the two colors
     */
    public GlowBackground(Region node, Color colorA, Color colorB, int colorSteps) {
        super(node);
        this.originalBackground = getNode().backgroundProperty().get();
        
        int totalFrames = colorSteps * 2;
        double millisPerFrame = 1000 / totalFrames;
        for (int i = 0; i < totalFrames; i++) {
            Color color;
            double frac = i * 2.0 / totalFrames;
            Duration dur = Duration.millis(i * millisPerFrame);
            if (i <= colorSteps) {
                color = colorA.interpolate(colorB, frac);
            } else {
                color = colorB.interpolate(colorA, frac - 1);
            }
            getTimeline().getKeyFrames().add(
                    new KeyFrame(dur,
                            new KeyValue(getNode().backgroundProperty(),
                                    new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)))));
        }

    }

    @Override
    public Region getNode() {
        return (Region) super.getNode();
    }

    @Override
    AnimationFX resetNode() {
        getNode().setBackground(originalBackground);
        return this;
    }

    @Override
    void initTimeline() {
        setTimeline(new Timeline()); //will be populated at the end of constructor
    }

}
