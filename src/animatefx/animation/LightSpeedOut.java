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

public class LightSpeedOut {
    /**
     * Create new LightSpeedOut
     *
     * @param node The node to affect
     */
    public LightSpeedOut(Node node) {
        LightSpeedOut(node);
    }

    private void LightSpeedOut(Node node) {
        Shear shear = new Shear();
        node.getTransforms().add(shear);

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(shear.xProperty(), 0),
                        new KeyValue(shear.yProperty(), 0),
                        new KeyValue(node.opacityProperty(), 1, Interpolator.EASE_IN)
                ),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(node.translateXProperty(), node.getBoundsInParent().getWidth(), Interpolator.EASE_IN),
                        new KeyValue(shear.xProperty(), 0.30),
                        new KeyValue(shear.yProperty(), 0),
                        new KeyValue(node.opacityProperty(), 0, Interpolator.EASE_IN)

                )
        );
        timeline.play();
    }
}
