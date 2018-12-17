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
public class ParallelAnimationFX {

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

    public ParallelAnimationFX(Node node) {
        nodeProperty().set(node);
        reset = false;
    }

    public ParallelAnimationFX(Node node, AnimationFX... animations) {
        nodeProperty().set(node);
        getAnimation().setAll(animations);
        reset = false;
    }

    public ParallelAnimationFX(AnimationFX... animations) {
        getAnimation().setAll(animations);
        reset = false;
    }

    public ParallelAnimationFX() {
    }

    /**
     * A list of {@link AnimationFX Animations} that will be
     * played in parallel.
     * <p>
     * It is not possible to change the animation of a running
     * {@code ParallelAnimationFX}. If the animation are changed for a running
     * {@code ParallelAnimationFX}, the animation has to be stopped and started
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
        for (AnimationFX animation: animations) {
            if (nodeProperty().get() != null) {
                if (animation.getNode() == null) {
                    animation.setNode(nodeProperty().get());
                }
            }
            animation.play();
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


