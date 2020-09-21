package animatefx.animation;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;

/**
 * @author Loïc Sculier aka typhon0
 */
public class BounceInRight extends AnimationFX {

    /**
     * Create new BounceInRight
     *
     * @param node The node to affect
     */
    public BounceInRight(Node node) {
        super(node);
    }

    public BounceInRight() {
    }

    @Override
    AnimationFX resetNode() {
        getNode().setOpacity(1);
        getNode().setTranslateX(0);
        return this;
    }

    @Override
    void initTimeline() {

        double startX = getNode().getScene().getWidth() - getNode().localToScene(0, 0).getX();
        setTimeline(
                new Timeline(
                        new KeyFrame(Duration.millis(0),
                                new KeyValue(getNode().opacityProperty(), 0, Interpolator.SPLINE(0.215, 0.610, 0.355, 1.000)),
                                new KeyValue(getNode().translateXProperty(), startX, Interpolator.SPLINE(0.215, 0.610, 0.355, 1.000))
                        ),
                        new KeyFrame(Duration.millis(600),
                                new KeyValue(getNode().opacityProperty(), 1, Interpolator.SPLINE(0.215, 0.610, 0.355, 1.000)),
                                new KeyValue(getNode().translateXProperty(), -25, Interpolator.SPLINE(0.215, 0.610, 0.355, 1.000))
                        ),
                        new KeyFrame(Duration.millis(750),
                                new KeyValue(getNode().translateXProperty(), 10, Interpolator.SPLINE(0.215, 0.610, 0.355, 1.000))
                        ),
                        new KeyFrame(Duration.millis(900),
                                new KeyValue(getNode().translateXProperty(), -5, Interpolator.SPLINE(0.215, 0.610, 0.355, 1.000))
                        ),
                        new KeyFrame(Duration.millis(1000),
                                new KeyValue(getNode().translateXProperty(), 0, Interpolator.SPLINE(0.215, 0.610, 0.355, 1.000))
                        )

                ));

    }


}

