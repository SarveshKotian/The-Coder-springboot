package com.Programz;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
	LibRepository libRepository;
	
	List<Library> bList=new ArrayList<>();
	public void postName(String nm)
	{
		System.out.println(nm);
		List<Library> bList=new ArrayList<>();
		
		List<Library> lList=libRepository.findAll();
		for(Library l:lList)
		{
			if(nm.equals(l.name))
			{
				bList.add(l);
			}
		}
		this.bList=bList;
		myBooks();
	}
	
	public List<Library>myBooks()
	{
		System.out.println(this.bList);
		return this.bList;
	}

}
