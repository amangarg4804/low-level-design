package lowleveldesign.pen;

import lowleveldesign.pen.strategy.write.SmoothWriteBehaviour;
import lowleveldesign.pen.strategy.write.WriteBehaviour;

public class BallPen extends Pen implements  RefillPen{
    private Refil refil;
    private boolean canChangeRefil;
    public BallPen(WriteBehaviour writeBehaviour) {
        super(PenType.BALL, writeBehaviour);
    }

    public static class Builder {
        private Refil refil;
        private boolean canChangeRefil;
        public BallPen.Builder withRefil(Refil refil) {
            this.refil = refil;
            return this;
        }
        public BallPen.Builder withCanChangeRefil(boolean canChangeRefil) {
            this.canChangeRefil = canChangeRefil;
            return this;
        }
        public BallPen build() {
            BallPen ballPen = new BallPen(new SmoothWriteBehaviour());
            ballPen.canChangeRefil = this.canChangeRefil;
            ballPen.refil = this.refil;
            return ballPen;
        }

    }
    @Override
    public void write() {

    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public Refil getRefil() {
        return refil;
    }

    @Override
    public boolean canChangeRefil() {
        return true;
    }

    @Override
    public void changeRefil(Refil newREfil) {

    }
}
