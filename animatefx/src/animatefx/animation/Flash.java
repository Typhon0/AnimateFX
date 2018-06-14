package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;


/**
 * @author Loïc Sculier
 */
public class Flash {

    /**
     * Create new Flash
     *
     * @param node The node to affect
     */
    public Flash(Node node) {
        Flash(node);
    }

    private void Flash(Node node) {

        Timeline t =
                new Timeline(

                        new KeyFrame(Duration.millis(0),
                                new KeyValue(node.opacityProperty(), 1,AnimateFXInterpolator.EASE)
                        ),
                        new KeyFrame(Duration.millis(250),
                                new KeyValue(node.opacityProperty(), 0,AnimateFXInterpolator.EASE)
                        ),
                        new KeyFrame(Duration.millis(500),
                                new KeyValue(node.opacityProperty(), 1,AnimateFXInterpolator.EASE)
                        ),
                        new KeyFrame(Duration.millis(750),
                                new KeyValue(node.opacityProperty(), 0,AnimateFXInterpolator.EASE)
                        ),
                        new KeyFrame(Duration.millis(1000),
                                new KeyValue(node.opacityProperty(), 1,AnimateFXInterpolator.EASE)
                        )

                );
        t.play();
    }
}

