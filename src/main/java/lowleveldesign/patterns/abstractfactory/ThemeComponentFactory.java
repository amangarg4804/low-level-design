package lowleveldesign.patterns.abstractfactory;

// Step 3: Create component factory
// factory of factories
public interface ThemeComponentFactory {
    Button  createButton();
    Menu createMenu();

}
