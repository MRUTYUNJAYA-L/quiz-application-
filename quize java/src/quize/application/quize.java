package quize.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class quize extends JFrame implements ActionListener {
    String Questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswer[][] = new String[10][1];
    JLabel qn,ques;
    JRadioButton op1,op2,op3,op4;
    ButtonGroup groupo;
    JButton next, submit,life;

    public static int timer =15;
    public static int ans_given=0;
    public static int count =0;
    public static int score =0;

    String name;
    quize(String name) {
        this.name=name;
        getContentPane().setBackground(Color.black);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/Quiz-Nights.jpg"));
        Image i = i1.getImage().getScaledInstance(985,300,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel ima=new JLabel(i2);
        ima.setBounds(0,0,985,300);
        add(ima);

        qn = new JLabel();
        qn.setForeground(Color.white);
        qn.setBounds(130,320,50,30);
        qn.setFont(new Font("Tahmos",Font.PLAIN,24));
        add(qn);

        ques = new JLabel();
        ques.setForeground(Color.white);
        ques.setBounds(180,320,800,30);
        ques.setFont(new Font("Tahmos",Font.BOLD,20));
        add(ques);

        Questions[0][0]="Number Of Primitive Datatype in Java are?";
        Questions[0][1]="6";
        Questions[0][2]="7";
        Questions[0][3]="8";
        Questions[0][4]="9";

        Questions[1][0]="What is the size of float and double in java?";
        Questions[1][1]="32 and 64";
        Questions[1][2]="32 and 32";
        Questions[1][3]="64 and 64";
        Questions[1][4]="64 and 32";

        Questions[2][0] = "Automatic type conversion is possible in which of the possible cases?";
        Questions[2][1] = "Byte to int";
        Questions[2][2] = "Int to Long";
        Questions[2][3] = "Long to int";
        Questions[2][4] = "Short to int";

        Questions[3][0] = "When an array is passed to a method, what does the method receive?";
        Questions[3][1] = "The reference of the array";
        Questions[3][2] = "A copy of the array";
        Questions[3][3] = "Length of the array";
        Questions[3][4] = "Copy of first element";

        Questions[4][0] = "Arrays in java are.?";
        Questions[4][1] = "Object References";
        Questions[4][2] = "Objects";
        Questions[4][3] = "Primitive data type";
        Questions[4][4] = "None";

        Questions[5][0] = "When is the object created with new keyword?";
        Questions[5][1] = "At rum time";
        Questions[5][2] = "At compile time";
        Questions[5][3] = "Depends on the code";
        Questions[5][4] = "None";

        Questions[6][0] = "Identify the corrected definition of a package.?";
        Questions[6][1] = "A package is a collection of editing tools";
        Questions[6][2] = "A package is a collection of Classes";
        Questions[6][3] = "A package is a collection of Classes and interfaces";
        Questions[6][4] = "A package is a collection of interfaces";

        Questions[7][0] = "compareTo() returns";
        Questions[7][1] = "True";
        Questions[7][2] = "False";
        Questions[7][3] = "An int value";
        Questions[7][4] = "None";

        Questions[8][0] = "To which of the following does the class string belong to.";
        Questions[8][1] = "java.lang";
        Questions[8][2] = "java.awt";
        Questions[8][3] = "java.applet";
        Questions[8][4] = "java.String";

        Questions[9][0] = "Total constructor string class have.?";
        Questions[9][1] = "3";
        Questions[9][2] = "7";
        Questions[9][3] = "13";
        Questions[9][4] = "20";

        answers[0][1] = "8";
        answers[1][1] = "32 and 64";
        answers[2][1] = "Int to Long";
        answers[3][1] = "The reference of the array";
        answers[4][1] = "Objects";
        answers[5][1] = "At rum time";
        answers[6][1] = "A package is a collection of Classes and interfaces";
        answers[7][1] = "An int value";
        answers[8][1] = "java.lang";
        answers[9][1] = "13";

        op1 = new JRadioButton();
        op1.setBounds(170, 350, 700, 30);
        op1.setBackground(Color.BLACK);
        op1.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(op1);

        op2 = new JRadioButton();
        op2.setBounds(170, 376, 700, 30);
        op2.setBackground(Color.BLACK);
        op2.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(op2);

        op3 = new JRadioButton();
        op3.setBounds(170, 399, 700, 30);
        op3.setBackground(Color.BLACK);
        op3.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(op3);

        op4 = new JRadioButton();
        op4.setBounds(170, 422, 700, 30);
        op4.setBackground(Color.BLACK);
        op4.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(op4);

        groupo = new ButtonGroup();
        groupo.add(op1);
        groupo.add(op2);
        groupo.add(op3);
        groupo.add(op4);

        next = new JButton("Next");
        next.setBounds(260, 500, 100, 30);
        next.setFont(new Font("Tahoma", Font.PLAIN, 18));
        next.setBackground(new Color(130, 243, 6));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        life = new JButton("Help");
        life.setBounds(380, 500, 100, 30);
        life.setFont(new Font("Tahoma", Font.PLAIN, 18));
        life.setBackground(new Color(189, 248, 3));
        life.setForeground(Color.WHITE);
        life.addActionListener(this);
        add(life);

        submit = new JButton("Submit");
        submit.setBounds(500, 500, 100, 30);
        submit.setForeground(Color.white);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 18));
        submit.setBackground(new Color(202, 252, 5));
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);

        start(count);

        setLayout(null);
        setSize(1000, 700);
        setLocation(20, 20);
        setUndecorated(true);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

            if (e.getSource() == next) {
                repaint();
                op1.setEnabled(true);
                op2.setEnabled(true);
                op3.setEnabled(true);
                op4.setEnabled(true);

                ans_given = 1;
                if (groupo.getSelection() == null) {
                    useranswer[count][0] = "";
                } else {
                    useranswer[count][0] = groupo.getSelection().getActionCommand();
                }
                if (count == 8) {
                    next.setEnabled(false);
                    submit.setEnabled(true);
                }
                count++;
                start(count);
            } else if (e.getSource() == life) {
                if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                    op2.setEnabled(false);
                    op3.setEnabled(false);
                } else {
                    op1.setEnabled(false);
                    op4.setEnabled(false);
                }
                life.setEnabled(false);
            } else if (e.getSource() == submit) {
                ans_given = 1;
                if (groupo.getSelection() == null) {
                    useranswer[count][0] = "";
                } else {
                    useranswer[count][0] = groupo.getSelection().getActionCommand();
                }
                for (int i = 0; i < useranswer.length; i++) {
                    if (useranswer[i][0].equals(answers[i][1])) {
                        score += 10;
                    } else {
                        score += 0;
                    }
                }
                setVisible(false);
                new Scoree(name, score);
            }
        }
        public void paint(Graphics g){
        super.paint(g);
        String time = "Time left"+timer+"seconds";
        g.setColor(Color.RED);
        g.setFont(new Font("Arial",Font.BOLD,23));

        if(timer>0){
            g.drawString(time,700,330);
        }else{
            g.drawString("Time up!!",700,330);
        }
        timer--;
        try{
            Thread.sleep(1000);
            repaint();
        }catch(Exception e){
            e.printStackTrace();
        }
        if(ans_given == 1){
            ans_given =0;
            timer =15;
        }else if(timer<0){
            timer =15;
            op1.setEnabled(true);
            op2.setEnabled(true);
            op3.setEnabled(true);
            op4.setEnabled(true);

            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if(count==9){
                if(groupo.getSelection()==null){
                    useranswer[count][0]="";
                }else{
                    useranswer[count][0]=groupo.getSelection().getActionCommand();
                }
                for(int i=0; i<useranswer.length; i++){
                    if(useranswer[i][0].equals(answers[i][1])){
                        score += 10;
                    }else{
                        score +=0;
                    }
                }
                setVisible(false);
                new Scoree(name,score);
            }else{
                useranswer[count][0] = groupo.getSelection().getActionCommand();
            }
            count++;
            start(count);
        }
    }

    public void start(int count) {
        qn.setText(""+(count+1)+ ". ");
        ques.setText(Questions[count][0]);
        op1.setText(Questions[count][1]);
        op1.setActionCommand(Questions[count][1]);

        op2.setText(Questions[count][2]);
        op2.setActionCommand(Questions[count][2]);

        op3.setText(Questions[count][3]);
        op3.setActionCommand(Questions[count][3]);

        op4.setText(Questions[count][4]);
        op4.setActionCommand(Questions[count][4]);

        groupo.clearSelection();

    }

    public static void main(String args[]) {

        new quize("User");
    }
}
