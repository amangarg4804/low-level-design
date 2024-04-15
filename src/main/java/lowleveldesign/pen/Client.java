package lowleveldesign.pen;

public class Client {
    public static void main(String[] args) {
        GelPen reynoldsTrimaxPen = PenFactory.createGelPen()
        	.withRefil(new Refil())
        	.withCanChangeRefil(true)
        	.build();
        reynoldsTrimaxPen.setName("trimax");
        reynoldsTrimaxPen.setCompany("Reynolds");
        // we can use prototype pattern and registry to save trimax reynolds
        // which can use clone method to create new Reynold trimax pen whenever required
    }
}
