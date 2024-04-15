package lowleveldesign.pen;

public interface RefillPen {
    // 1. If we created it as an abstract class, there would be class explosion, GelRefillPen, GenNonRefillPen, GelRefillOtherFeaturePen
    // RefillPen is a noun and this is an interface , should we change into Refillable? No, because refillable means,the pen can be refiled,
    // but thee are some pens with refil but not allow to change refil
    Refil getRefil();
    boolean canChangeRefil();

    void changeRefil(Refil newREfil); // is this volaite inteface seggrgation?
    // No because canChangeRefil and changeRefil are related methods just like hasNext() and next() in Iterable
}
