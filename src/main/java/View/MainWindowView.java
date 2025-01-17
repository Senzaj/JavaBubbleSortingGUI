package View;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class MainWindowView {

    private static final String DEFAULT_MENU_NAME = "Sorter";
    private static final int DEFAULT_MIN_WIDTH = 500;
    private static final int DEFAULT_MIN_HEIGHT = 500;
    private static final String DEFAULT_ICON_PATH = "/images/ProgramIcon.png";

    private final Image icon;
    private final String menuName;
    private final int minWidth;
    private final int minHeight;

    public MainWindowView(String menuName, int minWidth, int minHeight, String iconPath) {
        this.icon = loadIcon(iconPath);
        this.menuName = menuName;
        this.minWidth = minWidth;
        this.minHeight = minHeight;
    }

    public MainWindowView() {
        this(DEFAULT_MENU_NAME, DEFAULT_MIN_WIDTH, DEFAULT_MIN_HEIGHT, DEFAULT_ICON_PATH);
    }

    public void DrawWindow() {
        StartMenu startMenu = CreateStartMenu();
        ConfigureStartMenu(startMenu);
        startMenu.setVisible(true);
    }

    private Image loadIcon(String path) {
        try {
            return new ImageIcon(Objects.requireNonNull(this.getClass().getResource(path))).getImage();
        }
        catch (NullPointerException e) {
            System.err.println("Ошибка: файл иконки не найден по пути " + path);
            return null;
        }
    }

    private StartMenu CreateStartMenu() {
        return new StartMenu(menuName, icon, minWidth, minHeight);
    }

    private void ConfigureStartMenu(JFrame frame) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(minWidth, minHeight));
        frame.setLocationRelativeTo(null);
    }
}