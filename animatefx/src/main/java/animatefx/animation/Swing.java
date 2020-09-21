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
public class Swing extends AnimationFX {

    /**
     * Create new Swing
     *
     * @param node The node to affect
     */
    public Swing(Node node) {
        super(node);
    }

    public Swing() {
    }

    private Rotate rotation;

    @Override
    AnimationFX resetNode() {
        rotation.setAngle(0);
        return this;
    }

    @Override
    void initTimeline() {
        rotation = new Rotate();
        rotation.setPivotX(getNode().getLayoutBounds().getWidth() / 2.0);
        rotation.setPivotY(-getNode().getLayoutBounds().getHeight());
        getNode().getTransforms().add(rotation);
        setTimeline(new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(rotation.angleProperty(), 0, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(200),
                        new KeyValue(rotation.angleProperty(), 15, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(400),
                        new KeyValue(rotation.angleProperty(), -10, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(600),
                        new KeyValue(rotation.angleProperty(), 5, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(800),
                        new KeyValue(rotation.angleProperty(), -5, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(rotation.angleProperty(), 0, AnimateFXInterpolator.EASE)
                )
        ));
    }
}

