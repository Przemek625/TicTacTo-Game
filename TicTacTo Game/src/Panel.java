import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Przemek on 2016-03-19.
 */
public class Panel extends JPanel{

    private JPanel F1,F2;


    private static JButton[] buttonTable;
    private JLabel lblXWins, lblOWins, lblDraws;
    private JLabel lblXWins_1;
    private JLabel lblOWins_1;
    private JLabel lblDraws_1;
    private String buttonID;
    private int buttonIndex;

    private int XWins = 0;
    private int OWins = 0;
    private int Draws = 0;

    private static ImageIcon X,O;

    public static int counter=0;

    public Panel()
    {
        setLayout(new BorderLayout());
        F1=new JPanel();


        F1.setPreferredSize(new Dimension(400,400));
        F1.setLayout(new GridLayout(3,3));
        buttonTable=new JButton[9];

        X=new ImageIcon(this.getClass().getResource("images/X.png"));
        O=new ImageIcon(this.getClass().getResource("images/O.png"));

        for(int i=0;i<=8;i++)
        {
            buttonTable[i]=new JButton();
            buttonTable[i].setName(Integer.toString(i));
            F1.add(buttonTable[i]);

            buttonTable[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {


                    buttonID = ((JButton) e.getSource()).getName();
                    buttonIndex=Integer.parseInt(buttonID);

                    if(GameEngine.data[buttonIndex]=='\u0000' && counter <=8) {
                        ((JButton) e.getSource()).setIcon(X);
                        GameEngine.data[buttonIndex]='X';
                        GameEngine.computerMove();
                        if(GameEngine.Check()==true)
                        {
                            if(counter % 2 == 0) {
                                XWins++;
                                JOptionPane.showMessageDialog(null, "X has won the game!");
                                lblXWins.setText(Integer.toString(XWins));

                            }
                            else
                            {
                                OWins++;
                                JOptionPane.showMessageDialog(null, "O has won the game!");
                                lblOWins.setText(Integer.toString(OWins));
                            }
                            counter=0;
                            for(int i=0;i<=8;i++)
                            {
                                GameEngine.data[i]='\u0000';
                                buttonTable[i].setIcon(null);
                            }
                        }
                        else if(GameEngine.Check()==false && counter==8)
                        {
                            Draws++;
                            JOptionPane.showMessageDialog(null, "Draw!");
                            lblDraws.setText(Integer.toString(Draws));
                        }
                        counter=counter+2;
                    }

                    }

            });
        }


        F2=new JPanel();
        F2.setLayout(new GridLayout(3,2));
        F2.setPreferredSize(new Dimension(200,400));

        //Score Board
        lblXWins_1 = new JLabel("X wins:");
        lblXWins_1.setFont(new Font("Tahoma", Font.BOLD, 17));
        F2.add(lblXWins_1);

        lblXWins = new JLabel("0");
        lblXWins.setFont(new Font("Tahoma", Font.BOLD, 17));
        F2.add(lblXWins);

        lblOWins_1 = new JLabel("O wins:");
        lblOWins_1.setFont(new Font("Tahoma", Font.BOLD, 17));
        F2.add(lblOWins_1);

        lblOWins = new JLabel("0");
        lblOWins.setFont(new Font("Tahoma", Font.BOLD, 17));
        F2.add(lblOWins);

        lblDraws_1 = new JLabel("Draws:");
        lblDraws_1.setFont(new Font("Tahoma", Font.BOLD, 17));
        F2.add(lblDraws_1);

        lblDraws = new JLabel("0");
        lblDraws.setFont(new Font("Tahoma", Font.BOLD, 17));
        F2.add(lblDraws);

        add(F1, BorderLayout.CENTER);
        add(F2, BorderLayout.EAST);


    }

    public static void setButtonTable(int i)
    {
        buttonTable[i].setIcon(O);
    }

    public static void restartButtonTable(int i)
    {
        buttonTable[i].setIcon(null);
    }













}
