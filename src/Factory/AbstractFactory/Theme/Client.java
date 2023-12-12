package Factory.AbstractFactory.Theme;

import Factory.AbstractFactory.Theme.primary.PrimaryTheme;

public class Client {
    public static void main(String theme) {
        //we can also create a themeFactory to createTheme like simple factory
        Theme primaryTheme = Theme.createTheme(theme);
        ThemeComponentFactory componentFactory = primaryTheme.createComponentFactory();
        Button button = componentFactory.createButton();
    }
}
