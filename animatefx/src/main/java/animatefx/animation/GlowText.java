package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.control.Labeled;
import javafx.scene.paint.Paint;
import javafx.util.Duration;

/**
 * Makes text glow alternating between two colors
 *
 * @author ced04u
 */
public class GlowText extends AnimationFX {

    private Paint originalPaint;
    private Paint colorA;
    private Paint colorB;

    public GlowText(Labeled node, Paint colorA, Paint colorB) {
        this.colorA = colorA;
        this.colorB = colorB;
        setNode(node);
    }

    public GlowText(Paint originalPaint, Paint colorA, Paint colorB) {
        this.originalPaint = originalPaint;
        this.colorA = colorA;
        this.colorB = colorB;
    }

    public Paint getColorA() {
        return colorA;
    }

    public GlowText setColorA(Paint colorA) {
        this.colorA = colorA;
        if (getNode() != null) {
            initTimeline();
        }
        return this;
    }

    public Paint getColorB() {
        return colorB;
    }

    public GlowText setColorB(Paint colorB) {
        this.colorB = colorB;
        if (getNode() != null) {
            initTimeline();
        }
        return this;
    }

    @Override
    public Labeled getNode() {
        return (Labeled) super.getNode();
    }

    @Override
    protected AnimationFX resetNode() {
        getNode().setTextFill(originalPaint);
        return this;
    }

    @Override
    protected void initTimeline() {
        Timeline timeline = new Timeline();
        setTimeline(timeline);
        if (getNode() == null || colorA == null || colorB == null) {
            return;
        }

        if (originalPaint == null) {
            originalPaint = getNode().textFillProperty().get();
        }

        timeline.getKeyFrames().addAll(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(getNode().textFillProperty(), colorA)),
                new KeyFrame(Duration.millis(500),
                        new KeyValue(getNode().textFillProperty(), colorB)),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(getNode().textFillProperty(), colorA))
        );
    }

}
