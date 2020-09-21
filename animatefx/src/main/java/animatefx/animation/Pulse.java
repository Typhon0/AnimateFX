package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;


/**
 * @author Loïc Sculier
 */
public class Pulse extends AnimationFX {

    /**
     * Create new Pulse
     *
     * @param node The node to affect
     */
    public Pulse(Node node) {
        super(node);
    }

    public Pulse() {
    }


    @Override
    AnimationFX resetNode() {
        getNode().setScaleX(1);
        getNode().setScaleY(1);
        getNode().setScaleZ(1);
        return this;
    }

    @Override
    void initTimeline() {
        setTimeline(new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(getNode().scaleXProperty(), 1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleYProperty(), 1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleZProperty(), 1, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(500),
                        new KeyValue(getNode().scaleXProperty(), 1.05, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleYProperty(), 1.05, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleZProperty(), 1.05, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(getNode().scaleXProperty(), 1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleYProperty(), 1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleZProperty(), 1, AnimateFXInterpolator.EASE)
                )
        ));
    }
}

