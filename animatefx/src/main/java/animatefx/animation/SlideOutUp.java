package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;


/**
 * @author Loïc Sculier
 */
public class SlideOutUp {

    /**
     * Create new SlideOutUp
     *
     * @param node The node to affect
     */
    public SlideOutUp(Node node) {
        SlideOutUp(node);
    }

    private void SlideOutUp(Node node) {

        Timeline t =
                new Timeline(
                        new KeyFrame(Duration.millis(0),
                                new KeyValue(node.translateYProperty(), 0, AnimateFXInterpolator.EASE)

                        ),

                        new KeyFrame(Duration.millis(1000),
                                new KeyValue(node.translateYProperty(), -node.getBoundsInParent().getHeight(), AnimateFXInterpolator.EASE)

                        )

                );
        t.play();
    }
}

