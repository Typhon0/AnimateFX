package animatefx.animation;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.scene.transform.Shear;
import javafx.util.Duration;

/**
 * @author Sculier Loïc aka typhon0
 */

public class LightSpeedIn {
    /**
     * Create new LightSpeedIn
     *
     * @param node The node to affect
     */
    public LightSpeedIn(Node node) {
        LightSpeedIn(node);
    }

    private void LightSpeedIn(Node node) {
        Shear shear = new Shear();
        node.getTransforms().add(shear);

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(node.translateXProperty(), node.getBoundsInParent().getWidth(), Interpolator.EASE_OUT),
                        new KeyValue(shear.xProperty(), -0.30),
                        new KeyValue(shear.yProperty(), 0),
                        new KeyValue(node.opacityProperty(), 0, Interpolator.EASE_OUT)
                ),
                new KeyFrame(Duration.millis(600),
                        new KeyValue(node.translateXProperty(), 0, Interpolator.EASE_OUT),

                        new KeyValue(shear.xProperty(), 0.20),
                        new KeyValue(shear.yProperty(), 0),
                        new KeyValue(node.opacityProperty(), 1, Interpolator.EASE_OUT)

                ),
                new KeyFrame(Duration.millis(800),

                        new KeyValue(shear.xProperty(), -0.5),
                        new KeyValue(shear.yProperty(), 0),
                        new KeyValue(node.opacityProperty(), 1, Interpolator.EASE_OUT)

                ),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(shear.xProperty(), 0),
                        new KeyValue(shear.yProperty(), 0),
                        new KeyValue(node.opacityProperty(), 1, Interpolator.EASE_OUT)

                )
        );
        timeline.play();
    }
}
