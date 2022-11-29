import javax.swing.*; import 
java.awt.*; import java.awt.event.*; 
import java.awt.event.ActionEvent; 
import 
java.awt.event.ActionListener;
class Canteen implements ActionListener{
JFrame f=new JFrame("MENU");
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,s; 
JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13; 
JTextArea a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12;
Int
o=1,o1=0,o2=1,o3=0,o4=1,o5=0,o6=1,o7=0,o8
=1,o9=0,o10=1,o11=0,o12=1,o13=0,o14=1,o15=0,o16=1,o17=0,o18=1,o19=0,o20=1;
o21=0,o22=1,o23=0,o24=1,o25=0;
Container c;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
Canteen(){
f.setSize(600,700);
f.setLocation(0, 0);
f.setLayout(null);
f.setDefaultCloseOperation(f.EXIT_ON_CLOSE );
f.setResizable(false);
l13=new JLabel("CANTEEN MANAGEMENT SYSTEM");
l13.setBounds(200, 10, 600,30);
f.add(l13); l1 = new JLabel("Tea"); 
l1.setFont(new Font("Arial", Font.PLAIN, 20)); 
l1.setSize(100, 89); l1.setLocation(50, 50);
f.add(l1); l2 = new JLabel("Coffee"); 
l2.setFont(new Font("Arial", Font.PLAIN, 20)); 
l2.setSize(100, 130); l2.setLocation(50, 70);
f.add(l2); l3 = new JLabel("Juice item"); 
l3.setFont(new Font("Arial", Font.PLAIN, 20)); 
l3.setSize(100, 130); l3.setLocation(50, 105);
f.add(l3);
l4 = new JLabel("Samsa/vada"); l4.setFont(new 
Font("Arial", Font.PLAIN, 20)); l4.setSize(150, 
150); l4.setLocation(50, 132);
f.add(l4); l5 = new JLabel("Veg buffs"); 
l5.setFont(new Font("Arial", Font.PLAIN, 20)); 
l5.setSize(150, 150); l5.setLocation(50, 165);
f.add(l5); l6 = new JLabel("Egg buffs"); 
l6.setFont(new Font("Arial", Font.PLAIN, 20)); 
l6.setSize(150, 150); l6.setLocation(50, 200);
f.add(l6);
l7 = new JLabel("Dosa"); l7.setFont(new 
Font("Arial", Font.PLAIN, 20)); l7.setSize(150, 
150); l7.setLocation(50, 237);
f.add(l7); l8 = new JLabel("Parota"); 
l8.setFont(new Font("Arial", Font.PLAIN, 20)); 
l8.setSize(150, 150); l8.setLocation(50, 269);
f.add(l8); l8 = new JLabel("poori"); 
l8.setFont(new Font("Arial", Font.PLAIN, 20)); 
l8.setSize(150, 150); l8.setLocation(50, 300);
f.add(l8);
l9 = new JLabel("Veg Meals"); l9.setFont(new 
Font("Arial", Font.PLAIN, 20)); l9.setSize(150, 
150); l9.setLocation(50, 335);
f.add(l9);
l10 = new JLabel("NonVeg Meals"); 
l10.setFont(new Font("Arial", Font.PLAIN, 20)); 
l10.setSize(150, 150); l10.setLocation(50, 372);
f.add(l10); l11 = new JLabel("Chapathi"); 
l11.setFont(new Font("Arial", Font.PLAIN, 20)); 
l11.setSize(150, 150); l11.setLocation(50, 407);
f.add(l11); l12 = new JLabel("Idli"); 
l12.setFont(new Font("Arial", Font.PLAIN, 20)); 
l12.setSize(150, 150); l12.setLocation(50, 440);
f.add(l12); b1 = new JButton("+"); 
b1.setFont(new Font("Arial", Font.BOLD, 10)); 
b1.setBounds(220, 80,40,20 );
f.add(b1); b2 = new JButton("+"); 
b2.setFont(new Font("Arial", Font.BOLD, 10)); 
b2.setBounds(220, 118,40,20 );
f.add(b2); b3 = new JButton("+"); 
b3.setFont(new Font("Arial", Font.BOLD, 10)); 
b3.setBounds(220, 156 ,40,20);
f.add(b3); b4 = new JButton("+"); 
b4.setFont(new Font("Arial", Font.BOLD, 10)); 
b4.setBounds(220, 194 ,40,20);
f.add(b4); b5 = new JButton("+"); 
b5.setFont(new Font("Arial", Font.BOLD, 10)); 
b5.setBounds(220, 230 ,40,20);
f.add(b5); b6 = new JButton("+"); 
b6.setFont(new Font("Arial", Font.BOLD, 10)); 
b6.setBounds(220, 263,40,20 );
f.add(b6); b7 = new JButton("+"); 
b7.setFont(new Font("Arial", Font.BOLD, 10)); 
b7.setBounds(220, 299,40,20 );
f.add(b7); b8 = new JButton("+"); 
b8.setFont(new Font("Arial", Font.BOLD, 10)); 
b8.setBounds(220, 333,40,20 );
f.add(b8); b9 = new JButton("+"); 
b9.setFont(new Font("Arial", Font.BOLD, 10)); 
b9.setBounds(220, 367,40,20);
f.add(b9); b10 = new JButton("+"); 
b10.setFont(new Font("Arial", Font.BOLD, 10)); 
b10.setBounds(220, 400,40,20 );
f.add(b10); b11 = new JButton("+"); 
b11.setFont(new Font("Arial", Font.BOLD, 10)); 
b11.setBounds(220, 435,40,20);
f.add(b11);
b12 = new JButton("+"); b12.setFont(new 
Font("Arial", Font.BOLD, 10)); 
b12.setBounds(220, 472,40,20);
f.add(b12); b13 = new JButton("+"); 
b13.setFont(new Font("Arial", Font.BOLD, 10)); 
b13.setBounds(220, 508,40,20);
f.add(b13); t1 = new JTextField(""); 
t1.setFont(new Font("Arial", Font.PLAIN, 20)); 
t1.setSize(35, 20); t1.setLocation(280, 80); 
t1.setEditable(false);
f.add(t1); t2 = new JTextField(""); 
t2.setFont(new Font("Arial", Font.PLAIN, 20)); 
t2.setSize(35, 20); t2.setLocation(280, 118); 
t2.setEditable(false);
f.add(t2); t3 = new JTextField(""); 
t3.setFont(new Font("Arial", Font.PLAIN, 20)); 
t3.setSize(35, 20); t3.setLocation(280, 156); 
t3.setEditable(false);
f.add(t3);
t4 = new JTextField(""); t4.setFont(new 
Font("Arial", Font.PLAIN, 20)); t4.setSize(35, 
20); t4.setLocation(280, 195); 
t4.setEditable(false);
f.add(t4);
t5 = new JTextField(""); t5.setFont(new 
Font("Arial", Font.PLAIN, 20)); t5.setSize(35, 
20); t5.setLocation(280, 230); 
t5.setEditable(false);
f.add(t5);
t6 = new JTextField(""); t6.setFont(new 
Font("Arial", Font.PLAIN, 20)); t6.setSize(35, 
20); t6.setLocation(280, 264); 
t6.setEditable(false);
f.add(t6);
t7 = new JTextField(""); t7.setFont(new 
Font("Arial", Font.PLAIN, 20)); t7.setSize(35, 
20); t7.setLocation(280, 300); 
t7.setEditable(false);
f.add(t7); t8 = new JTextField(""); 
t8.setFont(new Font("Arial", Font.PLAIN, 20)); 
t8.setSize(35, 20); t8.setLocation(280, 333); 
t8.setEditable(false);
f.add(t8); t9 = new JTextField(""); 
t9.setFont(new Font("Arial", Font.PLAIN, 20)); 
t9.setSize(35, 20); t9.setLocation(280, 367); 
t9.setEditable(false);
f.add(t9); t10 = new JTextField(""); 
t10.setFont(new Font("Arial", Font.PLAIN, 20)); 
t10.setSize(35, 20); t10.setLocation(280, 400); 
t10.setEditable(false);
f.add(t10); t11 = new JTextField(""); 
t11.setFont(new Font("Arial", Font.PLAIN, 20)); 
t11.setSize(35, 20); t11.setLocation(280, 435); 
t11.setEditable(false);
f.add(t11); t12 = new JTextField(""); 
t12.setFont(new Font("Arial", Font.PLAIN, 20)); 
t12.setSize(35, 20); t12.setLocation(280, 472); 
t12.setEditable(false);
f.add(t12);
t13 = new JTextField(""); t13.setFont(new 
Font("Arial", Font.PLAIN, 20)); t13.setSize(35, 
20); t13.setLocation(280, 508); 
t13.setEditable(false);
f.add(t13);
s = new JButton("Buy the items");
s.setFont(new Font("Arial", Font.PLAIN, 20));
s.setSize(170, 40);
s.setLocation(200, 580 );
f.add(s);
f.setVisible(true); 
b1.addActionListener(this); 
b2.addActionListener(this); 
b3.addActionListener(this); 
b4.addActionListener(this); 
b5.addActionListener(this); 
b6.addActionListener(this); 
b7.addActionListener(this); 
b8.addActionListener(this); 
b9.addActionListener(this); 
b10.addActionListener(this); 
b11.addActionListener(this); 
b12.addActionListener(this); 
b13.addActionListener(this);
s.addActionListener(this); a1 = new 
JTextArea(); a1.setFont(new Font("Arial", 
Font.PLAIN, 15)); a1.setSize(150,70); 
a1.setLocation(400, 300); 
a1.setLineWrap(true);
f.add(a1);
}
public void actionPerformed(ActionEvent e){ 
if(e.getSource()==b1){ 
t1.setText(String.valueOf(o));
o++;
}o1=(o-1)*5; 
if(e.getSource()==b2){ 
t2.setText(String.valueOf(o2));
o2++;
} o3=(o2-1)*10; 
if(e.getSource()==b3){ 
t3.setText(String.valueOf(o4));
o4++;
}o5=(o4-1)*15; 
if(e.getSource()==b4){ 
t4.setText(String.valueOf(o6));
o6++;
} o7=(o6-1)*8; 
if(e.getSource()==b5){ 
t5.setText(String.valueOf(o8));
o8++; } 
o9=(o8-
1)*12; 
if(e.getSource
()==b6){ 
t6.setText(String.valueOf(o1
0));
o10++; } o11=(o10-1)*20; 
if(e.getSource()==b7){ 
t7.setText(String.valueOf(o12));
o12++;
} o13=(o12-1)*40; 
if(e.getSource()==b8){ 
t8.setText(String.valueOf(o14));
o14++; }o15=(o14-
1)*15;
if(e.getSource()==b9){ 
t9.setText(String.valueOf(o16));
o16++;
}o17=(o16-1)*12; 
if(e.getSource()==b10){ 
t10.setText(String.valueOf(o18)); o18++;
}o19=(o18-1)*60; 
if(e.getSource()==b11){ 
t11.setText(String.valueOf(o20));
o20++;
}o21=(o20-1)*80; 
if(e.getSource()==b12){ 
t12.setText(String.valueOf(o22));
o22++;
}o23=(o22-1)*18; 
if(e.getSource()==b13){ 
t13.setText(String.valueOf(o24));
o16++;
}o25=(o24-1)*8; if(e.getSource()==s){
int
sum=o1+o3+o5+o7+o9+o11+o13+o15+o17+o19+o21+o23+o25;
a1.setText("Total Ammount: "+String.valueOf(sum)); 
a1.setEditable(false);
}
}
public static void main(String args[]){
new Canteen();
	}
}