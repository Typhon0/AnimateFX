package animatefx.animation;


import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;


/**
 * @author Loïc Sculier
 */
public class RubberBand {

    /**
     * Create new RubberBand
     *
     * @param node The node to affect
     */
    public RubberBand(Node node) {
        RubberBand(node);
    }

    private void RubberBand(Node node) {

        Timeline t =
                new Timeline(
                        new KeyFrame(Duration.millis(0),
                                new KeyValue(node.scaleXProperty(), 1),
                                new KeyValue(node.scaleYProperty(), 1),
                                new KeyValue(node.scaleZProperty(), 1)
                        ),
                        new KeyFrame(Duration.millis(300),
                                new KeyValue(node.scaleXProperty(), 1.25),
                                new KeyValue(node.scaleYProperty(), 0.75),
                                new KeyValue(node.scaleZProperty(), 1)
                        ),
                        new KeyFrame(Duration.millis(400),
                                new KeyValue(node.scaleXProperty(), 0.75),
                                new KeyValue(node.scaleYProperty(), 1.25),
                                new KeyValue(node.scaleZProperty(), 1)
                        ),
                        new KeyFrame(Duration.millis(500),
                                new KeyValue(node.scaleXProperty(), 1.15),
                                new KeyValue(node.scaleYProperty(), 0.85),
                                new KeyValue(node.scaleZProperty(), 1)
                        ),
                        new KeyFrame(Duration.millis(650),
                                new KeyValue(node.scaleXProperty(), 0.95),
                                new KeyValue(node.scaleYProperty(), 1.05),
                                new KeyValue(node.scaleZProperty(), 1)
                        ),
                        new KeyFrame(Duration.millis(750),
                                new KeyValue(node.scaleXProperty(), 1.05),
                                new KeyValue(node.scaleYProperty(), 0.95),
                                new KeyValue(node.scaleZProperty(), 1)
                        ),
                        new KeyFrame(Duration.millis(1000),
                                new KeyValue(node.scaleXProperty(), 1),
                                new KeyValue(node.scaleYProperty(), 1),
                                new KeyValue(node.scaleZProperty(), 1)
                        )
                );
        t.play();
    }
}



