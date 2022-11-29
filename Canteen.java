import javax.swing.*;  
import java.awt.*;
import java.awt.event.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
class Canteen extends JFrame{
 //JFrame f=new JFrame("MENU");
        JButton b1,b2;
	JTextField t1;
	int o=1;
	Canteen(){
	b1=new JButton("+");
	b1.setBounds(100,100,200,30);
	add(b1);
	t1=new JTextField();
	t1.setBounds(200,100,100,30);
add(t1);
setLayout(null);	
setVisible(true);
	
	setSize(500,500);
}
public static void main(String[] args){
	new Canteen();
}
}