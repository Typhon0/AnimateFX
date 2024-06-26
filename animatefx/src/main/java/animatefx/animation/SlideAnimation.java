package animatefx.animation;

import animatefx.modifier.Modifier;
import animatefx.modifier.SlideModifier;
import javafx.scene.Node;

/**
 * @author Dominik Müka aka 41zu
 */
public abstract class SlideAnimation extends AnimationFX {

    protected Double slideBy;

    public SlideAnimation(Node node) {
        super(node);
    }

    public SlideAnimation() { }

    /**
     * Accepts an Modifier from type SlideModifier
     */
    @Override
    public AnimationFX applyAnimationModifier(Modifier modifier) {
        if (modifier == null)
            throw new NullPointerException("modifier cannot be null");

        if (!(modifier instanceof SlideModifier))
            throw new IllegalArgumentException("The modifier instance must be from type SlideModifier, is: " + modifier.getClass().getName());

        // The attribute gets checked for null in the initTimeline method
        slideBy = ((SlideModifier) modifier).getSlideBy().doubleValue();

        initTimeline();
        setAnimationStoppedListener();
        return this;
    }
}
