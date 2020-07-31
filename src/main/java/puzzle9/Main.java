package puzzle9;

import javax.swing.*;
public class Main extends JFrame {
    public Main(){
        Game game=new Game();
        addKeyListener(game);
        add(game);
        setTitle("hesam");
        setSize(800,600);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
