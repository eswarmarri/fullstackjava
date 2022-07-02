package oop_techniques;

public class document {
	private String text;

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return text;
	}

	public document(String text) {
		this.text = text;
	}
}
