package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;


/**
 * @author Loïc Sculier
 */
public class ZoomIn {

    /**
     * Create new ZoomIn
     *
     * @param node The node to affect
     */
    public ZoomIn(Node node) {
        ZoomIn(node);
    }

    private void ZoomIn(Node node) {

        Timeline t =
                new Timeline(
                        new KeyFrame(Duration.millis(0),
                                new KeyValue(node.opacityProperty(), 0, AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleXProperty(), 0.3, AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleYProperty(), 0.3, AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleZProperty(), 0.3, AnimateFXInterpolator.EASE)

                        ),

                        new KeyFrame(Duration.millis(1000),
                                new KeyValue(node.opacityProperty(), 1, AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleXProperty(), 1, AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleYProperty(), 1, AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleZProperty(), 1, AnimateFXInterpolator.EASE)

                        )

                );
        t.play();
    }
}

