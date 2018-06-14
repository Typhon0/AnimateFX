package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;


/**
 * @author Loïc Sculier aka typhon0
 */
public class RollOut {

    /**
     * Create new RollOut
     *
     * @param node The node to affect
     */
    public RollOut(Node node) {
        RollOut(node);
    }

    private void RollOut(Node node) {

        Timeline t =
                new Timeline(
                        new KeyFrame(Duration.millis(0),
                                new KeyValue(node.opacityProperty(), 1, AnimateFXInterpolator.EASE),
                                new KeyValue(node.translateXProperty(), 0, AnimateFXInterpolator.EASE),
                                new KeyValue(node.rotateProperty(), 0, AnimateFXInterpolator.EASE)
                        ),

                        new KeyFrame(Duration.millis(1000),
                                new KeyValue(node.opacityProperty(), 0, AnimateFXInterpolator.EASE),
                                new KeyValue(node.translateXProperty(), node.getBoundsInLocal().getWidth(), AnimateFXInterpolator.EASE),
                                new KeyValue(node.rotateProperty(), 120, AnimateFXInterpolator.EASE)
                        )
                );
        t.play();
    }
}

