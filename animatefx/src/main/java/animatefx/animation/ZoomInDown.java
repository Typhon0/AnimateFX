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
public class ZoomInDown extends AnimationFX {

    /**
     * Create new ZoomInDown
     *
     * @param node The node to affect
     */
    public ZoomInDown(Node node) {
        super(node);
    }

    public ZoomInDown() {
    }

    @Override
    AnimationFX resetNode() {
        getNode().setOpacity(1);
        getNode().setScaleX(1);
        getNode().setScaleY(1);
        getNode().setScaleZ(1);
        getNode().setTranslateY(0);
        return this;
    }

    @Override
    void initTimeline() {
        setTimeline(new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(getNode().opacityProperty(), 0, Interpolator.SPLINE(0.55, 0.055, 0.675, 0.19)),
                        new KeyValue(getNode().translateYProperty(), -600, Interpolator.SPLINE(0.55, 0.055, 0.675, 0.19)),
                        new KeyValue(getNode().scaleXProperty(), 0.1, Interpolator.SPLINE(0.55, 0.055, 0.675, 0.19)),
                        new KeyValue(getNode().scaleYProperty(), 0.1, Interpolator.SPLINE(0.55, 0.055, 0.675, 0.19)),
                        new KeyValue(getNode().scaleZProperty(), 0.1, Interpolator.SPLINE(0.55, 0.055, 0.675, 0.19))
                ),
                new KeyFrame(Duration.millis(600),
                        new KeyValue(getNode().opacityProperty(), 1, Interpolator.SPLINE(0.175, 0.885, 0.32, 1)),
                        new KeyValue(getNode().translateYProperty(), 60, Interpolator.SPLINE(0.175, 0.885, 0.32, 1)),
                        new KeyValue(getNode().scaleXProperty(), 0.475, Interpolator.SPLINE(0.175, 0.885, 0.32, 1)),
                        new KeyValue(getNode().scaleYProperty(), 0.475, Interpolator.SPLINE(0.175, 0.885, 0.32, 1)),
                        new KeyValue(getNode().scaleZProperty(), 0.475, Interpolator.SPLINE(0.175, 0.885, 0.32, 1))
                ),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(getNode().translateYProperty(), 0, Interpolator.SPLINE(0.175, 0.885, 0.32, 1)),
                        new KeyValue(getNode().opacityProperty(), 1, Interpolator.SPLINE(0.175, 0.885, 0.32, 1)),
                        new KeyValue(getNode().scaleXProperty(), 1, Interpolator.SPLINE(0.175, 0.885, 0.32, 1)),
                        new KeyValue(getNode().scaleYProperty(), 1, Interpolator.SPLINE(0.175, 0.885, 0.32, 1)),
                        new KeyValue(getNode().scaleZProperty(), 1, Interpolator.SPLINE(0.175, 0.885, 0.32, 1))
                )
        ));
    }
}

