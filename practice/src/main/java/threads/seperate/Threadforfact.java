package threads.seperate;

public class Threadforfact extends Thread {
	private Randomandfact rf;
	public Threadforfact(Randomandfact rf)
	{
		this.rf = rf;
	}
	@Override
	public void run() 
	{
		for (int i = 0; i <5; i++) {
			synchronized (rf) {
				while (!rf.b) {
					try {
						rf.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				rf.fact = rf.generatefactorial(rf.random);
				System.out.println("fact : " + rf.fact);
				rf.b = false;
				rf.notify();
			} 
		}
	}
	
}
