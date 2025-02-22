package ui.labels;

import javax.swing.*;
import java.awt.*;

public class MainLabel extends JLabel {

    public MainLabel(String text) {
        super(text);
        setupUi();
    }

    private void setupUi(){
        setPreferredSize(new Dimension(50,20));
        setMaximumSize(new Dimension(Integer.MAX_VALUE, getPreferredSize().height));
    }
}
