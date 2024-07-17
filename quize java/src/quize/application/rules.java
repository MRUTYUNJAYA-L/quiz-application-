package quize.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class rules extends JFrame implements ActionListener {
    JButton start,back;
    String name;
    rules(String name){
        this.name=name;
        getContentPane().setBackground(Color.white);
        JLabel head = new JLabel("Welcome"+" "+name+" "+"to QUIZ TEST" );
        head.setBounds(260,40,700,30);
        head.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
        head.setForeground(new Color(0x0004D9));
        add(head);

        JLabel rules = new JLabel();
        rules.setBounds(100,100,800,400);
        rules.setForeground(new Color(0x2D6E01));
        rules.setFont(new Font("Tohma",Font.PLAIN,16));
        rules.setText("<html>"+
                "1. Participation in the quiz is free and open to all persons above 18 years old." + "<br><br>" +
                "2. There are a total 10 questions. " + "<br><br>" +
                "3. You only have 15 seconds to answer the question." + "<br><br>" +
                "4. No cell phones or other secondary devices in the room or test area." + "<br><br>" +
                "5. No talking." + "<br><br>" +
                "6. No one else can be in the room with you." + "<br><br>" +
                "<html>"
        );
        add(rules);

        back= new JButton("Back");
        back.setBounds(300,600,100,25);
        back.setFont(new Font("Arial",Font.BOLD,20));
        back.setForeground(Color.BLACK);
        back.setBackground(new Color(0x049FE1));
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(430,600,100,25);
        start.setFont(new Font("Arial",Font.BOLD,20));
        start.setForeground(Color.black);
        start.setBackground(new Color(0x0388C5));
        start.addActionListener(this);
        add(start);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/picture.jpg"));
        Image i = i1.getImage().getScaledInstance(1000,700,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel ima=new JLabel(i2);
        ima.setBounds(0,0,1000,700);
        add(ima);

        setSize(1000,700);
        setLocation(5,5);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==start){
            setVisible(false);
            new quize(name);
        }else{
            setVisible(false);
            new Login();
        }
    }
    public static void main(String args[]){

        new rules("User");
    }
}
