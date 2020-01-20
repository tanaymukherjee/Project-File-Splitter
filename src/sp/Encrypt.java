package sp;
import java.io.*;
public class Encrypt
{
	public void encryptFile(String SourceFile)
	throws Exception
	{	 
		RandomAccessFile r1=new RandomAccessFile(SourceFile,"r");
		int x=(int)r1.length();
		byte b[]=new byte[x];
		r1.read(b);
		File f1=new File(SourceFile+"_Encrypted");
		RandomAccessFile r2=new RandomAccessFile(SourceFile+"_Encrypted","rw");
		byte b2[]=new byte[x];
		for(int i=0;i<x;i++)
		{
			b2[i]=(byte)(b[i]+3);	
		}
		r2.write(b2);
	}
}