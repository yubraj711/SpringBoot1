package com.springboot.Model;

import lombok.Data;

@Data
@javax.persistence.Entity
@javax.persistence.Table

public class Books {

	@javax.persistence.Id
	@javax.persistence.GeneratedValue
	private int bookid;
	private String bookname;
	private String author;

	private int price;

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
