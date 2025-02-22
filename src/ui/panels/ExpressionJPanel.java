package ui.panels;

import ui.textFields.ExpressionJTextField;

import javax.swing.*;
import java.awt.*;

public class ExpressionJPanel  extends JPanel {
    private static final int HEIGHT = 100;
    private static final int WIDTH = 500;
    private ExpressionJTextField expressionField ;
    public ExpressionJPanel(){
        setupUi();
    }

    private void setupUi() {
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setBackground(new Color(89, 213, 137));
        setLayout(new FlowLayout());
        expressionField = new ExpressionJTextField(new Color(24, 105, 23),getBackground());
        add(expressionField);

    }
}
