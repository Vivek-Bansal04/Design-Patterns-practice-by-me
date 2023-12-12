package Factory.AbstractFactory.Theme.dark;

import Factory.AbstractFactory.Theme.Button;
import Factory.AbstractFactory.Theme.Menu;
import Factory.AbstractFactory.Theme.ThemeComponentFactory;

public class DarkThemeFactory implements ThemeComponentFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Menu createMenu() {
        return new DarkMenu();
    }
}
