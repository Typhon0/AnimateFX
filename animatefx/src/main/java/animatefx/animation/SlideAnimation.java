package animatefx.animation;

import animatefx.modifier.Modifier;
import animatefx.modifier.SlideModifier;
import javafx.scene.Node;

public abstract class SlideAnimation extends AnimationFX {

    protected Number slideBy;

    public SlideAnimation(Node node) {
        super(node);
    }

    public SlideAnimation() { }

    /**
     * Accepts an Modifier from type SlideModifier
     */
    @Override
    public AnimationFX setAnimationModifier(Modifier modifier) {
        if (modifier == null)
            throw new NullPointerException("modifier cannot be null");

        if (!(modifier instanceof SlideModifier))
            throw new IllegalArgumentException("The modifier instance must be from type SlideModifier, is: " + modifier.getClass().getName());

        // The attribute gets checked for null in the initTimeline method
        slideBy = ((SlideModifier) modifier).getSlideBy();
        initTimeline();
        setAnimationStoppedListener();
        return this;
    }
}
