package ui.textFields;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class ExpressionJTextField extends JTextField {
    private static final int HEIGHT = 50;
    private static final int WIDTH = 250;
    private Color brdColor;
    private Shape shape;
    private int paddingLeft = 5;
    public  ExpressionJTextField(Color brdColor, Color bgColor) {
        super();
        this.brdColor =  brdColor;
        setupUi();
        setBackground(bgColor);

    }

    private void setupUi() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setupFont();
        setOpaque(false);
        setBorder(new RoundedBoarder(20,10,Color.CYAN));
    }
    private void setupFont(){
        setForeground(brdColor);
        setFont(new Font("Arial", Font.BOLD, 20));
    }
//    protected void paintComponent(Graphics g) {
//        g.setColor(getBackground());
//        g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
//        super.paintComponent(g);
//    }

//    public boolean contains(int x, int y) {
//        if (shape == null || !shape.getBounds().equals(getBounds())) {
//            shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, 15, 15);
//        }
//        return shape.contains(x, y);
//    }

}
