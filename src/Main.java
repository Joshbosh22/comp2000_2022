import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

public static void main(String[] args) throws Exception {
Main window = new Main();
}

public Main() {
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// created a 20x20 grid
Grid grid = new Grid(20, 20);
this.setContentPane(grid);
this.pack();
this.setVisible(true);
}

public class Cell extends JPanel {
Color fillColor;
Color borderColor;

public Cell(int width, int height) {
setPreferredSize(new Dimension(width, height));
fillColor = Color.WHITE;
borderColor = Color.BLACK;
}

@Override

protected void paintComponent(Graphics g) {

super.paintComponent(g);
g.setColor(fillColor);
g.fillRect(0, 0, getWidth(), getHeight());
g.setColor(borderColor);
g.drawRect(0, 0, getWidth(), getHeight());
}

}

public class Grid extends JPanel {
Cell grid[][];
public Grid(int rows, int cols) {
grid = new Cell[rows][cols];
setLayout(new GridLayout(rows, cols));
for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
        grid[i][j] = new Cell(35, 35);
        add(grid[i][j]);   
    }
}
setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

}

}

}