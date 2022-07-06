package app01;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
class MyPanel extends JFrame{
    MyPanel(){
        setTitle("Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        Border br = BorderFactory.createLineBorder(Color.black);
        setBounds(100,100,645,470);
       
        Container c=getContentPane();
      
        JPanel panel=new JPanel();
        JPanel panel2=new JPanel();
        JPanel panel3=new JPanel();
        JPanel panel4=new JPanel();
        
     
        panel.setLayout(new GridBagLayout());
        panel2.setLayout(null);
        panel3.setLayout(null);
        panel4.setLayout(null);
        //adding a label element to the panel
        
        GridBagConstraints cont = new GridBagConstraints();
        
        
        JLabel label=new JLabel("Panel 1");
        JLabel label2=new JLabel("Panel 2");
        JLabel label3=new JLabel("Panel 3");
        JLabel label4=new JLabel("Panel 4");
        
        JTextField t1=new JTextField();
        JTextField t2=new JTextField();
        JTextField t3=new JTextField();
        JTextField t4=new JTextField();
        
        JButton b1=new JButton("Button 1");
        JButton b2=new JButton("Button 2");
        JButton b3=new JButton("Button 3");
        JButton b4=new JButton("Button 4");
        
      //  label.setBounds(120,50,200,50);
      /*  label2.setBounds(120,50,200,50);
        label3.setBounds(120,50,200,50);
        label4.setBounds(120,50,200,50);*/
        
       // t1.setBounds(120,50,200,50);
      /*  t2.setBounds(120,50,200,50);
        t3.setBounds(120,50,200,50);
        t4.setBounds(120,50,200,50);*/
        
      //  b1.setBounds(120,50,200,50);
      /*  b2.setBounds(120,50,200,50);
        b3.setBounds(120,50,200,50);
        b4.setBounds(120,50,200,50);*/
        
        panel.add(label,cont);
        panel.add(b1,cont);
        panel.add(t1,cont);
     /*   panel2.add(label2);
        panel3.add(label3);
        panel4.add(label4);*/
     
        panel.setBackground(Color.yellow);
        panel.setBounds(10,10,300,200);
     
        panel2.setBackground(Color.red);
        panel2.setBounds(320,10,300,200);
       
        panel3.setBackground(Color.green);
        panel3.setBounds(10,220,300,200);
      
        panel4.setBackground(Color.cyan);
        panel4.setBounds(320,220,300,200);
        
        
        panel.setBorder(br);
        panel2.setBorder(br);
        panel3.setBorder(br);
        panel4.setBorder(br);
        
        //adding the panel to the Container of the JFrame
        c.add(panel);
        c.add(panel2);
        c.add(panel3);
        c.add(panel4);
       
        setVisible(true);
    }
    public static void main(String[] args) {
        new MyPanel();
    }
}