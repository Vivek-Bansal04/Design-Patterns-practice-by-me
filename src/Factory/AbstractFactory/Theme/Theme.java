package Factory.AbstractFactory.Theme;

import Factory.AbstractFactory.Theme.dark.DarkTheme;
import Factory.AbstractFactory.Theme.primary.PrimaryTheme;

//step 1 create parent
//step 4 add factory method
public abstract class Theme {
    private String name;
    private String primaryColor;
    private String authorName;

    public static Theme createTheme(String themeName) {
        if ("PrimaryTheme".equalsIgnoreCase(themeName)) {
            return new PrimaryTheme();
        } else if ("DarkTheme".equalsIgnoreCase(themeName)) {
            return new DarkTheme();
        } else {
            throw new IllegalArgumentException("Unknown theme: " + themeName);
        }
    }

    //factory method
    public abstract ThemeComponentFactory createComponentFactory();

}
