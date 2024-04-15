package lowleveldesign.pen;

import lowleveldesign.pen.strategy.write.SmoothWriteBehaviour;
import lowleveldesign.pen.strategy.write.WriteBehaviour;

public class GelPen extends Pen implements RefillPen {

    private Refil refil;
    private boolean canChangeRefil;
    private GelPen(WriteBehaviour writeBehaviour) {
        super(PenType.GEL, writeBehaviour);
    }

    public static class Builder {
        private Refil refil;
        private boolean canChangeRefil;
        public Builder withRefil(Refil refil) {
            this.refil = refil;
            return this;
        }
        public Builder withCanChangeRefil(boolean canChangeRefil) {
            this.canChangeRefil = canChangeRefil;
            return this;
        }
        public GelPen build() {
            GelPen gelPen = new GelPen(new SmoothWriteBehaviour());
            gelPen.canChangeRefil = this.canChangeRefil;
            gelPen.refil = this.refil;
            return gelPen;
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
        return canChangeRefil;
    }

    @Override
    public void changeRefil(Refil newREfil) {

    }
}
