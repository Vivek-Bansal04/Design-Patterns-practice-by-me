package Factory.AbstractFactory.Theme.primary;

import Factory.AbstractFactory.Theme.Button;
import Factory.AbstractFactory.Theme.Menu;
import Factory.AbstractFactory.Theme.ThemeComponentFactory;

public class PrimaryThemeFactory implements ThemeComponentFactory {
    @Override
    public Button createButton() {
        return new PrimaryButton();
    }

    @Override
    public Menu createMenu() {
        return new PrimaryMenu();
    }
}
