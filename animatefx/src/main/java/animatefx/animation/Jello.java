package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.geometry.Bounds;
import javafx.scene.Node;
import javafx.scene.transform.Shear;
import javafx.util.Duration;

/**
 * @author Remi Lenoir
 */

public class Jello extends AnimationFX {
    /**
     * Create new Jello
     *
     * @param node The node to affect
     */
    public Jello(Node node) {
        super(node);
    }

    public Jello() {
    }

    @Override
    AnimationFX resetNode() {
        shear.setX(0);
        shear.setY(0);
        return this;
    }

    private Shear shear;

    @Override
    void initTimeline() {
         shear = new Shear();
        Bounds bounds = getNode().getLayoutBounds();
        shear.setPivotX(bounds.getWidth() / 2);
        shear.setPivotY(bounds.getHeight() / 2);
        getNode().getTransforms().add(shear);
        setTimeline(new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(shear.xProperty(), 0),
                        new KeyValue(shear.yProperty(), 0)),
                new KeyFrame(Duration.millis(111),
                        new KeyValue(shear.xProperty(), 0.125),
                        new KeyValue(shear.yProperty(), 0.125)),
                new KeyFrame(Duration.millis(222),
                        new KeyValue(shear.xProperty(), -0.625),
                        new KeyValue(shear.yProperty(), -0.625)),
                new KeyFrame(Duration.millis(333),
                        new KeyValue(shear.xProperty(), 0.3125),
                        new KeyValue(shear.yProperty(), 0.3125)),
                new KeyFrame(Duration.millis(444),
                        new KeyValue(shear.xProperty(), -0.15625),
                        new KeyValue(shear.yProperty(), -0.15625)),
                new KeyFrame(Duration.millis(555),
                        new KeyValue(shear.xProperty(), 0.078125),
                        new KeyValue(shear.yProperty(), 0.078125)),
                new KeyFrame(Duration.millis(666),
                        new KeyValue(shear.xProperty(), -0.0390625),
                        new KeyValue(shear.yProperty(), -0.0390625)),
                new KeyFrame(Duration.millis(777),
                        new KeyValue(shear.xProperty(), 0.01953125),
                        new KeyValue(shear.yProperty(), 0.01953125)),
                new KeyFrame(Duration.millis(888),
                        new KeyValue(shear.xProperty(), 0),
                        new KeyValue(shear.yProperty(), 0))));
    }

}
