package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.scene.ParallelCamera;
import javafx.scene.PerspectiveCamera;
import javafx.util.Duration;

import static javafx.scene.transform.Rotate.X_AXIS;


/**
 * @author Loïc Sculier aka typhon0
 */
public class FlipOutX {

    /**
     * Create new FlipOutX
     *
     * @param node The node to affect
     */
    public FlipOutX(Node node) {
        FlipOutX(node);
    }

    private void FlipOutX(Node node) {
        node.getScene().setCamera(new PerspectiveCamera());
        node.setRotationAxis(X_AXIS);
        Timeline t =
                new Timeline(

                        new KeyFrame(Duration.millis(0),
                                new KeyValue(node.opacityProperty(), 1, AnimateFXInterpolator.EASE)
                        ),
                        new KeyFrame(Duration.millis(225),
                                new KeyValue(node.rotateProperty(), 20, AnimateFXInterpolator.EASE)

                        ),
                        new KeyFrame(Duration.millis(750),
                                new KeyValue(node.opacityProperty(), 0, AnimateFXInterpolator.EASE),
                                new KeyValue(node.rotateProperty(), -90, AnimateFXInterpolator.EASE)
                        )

                );
        t.play();
        t.setOnFinished(event -> node.getScene().setCamera(new ParallelCamera()));
    }

}

