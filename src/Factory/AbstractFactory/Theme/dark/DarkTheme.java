package Factory.AbstractFactory.Theme.dark;

import Factory.AbstractFactory.Theme.Theme;
import Factory.AbstractFactory.Theme.ThemeComponentFactory;

public class DarkTheme extends Theme {

    @Override
    public ThemeComponentFactory createComponentFactory(){
        return new DarkThemeFactory();
    }
}
