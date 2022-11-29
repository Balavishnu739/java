import javax.swing.*; 
import java.awt.*; import java.awt.Color; 
import java.awt.event.ActionEvent; 
import 
java.awt.event.ActionListener;
import java.awt.event.*;
class Loginn implements ActionListener{
JFrame f;
JLabel l1,l2,l3;
JTextField un;
JPasswordField pw;
JButton s,c; 
Loginn(){ 
f=new 
JFrame();
l1=new JLabel("CANTEEN MANAGEMENT SYSTEM");
l1.setBounds(100,10,270,20); 
l2=new JLabel("UserName"); 
l2.setBounds(10,50,200,20); 
l3=new JLabel("Password"); 
l3.setBounds(10,80,200,20); 
un=new JTextField(); 
un.setBounds(100,50,200,20); 
pw=new JPasswordField(); 
pw.setBounds(100,80,200,20); 
s=new JButton("Submit");
s.setBounds(150,125,80,20);
f.add(l1);f.add(l2);f.add(un);f.add(l3);f.add(pw);f.add(s);
f.setLayout(null);
f.setVisible(true);
f.getContentPane().setBackground(Color.lightGray);
f.setSize(400,200);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setResizable(false);
f.setTitle("Login");
s.addActionListener(this);
}
public void actionPerformed(ActionEvent e){ 
if(e.getSource()==s){
String userValue = un.getText();
String passValue = pw.getText();
if (userValue.equals("admin1") &&
passValue.equals("itsme") || userValue.equals("admin2") && 
passValue.equals("ucantcme")) {
CanteenManagement rr=new CanteenManagement();
}
}
}
public static void main(String ars[]){
Loginn t=new Loginn();
}}
