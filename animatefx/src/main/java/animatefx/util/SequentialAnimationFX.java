package animatefx.util;

import animatefx.animation.AnimationFX;
import javafx.animation.Animation;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;

/**
 * @author Loïc Sculier aka typhon0
 */
public class SequentialAnimationFX {

    private Animation.Status status;

    private ObjectProperty<Node> node;

    private boolean reset;

    /**
     * The node property
     *
     * @return node property
     */
    public final ObjectProperty<Node> nodeProperty() {
        if (node == null) {
            node = new SimpleObjectProperty<>(this, "node", null);
        }
        return node;
    }

    private ObservableList<AnimationFX> animations = FXCollections.observableArrayList();

    public SequentialAnimationFX(Node node) {
        nodeProperty().set(node);
        reset = false;
    }

    public SequentialAnimationFX(Node node, AnimationFX... animations) {
        nodeProperty().set(node);
        getAnimation().setAll(animations);
        reset = false;
    }

    public SequentialAnimationFX(AnimationFX... animations) {
        getAnimation().setAll(animations);
        reset = false;
    }

    public SequentialAnimationFX() {
    }

    /**
     * A list of {@link AnimationFX Animations} that will be
     * played sequentially.
     * <p>
     * It is not possible to change the animation of a running
     * {@code SequentialAnimationFX}. If the animation are changed for a running
     * {@code SequentialAnimationFX}, the animation has to be stopped and started
     * again to pick up the new value.
     */
    public final ObservableList<AnimationFX> getAnimation() {
        return animations;
    }


    /**
     * Set the node
     *
     * @param value the node
     */
    public void setNode(Node value) {
        if ((node != null) || (value != null)) {
            nodeProperty().set(value);
        }
    }

    /**
     * Play the animations
     */
    public void play() {
        initAnimations();
        getAnimation().get(0).play();
        status = Animation.Status.RUNNING;
    }

    /**
     * Initialize which animation to play after another
     */
    private void initAnimations() {
        for (int i = 0; i < getAnimation().size() - 1; i++) {
            if (nodeProperty().get() != null) {
                if (getAnimation().get(i).getNode() == null) {
                    getAnimation().get(i).setNode(nodeProperty().get());
                }
            }
            if (getAnimation().get(i + 1) != null) {
                getAnimation().get(i).playOnFinished(getAnimation().get(i + 1));
            }
        }
        // config last animation
        if (nodeProperty().get() != null) {
            if (getAnimation().get(getAnimation().size() - 1).getNode() == null) {
                getAnimation().get(getAnimation().size() - 1).setNode(nodeProperty().get());
            }
        }
        if (reset) {
            getAnimation().get(getAnimation().size() - 1).setResetOnFinished(true);
        }
    }

    /**
     * Stop the animations
     */
    public void stop() {
        status = Animation.Status.STOPPED;
        for (AnimationFX animationFX : animations) {
            animationFX.stop();
        }
    }

    /**
     * Get the status
     *
     * @return animations status
     */
    public Animation.Status getStatus() {
        return status;
    }

    /**
     * Set if the node have to reset at the end
     *
     * @param value true to reset
     */
    public void setResetOnFinished(boolean value) {
        this.reset = value;
    }
}


