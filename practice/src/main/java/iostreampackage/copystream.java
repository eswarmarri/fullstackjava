package iostreampackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copystream
{
	public void copywithoutspaces() throws IOException
	{
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try 
		{
			fis = new FileInputStream("src/main/resources/copyfromthis.txt");
			fos = new FileOutputStream("src/main/resources/copytothis.txt");
			int i;
			char c;
			while((i=fis.read())!=-1)
			{
				c=(char)i;
				if(c==' ')
					continue;
				fos.write(c);
			}
		}
		finally
		{
			fis.close();
			fos.close();
		}
	}
}
