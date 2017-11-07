package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;

/**
 * @author Loïc Sculier
 */
public class BounceIn {

    /**
     * Create new BounceIn
     *
     * @param node The node to affect
     */
    public BounceIn(Node node){
    BounceIn(node);
    }

    private void BounceIn(Node node){
        Timeline t = new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(node.opacityProperty(), 0),
                        new KeyValue(node.scaleXProperty(), 0.3),
                        new KeyValue(node.scaleYProperty(), 0.3)
                ),
                new KeyFrame(Duration.millis(150),
                        new KeyValue(node.scaleXProperty(), 1.1),
                        new KeyValue(node.scaleYProperty(), 1.1)
                ),
                new KeyFrame(Duration.millis(300),
                        new KeyValue(node.scaleXProperty(), 0.9),
                        new KeyValue(node.scaleYProperty(), 0.9)
                ),
                new KeyFrame(Duration.millis(450),
                        new KeyValue(node.opacityProperty(), 1),
                        new KeyValue(node.scaleXProperty(), 1.03),
                        new KeyValue(node.scaleYProperty(), 1.03)
                ),
                new KeyFrame(Duration.millis(600),
                        new KeyValue(node.scaleXProperty(), 0.97),
                        new KeyValue(node.scaleYProperty(), 0.97)
                ),
                new KeyFrame(Duration.millis(750),
                        new KeyValue(node.opacityProperty(), 1),
                        new KeyValue(node.scaleXProperty(), 1),
                        new KeyValue(node.scaleYProperty(), 1)
                )

        );

        t.play();
    }
}
