package com.Programz;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stud/books")
@CrossOrigin(origins="http://localhost:4200")
public class BookController {
	
	@Autowired
	BookRepository bookRepository;
	
	@Autowired
	LibRepository libRepository;
	
	@Autowired
	BookService bookService;
	
	

	

	
	@RequestMapping(value="")  
	public List<Book> getAllBooks()
	{
		return this.bookRepository.findAll();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="")  
	private void postBooks(@RequestBody Library lib)
	{
		libRepository.save(lib);
	}
	
	@GetMapping(value="/mybooks")  
	public List<Library> myBooks()
	{
		return bookService.myBooks();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/{name}")  
	private void postName(@PathVariable("name") String nm)
	{
		bookService.postName(nm);
	}

}
