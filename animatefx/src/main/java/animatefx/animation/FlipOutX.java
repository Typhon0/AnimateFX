package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.scene.ParallelCamera;
import javafx.scene.PerspectiveCamera;
import javafx.util.Duration;

import static javafx.scene.transform.Rotate.X_AXIS;


/**
 * @author Loïc Sculier aka typhon0
 */
public class FlipOutX extends AnimationFX {

    /**
     * Create new FlipOutX
     *
     * @param node The node to affect
     */
    public FlipOutX(Node node) {
        super(node);
    }

    public FlipOutX() {
    }

    @Override
    protected AnimationFX resetNode() {
        getNode().setOpacity(1);
        getNode().setRotate(0);
        return this;
    }

    @Override
    protected void initTimeline() {
        getNode().getScene().setCamera(new PerspectiveCamera());
        getNode().setRotationAxis(X_AXIS);
        setTimeline(new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(getNode().opacityProperty(), 1, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(225),
                        new KeyValue(getNode().rotateProperty(), 20, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(750),
                        new KeyValue(getNode().opacityProperty(), 0, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().rotateProperty(), -90, AnimateFXInterpolator.EASE)
                )
        ));
        getTimeline().setOnFinished(event -> getNode().getScene().setCamera(new ParallelCamera()));

    }

}

