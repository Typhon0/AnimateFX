package animatefx.animation;

import javafx.animation.Interpolator;

public final class AnimateFXInterpolator {

    private AnimateFXInterpolator() {
        throw new IllegalStateException("AnimateFX Interpolator");
    }

    public static final Interpolator EASE = Interpolator.SPLINE(0.25, 0.1, 0.25, 1);

}
