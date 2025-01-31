package View.Elements;

import javax.swing.*;
import java.awt.*;

public class InputField extends JTextField {

    public InputField( int width, int height, int fontSize){
        setPreferredSize(new Dimension(width, height));
        setFont(new Font("Bahnschrift", Font.BOLD, fontSize));
        setForeground(Color.darkGray);
        setBackground(Color.white);
    }

    public InputField( int width, int height, int fontSize, Boolean isFocusable){
        setPreferredSize(new Dimension(width, height));
        setFont(new Font("Bahnschrift", Font.BOLD, fontSize));
        setForeground(Color.darkGray);
        setBackground(Color.white);
        setFocusable(isFocusable);
    }
}
