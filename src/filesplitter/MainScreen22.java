
package filesplitter;

import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import FileSplitter.*;

public class MainScreen22 extends JFrame implements WindowListener, ActionListener
{
	JButton Browse,Stop,About,Exit,Select,Help,Split;
	JTextField tbrowse,tselect,fragment,size;
	JComboBox choice1;
	JLabel p,q,r;
	MainScreen22()
	{
		setLayout(new FlowLayout());
		Font f=new Font("Arial",Font.PLAIN,14);
		setFont(f);
		p=new JLabel("File: ");
		q=new JLabel("Save fragments in: ");
		r=new JLabel("Fragments: ");				
		Browse=new JButton("Browse");
		Stop=new JButton("Stop");
		About=new JButton("About");
		Exit=new JButton("Exit");		
		Select=new JButton("Select");
		Help=new JButton("Help");
		Split=new JButton("Split");
		fragment=new JTextField();
		tbrowse=new JTextField();
		tselect=new JTextField();
		size=new JTextField();
		choice1=new JComboBox();
		choice1.addItem("BYTE");
		choice1.addItem("KB");
		choice1.addItem("MB");
		
		add(p);
		add(q);
		add(r);
		add(Browse);
		add(Stop);
		add(About);
		add(Exit);
		add(Select);
		add(Help);
		add(Split);
		add(tbrowse);
		add(tselect);
		add(fragment);
		add(size);
		add(choice1);
		size.setEditable(false);
		addWindowListener(this);
		Browse.addActionListener(this);
		Select.addActionListener(this);
		Split.addActionListener(this);
		Exit.addActionListener(this);
		About.addActionListener(this);
		Help.addActionListener(this);
		Stop.addActionListener(this);


		repaint();
	}
		
	public void paint(Graphics g)
	{	
		
		Browse.setLocation(240,100);		
		p.setLocation(20,50);
		tbrowse.setLocation(50,50);
		Select.setLocation(240,250);
		q.setLocation(20,200);
		tselect.setLocation(150,200);
		Split.setLocation(400,50);
		Stop.setLocation(400,100);
		Exit.setLocation(400,150);
		Help.setLocation(400,200);
		About.setLocation(400,250);
		r.setLocation(150,350);
		fragment.setLocation(230,350);
		size.setLocation(50,100);
		choice1.setLocation(350,350);
		About.setSize(80,25);
		Browse.setSize(80,25);
		Select.setSize(80,25);
		Split.setSize(80,25);
		Stop.setSize(80,25);
		Exit.setSize(80,25);
		Help.setSize(80,25);
		tbrowse.setSize(260,25);
		tselect.setSize(170,25);
		fragment.setSize(70,25);
		size.setSize(100,20);
		choice1.setSize(70,25);
	}

	public static void main(String args[])
	{
		MainScreen21 m1=new MainScreen21();
                                   m1.setVisible(true);
		m1.setSize(500,500);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		String x=e.getActionCommand();
		System.out.println(x);
		if(x.equals("Stop"))
		{
			System.exit(0);
		}
		if(x.equals("Help"))
		{
			Help1 h1=new Help1();
			h1.setVisible(true);
			h1.setSize(200,50);
			h1.setLocation(300,300);
		}
		if(x.equals("Browse"))
		{
			JFileChooser js=new JFileChooser();
			JList l1=new JList();
			js.showOpenDialog(l1);
			File f1=js.getSelectedFile();
			tbrowse.setText(f1.toString());
			//size.setText();
		}	
		if(x.equals("Select"))
		{
			JFileChooser js=new JFileChooser();
			JList l1=new JList();
			js.showSaveDialog(l1);
			File f1=js.getSelectedFile();
			tselect.setText(f1.toString());
		}
		if(x.equals("About"))
		{
		About1 a1=new About1();
		a1.setVisible(true);
		a1.setSize(300,100);
		a1.setLocation(300,300);
		}
		if(x.equals("Exit"))
		{

		String m="ARE YOU SURE YOU WANT TO EXIT...???";
		int option=JOptionPane.showConfirmDialog(this, m,"File_Splitter",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

				if(option == JOptionPane.YES_OPTION){
					System.exit(0);
				}

			}
		
		if(x.equals("Split"))
		{
			try
			{
			String sourceFile=tbrowse.getText();
			String destFile=tselect.getText();
			Split1 s1=new Split1();
			int size;
			size=Integer.parseInt(fragment.getText());
			String type=(String)choice1.getSelectedItem();
			if(type.equals("KB")) size*=1024;
			if(type.equals("MB")) size*=1048576;
			s1.SplitFile(sourceFile, destFile, size);
			}
			catch(Exception e1){System.out.println(e1);}
		}
	}
	public void windowActivated(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowClosing(WindowEvent e)
	{
	dispose();
	}
	public void windowIconified(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){} 
}


