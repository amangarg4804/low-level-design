package lowleveldesign.pen;

import lowleveldesign.pen.strategy.write.WriteBehaviour;

public class FountainPen extends Pen{
    private Refil refil;
    private boolean canChangeRefil;
    public FountainPen(WriteBehaviour writeBehaviour) {
        super(PenType.FOUNTAIN, writeBehaviour);
    }

    @Override
    public void write() {

    }

    @Override
    public Color getColor() {
        return null;
    }
}
