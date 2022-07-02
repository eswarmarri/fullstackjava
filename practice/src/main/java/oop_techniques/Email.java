package oop_techniques;

public class Email extends document {
	private String sender;
	private String recipient;
	private String title;
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Email [sender=" + sender + ", recipient=" + recipient + ", title=" + title + "]"+"\n"+super.toString();
	}
	public Email(String text, String sender, String recipient, String title) {
		super(text);
		this.sender = sender;
		this.recipient = recipient;
		this.title = title;
	}
}
