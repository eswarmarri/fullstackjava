package threads.seperate;

public class Randomandfact {
	public Randomandfact(){
		Threadforrandom tfr = new Threadforrandom(this);
		Threadforfact tff = new Threadforfact(this);
		tfr.start();
		tff.start();
	}
	public int random;
	public int fact;
	public boolean b = false;
	public int generatefactorial(int a)
	{
		if(a>0)
			return a*generatefactorial(a-1);
		else
			return 1;
	}

}
