package ui.panels;

import ui.buttons.MainJButton;
import ui.labels.MainLabel;

import javax.swing.*;
import java.awt.*;

public class ResultsJPanel  extends JPanel {
    private static final int HEIGHT = 100;
    private static final int WIDTH = 500;
    private MainLabel resultLabel;
    private MainJButton resultButton;
    public ResultsJPanel(){
        setupUi();
    }

    private void setupUi() {
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setBackground(new Color(81, 218, 236));
        setupLayout();
        setupComponent();
    }
    private void setupLayout(){
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

    }

    private void setupComponent(){
        add(Box.createHorizontalStrut(10));
        resultLabel = new MainLabel("Answer: 0");
        add(resultLabel);
        add(Box.createHorizontalStrut(10));
        resultButton = new MainJButton("Calculate");
        add(resultButton);
        add(Box.createHorizontalStrut(10));

    }

}
