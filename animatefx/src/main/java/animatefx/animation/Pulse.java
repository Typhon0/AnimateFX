package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;


/**
 * @author Loïc Sculier
 */
public class Pulse {

    /**
     * Create new Pulse
     *
     * @param node The node to affect
     */
    public Pulse(Node node) {
        Pulse(node);
    }

    private void Pulse(Node node) {

        Timeline t =
                new Timeline(
                        new KeyFrame(Duration.millis(0),
                                new KeyValue(node.scaleXProperty(), 1,AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleYProperty(), 1,AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleZProperty(), 1,AnimateFXInterpolator.EASE)
                        ),
                        new KeyFrame(Duration.millis(500),
                                new KeyValue(node.scaleXProperty(), 1.05,AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleYProperty(), 1.05,AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleZProperty(), 1.05,AnimateFXInterpolator.EASE)
                        ),
                        new KeyFrame(Duration.millis(1000),
                                new KeyValue(node.scaleXProperty(), 1,AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleYProperty(), 1,AnimateFXInterpolator.EASE),
                                new KeyValue(node.scaleZProperty(), 1,AnimateFXInterpolator.EASE)
                        )
                );
        t.play();
    }
}

