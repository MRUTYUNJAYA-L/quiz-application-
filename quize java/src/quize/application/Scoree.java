package quize.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarFile;

public class Scoree extends JFrame implements ActionListener {
    Scoree(String name, int score){
        getContentPane().setBackground(Color.black);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/ani.jpg"));
        Image i = i1.getImage().getScaledInstance(500,300,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel ima=new JLabel(i2);
        ima.setBounds(60,80,540,300);
        add(ima);

        JLabel l1 = new JLabel("Thank you"+" "+ name +" "+"for playing this quize game");
        l1.setFont(new Font("Tohma",Font.BOLD,20));
        l1.setForeground(Color.BLUE);
        l1.setBounds(130,50,520,30);
        ima.add(l1);

        JLabel l2 = new JLabel("Your score is"+" "+score);
        l2.setFont(new Font("Thoma",Font.BOLD,17));
        l2.setForeground(Color.blue);
        l2.setBounds(190,120,400,20);
        ima.add(l2);

        JButton b1 = new JButton("Next");
        b1.setFont(new Font("Arial",Font.BOLD,15));
        b1.setForeground(new Color(7, 218,255));
        b1.setBackground(new Color(7, 86, 255));
        b1.setBounds(250,250,100,30);
        ima.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Login();
            }
        });

        setLayout(null);
        setSize(800, 600);
        setLocation(0, 35);
        setUndecorated(true);
        setVisible(true);
    }
    public static void main(String args[]){
        new Scoree("User",0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
