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

    private final Paint originalPaint;
    private final Paint colorA;
    private final Paint colorB;

    public GlowText(Labeled node, Paint colorA, Paint colorB) {
        super(node);
        this.originalPaint = getNode().textFillProperty().get();
        this.colorA = colorA;
        this.colorB = colorB;
        getTimeline().getKeyFrames().addAll(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(getNode().textFillProperty(), colorA)),
                new KeyFrame(Duration.millis(500),
                        new KeyValue(getNode().textFillProperty(), colorB)),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(getNode().textFillProperty(), colorA))
        );
    }

    public GlowText(Paint originalPaint, Paint colorA, Paint colorB) {
        this.originalPaint = originalPaint;
        this.colorA = colorA;
        this.colorB = colorB;
    }

    @Override
    public Labeled getNode() {
        return (Labeled) super.getNode();
    }

    @Override
    AnimationFX resetNode() {
        getNode().setTextFill(originalPaint);
        return this;
    }

    @Override
    void initTimeline() {
        setTimeline(new Timeline()); //will be populated at the end of constructor
    }

}
