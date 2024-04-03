package lowleveldesign.patterns.abstractfactory.primary;

import lowleveldesign.patterns.abstractfactory.Button;
import lowleveldesign.patterns.abstractfactory.Menu;
import lowleveldesign.patterns.abstractfactory.ThemeComponentFactory;

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
