package lowleveldesign.patterns.creational.abstractfactory.primary;

import lowleveldesign.patterns.creational.abstractfactory.Theme;
import lowleveldesign.patterns.creational.abstractfactory.ThemeComponentFactory;

public class PrimaryTheme extends Theme {
    @Override
    public ThemeComponentFactory createComponentFactory() {
        return new PrimaryComponentFactory();
    }
}
