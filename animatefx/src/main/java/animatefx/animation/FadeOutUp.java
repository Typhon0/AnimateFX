package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;


/**
 * @author Loïc Sculier
 */
public class FadeOutUp {

    /**
     * Create new FadeOutUp
     *
     * @param node The node to affect
     */
    public FadeOutUp(Node node) {
        FadeOutUp(node);
    }

    private void FadeOutUp(Node node) {

        Timeline t =
                new Timeline(
                        new KeyFrame(Duration.millis(0),
                                new KeyValue(node.opacityProperty(), 1, AnimateFXInterpolator.EASE),
                                new KeyValue(node.translateYProperty(), 0, AnimateFXInterpolator.EASE)

                        ),

                        new KeyFrame(Duration.millis(1000),
                                new KeyValue(node.opacityProperty(), 0, AnimateFXInterpolator.EASE),
                                new KeyValue(node.translateYProperty(), -node.getBoundsInParent().getHeight(), AnimateFXInterpolator.EASE)

                        )

                );
        t.play();
    }
}

