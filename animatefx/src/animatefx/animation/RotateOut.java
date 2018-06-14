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
public class RotateOut {

    /**
     * Create new RotateOut
     *
     * @param node The node to affect
     */
    public RotateOut(Node node) {
        RotateOut(node);
    }

    private void RotateOut(Node node) {
        node.setRotationAxis(Rotate.Z_AXIS);
        Timeline t =
                new Timeline(
                        new KeyFrame(Duration.millis(0),
                                new KeyValue(node.rotateProperty(), 0, AnimateFXInterpolator.EASE),
                                new KeyValue(node.opacityProperty(), 1, AnimateFXInterpolator.EASE)
                        ),
                        new KeyFrame(Duration.millis(1000),
                                new KeyValue(node.rotateProperty(), 200, AnimateFXInterpolator.EASE),
                                new KeyValue(node.opacityProperty(), 0, AnimateFXInterpolator.EASE)
                        )
                );
        t.play();
    }
}
