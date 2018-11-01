package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;


/**
 * @author Loïc Sculier aka typhon0
 */
public class ZoomOut extends AnimationFX {

    /**
     * Create new ZoomOut
     *
     * @param node The node to affect
     */
    public ZoomOut(Node node) {
        super(node);
    }

    public ZoomOut() {
    }

    @Override
    AnimationFX resetNode() {
        getNode().setOpacity(1);
        getNode().setScaleX(1);
        getNode().setScaleY(1);
        getNode().setScaleZ(1);
        return this;
    }

    @Override
    void initTimeline() {
        setTimeline(new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(getNode().opacityProperty(), 1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleXProperty(), 1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleYProperty(), 1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleZProperty(), 0.3, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(500),
                        new KeyValue(getNode().opacityProperty(), 0, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleXProperty(), 0.3, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleYProperty(), 0.3, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleZProperty(), 0.3, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(getNode().opacityProperty(), 0, AnimateFXInterpolator.EASE)
                )
        ));
    }
}

