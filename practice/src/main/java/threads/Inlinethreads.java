package threads;
public class Inlinethreads{
	boolean b = false;
	int random;
	public void print()
	{
		Inlinethreads it = new Inlinethreads();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				it.generaterandom();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				it.printfactorial();
			}
		});
		t1.start();
		t2.start();
	}
	
	private synchronized void printfactorial() {
		while(!b)
		{
			try {
				wait();
			} catch (Exception e) {
			}
		}
		System.out.println("Fact : "+random);
		b = false;
		notify();
	}

	private synchronized void generaterandom() {
		while(b)
		{
			try {
				wait();
			} catch (Exception e) {
			}
		}
		random = (int)(Math.random()*10);
		System.out.println("random : "+random);
		b = true;
		notify();
	}

}
