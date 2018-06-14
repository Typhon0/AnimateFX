package animatefx.animation;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.scene.ParallelCamera;
import javafx.scene.PerspectiveCamera;
import javafx.util.Duration;

import static javafx.scene.transform.Rotate.Y_AXIS;


/**
 * @author Loïc Sculier aka typhon0
 */
public class FlipInY {

    /**
     * Create new FlipInY
     *
     * @param node The node to affect
     */
    public FlipInY(Node node) {
        FlipInY(node);
    }

    private void FlipInY(Node node) {
        node.getScene().setCamera(new PerspectiveCamera());
        node.setRotationAxis(Y_AXIS);
        Timeline t =
                new Timeline(

                        new KeyFrame(Duration.millis(0),
                                new KeyValue(node.opacityProperty(), 0, Interpolator.EASE_IN),
                                new KeyValue(node.rotateProperty(), -90, Interpolator.EASE_IN)

                        ),
                        new KeyFrame(Duration.millis(400),
                                new KeyValue(node.rotateProperty(), 20, Interpolator.EASE_IN)

                        ),
                        new KeyFrame(Duration.millis(600),
                                new KeyValue(node.rotateProperty(), -10, Interpolator.EASE_IN)

                        ),
                        new KeyFrame(Duration.millis(800),
                                new KeyValue(node.rotateProperty(), 5, Interpolator.EASE_IN)
                        ),
                        new KeyFrame(Duration.millis(1000),
                                new KeyValue(node.opacityProperty(), 1, Interpolator.EASE_IN),
                                new KeyValue(node.rotateProperty(), 0, Interpolator.EASE_IN)
                        )

                );
        t.play();
        t.setOnFinished(event -> node.getScene().setCamera(new ParallelCamera()));
    }

}

