package quize.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JTextField field;

    JButton next,back;
    Login(){
      getContentPane().setBackground(Color.white);

      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/quize.jpg"));
      Image i = i1.getImage().getScaledInstance(1000,600,Image.SCALE_DEFAULT);
      ImageIcon i2 = new ImageIcon(i);
      JLabel ima=new JLabel(i2);
      ima.setBounds(0,0,1000,600);
      add(ima);



      JLabel l1 = new JLabel("Quize Application");
      l1.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
      l1.setForeground(Color.white);
      l1.setBounds(150,130,300,40);
      ima.add(l1);

      JLabel l2 = new JLabel("NAME:");
      l2.setFont(new Font("Mongolian Biti",Font.BOLD,18));
      l2.setForeground(Color.white);
      l2.setBounds(130,210,200,18);
      ima.add(l2);

      field = new JTextField();
      field .setFont(new Font("BEAU REGULAR",Font.BOLD,15));
      field .setForeground(Color.black);
      field .setBounds(220,210,230,20);
      ima.add(field );

      next = new JButton("Next");
      next.setFont(new Font("Arial",Font.BOLD,17));
      next.setBounds(180,270,100,18);
      next.setForeground(Color.black);
      next.addActionListener(this);
      ima.add(next );

      back = new JButton("Clear");
      back.setFont(new Font("Arial",Font.BOLD,17));
      back.setBounds(310,270,100,18);
      back.setForeground(Color.black);
      back.addActionListener(this);
      ima.add(back );

      setLayout(null);
      setSize(1000,600);
      setLocation(20,20);
      setUndecorated(true);
      setVisible(true);
    }
  @Override
  public void actionPerformed(ActionEvent e) {
      try{
        if (e.getSource() == next) {
          String namee = field.getText();
            new rules(namee);
            setVisible(false);
          }else if(e.getSource()==back){
            System.exit(50);
          }


      }catch(Exception E){
        E.printStackTrace();
      }

    }
    public static void main(String args[]){

      new Login();
    }
}
