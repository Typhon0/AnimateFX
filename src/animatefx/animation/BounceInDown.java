package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;

/**
 * @author Loïc Sculier
 */
public class BounceInDown {

    /**
     * Create new BounceInDown animation
     * @param node The node to affect
     */
    public BounceInDown(final Node node) {
        BounceInDown(node);
    }

    private void BounceInDown(Node node) {

        double startY = -node.localToScene(0, 0).getY() - node.getBoundsInParent().getHeight();
        Timeline t = new Timeline(

                new KeyFrame(Duration.millis(0),
                        new KeyValue(node.opacityProperty(), 0),
                        new KeyValue(node.translateYProperty(), startY)
                ),
                new KeyFrame(Duration.millis(300),
                        new KeyValue(node.opacityProperty(), 1),
                        new KeyValue(node.translateYProperty(), 25)
                ),
                new KeyFrame(Duration.millis(400),
                        new KeyValue(node.translateYProperty(), -10)
                ),
                new KeyFrame(Duration.millis(600),
                        new KeyValue(node.translateYProperty(), 5)
                ),
                new KeyFrame(Duration.millis(800),
                        new KeyValue(node.translateYProperty(), 0)
                )
        );
        t.play();

    }
}
