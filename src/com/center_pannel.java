package com;

import com.bookingSnake.referencer.main;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Andy on 10/12/2015.
 */
public class center_pannel extends JFrame {


    private JLabel label;
    private JButton button;
    private TextField textfield;
    private JLabel label_2;
    private TextField  textfield_2;
    private JLabel label_3;
    private TextField textfield_3;
    private JLabel label_4;
    private TextField textfield_4;
    private JLabel label_5;
    private TextField textfield_5;




    public center_pannel () {

        setLayout(new FlowLayout());
        label = new JLabel("Enter Author Details");
        add(label);
        textfield = new TextField(20);
        add(textfield);
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

        pa.setVisible(true);
        pa.setSize(250, 360);




    }
}

