package animatefx.animation;

import animatefx.modifier.Modifier;
import animatefx.modifier.ScaleModifier;
import javafx.scene.Node;

/**
 * @author Dominik Müka aka 41zu
 */
public abstract class ScaleAnimation extends AnimationFX {

    protected Double beginScale;
    protected Double endScale;

    public ScaleAnimation() { }

    public ScaleAnimation(Node node) {
        super(node);
    }

    @Override
    public AnimationFX setAnimationModifier(Modifier modifier) {
        if (modifier == null)
            throw new NullPointerException("modifier cannot be null");

        if (!(modifier instanceof ScaleModifier))
            throw new IllegalArgumentException("The modifier instance must be from type ScaleModifier, is: " + modifier.getClass().getName());

        // Attributes get checked for null in the initTimeline method
        ScaleModifier sm = (ScaleModifier) modifier;
        beginScale = sm.getBeginScale().doubleValue();
        endScale = sm.getEndScale().doubleValue();

        initTimeline();
        setAnimationStoppedListener();
        return this;
    }
}
