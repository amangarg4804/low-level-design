package lowleveldesign.designproblems.pen;

public class PenFactory {
    public static GelPen.Builder createGelPen() {
        // use builder pattern to create GelPen
        return new GelPen.Builder();
    }
}
