package View;

import View.Elements.Frame;
import View.Elements.Button;
import View.Elements.InputField;
import View.Elements.Label;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import javax.swing.*;
import java.awt.*;

public class MainWindowView implements ActionListener {

    private static final String DEFAULT_MENU_NAME = "Sorter";
    private static final String DEFAULT_ICON_PATH = "/images/ProgramIcon.png";
    private static final int DEFAULT_MIN_WIDTH = 1100;
    private static final int DEFAULT_MIN_HEIGHT = 600;

    private static final String ACTION_CLICK_RANDOMIZE_BTN = "RandomizeButtonClicked";
    private static final String ACTION_CLICK_SORT_BTN = "SortButtonClicked";
    private static final String ACTION_ENTERED_ARRAY = "ArrayEntered";
    private static final String ACTION_ENTERED_ARRAY_LENGTH = "ArrayLengthEntered";

    private final Image icon;
    private final String menuName;
    private final int minWidth;
    private final int minHeight;

    private Frame mainFrame;
    private JPanel startPanel;
    private InputField inputField_Array;
    private InputField inputField_ArrayLength;
    private InputField inputField_Result;

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
            int columnCounter = 0;
            int rowCounter = 0;

            Label label = new Label("Bubble Sorting", 64);
            AddElementToGrid(startPanel, label, grid, 0, rowCounter++);

            inputField_Array = new InputField(300, 80, 40);
            inputField_Array.setActionCommand(ACTION_ENTERED_ARRAY);
            inputField_Array.addActionListener(this);
            AddElementToGrid(startPanel, inputField_Array, grid, columnCounter, rowCounter++);

            Button buttonSetManually = CreateButton("Randomize");
            buttonSetManually.setActionCommand(ACTION_CLICK_RANDOMIZE_BTN);
            buttonSetManually.addActionListener(this);
            AddElementToGrid(startPanel, buttonSetManually, grid, columnCounter++, rowCounter);

            inputField_ArrayLength = new InputField(100, 80, 40);
            inputField_Array.setActionCommand(ACTION_ENTERED_ARRAY_LENGTH);
            inputField_Array.addActionListener(this);
            AddElementToGrid(startPanel, inputField_ArrayLength, grid, columnCounter++, rowCounter);

            Label description_Length = new Label("< Length", 40);
            AddElementToGrid(startPanel, description_Length, grid, columnCounter, rowCounter++);

            Button buttonSetRandomly = CreateButton("Sort");
            buttonSetRandomly.setActionCommand(ACTION_CLICK_SORT_BTN);
            buttonSetRandomly.addActionListener(this);
            AddElementToGrid(startPanel, buttonSetRandomly, grid,0, rowCounter++);

            inputField_Result = new InputField(600, 80, 40, false);
            AddElementToGrid(startPanel, inputField_Result, grid,0, rowCounter);

            Label description_Result = new Label("< Result", 40);
            AddElementToGrid(startPanel, description_Result, grid, 1, rowCounter);
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
        return new Button(name, 240, 80, 40);
    }

    private void AddElementToGrid(JPanel panel ,JComponent element ,GridBagConstraints grid, int columnCounter , int rowCounter) {
        grid.gridx = columnCounter;
        grid.gridy = rowCounter;
        panel.add(element, grid);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        if (Objects.equals(event.getActionCommand(), ACTION_CLICK_RANDOMIZE_BTN)){
            //TODO: Проверка наличия поля InputField_ArrayLength
        }

        if (Objects.equals(event.getActionCommand(), ACTION_CLICK_SORT_BTN)){
            //TODO: Проверка наличия массива в модели
        }

        if (Objects.equals(event.getActionCommand(), ACTION_ENTERED_ARRAY)){

            //TODO: Проверка наличия чисел и их кастинга в массив
        }

        if (Objects.equals(event.getActionCommand(), ACTION_ENTERED_ARRAY_LENGTH)){
            //TODO: Проверка кастинга в int поля InputField_ArrayLength
        }
    }
}