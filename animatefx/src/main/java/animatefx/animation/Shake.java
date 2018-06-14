package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;


/**
 * @author Loïc Sculier
 */
public class Shake {

    /**
     * Create new Shake
     *
     * @param node The node to affect
     */
    public Shake(Node node) {
        Shake(node);
    }

    private void Shake(Node node) {
        Timeline t =
                new Timeline(
                        new KeyFrame(Duration.millis(0),
                                new KeyValue(node.translateXProperty(), 0,AnimateFXInterpolator.EASE)
                        ),
                        new KeyFrame(Duration.millis(100),
                                new KeyValue(node.translateXProperty(), -10,AnimateFXInterpolator.EASE)
                        ),
                        new KeyFrame(Duration.millis(200),
                                new KeyValue(node.translateXProperty(), 10,AnimateFXInterpolator.EASE)
                        ),
                        new KeyFrame(Duration.millis(300),
                                new KeyValue(node.translateXProperty(), -10,AnimateFXInterpolator.EASE)
                        ),
                        new KeyFrame(Duration.millis(400),
                                new KeyValue(node.translateXProperty(), 10,AnimateFXInterpolator.EASE)
                        ),
                        new KeyFrame(Duration.millis(500),
                                new KeyValue(node.translateXProperty(), -10,AnimateFXInterpolator.EASE)
                        ),
                        new KeyFrame(Duration.millis(600),
                                new KeyValue(node.translateXProperty(), 10,AnimateFXInterpolator.EASE)
                        ),
                        new KeyFrame(Duration.millis(700),
                                new KeyValue(node.translateXProperty(), -10,AnimateFXInterpolator.EASE)
                        ),
                        new KeyFrame(Duration.millis(800),
                                new KeyValue(node.translateXProperty(), 10,AnimateFXInterpolator.EASE)
                        ),

                        new KeyFrame(Duration.millis(900),
                                new KeyValue(node.translateXProperty(), -10,AnimateFXInterpolator.EASE)
                        ),

                        new KeyFrame(Duration.millis(1000),
                                new KeyValue(node.translateXProperty(), 0,AnimateFXInterpolator.EASE)
                        )
                );
        t.play();
    }
}



