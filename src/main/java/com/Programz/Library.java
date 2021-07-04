package com.Programz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Library {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	public int lid;
	
	@Column 
	public String name;
	
	@Column
	public int bid;
	
	@Column  
	public String bookname;
	
	public Library()
	{
		
	}
	
	public Library(int li,String n,int bi,String b)
	{
		this.lid=li;
		this.name=n;
		this.bid=bi;
		this.bookname=b;
	}
	
	
	
	
	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	@Override
	public String toString()
	{
		return "Lib ID: "+lid+"Name: "+name+"Book ID: "+bid+"Book Name: "+bookname;
	}

}
