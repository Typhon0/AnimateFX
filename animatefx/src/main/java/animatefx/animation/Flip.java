package animatefx.animation;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.scene.ParallelCamera;
import javafx.scene.PerspectiveCamera;
import javafx.util.Duration;

import static javafx.scene.transform.Rotate.Y_AXIS;


/**
 * @author Loïc Sculier aka typhon0
 */
public class Flip extends AnimationFX {

    /**
     * Create new Flip
     *
     * @param node The node to affect
     */
    public Flip(Node node) {
        super(node);
    }

    public Flip() {
    }

    @Override
    AnimationFX resetNode() {
        getNode().setRotate(0);
        getNode().setScaleX(1);
        getNode().setScaleY(1);
        getNode().setScaleZ(1);
        getNode().setTranslateZ(0);
        return this;
    }

    @Override
    void initTimeline() {
        getNode().getScene().setCamera(new PerspectiveCamera());
        getNode().setRotationAxis(Y_AXIS);
        setTimeline(new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(getNode().rotateProperty(), 360, Interpolator.EASE_OUT)
                ),
                new KeyFrame(Duration.millis(400),
                        new KeyValue(getNode().rotateProperty(), 190, Interpolator.EASE_OUT),
                        new KeyValue(getNode().translateZProperty(), -150, Interpolator.EASE_OUT)
                ),
                new KeyFrame(Duration.millis(500),
                        new KeyValue(getNode().rotateProperty(), 170, Interpolator.EASE_IN),
                        new KeyValue(getNode().translateZProperty(), -150, Interpolator.EASE_IN)
                ),
                new KeyFrame(Duration.millis(800),
                        new KeyValue(getNode().scaleXProperty(), 0.95, Interpolator.EASE_IN),
                        new KeyValue(getNode().scaleYProperty(), 0.95, Interpolator.EASE_IN),
                        new KeyValue(getNode().scaleZProperty(), 0.95, Interpolator.EASE_IN)
                ),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(getNode().rotateProperty(), 0, Interpolator.EASE_IN),
                        new KeyValue(getNode().scaleXProperty(), 1, Interpolator.EASE_IN),
                        new KeyValue(getNode().scaleYProperty(), 1, Interpolator.EASE_IN),
                        new KeyValue(getNode().scaleZProperty(), 1, Interpolator.EASE_IN),
                        new KeyValue(getNode().translateZProperty(), 0, Interpolator.EASE_IN)
                )
        ));
        getTimeline().setOnFinished(event -> getNode().getScene().setCamera(new ParallelCamera()));

    }

}

