package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

/**
 * @author Loïc Sculier aka typhon0
 */
public class Tada extends AnimationFX {

    /**
     * Create new Swing
     *
     * @param node The node to affect
     */
    public Tada(Node node) {
        super(node);
    }

    public Tada() {
    }

    @Override
    AnimationFX resetNode() {
        getNode().setScaleX(1);
        getNode().setScaleY(1);
        getNode().setScaleZ(1);
        getNode().setRotate(0);
        return this;
    }

    @Override
    void initTimeline() {
        getNode().setRotationAxis(Rotate.Z_AXIS);
        setTimeline(new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(getNode().scaleXProperty(), 1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleYProperty(), 1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleZProperty(), 1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().rotateProperty(), 0, AnimateFXInterpolator.EASE)

                ),
                new KeyFrame(Duration.millis(100),
                        new KeyValue(getNode().scaleXProperty(), 0.9, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleYProperty(), 0.9, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleZProperty(), 0.9, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().rotateProperty(), -3, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(200),
                        new KeyValue(getNode().scaleXProperty(), 0.9, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleYProperty(), 0.9, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleZProperty(), 0.9, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().rotateProperty(), -3, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(300),
                        new KeyValue(getNode().scaleXProperty(), 1.1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleYProperty(), 1.1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleZProperty(), 1.1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().rotateProperty(), 3, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(400),
                        new KeyValue(getNode().scaleXProperty(), 1.1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleYProperty(), 1.1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleZProperty(), 1.1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().rotateProperty(), -3, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(500),
                        new KeyValue(getNode().scaleXProperty(), 1.1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleYProperty(), 1.1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleZProperty(), 1.1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().rotateProperty(), 3, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(600),
                        new KeyValue(getNode().scaleXProperty(), 1.1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleYProperty(), 1.1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleZProperty(), 1.1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().rotateProperty(), -3, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(700),
                        new KeyValue(getNode().scaleXProperty(), 1.1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleYProperty(), 1.1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleZProperty(), 1.1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().rotateProperty(), 3, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(800),
                        new KeyValue(getNode().scaleXProperty(), 1.1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleYProperty(), 1.1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleZProperty(), 1.1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().rotateProperty(), -3, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(900),
                        new KeyValue(getNode().scaleXProperty(), 1.1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleYProperty(), 1.1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleZProperty(), 1.1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().rotateProperty(), 3, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(getNode().scaleXProperty(), 1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleYProperty(), 1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleZProperty(), 1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().rotateProperty(), 0, AnimateFXInterpolator.EASE)
                )
        ));
    }
}

