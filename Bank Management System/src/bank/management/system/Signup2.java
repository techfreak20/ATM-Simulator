/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author tanis
 */
public class Signup2 extends JFrame implements ActionListener{
    
    
    JTextField aadharTextField ,panTextField ;
    JButton next;
    JRadioButton syes ,sno ,eyes ,eno;
    JComboBox religion , category , edu ,occu , income; 
    String formno ; 
    
    Signup2(String formno){
        this.formno =formno; 
        setLayout(null);
        
        setTitle ("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
       
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD , 22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway", Font.BOLD , 20));
        name.setBounds(100,140,100,30);
        add(name);
        
        String valReligion[] = {"Hindu" , "Muslim" ,"Sikh" , "Christian" , "Others" };
        religion = new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        
        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Raleway", Font.BOLD , 20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        String valcategory[]= {"General" ,"OBC" ,"SC" ,"ST","Others"};
        category = new JComboBox(valcategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway", Font.BOLD , 20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        String valincome[]= {"Null" ,"<1,50,000" ,"<2,50,000" ,"<5,00,000","Upto 10,00,000"};
        income = new JComboBox(valincome);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        
        JLabel gender= new JLabel("Educational");
        gender.setFont(new Font("Raleway", Font.BOLD , 20));
        gender.setBounds(100,290,200,30);
        add(gender);
       
        JLabel eMail = new JLabel("Qualification:");
        eMail.setFont(new Font("Raleway", Font.BOLD , 20));
        eMail.setBounds(100,315,200,30);
        add(eMail);
        
        String valedu[]= {"Non-Graduation" , "Graduate" ,"Post-Graduation" ,"Doctrate" ,"Others"};
        edu = new JComboBox(valedu);
        edu.setBounds(300,315,400,30);
        edu.setBackground(Color.WHITE);
        add(edu);
        
        
        JLabel marital = new JLabel("Occupation:");
        marital.setFont(new Font("Raleway", Font.BOLD , 20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
        String valoccu[]= {"Salaried" ,"Self-employed","Buissness","Student","Retired","Others"};
        occu = new JComboBox(valoccu);
        occu.setBounds(300,390,400,30);
        occu.setBackground(Color.WHITE);
        add(occu);
        
        JLabel address = new JLabel("PAN No.:");
        address.setFont(new Font("Raleway", Font.BOLD , 20));
        address.setBounds(100,440,200,30);
        add(address);
        
        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD , 14));
        panTextField.setBounds(300,440,400,30);
        add(panTextField);
        
        JLabel city = new JLabel("Aadhar No.:");
        city.setFont(new Font("Raleway", Font.BOLD , 20));
        city.setBounds(100,490,200,30);
        add(city);
        
        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD , 14));
        aadharTextField.setBounds(300,490,400,30);
        add(aadharTextField);
        
        JLabel state = new JLabel("Senior Citizen:");
        state.setFont(new Font("Raleway", Font.BOLD , 20));
        state.setBounds(100,540,200,30);
        add(state);
        
        syes= new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno= new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        
        ButtonGroup seniorGroup = new ButtonGroup();
        seniorGroup.add(syes);
        seniorGroup.add(sno);
        
        
        JLabel pincode = new JLabel("Existing Account:");
        pincode.setFont(new Font("Raleway", Font.BOLD , 20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        eyes= new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno= new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        
        ButtonGroup existingGroup = new ButtonGroup();
        existingGroup.add(eyes);
        existingGroup.add(eno);
       
        
        next = new JButton("Next");
        next.setForeground(Color.WHITE);
        next.setBackground(Color.BLACK);
        next.setFont(new Font("Raleway" , Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        String sreligion =(String) religion.getSelectedItem();
        String scategory=(String) category.getSelectedItem();
        String sincome =(String) income.getSelectedItem();
        String sedu=(String) edu.getSelectedItem();
        String soccu=(String) occu.getSelectedItem();
        String seniorcitizen = null;
        if(syes.isSelected()){
            seniorcitizen= "Yes";
        }else if(sno.isSelected()){
            seniorcitizen= "No";
        }
        String existingaccount = null;
        if(eyes.isSelected()){
            existingaccount= "Yes";
        }else if(eno.isSelected()){
            existingaccount= "No";
        }
        
        
        String span = panTextField.getText();
        String saadhar = aadharTextField.getText();
        
        
        try{
           
                Conn c = new Conn();
                String query = "insert into signup2 values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"','"+sedu+"', '"+soccu+"', '"+seniorcitizen+"', '"+span+"', '"+saadhar+"', '"+existingaccount+"')";
                c.s.executeUpdate(query);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }    
    
        
    public static void main (String args[]){
        new Signup2("");
    }        
}



