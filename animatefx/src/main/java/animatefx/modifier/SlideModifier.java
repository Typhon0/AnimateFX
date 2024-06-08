package animatefx.modifier;

/**
 * Describes by how much an animation should slide
 *
 * @author Dominik Müka aka 41zu
 */
public class SlideModifier implements Modifier {

    private Number slideBy;

    public SlideModifier() { }

    public SlideModifier(Number slideBy) {
        this.slideBy = slideBy;
    }

    public Number getSlideBy() {
        return slideBy;
    }

    public void setSlideBy(Number slideBy) {
        this.slideBy = slideBy;
    }
}
