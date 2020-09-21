package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

/**
 * @author Loïc Sculier aka typhon0
 */
public class RotateInUpLeft extends AnimationFX {

    /**
     * Create new RotateInDownLeft
     *
     * @param node The node to affect
     */
    public RotateInUpLeft(Node node) {
        super(node);
    }

    public RotateInUpLeft() {
    }

    private Rotate rotate;

    @Override
    AnimationFX resetNode() {
        rotate.setAngle(0);
        getNode().setOpacity(1);
        return this;
    }

    @Override
    void initTimeline() {
        getNode().setRotationAxis(Rotate.Z_AXIS);
        rotate = new Rotate(0, 0, getNode().getBoundsInLocal().getHeight());
        getNode().getTransforms().add(rotate);
        setTimeline(new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(rotate.angleProperty(), 45, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().opacityProperty(), 0, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(rotate.angleProperty(), 0, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().opacityProperty(), 1, AnimateFXInterpolator.EASE)
                )
        ));
    }

}
