package lowleveldesign.patterns.abstractfactory.dark;

import lowleveldesign.patterns.abstractfactory.Button;
import lowleveldesign.patterns.abstractfactory.Menu;
import lowleveldesign.patterns.abstractfactory.ThemeComponentFactory;

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
