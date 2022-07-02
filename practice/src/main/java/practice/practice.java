package practice;

import oop_techniques.AbstractClass.*;

public class practice {

	public static void main(String[] args) {
		Instrument[] instruments = new Instrument[3];
		instruments[0] = new Piano();
		instruments[1] = new Flute();
		instruments[2] = new Guitar();
		for(Instrument i: instruments)
		{
			i.play();
		}
	}
}
