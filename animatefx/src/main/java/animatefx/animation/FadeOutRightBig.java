package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;


/**
 * @author Loïc Sculier aka typhon0
 */
public class FadeOutRightBig extends AnimationFX {

    /**
     * Create new FadeOutRightBig
     *
     * @param node The node to affect
     */
    public FadeOutRightBig(Node node) {
        super(node);
    }

    public FadeOutRightBig() {
    }

    @Override
    protected AnimationFX resetNode() {
        getNode().setOpacity(1);
        getNode().setTranslateX(0);
        return this;
    }

    @Override
    protected void initTimeline() {
        setTimeline(new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(getNode().opacityProperty(), 1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().translateXProperty(), 0, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(getNode().opacityProperty(), 0, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().translateXProperty(), 2000, AnimateFXInterpolator.EASE)
                )
        ));
    }
}

