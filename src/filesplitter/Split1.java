
package filesplitter;

import java.io.*;
class Split1
{

	void SplitFile(String SourceFile,String destFile, int size)
	throws Exception
	{	 
		RandomAccessFile r1=new RandomAccessFile(SourceFile,"r");
		int x=(int)r1.length();
		int no_of_parts=(x/size);
		byte b[]=new byte[x];
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

	}
}