package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;


/**
 * @author Loïc Sculier aka typhon0
 */
public class SlideOutUp extends SlideAnimation {

    /**
     * Create new SlideOutUp
     *
     * @param node The node to affect
     */
    public SlideOutUp(Node node) {
        super(node);
    }

    public SlideOutUp() { }

    @Override
    protected AnimationFX resetNode() {
        getNode().setOpacity(1);
        getNode().setTranslateY(0);
        return this;
    }

    @Override
    protected void initTimeline() {
        Number slideBy = this.slideBy; // protected attribute from SlideAnimation

        if (slideBy == null)
            slideBy = -getNode().getBoundsInParent().getHeight();

        setTimeline(new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(getNode().translateYProperty(), 0, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(getNode().translateYProperty(), slideBy, AnimateFXInterpolator.EASE)
                )
        ));
    }
}

