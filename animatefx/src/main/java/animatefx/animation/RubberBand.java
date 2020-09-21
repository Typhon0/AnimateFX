package animatefx.animation;


import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;


/**
 * @author Loïc Sculier aka typhon0
 */
public class RubberBand extends AnimationFX {

    /**
     * Create new RubberBand
     *
     * @param node The node to affect
     */
    public RubberBand(Node node) {
        super(node);
    }

    public RubberBand() {
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
                new KeyFrame(Duration.millis(300),
                        new KeyValue(getNode().scaleXProperty(), 1.25, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleYProperty(), 0.75, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleZProperty(), 1, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(400),
                        new KeyValue(getNode().scaleXProperty(), 0.75, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleYProperty(), 1.25, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleZProperty(), 1, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(500),
                        new KeyValue(getNode().scaleXProperty(), 1.15, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleYProperty(), 0.85, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleZProperty(), 1, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(650),
                        new KeyValue(getNode().scaleXProperty(), 0.95, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleYProperty(), 1.05, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleZProperty(), 1, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(750),
                        new KeyValue(getNode().scaleXProperty(), 1.05, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleYProperty(), 0.95, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleZProperty(), 1, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(getNode().scaleXProperty(), 1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleYProperty(), 1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleZProperty(), 1, AnimateFXInterpolator.EASE)
                )
        ));
    }

}



