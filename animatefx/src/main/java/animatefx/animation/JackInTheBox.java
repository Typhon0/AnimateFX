package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

/**
 * @author Loïc Sculier
 */
public class JackInTheBox {

    /**
     * Create new JackInTheBox animation
     *
     * @param node The node to affect
     */
    public JackInTheBox(Node node){
        JackInTheBox(node);

    }

    public void JackInTheBox(Node node){
        Rotate rotate = new Rotate(30,node.getBoundsInParent().getWidth()/2,node.getBoundsInParent().getHeight());

        Timeline t = new Timeline(

                new KeyFrame(Duration.millis(0),
                        new KeyValue(rotate.angleProperty(), 30, AnimateFXInterpolator.EASE),
                        new KeyValue(node.scaleXProperty(),0.1,AnimateFXInterpolator.EASE),
                        new KeyValue(node.scaleYProperty(),0.1,AnimateFXInterpolator.EASE),
                        new KeyValue(node.opacityProperty(),0,AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(500),
                        new KeyValue(rotate.angleProperty(), -10, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(700),
                        new KeyValue(rotate.angleProperty(), 3, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(node.scaleXProperty(),1,AnimateFXInterpolator.EASE),
                        new KeyValue(node.scaleYProperty(),1,AnimateFXInterpolator.EASE),
                        new KeyValue(rotate.angleProperty(), 0, AnimateFXInterpolator.EASE),
                        new KeyValue(node.opacityProperty(),1,AnimateFXInterpolator.EASE)

                )

        );

        node.getTransforms().add(rotate);
        t.play();
    }
}
