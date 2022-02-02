package currency;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverter extends JFrame implements ActionListener {
    Container c;
    JLabel l1, l2;
    JTextField t1, t2;
    JButton btn1, btn2, btn3;
    Font f1,f2;
    double rupe, rupe1, rupe3, rupe4, rupe2, rupe5;
    CurrencyConverter(){

            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(null);
            this.setBounds(200, 100, 400, 400);
            this.setTitle("Login");
            this.setResizable(false);

            c = this.getContentPane();
            c.setLayout(null);
            c.setBackground(Color.lightGray);

            f1 = new Font("Arial", Font.BOLD+Font.ITALIC, 18);
            f2 = new Font("Arial", Font.BOLD+Font.ITALIC, 22);

            l1 = new JLabel("Currency Converter ");
            l1.setBounds(100,10,250,50);
            l1.setFont(f2);
            c.add(l1);

            l2 = new JLabel("Input  : ");
            l2.setBounds(10,100 , 200, 50);
            l2.setFont(f1);
            c.add(l2);

            t1 = new JTextField();
            t1.setBounds(130, 100, 200, 40);
            t1.setBackground(Color.pink);
            t1.setFont(f1);
            c.add(t1);

            l2 = new JLabel("Output : ");
            l2.setBounds(10, 155, 200, 50);
            l2.setFont(f1);
            c.add(l2);

            t2 = new JTextField();
            t2.setBounds(130, 150, 200, 40);
            t2.setBackground(Color.pink);
            t2.setFont(f1);
            c.add(t2);

            btn1 = new JButton("IND");
            btn1.setBounds(20, 250, 100, 60);
            btn1.setFont(f1);
            btn1.setBackground(Color.red);
            c.add(btn1);

            btn2 = new JButton("USA");
            btn2.setBounds(150, 250, 100, 60);
            btn2.setFont(f1);
            btn2.setBackground(Color.orange);
            c.add(btn2);

            btn3 = new JButton("AUS");
            btn3.setBounds(280, 250, 100, 60);
            btn3.setFont(f1);
            btn3.setBackground(Color.blue);
            c.add(btn3);

            btn1.addActionListener(this);
            btn2.addActionListener(this);
            btn3.addActionListener(this);

            setVisible(true);
    }

        @Override
        public void actionPerformed(ActionEvent e) {
                if(e.getSource() == btn1){
                         rupe = Double.parseDouble(t1.getText());
                         rupe1 = rupe * .86;
                         String str1 = String.valueOf(rupe1);
                         t2.setText(str1);
                }
                if(e.getSource() == btn2){
                        rupe2 = Double.parseDouble(t1.getText());
                        rupe3 = rupe * .012;
                        String str1 = String.valueOf(rupe3);
                        t2.setText(str1);
                }
                if(e.getSource() == btn3){
                        rupe4= Double.parseDouble(t1.getText());
                        rupe5= rupe * .016;
                        String str1 = String.valueOf(rupe5);
                        t2.setText(str1);
                }
   }

}
