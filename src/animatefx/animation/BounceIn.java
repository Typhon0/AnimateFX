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
                        new KeyValue(node.opacityProperty(), 0,Interpolator.SPLINE(0.215,0.610,0.355,1.000)),
                        new KeyValue(node.scaleXProperty(), 0.3,Interpolator.SPLINE(0.215,0.610,0.355,1.000)),
                        new KeyValue(node.scaleYProperty(), 0.3, Interpolator.SPLINE(0.215,0.610,0.355,1.000))
                ),
                new KeyFrame(Duration.millis(200),
                        new KeyValue(node.scaleXProperty(), 1.1,Interpolator.SPLINE(0.215,0.610,0.355,1.000)),
                        new KeyValue(node.scaleYProperty(), 1.1,Interpolator.SPLINE(0.215,0.610,0.355,1.000))
                ),
                new KeyFrame(Duration.millis(400),
                        new KeyValue(node.scaleXProperty(), 0.9,Interpolator.SPLINE(0.215,0.610,0.355,1.000)),
                        new KeyValue(node.scaleYProperty(), 0.9,Interpolator.SPLINE(0.215,0.610,0.355,1.000))
                ),
                new KeyFrame(Duration.millis(600),
                        new KeyValue(node.opacityProperty(), 1,Interpolator.SPLINE(0.215,0.610,0.355,1.000)),
                        new KeyValue(node.scaleXProperty(), 1.03,Interpolator.SPLINE(0.215,0.610,0.355,1.000)),
                        new KeyValue(node.scaleYProperty(), 1.03,Interpolator.SPLINE(0.215,0.610,0.355,1.000))
                ),
                new KeyFrame(Duration.millis(800),
                        new KeyValue(node.scaleXProperty(), 0.97,Interpolator.SPLINE(0.215,0.610,0.355,1.000)),
                        new KeyValue(node.scaleYProperty(), 0.97,Interpolator.SPLINE(0.215,0.610,0.355,1.000))
                ),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(node.opacityProperty(), 1,Interpolator.SPLINE(0.215,0.610,0.355,1.000)),
                        new KeyValue(node.scaleXProperty(), 1,Interpolator.SPLINE(0.215,0.610,0.355,1.000)),
                        new KeyValue(node.scaleYProperty(), 1,Interpolator.SPLINE(0.215,0.610,0.355,1.000))
                )

        );

        t.play();

    }
}
