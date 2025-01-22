package View.Elements;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {

    public Button(String name){
        super(name);
        setFont(new Font("Bahnschrift", Font.BOLD, Math.max(getWidth(), getHeight())));
        setForeground(Color.darkGray);
        setBackground(Color.white);
        setFocusable(false);
    }

    public Button(String name, int width, int height, int fontSize){
        super(name);
        setPreferredSize(new Dimension(width, height));
        setFont(new Font("Bahnschrift", Font.BOLD, fontSize));
        setForeground(Color.darkGray);
        setBackground(Color.white);
        setFocusable(false);
    }
}
