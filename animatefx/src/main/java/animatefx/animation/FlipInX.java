package animatefx.animation;

import javafx.animation.Interpolator;
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
public class FlipInX extends AnimationFX {

    /**
     * Create new FlipInX
     *
     * @param node The node to affect
     */
    public FlipInX(Node node) {
        super(node);
    }

    public FlipInX() {
    }

    @Override
    AnimationFX resetNode() {
        getNode().setOpacity(1);
        getNode().setRotate(0);
        return this;
    }

    @Override
    void initTimeline() {
        getNode().getScene().setCamera(new PerspectiveCamera());
        getNode().setRotationAxis(X_AXIS);
        setTimeline(new Timeline(

                new KeyFrame(Duration.millis(0),
                        new KeyValue(getNode().opacityProperty(), 0, Interpolator.EASE_IN),
                        new KeyValue(getNode().rotateProperty(), -90, Interpolator.EASE_IN)

                ),
                new KeyFrame(Duration.millis(400),
                        new KeyValue(getNode().rotateProperty(), 20, Interpolator.EASE_IN)

                ),
                new KeyFrame(Duration.millis(600),
                        new KeyValue(getNode().rotateProperty(), -10, Interpolator.EASE_IN)

                ),
                new KeyFrame(Duration.millis(800),
                        new KeyValue(getNode().rotateProperty(), 5, Interpolator.EASE_IN)
                ),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(getNode().opacityProperty(), 1, Interpolator.EASE_IN),
                        new KeyValue(getNode().rotateProperty(), 0, Interpolator.EASE_IN)
                )

        ));
        getTimeline().setOnFinished(event -> getNode().getScene().setCamera(new ParallelCamera()));

    }


}

