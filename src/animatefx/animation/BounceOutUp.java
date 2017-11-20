package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;

/**
 * @author Loïc Sculier
 */
public class BounceOutUp {

    /**
     * Create new BounceOutUp animation
     *
     * @param node The node to affect
     */
    public BounceOutUp(final Node node) {
        BounceOutUp(node);
    }


    private static void BounceOutUp(Node node) {
        double endY = -node.localToScene(0, 0).getY() -node.getBoundsInParent().getHeight();
        Timeline t = new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(node.opacityProperty(), 1)
                ),
                new KeyFrame(Duration.millis(200),
                        new KeyValue(node.translateYProperty(), -10)
                ),
                new KeyFrame(Duration.millis(400),
                        new KeyValue(node.opacityProperty(), 1),
                        new KeyValue(node.translateYProperty(), 20)
                ),
                new KeyFrame(Duration.millis(550),
                        new KeyValue(node.opacityProperty(), 0),
                        new KeyValue(node.translateYProperty(), endY)
                )

        );

        t.play();
    }

}
