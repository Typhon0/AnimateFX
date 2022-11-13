package animatefx.animation.partial;

import animatefx.animation.AnimateFXInterpolator;
import animatefx.animation.AnimationFX;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;

/**
 * Can be used in combination with Expand,
 * to bring the Node back to the original scale.
 *
 * @author Dominik Müka aka 41zu
 */
public class Contract extends AnimationFX {

    private boolean initialzed;
    private Number beginScale;
    private Number endScale;

    /**
     * Contracts the Node by an defined scale.<br>
     * The default values are:<br>
     * beginScale = 1.05<br>
     * endScale = 1.0
     *
     * @param node Node which should be contracted
     */
    public Contract(Node node) {
        super(node);
    }

    /*
     * we have to initialize the class variables in this
     * method, because otherwise they would be initialized
     * after the constructor and they would be null in the
     * initTimeline method.
     */
    private void initVars() {
        beginScale = 1.05d;
        endScale = 1.0d;

        initialzed = true;
    }

    public Contract setBeginScale(Number beginScale) {
        this.beginScale = beginScale;
        rebuildTimeline();
        return this;
    }

    public Contract setEndScale(Number endScale) {
        this.endScale = endScale;
        rebuildTimeline();
        return this;
    }

    /**
     * resets the Node to the beginScale value
     */
    @Override
    protected AnimationFX resetNode() {
        getNode().setScaleX(beginScale.doubleValue());
        getNode().setScaleY(beginScale.doubleValue());
        getNode().setScaleZ(beginScale.doubleValue());
        return this;
    }

    @Override
    protected void initTimeline() {
        if (!initialzed)
            initVars();

        setTimeline(new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(getNode().scaleXProperty(), beginScale, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleYProperty(), beginScale, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleZProperty(), beginScale, AnimateFXInterpolator.EASE)
                ),
                new KeyFrame(Duration.millis(500),
                        new KeyValue(getNode().scaleXProperty(), endScale, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleYProperty(), endScale, AnimateFXInterpolator.EASE),
                        new KeyValue(getNode().scaleZProperty(), endScale, AnimateFXInterpolator.EASE)
                )
        ));
    }

    /*
     * rebuild the timeline with the new variable values
     */
    private void rebuildTimeline() {
        setNode(getNode());
    }
}
