package ui.panels;

import ui.buttons.MainJButton;
import ui.labels.MainLabel;
import ui.textFields.ExpressionJTextField;

import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.*;

public class VariablesJPanel extends JPanel {
    private static final int HEIGHT = 200;
    private static final int WIDTH = 500;
    private int variablesCount = 12;
    GridBagConstraints gbc = new GridBagConstraints();
    GroupLayout layout;
    public VariablesJPanel(){
        setupUi();
    }

    private void setupUi() {
        int rows = variablesCount % 2 == 0?variablesCount/2: variablesCount/2 + 1;
        int height = rows * 29;
        setPreferredSize(new Dimension(WIDTH,height));
        setBackground(new Color(255, 255, 255));
        layout = new GroupLayout(this);
        setLayout(layout);
        createVariables();

    }


    private void createSingleRow(MainJButton button , ExpressionJTextField field, GroupLayout.SequentialGroup vGroup,  GroupLayout.ParallelGroup col1,  GroupLayout.ParallelGroup col2){
        button = new MainJButton("A");
        //buttons[i][0].setPreferredSize(new Dimension(100, 50));
        field = new ExpressionJTextField(new Color(255, 176, 176), new Color(255, 255, 255));
        //fields[i][0].setPreferredSize(new Dimension(50, 50));

        col1.addComponent(button);
        col2.addComponent(field);

        vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(button)
                .addComponent(field));
    }



    private void createVariables() {
        int rows = variablesCount % 2 == 0?variablesCount/2: variablesCount/2 + 1;
        MainJButton[][] buttons = new MainJButton[rows][2];
        ExpressionJTextField[][] fields = new ExpressionJTextField[rows][2];

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
        GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();

        GroupLayout.ParallelGroup col1 = layout.createParallelGroup(GroupLayout.Alignment.LEADING);
        GroupLayout.ParallelGroup col2 = layout.createParallelGroup(GroupLayout.Alignment.LEADING);
        GroupLayout.ParallelGroup col3 = layout.createParallelGroup(GroupLayout.Alignment.LEADING);
        GroupLayout.ParallelGroup col4 = layout.createParallelGroup(GroupLayout.Alignment.LEADING);
        int pairRows = variablesCount % 2 == 0?rows:rows-1;
        for(int i = 0; i < pairRows ; i++) {
            buttons[i][0] = new MainJButton("A");
            buttons[i][0].setBorder(null);
            //buttons[i][0].setPreferredSize(new Dimension(100, 50));
            fields[i][0] = new ExpressionJTextField(new Color(255, 176, 176), new Color(255, 255, 255));
            //fields[i][0].setPreferredSize(new Dimension(50, 50));



            buttons[i][1] = new MainJButton("A");
            //buttons[i][1].setPreferredSize(new Dimension(100, 50));
            fields[i][1] = new ExpressionJTextField(new Color(255, 176, 176), new Color(255, 255, 255));
            //fields[i][1].setPreferredSize(new Dimension(50, 50));


            col1.addComponent(buttons[i][0]);
            col2.addComponent(fields[i][0]);
            col3.addComponent(buttons[i][1]);
            col4.addComponent(fields[i][1]);


            vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(buttons[i][0])
                    .addComponent(fields[i][0])
                    .addComponent(buttons[i][1])
                    .addComponent(fields[i][1]));


        }
        if(pairRows < rows) {
            createSingleRow(buttons[rows - 1][0], fields[rows - 1][0], vGroup, col1, col2);
        }
        hGroup.addGroup(col1);
        hGroup.addGroup(col2);
        hGroup.addGroup(col3);
        hGroup.addGroup(col4);
        layout.setHorizontalGroup(hGroup);
        layout.setVerticalGroup(vGroup);
    }
}
