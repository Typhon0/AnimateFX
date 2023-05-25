package animatefx.animation.partial;

import animatefx.animation.AnimateFXInterpolator;
import animatefx.animation.AnimationFX;
import animatefx.animation.ScaleAnimation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;

/**
 * Can be used in combination with Expand,
 * to bring the Node back to the original scale.
 *
 * @author Dominik Müka aka 41zu
 */
public class Contract extends ScaleAnimation {

    /**
     * Contracts the Node by an defined scale.<br>
     * The default values are:<br>
     * beginScale = 1.05<br>
     * endScale = 1.0
     *
     * @param node Node which should be contracted
     */
    public Contract(Node node) {
        super(node);
    }

    /**
     * resets the Node to the beginScale value
     */
    @Override
    protected AnimationFX resetNode() {
        getNode().setScaleX(beginScale);
        getNode().setScaleY(beginScale);
        getNode().setScaleZ(beginScale);
        return this;
    }

    @Override
    protected void initTimeline() {
        Double beginScale = this.beginScale;
        Double endScale = this.endScale;

        if (beginScale == null)
            beginScale = 1.05;

        if (endScale == null)
            endScale = 1.0;

        setTimeline(new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(getNode().scaleXProperty(), beginScale, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleYProperty(), beginScale, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleZProperty(), beginScale, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(500),
                        new KeyValue(getNode().scaleXProperty(), endScale, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleYProperty(), endScale, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleZProperty(), endScale, AnimateFXInterpolator.EASE)
                )
        ));
    }
}
