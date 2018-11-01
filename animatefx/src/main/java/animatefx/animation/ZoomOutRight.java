package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;


/**
 * @author Loïc Sculier aka typhon0
 */
public class ZoomOutRight extends AnimationFX {

    /**
     * Create new ZoomOutRight
     *
     * @param node The node to affect
     */
    public ZoomOutRight(Node node) {
        super(node);
    }

    public ZoomOutRight() {
    }

    @Override
    AnimationFX resetNode() {
        getNode().setOpacity(1);
        getNode().setScaleX(1);
        getNode().setScaleY(1);
        getNode().setScaleZ(1);
        getNode().setTranslateX(0);
        return this;
    }

    @Override
    void initTimeline() {
        setTimeline(new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(getNode().translateXProperty(), 0, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().opacityProperty(), 1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleXProperty(), 1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleYProperty(), 1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleZProperty(), 1, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(400),
                        new KeyValue(getNode().opacityProperty(), 1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().translateXProperty(), -42, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleXProperty(), 0.475, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleYProperty(), 0.475, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleZProperty(), 0.475, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(1100),
                        new KeyValue(getNode().translateXProperty(), 2000, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().opacityProperty(), 0, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleXProperty(), 0.1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleYProperty(), 0.1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleZProperty(), 0.1, AnimateFXInterpolator.EASE)
                )
        ));
    }
}

