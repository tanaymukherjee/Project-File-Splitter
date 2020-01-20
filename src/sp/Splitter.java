package sp;

import java.io.*;
public class Splitter
{

	public void SplitFile(String SourceFile,String destFile, int size)
	throws Exception
	{	 
		
		RandomAccessFile r1=new RandomAccessFile(SourceFile,"r");
		int x=(int)r1.length();
		int no_of_parts=(x/size);
		byte b[]=new byte[x];
		int last=x-(no_of_parts*size);
        r1.read(b);
		
		for(int j=0;j<no_of_parts;j++)
		{
			File f1=new File("destFile"+j);
			RandomAccessFile r2=new RandomAccessFile(destFile+j,"rw");
			byte b2[]=new byte[size];
		
			for(int i=0;i<size;i++)
			{
				b2[i]=b[(j*size)+i];	
			}
			r2.write(b2);
		}
		File f1=new File("destFile"+no_of_parts);
		RandomAccessFile r2=new RandomAccessFile(destFile+no_of_parts,"rw");
		byte b2[]=new byte[size];
		for(int i=0;i<last;i++)
			{
				b2[i]=b[(no_of_parts*size)+i];	
			}
		r2.write(b2);

        System.out.println("File Splitted");
		PrintWriter pr1=new PrintWriter(new FileWriter(destFile));
		pr1.println(no_of_parts);
		pr1.println(size);
        pr1.println(last);
		pr1.flush();
		
	}
}