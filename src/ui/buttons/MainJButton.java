package ui.buttons;

import javax.swing.*;
import java.awt.*;

public class MainJButton extends JButton {
    public MainJButton(String text) {
        super(text);
    }
    private void setupUi(){
        setPreferredSize(new Dimension(50, 20));
    }
}
