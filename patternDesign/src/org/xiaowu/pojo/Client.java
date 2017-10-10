package org.xiaowu.pojo;

public class Client {
	public static void main(String[] args) {
		Author author = new Author();
		author.setName("tengj");
		Book book = new Book();
		book.setBookName("Java设计模式");
		book.setPrice(99);
		book.setAuthor(author);
		Book book2 = book.clone();
		System.out.println(book == book2); // false
		System.out.println(book.getBookName() == book2.getBookName()); // true
		System.out.println(book.getAuthor() == book2.getAuthor()); // true
	}
}
