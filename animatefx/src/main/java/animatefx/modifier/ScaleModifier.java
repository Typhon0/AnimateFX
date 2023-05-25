package animatefx.modifier;

/**
 * @author Dominik Müka aka 41zu
 */
public class ScaleModifier implements Modifier {

    private Number beginScale;
    private Number endScale;

    public ScaleModifier() { }

    public ScaleModifier(Number beginScale, Number endScale) {
        this.beginScale = beginScale;
        this.endScale = endScale;
    }

    public Number getBeginScale() {
        return beginScale;
    }

    public Number getEndScale() {
        return endScale;
    }

    public void setBeginScale(Number beginScale) {
        this.beginScale = beginScale;
    }

    public void setEndScale(Number endScale) {
        this.endScale = endScale;
    }
}
