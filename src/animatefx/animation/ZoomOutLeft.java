package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;


/**
 * @author Loïc Sculier
 */
public class ZoomOutLeft {

    /**
     * Create new ZoomOutLeft
     *
     * @param node The node to affect
     */
    public ZoomOutLeft(Node node) {
        ZoomOutLeft(node);
    }

    private void ZoomOutLeft(Node node) {

        Timeline t =
                new Timeline(
                        new KeyFrame(Duration.millis(0),
                                new KeyValue(node.translateXProperty(),0,AnimateFXInterpolator.EASE),
                                new KeyValue(node.opacityProperty(), 1, AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleXProperty(), 1, AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleYProperty(), 1, AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleZProperty(), 1, AnimateFXInterpolator.EASE)

                        ),

                        new KeyFrame(Duration.millis(400),
                                new KeyValue(node.opacityProperty(), 1, AnimateFXInterpolator.EASE),
                                new KeyValue(node.translateXProperty(),42,AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleXProperty(), 0.475, AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleYProperty(), 0.475, AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleZProperty(), 0.475, AnimateFXInterpolator.EASE)

                        ),
                        new KeyFrame(Duration.millis(1100),
                                new KeyValue(node.translateXProperty(),-2000,AnimateFXInterpolator.EASE),
                                new KeyValue(node.opacityProperty(), 0, AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleXProperty(), 0.1, AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleYProperty(), 0.1, AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleZProperty(), 0.1, AnimateFXInterpolator.EASE)


                                )

                );
        t.play();
    }
}

