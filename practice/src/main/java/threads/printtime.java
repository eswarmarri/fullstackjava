package threads;

import java.time.LocalDateTime;
import java.util.Date;

public class printtime extends Thread {
	public void run()
	{
		long starttime = System.currentTimeMillis();
		long prev = starttime;
		while(System.currentTimeMillis()-starttime<=20000)
		{
			long now = System.currentTimeMillis();
			if(((now-prev)/2000)==1)
			{
				prev=now;
				System.out.println(LocalDateTime.now());
			}
		}
	}
}
