package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

/**
 * @author Loïc Sculier
 */
public class Tada {

    /**
     * Create new Swing
     *
     * @param node The node to affect
     */
    public Tada(Node node) {
        Swing(node);
    }

    private void Swing(Node node) {
        node.setRotationAxis(Rotate.Z_AXIS);
        Timeline t =
                new Timeline(
                        new KeyFrame(Duration.millis(0),
                                new KeyValue(node.scaleXProperty(), 1,AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleYProperty(), 1,AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleZProperty(), 1,AnimateFXInterpolator.EASE),
                                new KeyValue(node.rotateProperty(), 0,AnimateFXInterpolator.EASE)

                        ),
                        new KeyFrame(Duration.millis(100),
                                new KeyValue(node.scaleXProperty(), 0.9,AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleYProperty(), 0.9,AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleZProperty(), 0.9,AnimateFXInterpolator.EASE),
                                new KeyValue(node.rotateProperty(), -3,AnimateFXInterpolator.EASE)
                        ),
                        new KeyFrame(Duration.millis(200),
                                new KeyValue(node.scaleXProperty(), 0.9,AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleYProperty(), 0.9,AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleZProperty(), 0.9,AnimateFXInterpolator.EASE),
                                new KeyValue(node.rotateProperty(), -3,AnimateFXInterpolator.EASE)
                        ),
                        new KeyFrame(Duration.millis(300),
                                new KeyValue(node.scaleXProperty(), 1.1,AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleYProperty(), 1.1,AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleZProperty(), 1.1,AnimateFXInterpolator.EASE),
                                new KeyValue(node.rotateProperty(), 3,AnimateFXInterpolator.EASE)
                        ),
                        new KeyFrame(Duration.millis(400),
                                new KeyValue(node.scaleXProperty(), 1.1,AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleYProperty(), 1.1,AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleZProperty(), 1.1,AnimateFXInterpolator.EASE),
                                new KeyValue(node.rotateProperty(), -3,AnimateFXInterpolator.EASE)
                        ),
                        new KeyFrame(Duration.millis(500),
                                new KeyValue(node.scaleXProperty(), 1.1,AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleYProperty(), 1.1,AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleZProperty(), 1.1,AnimateFXInterpolator.EASE),
                                new KeyValue(node.rotateProperty(), 3,AnimateFXInterpolator.EASE)
                        ),
                        new KeyFrame(Duration.millis(600),
                                new KeyValue(node.scaleXProperty(), 1.1,AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleYProperty(), 1.1,AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleZProperty(), 1.1,AnimateFXInterpolator.EASE),
                                new KeyValue(node.rotateProperty(), -3,AnimateFXInterpolator.EASE)
                        ),
                        new KeyFrame(Duration.millis(700),
                                new KeyValue(node.scaleXProperty(), 1.1,AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleYProperty(), 1.1,AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleZProperty(), 1.1,AnimateFXInterpolator.EASE),
                                new KeyValue(node.rotateProperty(), 3,AnimateFXInterpolator.EASE)
                        ),
                        new KeyFrame(Duration.millis(800),
                                new KeyValue(node.scaleXProperty(), 1.1,AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleYProperty(), 1.1,AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleZProperty(), 1.1,AnimateFXInterpolator.EASE),
                                new KeyValue(node.rotateProperty(), -3,AnimateFXInterpolator.EASE)
                        ),
                        new KeyFrame(Duration.millis(900),
                                new KeyValue(node.scaleXProperty(), 1.1,AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleYProperty(), 1.1,AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleZProperty(), 1.1,AnimateFXInterpolator.EASE),
                                new KeyValue(node.rotateProperty(), 3,AnimateFXInterpolator.EASE)
                        ),
                        new KeyFrame(Duration.millis(1000),
                                new KeyValue(node.scaleXProperty(), 1,AnimateFXInterpolator.EASE),
                                new KeyValue(node.rotateProperty(), 0,AnimateFXInterpolator.EASE)
                        )
                );
        t.play();
    }
}

