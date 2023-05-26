package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;


/**
 * @author Loïc Sculier aka typhon0
 */
public class SlideInUp extends SlideAnimation {

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
    protected AnimationFX resetNode() {
        getNode().setTranslateY(0);
        return this;
    }

    @Override
    protected void initTimeline() {
        Number slideBy = this.slideBy; // protected attribute from SlideAnimation

        if (slideBy == null)
            slideBy = getNode().getBoundsInParent().getHeight();

        setTimeline(new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(getNode().translateYProperty(), slideBy, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(getNode().translateYProperty(), 0, AnimateFXInterpolator.EASE)
                )
        ));
    }
}
