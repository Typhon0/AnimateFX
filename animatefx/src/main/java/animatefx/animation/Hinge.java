package animatefx.animation;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

/**
 * @author Loïc Sculier aka typhon0
 */
public class Hinge extends AnimationFX {

    /**
     * Create new BounceInDown animation
     *
     * @param node The node to affect
     */
    public Hinge(Node node) {
        super(node);

    }

    @Override
    AnimationFX resetNode() {
        //TODO
        return this;
    }

    @Override
    void initTimeline() {
        double endY = getNode().getScene().getHeight() - getNode().localToScene(0, 0).getY();
        Rotate rotate = new Rotate(0, 0, 0);
        setTimeline(new Timeline(

                new KeyFrame(Duration.millis(0),
                        new KeyValue(rotate.angleProperty(), 0, Interpolator.EASE_BOTH)
                ),
                new KeyFrame(Duration.millis(300),
                        new KeyValue(rotate.angleProperty(), 80, Interpolator.EASE_BOTH)
                ),
                new KeyFrame(Duration.millis(650),
                        new KeyValue(rotate.angleProperty(), 60, Interpolator.EASE_BOTH)
                ),
                new KeyFrame(Duration.millis(1050),
                        new KeyValue(rotate.angleProperty(), 80, Interpolator.EASE_BOTH)
                ),
                new KeyFrame(Duration.millis(1450),
                        new KeyValue(getNode().opacityProperty(), 1, Interpolator.EASE_BOTH),
                        new KeyValue(getNode().translateYProperty(), 0, Interpolator.EASE_BOTH),
                        new KeyValue(rotate.angleProperty(), 60, Interpolator.EASE_BOTH)
                ),
                new KeyFrame(Duration.millis(1900),
                        new KeyValue(getNode().opacityProperty(), 0, Interpolator.EASE_BOTH),
                        new KeyValue(getNode().translateYProperty(), endY, Interpolator.EASE_BOTH),
                        new KeyValue(rotate.angleProperty(), 60, Interpolator.EASE_BOTH)
                )
        ));
        getNode().getTransforms().add(rotate);

    }


}
