package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;

/**
 * @author Loïc Sculier
 */
public class Wobble {

    /**
     * Create new Wobble
     *
     * @param node The node to affect
     */
    public Wobble(Node node){
        Wobble(node);
    }

    private void Wobble(Node node){
        Timeline t = new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(node.translateXProperty(), 0,AnimateFXInterpolator.EASE),
                        new KeyValue(node.rotateProperty(), -0,AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(150),
                        new KeyValue(node.translateXProperty(), -0.25*node.getBoundsInParent().getWidth(),AnimateFXInterpolator.EASE),
                        new KeyValue(node.rotateProperty(), -5,AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(300),
                        new KeyValue(node.translateXProperty(), 0.2*node.getBoundsInParent().getWidth(),AnimateFXInterpolator.EASE),
                        new KeyValue(node.rotateProperty(), 3,AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(450),
                        new KeyValue(node.translateXProperty(), -0.15*node.getBoundsInParent().getWidth(),AnimateFXInterpolator.EASE),
                        new KeyValue(node.rotateProperty(), -3,AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(600),
                        new KeyValue(node.translateXProperty(), 0.1*node.getBoundsInParent().getWidth(),AnimateFXInterpolator.EASE),
                        new KeyValue(node.rotateProperty(), 2,AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(750),
                        new KeyValue(node.translateXProperty(), -0.05*node.getBoundsInParent().getWidth(),AnimateFXInterpolator.EASE),
                        new KeyValue(node.rotateProperty(), -1,AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(node.translateXProperty(), 0,AnimateFXInterpolator.EASE),
                        new KeyValue(node.rotateProperty(), 0,AnimateFXInterpolator.EASE)
                )

        );

        t.play();
    }
}
