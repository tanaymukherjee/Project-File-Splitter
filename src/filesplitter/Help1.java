package filesplitter;

import javax.swing.*;

class Help1 extends JFrame
{
	JTextArea t1;
	Help1()
	{
		t1=new JTextArea(80,80);
		add(t1);
		t1.setEditable(false);
		t1.setText("\thelp is given");
	}
	public static void main(String ar[])
	{
		Help1 h1=new Help1();
		h1.setVisible(true);
		h1.setSize(300,200);
		h1.setLocation(300,300);
	}
}