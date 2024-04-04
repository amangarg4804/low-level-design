package lowleveldesign.patterns.creational.abstractfactory;

import lowleveldesign.patterns.creational.abstractfactory.dark.DarkTheme;

public class Client {
    public static void main(String[] args) {
        Theme theme = new DarkTheme();// // only this line requires change when we need to change theme.
        // Assignment is to instead of hardcoding DarkTheme here, have a method that accepts String and returns DarkTheme or PrimaryTheme
        ThemeComponentFactory componentFactory = theme.createComponentFactory();
        Button button = componentFactory.createButton();
        Menu menu = componentFactory.createMenu();
        // Notice that this module is entirely dependent ob abstractions, no concrete classes
    }
}
