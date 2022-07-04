package practice;
import java.io.IOException;

import iostreampackage.ReadandWrite;
import iostreampackage.copystream;
import threads.*;
import threads.seperate.Randomandfact;
import threads.seperate.Threadforfact;
import threads.seperate.Threadforrandom;
public class practice {
	public static Integer a;

	public static void main(String[] args) {
		ReadandWrite raw = new ReadandWrite();
		try {
			raw.randomwrite();
			raw.readrandom();
			(new copystream()).copywithoutspaces();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}