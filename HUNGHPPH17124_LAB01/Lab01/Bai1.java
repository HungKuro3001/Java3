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

/**
 *
 * @author Administrator
 */
public class Bai1 extends Frame implements ActionListener{
    Button btnYellow,btnRed;
    Label label = new Label();
    public Bai1(String msg){
        setTitle(msg);
        setLayout(new FlowLayout());
        btnYellow = new Button("Yello");
        btnRed = new Button("Red");
        add(btnYellow);
        add(btnRed);
        add(label);
        btnYellow.addActionListener(this);
        btnRed.addActionListener(this);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        if(str.equals("Tellow")){
            label.setText("Bạn nhận button mau vàng");
            this.setBackground(Color.yellow);
            
        
        
        }
        if(str.equals("red")){
            label.setText("Bạn nhận button màu đỏ");
            this.setBackground(Color.red);
        
        }
    }
    public static void main(String[] args) {
        Bai2 ab = new Bai2("AWT Fpoly");
        ab.setSize(400,200);
        ab.show();
    }
    
}
