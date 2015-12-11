package com.bookingSnake.referencer;



import javax.swing.*;
import java.awt.*;

/**
 * Created by Andy on 11/12/2015.
 */


public class left_panel extends JFrame {


    public JLabel label_1;
    public JButton button;
    public TextField textfield_1;
    public JLabel label_2;
    public TextField  textfield_2;
    public JLabel label_3;
    public TextField textfield_3;
  //  public JLabel label_4;
  //  public TextField textfield_4;
  //  public JLabel label_5;
 //   public TextField textfield_5;
    public JPanel color_1 = new JPanel();
    public JPanel color_2 =new JPanel ();


    public left_panel () {


        setLayout(new FlowLayout());
        color_1.setBackground(Color.RED);
        add(color_1);

        color_2.setBackground(Color.ORANGE);
        add(color_2);
        label_1 = new JLabel("BOOK SEARCH");
        add(label_1);
        textfield_1 = new TextField(20);
        add(textfield_1);

        label_2 = new JLabel("Enter Title of Publiction");
        add(label_2);
        textfield_2 = new TextField(20);
        add(textfield_2);

        label_3 = new JLabel("Enter Date of Publication");
        add(label_3);
        textfield_3 = new TextField (20);
        add(textfield_3);



        button = new JButton("SEARCH INTERNET");
        add(button);
    }


    public static void main(String args[]) {



        left_panel lp = new left_panel();
        lp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lp.setBackground(Color.BLUE);
        lp.setVisible(true);
        lp.setSize(250, 360);




    }
}

