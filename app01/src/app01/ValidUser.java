package app01;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ValidUser 
{

		
		static JLabel l1=new JLabel("Full Name: ");
		static JLabel l2=new JLabel("Email ID:");
		static JLabel l3=new JLabel("Address:");
		static JTextField t1=new JTextField();
		static JTextField t2=new JTextField();
		static JTextArea area=new JTextArea();  
		static JButton b1=new JButton("Submit");
		static JButton b2=new JButton("Cancel");
		
		
		
		
		public static void main(String[] args) {
			

			ValidUser user=new ValidUser();
			JFrame f=new JFrame("MyFrame");  // Object created of JFrame class
				
			l1.setBounds(10, 10, 200, 30);
			t1.setBounds(100, 10, 300, 30);
			
			l2.setBounds(10, 50, 200, 30);
			t2.setBounds(100, 50, 300, 30);
			
		    l3.setBounds(10,130 ,100,30);
		    area.setBounds(100, 100, 300,80);
		    
		    b1.setBounds(210, 200, 90, 40);
		    b2.setBounds(310, 200, 90, 40);
		    f.add(b1);
		    f.add(b2);
		    f.add(l1);
		    f.add(t1);
			f.add(l2);
			f.add(l3);
			f.add(t2);
			f.add(area);
			f.setSize(450,300);
			
			
			
		
			
			f.setLayout(null);
			
			f.setVisible(true);

		}

		

	}



