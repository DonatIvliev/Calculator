package ui;

import ui.panels.*;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

import expression.ExpressionCalculator;

public class MainWindow extends JFrame implements ExpressionDelegate, ResultsPanelDelegate {
    private Container mainContainer;
    ExpressionJPanel expressionPanel;
    VariablesJPanel variablesPanel;
    ResultsJPanel resultsPanel ;

    private ExpressionCalculator calculator = new ExpressionCalculator();

    public MainWindow(){
         setupUi();

     }

    private void setupUi() {
         setTitle("Calculator");
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLayout(new BorderLayout());
         mainContainer = getContentPane();
         mainContainer.setBackground(new Color(216, 231, 179));

         createPanels();

         invalidate();
         validate();
         pack();
         setResizable(false);
         setVisible(true);
    }

    private void createPanels() {
        expressionPanel = new ExpressionJPanel();
        expressionPanel.delegate = this;
        resultsPanel = new ResultsJPanel();
        resultsPanel.delegate = this;
        variablesPanel = new VariablesJPanel();

        mainContainer.add(expressionPanel, BorderLayout.PAGE_START);
        mainContainer.add(resultsPanel, BorderLayout.PAGE_END);
        mainContainer.add(variablesPanel, BorderLayout.CENTER);
    }

    @Override
    public void expressionUpdated(String expression)
    {
        calculator.setExpressionString(expression);
        System.out.println(calculator.getVariablesList());
        variablesPanel.variablesUpdated(calculator.getVariablesList());
        invalidate();
        validate();
        pack();
    }

    @Override
    public String getResult() {


        calculator.setVariablesValue(variablesPanel.getVariablesValue());
        return calculator.calculate();


    }
}
