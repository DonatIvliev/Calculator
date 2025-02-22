package ui.textFields;

import javax.swing.border.AbstractBorder;
import java.awt.*;

public class RoundedBoarder extends AbstractBorder {
    private int radius;
    private int paddingLeft;
    private Color color;
    public RoundedBoarder(int radius, Color color) {
        this.radius = radius;
        this.paddingLeft = radius;
        this.color = color;
    }

    public RoundedBoarder(int radius, int paddingLeft, Color color) {
        this.radius = radius;
        this.paddingLeft = paddingLeft;
        this.color = color;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(color); // Колір рамки
        g2.setStroke(new BasicStroke(3));
        g2.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
        g2.dispose();
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(5, paddingLeft, 5, 5); // Відступи (верх, ліво, низ, право)
    }

    @Override
    public Insets getBorderInsets(Component c, Insets insets) {
        insets.set(5, paddingLeft, 5, 5);
        return insets;
    }
}
