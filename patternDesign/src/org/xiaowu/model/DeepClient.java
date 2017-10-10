package org.xiaowu.model;

import java.io.IOException;

public class DeepClient {
	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		Author author = new Author();
		author.setName("tengj");
		Book book = new Book();
		book.setBookName("Java设计模式");
		book.setPrice(99);
		book.setAuthor(author);
		Book book2 = book.deepClone();
		System.out.println(book == book2); // false
		System.out.println(book.getBookName() == book2.getBookName()); // false
		System.out.println(book.getAuthor() == book2.getAuthor()); // false
	}
}
