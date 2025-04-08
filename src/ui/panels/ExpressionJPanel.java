package ui.panels;

import ui.textFields.ExpressionJTextField;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class ExpressionJPanel  extends JPanel {
    public ExpressionDelegate delegate;
    private static final int HEIGHT = 50;
    private static final int WIDTH = 500;
    private ExpressionJTextField expressionField ;
    public ExpressionJPanel(){
        setupUi();
    }

    private void setupUi() {
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setBackground(new Color(89, 213, 137));
        setLayout(new FlowLayout());
        expressionField = new ExpressionJTextField(new Color(255, 255, 255),getBackground());
        add(expressionField);
        expressionField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                textUpdated();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                textUpdated();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
            private void textUpdated(){
                System.out.println("Text changed to: " + expressionField.getText());
                delegate.expressionUpdated(expressionField.getText());
            }
        });

    }
}
