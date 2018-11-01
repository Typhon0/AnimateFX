package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;

/**
 * @author Loïc Sculier aka typhon0
 */
public class BounceOutLeft extends AnimationFX {

    /**
     * Create new BounceOutLeft animation
     *
     * @param node The node to affect
     */
    public BounceOutLeft(final Node node) {
        super(node);
    }

    public BounceOutLeft() {
    }

    @Override
    AnimationFX resetNode() {
        getNode().setTranslateX(0);
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
                        new KeyValue(getNode().opacityProperty(), 1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().translateXProperty(), 20, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(getNode().opacityProperty(), 0, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().translateXProperty(), -2000, AnimateFXInterpolator.EASE)
                )

        ));
    }


}
