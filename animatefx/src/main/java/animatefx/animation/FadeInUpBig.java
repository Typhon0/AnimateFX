package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;


/**
 * @author Loïc Sculier aka typhon0
 */
public class FadeInUpBig extends AnimationFX {

    /**
     * Create new FadeInUpBig
     *
     * @param node The node to affect
     */
    public FadeInUpBig(Node node) {
        super(node);
    }

    public FadeInUpBig() {
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
                        new KeyValue(getNode().opacityProperty(), 0, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().translateYProperty(), 2000, AnimateFXInterpolator.EASE)

                ),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(getNode().opacityProperty(), 1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().translateYProperty(), 0, AnimateFXInterpolator.EASE)

                )

        ));
    }

}

