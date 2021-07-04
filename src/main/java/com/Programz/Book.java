package com.Programz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {
	
	@Id  
	@Column
	public int bid;
	
	@Column(nullable=false)  
	public String bookname;
	
	@Column(nullable=false)  
	public int price;
	
	public Book()
	{
		
	}
	public Book(int b,String bn,int p)
	{
		bid=b;
		bookname=bn;
		price=p;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString()
	{
		return "Book ID: "+bid+"Book Name: "+bookname+"Price: "+price;
	}

}
