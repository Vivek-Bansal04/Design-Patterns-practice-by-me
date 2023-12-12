package Factory.AbstractFactory.Theme.primary;

import Factory.AbstractFactory.Theme.Theme;
import Factory.AbstractFactory.Theme.ThemeComponentFactory;

public class PrimaryTheme extends Theme{

    @Override
    public ThemeComponentFactory createComponentFactory(){
        return new PrimaryThemeFactory();
    }


}
