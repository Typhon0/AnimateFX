package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;


/**
 * @author Loïc Sculier
 */
public class SlideInLeft {

    /**
     * Create new SlideInLeft
     *
     * @param node The node to affect
     */
    public SlideInLeft(Node node) {
        SlideInLeft(node);
    }

    private void SlideInLeft(Node node) {

        Timeline t =
                new Timeline(

                        new KeyFrame(Duration.millis(0),
                                new KeyValue(node.translateXProperty(), -node.getBoundsInParent().getWidth(), AnimateFXInterpolator.EASE)

                        ),
                        new KeyFrame(Duration.millis(1000),
                                new KeyValue(node.translateXProperty(), 0, AnimateFXInterpolator.EASE)

                        )

                );
        t.play();
    }
}

