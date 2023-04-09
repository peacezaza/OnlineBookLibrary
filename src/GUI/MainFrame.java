package GUI;

import javax.swing.*;

public class MainFrame {
    private JFrame frame = new JFrame();

    public MainFrame(){
        frame.setSize(400,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}

class Main{
    public static void main(String[] args) {
        new MainFrame();
    }
}
