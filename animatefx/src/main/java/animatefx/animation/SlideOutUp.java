package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;


/**
 * @author Loïc Sculier aka typhon0
 */
public class SlideOutUp extends AnimationFX {

    /**
     * Create new SlideOutUp
     *
     * @param node The node to affect
     */
    public SlideOutUp(Node node) {
        super(node);
    }

    public SlideOutUp() {
    }

    @Override
    AnimationFX resetNode() {
        getNode().setOpacity(1);
        getNode().setTranslateY(0);
        return this;
    }

    @Override
    void initTimeline() {
        setTimeline(new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(getNode().translateYProperty(), 0, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(getNode().translateYProperty(), -getNode().getBoundsInParent().getHeight(), AnimateFXInterpolator.EASE)
                )
        ));
    }
}

