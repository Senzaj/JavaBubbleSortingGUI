package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private final String StartButtonText = "Start";
    private final String SettingsButtonText = "Settings";
    private final ImageIcon iconFile;
    private JPanel buttonsPanel;
    private JButton start, stop;
    private final int width, height;

    public MainFrame(String winTitle, Image icon, int w, int h) {
        super(winTitle);

        width = w;
        height = h;
        iconFile = new ImageIcon(icon);
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
