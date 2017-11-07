package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;

/**
 * @author Loïc Sculier
 */
public class Wobble {

    /**
     * Create new Wobble
     *
     * @param node The node to affect
     */
    public Wobble(Node node){
        Wobble(node);
    }

    private void Wobble(Node node){
        Timeline t = new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(node.translateXProperty(), 0),
                        new KeyValue(node.rotateProperty(), -0)
                ),
                new KeyFrame(Duration.millis(100),
                        new KeyValue(node.translateXProperty(), -0.25*node.getBoundsInParent().getWidth()),
                        new KeyValue(node.rotateProperty(), -5)
                ),
                new KeyFrame(Duration.millis(250),
                        new KeyValue(node.translateXProperty(), 0.2*node.getBoundsInParent().getWidth()),
                        new KeyValue(node.rotateProperty(), 3)
                ),
                new KeyFrame(Duration.millis(400),
                        new KeyValue(node.translateXProperty(), -0.15*node.getBoundsInParent().getWidth()),
                        new KeyValue(node.rotateProperty(), -3)
                ),
                new KeyFrame(Duration.millis(550),
                        new KeyValue(node.translateXProperty(), 0.1*node.getBoundsInParent().getWidth()),
                        new KeyValue(node.rotateProperty(), 2)
                ),
                new KeyFrame(Duration.millis(700),
                        new KeyValue(node.translateXProperty(), -0.05*node.getBoundsInParent().getWidth()),
                        new KeyValue(node.rotateProperty(), -1)
                ),
                new KeyFrame(Duration.millis(950),
                        new KeyValue(node.translateXProperty(), 0),
                        new KeyValue(node.rotateProperty(), 0)
                )

        );

        t.play();
    }
}
