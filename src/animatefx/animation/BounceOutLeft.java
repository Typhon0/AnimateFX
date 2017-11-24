package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;

/**
 * @author Loïc Sculier
 */
public class BounceOutLeft {

    /**
     * Create new BounceOutLeft animation
     *
     * @param node The node to affect
     */
    public BounceOutLeft(final Node node) {
        BounceOutLeft(node);
    }


    private static void BounceOutLeft(Node node) {
        Timeline t = new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(node.opacityProperty(), 1,AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(200),
                        new KeyValue(node.opacityProperty(), 1,AnimateFXInterpolator.EASE),
                        new KeyValue(node.translateXProperty(), 20,AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(node.opacityProperty(), 0,AnimateFXInterpolator.EASE),
                        new KeyValue(node.translateXProperty(), -2000,AnimateFXInterpolator.EASE)
                )

        );
        t.play();
    }

}
