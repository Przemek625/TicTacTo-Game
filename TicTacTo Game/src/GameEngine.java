import javax.swing.*;

/**
 * Created by Przemek on 2016-03-19.
 */
public class GameEngine {

    public static char[] data= new char[9];
    //private static boolean gameOver=false;
    private int previousMovie;
    private ImageIcon O;

    public static boolean Check(){


        if (       data[0] == data[1] && data[1] == data[2] && data[0] != '\u0000'
                || data[3] == data[4] && data[4] == data[5] && data[3] != '\u0000'
                || data[6] == data[7] && data[7] == data[8] && data[6] != '\u0000'
                || data[0] == data[3] && data[3] == data[6] && data[0] != '\u0000'
                || data[1] == data[4] && data[4] == data[7] && data[1] != '\u0000'
                || data[2] == data[5] && data[5] == data[8] && data[6] != '\u0000'
                || data[0] == data[4] && data[4] == data[8] && data[0] != '\u0000'
                || data[2] == data[4] && data[4] == data[6] && data[2] != '\u0000'
                ) return true;
        else return false;

    }

    public static void computerMove()
    {
        for(int i =0; i<=8;i++)
        {
            if(data[i]=='\u0000')
            {
                Panel.setButtonTable(i);
                data[i]='O';
                break;
            }
        }

    }

    }



