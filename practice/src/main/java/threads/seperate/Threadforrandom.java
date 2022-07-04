package threads.seperate;

import practice.practice;

public class Threadforrandom extends Thread {
	private Randomandfact rf;
	public Threadforrandom(Randomandfact rf)
	{
		this.rf = rf;
	}
	@Override
	public void run() {
		for (int i = 0; i <5; i++) {
			synchronized (rf) {
				while (rf.b) {
					try {
						rf.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				rf.random = (int) (Math.random() * 10);
				System.out.println("random : " + rf.random);
				rf.b = true;
				rf.notify();
			} 
		}
	}
	

}
