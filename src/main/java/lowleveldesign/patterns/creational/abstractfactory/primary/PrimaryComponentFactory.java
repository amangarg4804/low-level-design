package lowleveldesign.patterns.creational.abstractfactory.primary;

import lowleveldesign.patterns.creational.abstractfactory.Button;
import lowleveldesign.patterns.creational.abstractfactory.Menu;
import lowleveldesign.patterns.creational.abstractfactory.ThemeComponentFactory;

public class PrimaryComponentFactory implements ThemeComponentFactory {
    @Override
    public Button createButton() {
        return new PrimaryButton();
    }

    @Override
    public Menu createMenu() {
        return new PrimaryMenu();
    }
}
