import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.swing.table.DefaultTableModel;

public class Pharmacy extends JFrame implements ActionListener
{   

    JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, l, lb9, lb10;
    JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7;
    JButton bt1, bt2;

    Pharmacy()
    {

	lb1 = new JLabel("PHARMACY MANAGEMENT SYSTEM");
	lb2 = new JLabel("MEDICINE NAME");
	lb3 = new JLabel("MANUFACTURER NAME");
	lb4 = new JLabel("DATE OF MANUFACTURE"); 
	lb5 = new JLabel("DATE OF EXPIRE");
	lb6 = new JLabel("PRICE");
	lb7 = new JLabel("QUANTITY");
	lb8 = new JLabel("TOTAL PRICE");
	lb9 = new JLabel("DATE FORMAT - (dd/mm/yyyy)");
	lb10 = new JLabel("DATE FORMAT - (dd/mm/yyyy)");
	l = new JLabel(new ImageIcon("Dollarphotoclub_75783184.jpg"));

	l.setBounds(0, 0, 800, 700);

	tf1 = new JTextField();
	tf2 = new JTextField();
	tf3 = new JTextField();
	tf4 = new JTextField();
	tf5 = new JTextField();
	tf6 = new JTextField();
	tf7 = new JTextField();

	bt1 = new JButton("ADD ITEM");
	bt2 = new JButton("EXIT");

	Font font0 = new Font("Tahoma",Font.BOLD, 35);
	Font font1 = new Font("Tahoma",Font.BOLD, 20);
	Font font2 = new Font("Tahoma",Font.BOLD, 20);
	Font font3 = new Font("Tahoma",Font.ITALIC,12);

	lb1.setFont(font0);

	lb2.setFont(font1);
	lb3.setFont(font1);
	lb4.setFont(font1); 
	lb5.setFont(font1);
	lb6.setFont(font1);
	lb7.setFont(font1);
	lb8.setFont(font1);
	lb9.setFont(font3);
	lb10.setFont(font3);
	
	bt1.setFont(font1); 
	bt2.setFont(font1); 

	tf1.setFont(font2);
	tf2.setFont(font2);
	tf3.setFont(font2);
	tf4.setFont(font2);
	tf5.setFont(font2);
	tf6.setFont(font2);
	tf7.setFont(font2);

	lb1.setForeground(Color.red);
	lb2.setForeground(Color.blue);
	lb3.setForeground(Color.blue); 
	lb4.setForeground(Color.blue); 
	lb5.setForeground(Color.blue); 
	lb6.setForeground(Color.blue); 
	lb7.setForeground(Color.blue); 
	lb8.setForeground(Color.blue);
	lb9.setForeground(Color.magenta);
	lb10.setForeground(Color.magenta);

	tf1.setBackground(Color.GRAY); 
	tf2.setBackground(Color.GRAY); 
	tf3.setBackground(Color.GRAY); 
	tf4.setBackground(Color.GRAY); 
	tf5.setBackground(Color.GRAY); 
	tf6.setBackground(Color.GRAY); 
	tf7.setBackground(Color.GRAY);

	tf1.setForeground(Color.CYAN);
	tf2.setForeground(Color.CYAN);
	tf3.setForeground(Color.CYAN);
	tf4.setForeground(Color.CYAN);
	tf5.setForeground(Color.CYAN);
	tf6.setForeground(Color.CYAN);
	tf7.setForeground(Color.CYAN);

	bt1.setBackground(Color.black); 
	bt2.setBackground(Color.black); 

	bt1.setForeground(Color.white);
	bt2.setForeground(Color.white);

	lb1.setBounds(50, 10, 700, 45);
	lb2.setBounds(100, 90, 300, 35);
	lb3.setBounds(100, 160, 300, 35);
	lb4.setBounds(100, 230, 300, 35);
	lb5.setBounds(100, 300, 300, 35);
	lb6.setBounds(100, 370, 300, 35);
	lb7.setBounds(100, 440, 300, 35);
	lb8.setBounds(100, 510, 300, 35);
	lb9.setBounds(400,265, 300, 15);
	lb10.setBounds(400,335, 300, 15);

	tf1.setBounds(400, 90, 300, 35);
	tf2.setBounds(400, 160, 300, 35);
	tf3.setBounds(400, 230, 300, 35); 
	tf4.setBounds(400, 300, 300, 35);
	tf5.setBounds(400, 370, 300, 35);
	tf6.setBounds(400, 440, 300, 35);
	tf7.setBounds(400, 510, 300, 35);

	bt1.setBounds(100, 580, 280, 50);
	bt2.setBounds(420, 580, 280, 50);

	add(lb1);
	add(lb2);
	add(lb3);
	add(lb4);
	add(lb5);
	add(lb6);
	add(lb7);
	add(lb8);
	add(lb9);
	add(lb10);

	add(tf1);
	add(tf2);
	add(tf3);
	add(tf4);
	add(tf5);
	add(tf6);
	add(tf7);

	add(bt1);
	add(bt2);

	add(l);

	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(800,700);
	setLayout(null);
	setResizable(false);
	getContentPane().setBackground(Color.LIGHT_GRAY);
	setVisible(true);
	bt1.addActionListener(this);
	bt2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)

    {

	if(e.getSource() == bt1)

	{
	   
	       if(tf1.getText().equals("")) 
	    {
		JOptionPane.showMessageDialog(null,"ENTER MEDICINE NAME");
		tf1.grabFocus();
		return;
	    }

	    if(tf2.getText().equals(""))
	    {
		JOptionPane.showMessageDialog(null,"ENTER MANUFACTURER NAME");
		tf2.grabFocus();
		return;
	    }

	    if(tf3.getText().equals(""))
	    {
		JOptionPane.showMessageDialog(null,"ENTER DATE OF MANUFACTURE");
		tf3.grabFocus();
		return;
	    }

	    if(tf4.getText().equals(""))
	    {
		JOptionPane.showMessageDialog(null,"ENTER DATE OF EXPIRE");
		tf4.grabFocus();
		return;
	    }

	    try
	    {
		int n1 = Integer.parseInt(tf5.getText());
	    }

	    catch(NumberFormatException e1)
	    {
		JOptionPane.showMessageDialog(null,"ENTER PRICE IN INTEGER");
		return;
	    }

	    try
	    {
		int n2 = Integer.parseInt(tf6.getText());
	    }

	    catch(NumberFormatException e2)
	    {
		JOptionPane.showMessageDialog(null,"ENTER QUANTITY IN INTEGER");
		return;
	    }

	    int p = Integer.parseInt(tf5.getText()) * Integer.parseInt(tf6.getText());
	    tf7.setText(String.valueOf(p));

	    try
	    {

		BufferedWriter bw = new BufferedWriter(new FileWriter("Pharmacy.txt",true));

		bw.write(tf1.getText());
		bw.write("\t");
		bw.write(tf2.getText());
		bw.write("\t");
		bw.write(tf3.getText());
		bw.write("\t");
		bw.write(tf4.getText());
		bw.write("\t");
		bw.write(tf5.getText());
		bw.write("\t");
		bw.write(tf6.getText());
		bw.write("\t");
		bw.write(tf7.getText());

		JOptionPane.showMessageDialog(null,"Data Submitted Successfully");

		tf1.setText(" ");
		tf2.setText(" ");
		tf3.setText(" ");
		tf4.setText(" ");
		tf5.setText(" ");
		tf6.setText(" ");
		tf7.setText(" ");

		bw.newLine();
		bw.close();

	    } 
	    catch(Exception ex)
	    {
		JOptionPane.showMessageDialog(null,"ENTER VALID DATA");
	    }

	}

	if(e.getSource() == bt2)
	{
	    System.exit(0);
	}
	return;

    }

    public static void main(String []arg)
    {
	new Pharmacy();
    }

}
