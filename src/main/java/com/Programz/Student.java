package com.Programz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	
	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	public int id;
	
	@Column(nullable=false)  
	public String name;
	
	@Column(nullable=false,unique=true)  
	public String mobile;
	
	@Column(nullable=false) 
	public String dob;
	
	@Column(nullable=false,unique=true)
	public String emailid;
	
	@Column(nullable=false)  
	public String password;
	
	@Column
	public String course;
	
	@Column
	public int fee;
	
	@Column
	public String dos;
	
	@Column
	public String time ;

	
	public Student() {
		
	}
	
	public Student(int i,String n,String m,String d,String e,String p,String c,int f,String da,String t)
	{
		id=i;
		name=n;
		mobile=m;
		dob=d;
		emailid=e;
		password=p;
		course=c;
		fee=f;
		dos=da;
		time=t;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

	public String getDos() {
		return dos;
	}

	public void setDos(String day) {
		this.dos = day;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString()
	{
		return "ID: "+id+"Name: "+name+"Mobile No: "+mobile+"Date of Birthday: "+dob+"Email ID: "+emailid+"Password: "+password+"Course: "+course+"Fee: "+fee+"Day: "+dos+"Time: "+time;
	}


}
