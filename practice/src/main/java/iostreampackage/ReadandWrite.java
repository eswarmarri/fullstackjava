package iostreampackage;

import java.io.*;
import java.util.Random;

public class ReadandWrite {
	public void randomwrite() throws IOException
	{
		FileWriter fw = null;
		try 
		{
			fw = new FileWriter("src/main/resources/random.txt");
			Random r = new Random();
			int i;
			fw.write(Integer.toString(r.nextInt(1, 31)));
			for(i=1;i<30;i++)
			{
				fw.write("\n"+Integer.toString(r.nextInt(1, 31)));
			}
		}
		finally
		{
			fw.close();
		}
	}
	
	public void readrandom() throws IOException
	{
		FileReader fr = null;
		try 
		{
			fr = new FileReader("src/main/resources/random.txt");
			int t=1,c;
			
			while((c=fr.read())!=-1)
			{
				if((char)c=='\n' & t==10)
				{
					System.out.print((char)c);
					t=1;
				}
				else if((char)c=='\n')
				{
					System.out.print(" ");
					t++;
				}
				else
				{
					System.out.print((char)c);
				}
			}
		}
		finally
		{
			fr.close();
		}
		
	}
}
