package com;

import com.bookingSnake.referencer.main;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
/**
 * Created by Andy on 10/12/2015.
 */
public class center_pannel extends JFrame {


    public JLabel label_1;
    public JButton button;
    public TextField textfield_1;
    public JLabel label_2;
    public TextField  textfield_2;
    public JLabel label_3;
    public TextField textfield_3;
    public JLabel label_4;
    public TextField textfield_4;
    public JLabel label_5;
    public TextField textfield_5;
    public JPanel color_1 = new JPanel();
    public JPanel color_2 =new JPanel ();


    public center_pannel () {


        setLayout(new FlowLayout());
        color_1.setBackground(Color.BLUE);
        add(color_1);

        color_2.setBackground(Color.CYAN);
        add(color_2);
        label_1 = new JLabel("Enter Author Details");
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

        label_4 = new JLabel("Enter Publisher");
        add(label_4);
        textfield_4 = new TextField(20);
        add(textfield_4);

        label_5 = new JLabel("Enter Place of Publication");
        add(label_5);
        textfield_5 = new TextField (20);
        add(textfield_5);

        button = new JButton("Create reference");
        add(button);
    }


    public static void main(String args[]) {



        center_pannel pa = new center_pannel();
        pa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pa.setBackground(Color.BLUE);
        pa.setVisible(true);
        pa.setSize(250, 360);




    }
}

