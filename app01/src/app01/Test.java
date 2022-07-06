package app01;

import java.awt.*; 
import java.awt.event.*; 


public class Test extends Frame implements ActionListener {
private Label lblCount; 
private TextField tfCount; 
private Button btnCount; 
private int count = 0; 


public Test () {
setLayout(new GridLayout(2,1));
Panel p1=new Panel();
Panel p2=new Panel();
lblCount = new Label("Counter"); 
add(lblCount); 

tfCount = new TextField(count + "", 10); 
tfCount.setEditable(false); 
add(tfCount); 

btnCount = new Button("Count"); 
add(btnCount); 
btnCount.addActionListener(this);


setSize(250, 100); 
setTitle("Button Counter"); 
p1.add(lblCount);
p1.add(tfCount);
p2.add(btnCount);

add(p1);
add(p2);

setVisible(true); 
}


@Override
public void actionPerformed(ActionEvent evt) {
++count; 
tfCount.setText(count + ""); 
}


public static void main(String[] args) {

new Test();
}
}