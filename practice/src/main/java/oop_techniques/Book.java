package oop_techniques;

public class Book {
	private boolean isbn;
	private String title;
	private String author;
	private double price;
	public boolean isIsbn() {
		return isbn;
	}
	public void setIsbn(boolean isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book(boolean isbn, String title, String author, double price) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public void displayDetails()
	{
		String s = String.format("isbn: %b\n title: %s\n author: %s\n price: %s", isbn, title, author, price);
		System.out.println(s);
	}
	public void discountedPrice(double percent)
	{
		System.out.println(this.price-(this.price*percent)/100d);
	}
}
