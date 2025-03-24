/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


/**
 *
 * @author tanis
 */
public class Signup3 extends JFrame implements ActionListener {
    
    JButton submit, cancel;
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    String formno;
    
    Signup3(String formno){
        this.formno = formno;
        
        setLayout(null);
        
        JLabel l1 = new JLabel ("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD , 22));
        l1.setBounds(280,40,400,40);
        add(l1);
        
        JLabel type = new JLabel ("Account Type");
        type.setFont(new Font("Raleway", Font.BOLD , 22));
        type.setBounds(100,140,200,30);
        add(type);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD , 16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,180,150,20);
        add(r1);
        
        r2 = new JRadioButton("Fixed deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD , 16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,180,250,20);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD , 16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,220,150,20);
        add(r3);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD , 16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,220,250,20);
        add(r4);
        
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        groupaccount.add(r1);
        
        JLabel cardno = new JLabel ("Card No:");
        cardno.setFont(new Font("Raleway", Font.BOLD , 22));
        cardno.setBounds(100,300,200,30);
        add(cardno);
        
        JLabel number = new JLabel ("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Raleway", Font.BOLD , 22));
        number.setBounds(330,300,300,30);
        add(number);
        
        JLabel carddetail= new JLabel ("Your 16-Digit Card Number");
        carddetail.setFont(new Font("Raleway", Font.BOLD , 12));
        carddetail.setBounds(100,330,300,20);
        add(carddetail);
        
        JLabel pin = new JLabel ("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD , 22));
        pin.setBounds(100,370,200,30);
        add(pin);
        
        JLabel pnumber = new JLabel ("XXXX");
        pnumber.setFont(new Font("Raleway", Font.BOLD , 22));
        pnumber.setBounds(330,370,300,30);
        add(pnumber);
        
        JLabel pdetail= new JLabel ("Your 4-Digit PIN");
        pdetail.setFont(new Font("Raleway", Font.BOLD , 12));
        pdetail.setBounds(100,400,300,20);
        add(pdetail);
        
        JLabel services= new JLabel ("Services Required:");
        services.setFont(new Font("Raleway", Font.BOLD , 22));
        services.setBounds(100,450,200,30);
        add(services);
        
        c1 = new JCheckBox("ATM Card");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway" , Font.BOLD ,16));
        c1.setBounds(100,500,200,30);
        add(c1);
        
        c2 = new JCheckBox("Internet banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway" , Font.BOLD ,16));
        c2.setBounds(350,500,200,30);
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway" , Font.BOLD ,16));
        c3.setBounds(100,550,200,30);
        add(c3);
        
        c4 = new JCheckBox("EMAIL & SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway" , Font.BOLD ,16));
        c4.setBounds(350,550,200,30);
        add(c4);
        
        c5 = new JCheckBox("Cheaque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway" , Font.BOLD ,16));
        c5.setBounds(100,600,200,30);
        add(c5);
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway" , Font.BOLD ,16));
        c6.setBounds(350,600,200,30);
        add(c6);
        
        c7= new JCheckBox("I Here Declare That the above provided details are correct to best of my knowledge ");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway" , Font.BOLD ,12));
        c7.setBounds(100,680,600,30);
        add(c7);
        
        submit = new JButton("Submit");
        submit.setFont(new Font("Raleway", Font.BOLD , 14));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(250,720,100,30);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Raleway", Font.BOLD , 14));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(420,720,100,30);
        cancel.addActionListener(this);
        add(cancel);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
            String accountType = null;
            if(r1.isSelected()){
                accountType = "Saving Account";
            }else if(r2.isSelected()){
                accountType = "Fixed Deposit Account";
            }else if(r3.isSelected()){
                accountType = "Current Account";
            }else if(r4.isSelected()){
                accountType = "Recurring Deposit Account";
            }
            
            Random random = new Random();
            String cardno = "" + Math.abs((random.nextLong()% 90000000L)+504093600000000L);
            String pnumber  = "" + Math.abs((random.nextLong()%900L)+ 1000L);
            String facility ="";
            if(c1.isSelected()){
                facility = facility + " ATM Card";
            }else if(c2.isSelected()){
                facility = facility + " Internet Banking";
            }else if(c3.isSelected()){ 
                facility = facility + " Mobile Banking";
            }
            else if(c4.isSelected()){
                facility = facility + " EMAIL & SMS Alerts";
            } else if(c5.isSelected()){
                facility = facility + " Cheaque Book";
            }else if(c6.isSelected()){
                facility = facility + " E-Statement";
            }
            
            try{
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null,"Account type is Required");
                }else {
                    Conn conn = new Conn();
                    String query1 = "insert into Signup3 values('"+formno+"','"+accountType+"', '"+cardno+"', '"+pnumber+"', '"+facility+"')";
                    String query2 = "insert into login values('"+formno+"', '"+cardno+"', '"+pnumber+"')";
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                }
                
                JOptionPane.showMessageDialog(null," Card Number : " + cardno + "\n PIN : " + pnumber);
                
                
                setVisible(false);
                new Deposit(pnumber).setVisible(false);
            }catch(Exception e){
                System.out.println(e);
            }
            
        }else if (ae.getSource() == cancel){
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    
    public static void main(String args[]){
        new Signup3("");
    }
    
}
