package Factory.AbstractFactory.Theme;

// step 3 create componentFactory
public interface ThemeComponentFactory {
    Button createButton();
    Menu createMenu();
}
