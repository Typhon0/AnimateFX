package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;

/**
 * @author Loïc Sculier
 */
public class BounceOutDown {

    /**
     * Create new BounceOutDown animation
     *
     * @param node The node to affect
     */
    public BounceOutDown(final Node node) {
        BounceOutDown(node);
    }


    private static void BounceOutDown(Node node) {
        double endY = node.getScene().getHeight() - node.localToScene(0, 0).getY();
        Timeline t = new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(node.opacityProperty(), 1,AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(200),
                        new KeyValue(node.translateYProperty(), 10,AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(400),
                        new KeyValue(node.opacityProperty(), 1,AnimateFXInterpolator.EASE),
                        new KeyValue(node.translateYProperty(), -20,AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(node.opacityProperty(), 0,AnimateFXInterpolator.EASE),
                        new KeyValue(node.translateYProperty(), endY)
                )

        );

        t.play();
    }

}
