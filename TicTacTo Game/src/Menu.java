import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Przemek on 2016-03-19.
 */
public class Menu extends JMenuBar{

    private JMenu gameMenu;

    public Menu()
    {
        gameMenu=new JMenu("Game Menu");
        add(gameMenu);
        gameMenu.add(new JMenuItem(new AbstractAction("Restart Game") {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i=0;i<=8;i++) {
                    GameEngine.data[i] = '\u0000';
                    Panel.restartButtonTable(i);
                }
                Panel.counter = 0;
            }
        }));

        gameMenu.add(new JMenuItem(new AbstractAction("help") {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        }));

        gameMenu.add(new JMenuItem(new AbstractAction("About") {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        }));

        gameMenu.add( new JMenuItem(new AbstractAction("Exit") {
            public void actionPerformed(ActionEvent e) {

                System.exit(0);
            }
        }));





    }

}
