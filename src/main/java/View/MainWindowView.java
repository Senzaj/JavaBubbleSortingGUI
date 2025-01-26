package View;

import View.Elements.Frame;
import View.Elements.Button;
import View.Elements.Label;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import javax.swing.*;
import java.awt.*;

public class MainWindowView implements ActionListener {

    private static final String DEFAULT_MENU_NAME = "Sorter";
    private static final String DEFAULT_ICON_PATH = "/images/ProgramIcon.png";
    private static final int DEFAULT_MIN_WIDTH = 500;
    private static final int DEFAULT_MIN_HEIGHT = 500;

    private static final String ACTION_CLICK_MANUALLY_BTN = "ManuallyButtonClicked";
    private static final String ACTION_CLICK_RANDOMLY_BTN = "RandomlyButtonClicked";

    private final Image icon;
    private final String menuName;
    private final int minWidth;
    private final int minHeight;

    private Frame mainFrame;
    private JPanel startPanel;

    public MainWindowView(String menuName, int minWidth, int minHeight, String iconPath) {
        this.icon = loadIcon(iconPath);
        this.menuName = menuName;
        this.minWidth = minWidth;
        this.minHeight = minHeight;
        mainFrame = CreateStartMenu();
        ConfigureStartMenu(mainFrame);
    }

    public MainWindowView() {
        this(DEFAULT_MENU_NAME, DEFAULT_MIN_WIDTH, DEFAULT_MIN_HEIGHT, DEFAULT_ICON_PATH);
        mainFrame = CreateStartMenu();
        ConfigureStartMenu(mainFrame);
    }

    public void DrawWindow() {
        mainFrame.setVisible(true);
    }

    public void SetStartPanel(){
        if (startPanel == null) {

            startPanel = new JPanel();
            startPanel.setLayout(new GridBagLayout());

            GridBagConstraints grid = new GridBagConstraints();
            grid.fill = GridBagConstraints.HORIZONTAL;
            grid.insets = new Insets(10, 5, 5, 5);
            int rowCounter = 0;

            Label label = new Label("Bubble Sorting", 60);
            AddElementToGrid(startPanel, label, grid, rowCounter++);
            Button buttonSetManually = CreateButton("Set Manually");
            buttonSetManually.setActionCommand(ACTION_CLICK_MANUALLY_BTN);
            buttonSetManually.addActionListener(this);
            AddElementToGrid(startPanel, buttonSetManually, grid, rowCounter++);
            Button buttonSetRandomly = CreateButton("Set Randomly");
            buttonSetRandomly.setActionCommand(ACTION_CLICK_RANDOMLY_BTN);
            buttonSetRandomly.addActionListener(this);
            AddElementToGrid(startPanel, buttonSetRandomly, grid, rowCounter);
        }

        mainFrame.add(startPanel);
        mainFrame.revalidate();
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

    private Frame CreateStartMenu() {
        return new Frame(menuName, icon, minWidth, minHeight);
    }

    private void ConfigureStartMenu(JFrame frame) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(minWidth, minHeight));
        frame.setLocationRelativeTo(null);
    }

    private Button CreateButton(String name){
        return new Button(name, 330, 100, 42);
    }

    private void AddElementToGrid(JPanel panel ,JComponent element ,GridBagConstraints grid, int rowCounter){
        grid.gridx = 0;
        grid.gridy = rowCounter;
        panel.add(element, grid);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        if (Objects.equals(event.getActionCommand(), ACTION_CLICK_MANUALLY_BTN)){

        }

        if (Objects.equals(event.getActionCommand(), ACTION_CLICK_RANDOMLY_BTN)){

        }
    }
}