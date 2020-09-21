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
public class JackInTheBox extends AnimationFX {

    /**
     * Create new JackInTheBox animation
     *
     * @param node The node to affect
     */
    public JackInTheBox(Node node) {
        super(node);

    }

    public JackInTheBox() {
    }

    private Rotate rotate;

    @Override
    AnimationFX resetNode() {
        getNode().setScaleX(1);
        getNode().setScaleZ(1);
        getNode().setScaleY(1);
        getNode().setOpacity(1);
        rotate.setAngle(0);
        return this;
    }

    @Override
    void initTimeline() {
         rotate = new Rotate(30, getNode().getBoundsInParent().getWidth() / 2, getNode().getBoundsInParent().getHeight());
        getNode().getTransforms().add(rotate);
        setTimeline(new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(rotate.angleProperty(), 30, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleXProperty(), 0.1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleYProperty(), 0.1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().opacityProperty(), 0, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(500),
                        new KeyValue(rotate.angleProperty(), -10, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(700),
                        new KeyValue(rotate.angleProperty(), 3, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(getNode().scaleXProperty(), 1, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleYProperty(), 1, AnimateFXInterpolator.EASE),
                        new KeyValue(rotate.angleProperty(), 0, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().opacityProperty(), 1, AnimateFXInterpolator.EASE)
                )
        ));
    }
}
