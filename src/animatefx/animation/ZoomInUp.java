package animatefx.animation;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;


/**
 * @author Loïc Sculier aka typhon0
 */
public class ZoomInUp {

    /**
     * Create new ZoomInUp
     *
     * @param node The node to affect
     */
    public ZoomInUp(Node node) {
        ZoomInUp(node);
    }

    private void ZoomInUp(Node node) {
        Timeline t =
                new Timeline(
                        new KeyFrame(Duration.millis(0),
                                new KeyValue(node.opacityProperty(), 1, Interpolator.SPLINE(0.55, 0.055, 0.675, 0.19)),
                                new KeyValue(node.translateYProperty(), 0, Interpolator.SPLINE(0.55, 0.055, 0.675, 0.19)),
                                new KeyValue(node.scaleXProperty(), 1, Interpolator.SPLINE(0.55, 0.055, 0.675, 0.19)),
                                new KeyValue(node.scaleYProperty(), 1, Interpolator.SPLINE(0.55, 0.055, 0.675, 0.19)),
                                new KeyValue(node.scaleZProperty(), 1, Interpolator.SPLINE(0.55, 0.055, 0.675, 0.19))

                        ),
                        new KeyFrame(Duration.millis(400),
                                new KeyValue(node.opacityProperty(), 1, Interpolator.SPLINE(0.175, 0.885, 0.32, 1)),
                                new KeyValue(node.translateYProperty(), 60, Interpolator.SPLINE(0.175, 0.885, 0.32, 1)),
                                new KeyValue(node.scaleXProperty(), 0.475, Interpolator.SPLINE(0.175, 0.885, 0.32, 1)),
                                new KeyValue(node.scaleYProperty(), 0.475, Interpolator.SPLINE(0.175, 0.885, 0.32, 1)),
                                new KeyValue(node.scaleZProperty(), 0.475, Interpolator.SPLINE(0.175, 0.885, 0.32, 1))

                        ),
                        new KeyFrame(Duration.millis(1000),
                                new KeyValue(node.translateYProperty(), -600, Interpolator.SPLINE(0.55, 0.055, 0.675, 0.19)),
                                new KeyValue(node.opacityProperty(), 0, Interpolator.SPLINE(0.55, 0.055, 0.675, 0.19)),
                                new KeyValue(node.scaleXProperty(), 0.1, Interpolator.SPLINE(0.55, 0.055, 0.675, 0.19)),
                                new KeyValue(node.scaleYProperty(), 0.1, Interpolator.SPLINE(0.55, 0.055, 0.675, 0.19)),
                                new KeyValue(node.scaleZProperty(), 0.1, Interpolator.SPLINE(0.55, 0.055, 0.675, 0.19))
                        )
                );
        t.play();
    }
}

