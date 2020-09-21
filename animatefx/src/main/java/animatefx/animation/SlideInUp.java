package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;


/**
 * @author Loïc Sculier aka typhon0
 */
public class SlideInUp extends AnimationFX {

    /**
     * Create new SlideInUp
     *
     * @param node The node to affect
     */
    public SlideInUp(Node node) {
        super(node);
    }

    public SlideInUp() {
    }

    @Override
    AnimationFX resetNode() {
        getNode().setTranslateY(0);
        return this;
    }

    @Override
    void initTimeline() {
        setTimeline(new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(getNode().translateYProperty(), getNode().getBoundsInParent().getHeight(), AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(getNode().translateYProperty(), 0, AnimateFXInterpolator.EASE)
                )
        ));
    }
}
