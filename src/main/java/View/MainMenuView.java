package View;

import javax.swing.*;
import java.awt.*;

public class MainMenuView {

    private final String iconPath = "../Sprites/ProgramIcon.png";
    private final String MenuName = "Сортировка";
    private final int minWeight = 500;
    private final int minHeight = 500;

    public void DrawMainMenu() {
        StartMenu startMenu = new StartMenu(MenuName, iconPath, minWeight, minHeight );
        startMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startMenu.setMinimumSize(new Dimension(minWeight, minHeight));
        startMenu.setLocationRelativeTo(null);
        startMenu.setVisible(true);
    }
}
