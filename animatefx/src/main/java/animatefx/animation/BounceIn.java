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
public class BounceIn extends AnimationFX {


    /**
     * Create new BounceIn
     *
     * @param node The node to affect
     */
    public BounceIn(Node node) {
        super(node);

    }

    public BounceIn() {
        super();
    }

    @Override
    AnimationFX resetNode() {
        getNode().setOpacity(1);
        getNode().setScaleX(1);
        getNode().setScaleY(1);
        return this;
    }

    @Override
    void initTimeline() {
        setTimeline(new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(getNode().opacityProperty(), 0, Interpolator.SPLINE(0.215, 0.610, 0.355, 1.000)),
                        new KeyValue(getNode().scaleXProperty(), 0.3, Interpolator.SPLINE(0.215, 0.610, 0.355, 1.000)),
                        new KeyValue(getNode().scaleYProperty(), 0.3, Interpolator.SPLINE(0.215, 0.610, 0.355, 1.000))
                ),
                new KeyFrame(Duration.millis(200),
                        new KeyValue(getNode().scaleXProperty(), 1.1, Interpolator.SPLINE(0.215, 0.610, 0.355, 1.000)),
                        new KeyValue(getNode().scaleYProperty(), 1.1, Interpolator.SPLINE(0.215, 0.610, 0.355, 1.000))
                ),
                new KeyFrame(Duration.millis(400),
                        new KeyValue(getNode().scaleXProperty(), 0.9, Interpolator.SPLINE(0.215, 0.610, 0.355, 1.000)),
                        new KeyValue(getNode().scaleYProperty(), 0.9, Interpolator.SPLINE(0.215, 0.610, 0.355, 1.000))
                ),
                new KeyFrame(Duration.millis(600),
                        new KeyValue(getNode().opacityProperty(), 1, Interpolator.SPLINE(0.215, 0.610, 0.355, 1.000)),
                        new KeyValue(getNode().scaleXProperty(), 1.03, Interpolator.SPLINE(0.215, 0.610, 0.355, 1.000)),
                        new KeyValue(getNode().scaleYProperty(), 1.03, Interpolator.SPLINE(0.215, 0.610, 0.355, 1.000))
                ),
                new KeyFrame(Duration.millis(800),
                        new KeyValue(getNode().scaleXProperty(), 0.97, Interpolator.SPLINE(0.215, 0.610, 0.355, 1.000)),
                        new KeyValue(getNode().scaleYProperty(), 0.97, Interpolator.SPLINE(0.215, 0.610, 0.355, 1.000))
                ),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(getNode().opacityProperty(), 1, Interpolator.SPLINE(0.215, 0.610, 0.355, 1.000)),
                        new KeyValue(getNode().scaleXProperty(), 1, Interpolator.SPLINE(0.215, 0.610, 0.355, 1.000)),
                        new KeyValue(getNode().scaleYProperty(), 1, Interpolator.SPLINE(0.215, 0.610, 0.355, 1.000))
                )

        ));

    }
}
