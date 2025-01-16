package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Objects;

public class StartMenu extends JFrame {

    private final String StartButtonText = "Start";
    private final String SettingsButtonText = "Settings";
    private final ImageIcon iconFile;
    private JPanel buttonsPanel;
    private JButton start, stop;
    private final int width, height;

    public StartMenu(String winTitle, String iconPath, int w, int h) {
        super(winTitle);

        width = w;
        height = h;
        iconFile = new ImageIcon(Objects.requireNonNull(StartMenu.class.getResource(iconPath)));
        setIconImage(iconFile.getImage());
        setSize(width, height);

        start = new JButton(StartButtonText);
        stop = new JButton(SettingsButtonText);

        ActionListener MainMenuButtonsListener = new ButtonsListener();
        start.setActionCommand("StartGame");
        stop.setActionCommand("OpenSettings");
        start.addActionListener(MainMenuButtonsListener);
        stop.addActionListener(MainMenuButtonsListener);

        buttonsPanel = new JPanel();
        buttonsPanel.add(start);
        buttonsPanel.add(stop);
        getContentPane().add(BorderLayout.SOUTH, buttonsPanel);
    }
}
