package ui.panels;

import javax.swing.*;
import java.awt.*;

public class VariablesJPanel extends JPanel {
    private static final int HEIGHT = 100;
    private static final int WIDTH = 500;
    public VariablesJPanel(){
        setupUi();
    }

    private void setupUi() {
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setBackground(new Color(255, 33, 98));
    }
}
