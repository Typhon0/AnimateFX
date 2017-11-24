package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;

/**
 * @author Loïc Sculier
 */
public class BounceOutRight {

    /**
     * Create new BounceOutRight animation
     *
     * @param node The node to affect
     */
    public BounceOutRight(final Node node){
        BounceOutRight(node);
    }



    private static void BounceOutRight(Node node) {

        Timeline t = new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(node.opacityProperty(), 1,AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(200),
                        new KeyValue(node.opacityProperty(), 1,AnimateFXInterpolator.EASE),
                        new KeyValue(node.translateXProperty(), -20,AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(node.opacityProperty(), 0,AnimateFXInterpolator.EASE),
                        new KeyValue(node.translateXProperty(), 2000,AnimateFXInterpolator.EASE)
                )

        );
        t.play();
    }

}
