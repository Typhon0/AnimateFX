package animatefx.animation;

import javafx.animation.Interpolator;

public final class AnimateFXInterpolator {

    private AnimateFXInterpolator() {
        throw new IllegalStateException("AnimateFX Interpolator");
    }

    public static final Interpolator EASE = Interpolator.SPLINE(0.25, 0.1, 0.25, 1);

    public static final Interpolator BOUNCE_EASE_IN = Interpolator.SPLINE(0.215, 0.610, 0.355, 1.000);
    public static final Interpolator BOUNCE_EASE_OUT = Interpolator.SPLINE(0.755, 0.050, 0.855, 0.060);

}
