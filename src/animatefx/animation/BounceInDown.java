package animatefx.animation;

import javafx.animation.Interpolator;
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

        Timeline t = new Timeline(

                new KeyFrame(Duration.millis(0),
                        new KeyValue(node.opacityProperty(), 0, Interpolator.SPLINE(0.215,0.610,0.355,1.000)),
                        new KeyValue(node.translateYProperty(), -3000,Interpolator.SPLINE(0.215,0.610,0.355,1.000))
                ),
                new KeyFrame(Duration.millis(600),
                        new KeyValue(node.opacityProperty(), 1,Interpolator.SPLINE(0.215,0.610,0.355,1.000)),
                        new KeyValue(node.translateYProperty(), 25,Interpolator.SPLINE(0.215,0.610,0.355,1.000))
                ),
                new KeyFrame(Duration.millis(750),
                        new KeyValue(node.translateYProperty(), -10,Interpolator.SPLINE(0.215,0.610,0.355,1.000))
                ),
                new KeyFrame(Duration.millis(900),
                        new KeyValue(node.translateYProperty(), 5,Interpolator.SPLINE(0.215,0.610,0.355,1.000))
                ),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(node.translateYProperty(), 0,Interpolator.SPLINE(0.215,0.610,0.355,1.000))
                )
        );
        t.play();

    }
}
