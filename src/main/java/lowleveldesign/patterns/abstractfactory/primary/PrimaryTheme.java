package lowleveldesign.patterns.abstractfactory.primary;

import lowleveldesign.patterns.abstractfactory.Theme;
import lowleveldesign.patterns.abstractfactory.ThemeComponentFactory;

public class PrimaryTheme extends Theme {
    @Override
    public ThemeComponentFactory createComponentFactory() {
        return new PrimaryComponentFactory();
    }
}
