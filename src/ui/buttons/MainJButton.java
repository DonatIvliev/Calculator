package ui.buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainJButton extends JButton {
    Color boarderColor = Color.GREEN;
    boolean dark = false;
    public MainJButton(String text) {
        super(text);
        setupUi();
    }
    private void setupUi(){
        setBorder(BorderFactory.createLineBorder(boarderColor));
        setBorderPainted(true);
        setContentAreaFilled(false);
        setOpaque(true);
        setFocusable(false);
        setForeground(boarderColor);
        setBackground(new Color(229, 255, 227));
        setFont(new Font("Arial", Font.PLAIN, 14));
        setPreferredSize(new Dimension(70, 20));
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                //super.mousePressed(e);
                setBackground(getBackground().darker());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //super.mouseReleased(e);
                setBackground(getBackground().brighter());
            }
        });
    }


}
