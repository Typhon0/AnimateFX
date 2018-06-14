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
 * @author Loïc Sculier
 */
public class Hinge {

    /**
     * Create new BounceInDown animation
     *
     * @param node The node to affect
     */
    public Hinge(Node node){
        Hinge(node);

    }

    public void Hinge(Node node){
        double endY = node.getScene().getHeight() - node.localToScene(0, 0).getY();
       Rotate rotate = new Rotate(0,0,0);
        Timeline t = new Timeline(

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
                        new KeyValue(node.opacityProperty(), 1, Interpolator.EASE_BOTH),
                        new KeyValue(node.translateYProperty(), 0, Interpolator.EASE_BOTH),
                        new KeyValue(rotate.angleProperty(), 60, Interpolator.EASE_BOTH)
                ),
                new KeyFrame(Duration.millis(1900),
                        new KeyValue(node.opacityProperty(), 0, Interpolator.EASE_BOTH),
                        new KeyValue(node.translateYProperty(), endY, Interpolator.EASE_BOTH),
                        new KeyValue(rotate.angleProperty(), 60, Interpolator.EASE_BOTH)
                )
        );

        node.getTransforms().add(rotate);
        t.play();
    }
}
