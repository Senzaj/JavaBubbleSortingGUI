package View.Elements;

import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {

    public Label(String name){
        super(name);
        setFont(new Font("Bahnschrift", Font.BOLD, Math.max(getWidth(), getHeight())));
        setForeground(Color.darkGray);
        setFocusable(false);
    }

    public Label(String name, int fontSize){
        super(name);
        setFont(new Font("Bahnschrift", Font.BOLD, fontSize));
        setForeground(Color.darkGray);
        setFocusable(false);
    }
}
