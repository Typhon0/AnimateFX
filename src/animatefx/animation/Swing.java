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
public class Swing {

    /**
     * Create new Swing
     *
     * @param node The node to affect
     */
    public Swing(Node node) {
        Swing(node);
    }

    private void Swing(Node node) {
        Rotate rotation = new Rotate();
        rotation.setPivotX(node.getLayoutBounds().getWidth() / 2.0);
        rotation.setPivotY(-node.getLayoutBounds().getHeight());
        node.getTransforms().add(rotation);

        Timeline t =
                new Timeline(
                        new KeyFrame(Duration.millis(0),
                                new KeyValue(rotation.angleProperty(), 0)
                        ),
                        new KeyFrame(Duration.millis(200),
                                new KeyValue(rotation.angleProperty(), 15)
                        ),
                        new KeyFrame(Duration.millis(400),
                                new KeyValue(rotation.angleProperty(), -10)
                        ),
                        new KeyFrame(Duration.millis(600),
                                new KeyValue(rotation.angleProperty(), 5)
                        ),
                        new KeyFrame(Duration.millis(800),
                                new KeyValue(rotation.angleProperty(), -5)
                        ),
                        new KeyFrame(Duration.millis(1000),
                                new KeyValue(rotation.angleProperty(), 0)
                        )
                );
        t.play();
    }
}

