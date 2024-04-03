package lowleveldesign.patterns.abstractfactory;

// Step 1: Create parent class
// Step 4: Add factory method
public abstract class Theme {
    private String name;
    private String colour;
    private String authorName;
    // how do we link Theme to a Theme component factory? By a factory method
    // This is a factory of factories
    public abstract ThemeComponentFactory createComponentFactory();
}
