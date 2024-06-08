package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;


/**
 * @author Loïc Sculier aka typhon0
 */
public class SlideInRight extends SlideAnimation {

    /**
     * Create new SlideInRight
     *
     * @param node The node to affect
     */
    public SlideInRight(Node node) {
        super(node);
    }

    public SlideInRight() {
    }

    @Override
    protected AnimationFX resetNode() {
        getNode().setTranslateX(0);
        return this;
    }

    @Override
    protected void initTimeline() {
        Number slideBy = this.slideBy; // protected attribute from SlideAnimation

        if (slideBy == null)
            slideBy = getNode().getBoundsInParent().getWidth();

        setTimeline(new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(getNode().translateXProperty(), slideBy, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(getNode().translateXProperty(), 0, AnimateFXInterpolator.EASE)
                )
        ));
    }
}

