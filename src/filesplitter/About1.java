
package filesplitter;

import javax.swing.*;
class About1 extends JFrame
{
	JTextArea t2;
	About1()
	{
		t2=new JTextArea(100,100);
		add(t2);
		t2.setEditable(false);
		t2.setText("This is a 100% pure java application \n Hope U enjoy it");
	}
	public static void main(String ar[])
	{
		About1 a1=new About1();
		a1.setVisible(true);
		a1.setSize(300,100);
		a1.setLocation(300,300);
	}
}