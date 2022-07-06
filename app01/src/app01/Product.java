package app01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Product implements ActionListener{

	static JButton b1=new JButton("OK");
	static JLabel l1=new JLabel("Product Name: ");
	static JLabel l2=new JLabel("Quantity: ");
	static JLabel l3=new JLabel("Price per product: ");
	static JLabel l4=new JLabel();
	static JTextField txt1=new JTextField();
	static JTextField txt2=new JTextField();
	static JTextField txt3=new JTextField();
	static JFrame f=new JFrame(); 
	public static void main(String[] args) {
		Product t=new Product();
		
		l1.setBounds(10, 10, 170, 30);
		l2.setBounds(10, 50, 170, 30);
		l3.setBounds(10, 90, 170, 30);
		txt1.setBounds(200,10,270,30);
		txt2.setBounds(200,50,270,30);
		txt3.setBounds(200,90,270,30);
		b1.setBounds(300, 150, 80, 30);
		l4.setBounds(10,200,300,30);
		
		f.add(txt1);
		f.add(txt2);
		f.add(txt3);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(b1);
		
		f.setSize(500,400);
		
		b1.addActionListener(t);
		
		f.setLayout(null);
		
		f.setVisible(true);

	}
	public void actionPerformed(ActionEvent event) {
		 
		if(event.getSource()==b1)
		{
			double amount=Double.parseDouble(txt2.getText().toString())*Double.parseDouble(txt3.getText().toString());
			if(amount>100)
			{
				amount=amount*95/100;
				
			}
			else
			{
				amount=amount*98/100;
			}
			
			
			l4.setText("Total Amount for "+txt1.getText().toString()+" After discount: "+String.valueOf(amount));
			
		}
		
		
	}
}
