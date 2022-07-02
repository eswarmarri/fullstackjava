package practice;

import oop_techniques.Email;

public class practice {

	public static void main(String[] args) {
		Email email = new Email("text","sender", "recipient", "title");
		System.out.print(email.toString());
	}
}
