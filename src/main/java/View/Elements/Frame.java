package View.Elements;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    private final ImageIcon iconFile;
    private final int width, height;

    public Frame(String winTitle, Image icon, int w, int h) {
        super(winTitle);

        width = w;
        height = h;
        iconFile = new ImageIcon(icon);
        setIconImage(iconFile.getImage());
        setSize(width, height);
    }
}
