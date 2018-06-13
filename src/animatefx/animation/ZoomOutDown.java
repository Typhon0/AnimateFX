package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;


/**
 * @author Loïc Sculier
 */
public class ZoomOutDown {

    /**
     * Create new ZoomOutDown
     *
     * @param node The node to affect
     */
    public ZoomOutDown(Node node) {
        ZoomOutDown(node);
    }

    private void ZoomOutDown(Node node) {
        Timeline t =
                new Timeline(
                        new KeyFrame(Duration.millis(0),
                                new KeyValue(node.opacityProperty(), 1, AnimateFXInterpolator.EASE),
                                new KeyValue(node.translateYProperty(),0,AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleXProperty(), 1, AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleYProperty(), 1, AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleZProperty(), 1, AnimateFXInterpolator.EASE)

                        ),
                        new KeyFrame(Duration.millis(400),
                                new KeyValue(node.opacityProperty(), 1, AnimateFXInterpolator.EASE),
                                new KeyValue(node.translateYProperty(),-60,AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleXProperty(), 0.475, AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleYProperty(), 0.475, AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleZProperty(), 0.475, AnimateFXInterpolator.EASE)

                        ),
                        new KeyFrame(Duration.millis(1000),
                                new KeyValue(node.translateYProperty(),600,AnimateFXInterpolator.EASE),
                                new KeyValue(node.opacityProperty(), 0, AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleXProperty(), 0.1, AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleYProperty(), 0.1, AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleZProperty(), 0.1, AnimateFXInterpolator.EASE)
                                )
                );
        t.play();
    }
}

