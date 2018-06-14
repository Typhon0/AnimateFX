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
public class Flip {

    /**
     * Create new Flip
     *
     * @param node The node to affect
     */
    public Flip(Node node) {
        Flip(node);
    }

    private void Flip(Node node) {
        node.getScene().setCamera(new PerspectiveCamera());
        node.setRotationAxis(Y_AXIS);
        Timeline t =
                new Timeline(

                        new KeyFrame(Duration.millis(0),
                                new KeyValue(node.rotateProperty(), 360, Interpolator.EASE_OUT)

                        ),
                        new KeyFrame(Duration.millis(400),
                                new KeyValue(node.rotateProperty(), 190, Interpolator.EASE_OUT),
                                new KeyValue(node.translateZProperty(), -150, Interpolator.EASE_OUT)

                        ),
                        new KeyFrame(Duration.millis(500),
                                new KeyValue(node.rotateProperty(), 170, Interpolator.EASE_IN),
                                new KeyValue(node.translateZProperty(), -150, Interpolator.EASE_IN)


                        ),
                        new KeyFrame(Duration.millis(800),
                                new KeyValue(node.scaleXProperty(), 0.95, Interpolator.EASE_IN),
                                new KeyValue(node.scaleYProperty(), 0.95, Interpolator.EASE_IN),
                                new KeyValue(node.scaleZProperty(), 0.95, Interpolator.EASE_IN)

                        ),
                        new KeyFrame(Duration.millis(1000),
                                new KeyValue(node.rotateProperty(), 0, Interpolator.EASE_IN),
                                new KeyValue(node.scaleXProperty(), 1, Interpolator.EASE_IN),
                                new KeyValue(node.scaleYProperty(), 1, Interpolator.EASE_IN),
                                new KeyValue(node.scaleZProperty(), 1, Interpolator.EASE_IN),
                                new KeyValue(node.translateZProperty(), 0, Interpolator.EASE_IN)

                        )

                );
        t.play();
        t.setOnFinished(event -> node.getScene().setCamera(new ParallelCamera()));
    }

}

