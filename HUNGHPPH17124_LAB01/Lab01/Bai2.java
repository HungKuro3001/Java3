/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab01;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Bai2 extends JFrame implements ActionListener{
         Button btnyellowButton, btnred;
    Label lable = new Label();

    public Bai2 (String msg) {
        setLocationRelativeTo(null);
        setTitle(msg);
        setLayout( new FlowLayout());
        setResizable(false);
        btnred = new Button("red");
        btnyellowButton = new Button("yellow");
        lable.setSize(100,20);
        add(btnred);
        add(btnyellowButton);
        add(lable);
        btnred.addActionListener(this);
        btnyellowButton.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {

        String str = ae.getActionCommand();
        if (str.equalsIgnoreCase("red")) {
            lable.setSize(100,20);
            lable.setText("red color");
            getContentPane().setBackground(Color.RED);
        }
        if (str.equalsIgnoreCase("yellow")) {
            lable.setSize(100,20);
            lable.setText("yellow color");
             getContentPane().setBackground(Color.yellow);
        }

    }

    public static void main(String[] args) {
        Bai2 dm = new Bai2("HoangPhiHung");
        dm.setSize(500, 400);
        dm.setVisible(true);
    }

   

  
}
