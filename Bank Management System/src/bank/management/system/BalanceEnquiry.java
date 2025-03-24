/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

/**
 *
 * @author tanis
 */
public class BalanceEnquiry extends JFrame implements ActionListener{
    
    String pnumber;
    JButton back;
    
    BalanceEnquiry(String pnumber){
        
        this.pnumber = pnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        back = new JButton("BACK");
        back.setBounds(355,520,150,20);
        back.addActionListener(this);
        image.add(back);
        
        int balance =0;
        Conn c =new Conn();
        try{
            ResultSet rs = c.s.executeQuery("Select * from bank where pin = '"+pnumber+"'");
            
            while(rs.next()){
                if(rs.getString("type").equals("Deposit")){
                    balance +=Integer.parseInt(rs.getString("amount"));
                }else{
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
                
        }catch(Exception e){
            System.out.println(e);
        }
        
        JLabel text =new JLabel("Your Current Account Balance is Rs "+ balance);
        text.setBounds(170,300,400,30);
        text.setForeground(Color.WHITE);
        image.add(text);
        
        
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae ){
        setVisible(false);
        new Transactions(pnumber).setVisible(true);
    }
    
    public static void main(String args[]){
        new BalanceEnquiry("");
    }
    
}
