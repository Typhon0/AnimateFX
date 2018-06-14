package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;


/**
 * @author Loïc Sculier aka typhon0
 */
public class SlideOutDown extends AnimationFX {

    /**
     * Create new SlideOutDown
     *
     * @param node The node to affect
     */
    public SlideOutDown(Node node) {
        super(node);
    }

    @Override
    AnimationFX resetNode() {
        //TODO
        return this;
    }

    @Override
    void initTimeline() {
        new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(getNode().translateYProperty(), 0, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(getNode().translateYProperty(), getNode().getBoundsInParent().getHeight(), AnimateFXInterpolator.EASE)
                )
        );
    }
}

