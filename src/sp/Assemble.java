package sp;


import java.io.*;

public class Assemble 

{

	
	public void AssembleFile(String SourceFile)

	throws Exception
	
	{	 
		File fx=new File(SourceFile);
		FileInputStream fis=new FileInputStream(fx);
		BufferedReader br=new BufferedReader(new InputStreamReader(fis));
		int no_of_parts=Integer.parseInt(br.readLine());
		int size=Integer.parseInt(br.readLine());
        int last=Integer.parseInt(br.readLine());

		RandomAccessFile r1=new RandomAccessFile(SourceFile+"Assembled","rw");
		int x= (int)(no_of_parts*size)+last;
        byte b[]=new byte[x];

		for(int j=0;j<no_of_parts;j++)
		{
			File f1=new File("SourceFile"+j);
			RandomAccessFile r2=new RandomAccessFile(SourceFile+j,"rw");

			byte b2[]=new byte[(int)r2.length()];
			r2.read(b2);
			for(int i=0;i<size;i++)
			{
				b[(j*size)+i]=b2[i];
			}

		}
        File f1=new File("SourceFile"+no_of_parts);
			RandomAccessFile r2=new RandomAccessFile(SourceFile+no_of_parts,"rw");

			byte b2[]=new byte[(int)r2.length()];
			r2.read(b2);
			for(int i=0;i<last;i++)
			{
				b[(no_of_parts*size)+i]=b2[i];
			}
		r1.write(b);

	}

}