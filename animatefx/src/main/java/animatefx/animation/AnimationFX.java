package animatefx.animation;

import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.Node;


/**
 * @author Loïc Sculier aka typhon0
 */
public abstract class AnimationFX {

    private Timeline timeline;
    private boolean reset, cache;
    private Node node;
    private AnimationFX nextAnimation;

    /**
     * @param node
     */
    public AnimationFX(Node node) {
        this.reset = false;
        cache = false;
        this.node = node;
        initTimeline();
        timeline.setOnFinished(this::onFinished);

    }

    public AnimationFX(Node node, boolean start) {
        this(node);
        play();

    }

    /**
     * Handle when the animation is finished
     *
     * @param actionEvent
     * @return
     */
    public AnimationFX onFinished(ActionEvent actionEvent) {
        if (reset) {
            resetNode();
        }

        if (cache) {
            //TODO cache
        }

        if (this.nextAnimation != null) {
            this.nextAnimation.play();
        }

        return this;
    }

    /**
     * Set the next animation to play
     *
     * @param animation
     * @return
     */
    public AnimationFX setPlayOnFinished(AnimationFX animation) {
        this.nextAnimation = animation;
        return this;
    }

    /**
     * Function to reset the node or not when the animation is finished
     *
     * @param reset
     * @return
     */
    public AnimationFX setResetOnFinished(boolean reset) {
        this.reset = reset;
        return this;
    }

    /**
     * Play the animation
     *
     * @return
     */
    public AnimationFX play() {

        timeline.play();
        return this;
    }

    /**
     * Stop the animation
     *
     * @return
     */
    public AnimationFX stop() {
        timeline.stop();
        return this;
    }

    /**
     * Function the reset the node to original state
     *
     * @return
     */
    abstract AnimationFX resetNode();

    /**
     * Function to initialize the timeline
     */
    abstract void initTimeline();


    public Timeline getTimeline() {
        return timeline;
    }

    public void setTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

    public boolean isResetOnFinished() {
        return reset;
    }

    protected void setReset(boolean reset) {
        this.reset = reset;
    }

    public boolean isCache() {
        return cache;
    }

    public void setCache(boolean cache) {
        this.cache = cache;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public AnimationFX getNextAnimation() {
        return nextAnimation;
    }

    protected void setNextAnimation(AnimationFX nextAnimation) {
        this.nextAnimation = nextAnimation;
    }
}
