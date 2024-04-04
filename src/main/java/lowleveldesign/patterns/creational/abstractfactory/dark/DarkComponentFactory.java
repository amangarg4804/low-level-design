package lowleveldesign.patterns.creational.abstractfactory.dark;

import lowleveldesign.patterns.creational.abstractfactory.Button;
import lowleveldesign.patterns.creational.abstractfactory.Menu;
import lowleveldesign.patterns.creational.abstractfactory.ThemeComponentFactory;

public class DarkComponentFactory implements ThemeComponentFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Menu createMenu() {
        return new DarkMenu();
    }
}
