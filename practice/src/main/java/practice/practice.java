package practice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class practice {
	public static Integer a;

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		Iterator<Integer> it = al.iterator();
		it.next();
		it.next();
		it.remove();
		}
}