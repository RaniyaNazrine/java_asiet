import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Text implements ActionListener
{
	JLabel l1;
	JLabel l2;
	
	JTextField t1;
	JTextField t2;
	
	JButton b1;
	JButton b2;
	
	Text()
	{
		JFrame f=new JFrame("LOGIN");
		l1=new JLabel("username");
		l2=new JLabel("password");
		t1=new JTextField("24");
		t2=new JTextField("12");
		b1=new JButton("Login");
		b2=new JButton("Back");
		JPanel p = new JPanel (new GridLayout(3,1));
		p.add(l1);
		p.add(l2);
		p.add(t1);
		p.add(t2);
		p.add(b1);
		p.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		f.add(p);
		f.setSize(350,350);
		f.show();
	}
	public void actionPerformed(ActionEvent e)
	{
		String s = e.getActionCommand();
		if(s.equals("Login"))
		{
			l1.setText(t1.getText());
			t1.setText(" ");
		}
		else if(s.equals("Back"))
		{
			l2.setText(t2.getText());
			t2.setText(" ");
		}
	}
	public static void main(String args[])
	{
		Text t=new Text();
	}
}

