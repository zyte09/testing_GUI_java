import javax.swing.*;
import java.awt.*;
public class Game {
    JFrame window;
    Container container;
    JPanel titleNamePanel;
    public static void main(String[] args) {
        new Game();
    }

    public Game() {
        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        container = window.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 150);
        titleNamePanel.setLayout(null);
        titleNamePanel.setBackground(Color.blue);
        container.add(titleNamePanel);


    }
}
