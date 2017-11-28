package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;


/**
 * @author Loïc Sculier
 */
public class FadeInLeft {

    /**
     * Create new FadeInLeft
     *
     * @param node The node to affect
     */
    public FadeInLeft(Node node) {
        FadeInLeft(node);
    }

    private void FadeInLeft(Node node) {

        Timeline t =
                new Timeline(

                        new KeyFrame(Duration.millis(0),
                                new KeyValue(node.opacityProperty(), 0, AnimateFXInterpolator.EASE),
                                new KeyValue(node.translateXProperty(), -node.getBoundsInParent().getWidth(), AnimateFXInterpolator.EASE)

                        ),
                        new KeyFrame(Duration.millis(1000),
                                new KeyValue(node.opacityProperty(), 1, AnimateFXInterpolator.EASE),
                                new KeyValue(node.translateXProperty(), 0, AnimateFXInterpolator.EASE)

                        )

                );
        t.play();
    }
}

