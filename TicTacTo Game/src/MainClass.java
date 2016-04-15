/**
 * Created by Przemek on 2016-03-19.
 *
 *
 */

import  java.awt.*;
import javax.swing.*;

public class MainClass {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {

                JFrame frame = new JFrame();
                frame.setSize(new Dimension(600, 400));
                frame.add(new Panel());
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
                frame.setJMenuBar(new Menu());
                frame.setTitle("Tic Tac Toe game");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);

            }
        });
    }
}
