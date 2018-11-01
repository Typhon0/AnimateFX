package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;

/**
 * @author Loïc Sculier aka typhon0
 */
public class BounceOutUp extends AnimationFX {

    /**
     * Create new BounceOutUp animation
     *
     * @param node The node to affect
     */
    public BounceOutUp(final Node node) {
        super(node);
    }

    public BounceOutUp() {
    }

    @Override
    AnimationFX resetNode() {
        getNode().setTranslateY(0);
        getNode().setOpacity(1);
        return this;
    }

    @Override
    void initTimeline() {
        setTimeline(new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(getNode().opacityProperty(), 1, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(200),
                        new KeyValue(getNode().translateYProperty(), -10, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(400),
                        new KeyValue(getNode().opacityProperty(), 1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().translateYProperty(), 20, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(getNode().opacityProperty(), 0, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().translateYProperty(), -2000, AnimateFXInterpolator.EASE)
                )
        ));
    }


}
