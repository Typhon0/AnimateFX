package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;


/**
 * @author Loïc Sculier aka typhon0
 */
public class SlideOutLeft extends SlideAnimation {

    /**
     * Create new SlideOutLeft
     *
     * @param node The node to affect
     */
    public SlideOutLeft(Node node) {
        super(node);
    }

    public SlideOutLeft() { }

    @Override
    protected AnimationFX resetNode() {
        getNode().setOpacity(1);
        getNode().setTranslateX(0);
        return this;
    }

    @Override
    protected void initTimeline() {
        Double slideBy = this.slideBy; // protected attribute from SlideAnimation

        if (slideBy == null)
            slideBy = getNode().getBoundsInParent().getWidth();

        // negate value if positive
        if (slideBy > 0.0)
            slideBy = -slideBy;

        setTimeline(new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(getNode().translateXProperty(), 0, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(getNode().translateXProperty(), slideBy, AnimateFXInterpolator.EASE)
                )
        ));
    }
}

