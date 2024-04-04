package lowleveldesign.patterns.creational.abstractfactory.dark;

import lowleveldesign.patterns.creational.abstractfactory.Theme;
import lowleveldesign.patterns.creational.abstractfactory.ThemeComponentFactory;

public class DarkTheme extends Theme {
    @Override
    public ThemeComponentFactory createComponentFactory() {
        return new DarkComponentFactory();
    }
}
