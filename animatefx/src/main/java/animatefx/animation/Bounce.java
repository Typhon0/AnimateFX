package animatefx.animation;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;


/**
 * @author Loïc Sculier aka typhon0
 */
public class Bounce extends AnimationFX {


    /**
     * Create new Bounce
     *
     * @param node The node to affect
     */
    public Bounce(Node node) {
        super(node);
    }

    public Bounce() {
        super();
    }

    @Override
    public AnimationFX resetNode() {
        getNode().setTranslateY(0);
        return this;
    }

    @Override
    protected void initTimeline() {
        setTimeline(
                new Timeline(

                        new KeyFrame(Duration.millis(0),
                                new KeyValue(getNode().translateYProperty(), 0, AnimateFXInterpolator.BOUNCE_EASE_IN)
                        ),
                        new KeyFrame(Duration.millis(400),
                                new KeyValue(getNode().translateYProperty(), -30, AnimateFXInterpolator.BOUNCE_EASE_OUT)
                        ),
                        new KeyFrame(Duration.millis(550),
                                new KeyValue(getNode().translateYProperty(), 0, AnimateFXInterpolator.BOUNCE_EASE_IN)
                        ),
                        new KeyFrame(Duration.millis(700),
                                new KeyValue(getNode().translateYProperty(), -15, AnimateFXInterpolator.BOUNCE_EASE_OUT)
                        ),
                        new KeyFrame(Duration.millis(800),
                                new KeyValue(getNode().translateYProperty(), 0, AnimateFXInterpolator.BOUNCE_EASE_IN)
                        ),
                        new KeyFrame(Duration.millis(900),
                                new KeyValue(getNode().translateYProperty(), -5, AnimateFXInterpolator.BOUNCE_EASE_OUT)
                        ),
                        new KeyFrame(Duration.millis(1000),
                                new KeyValue(getNode().translateYProperty(), 0, AnimateFXInterpolator.BOUNCE_EASE_IN)
                        )

                ));
    }
}

