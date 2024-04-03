package lowleveldesign.patterns.abstractfactory.dark;

import lowleveldesign.patterns.abstractfactory.Theme;
import lowleveldesign.patterns.abstractfactory.ThemeComponentFactory;

public class DarkTheme extends Theme {
    @Override
    public ThemeComponentFactory createComponentFactory() {
        return new DarkComponentFactory();
    }
}
