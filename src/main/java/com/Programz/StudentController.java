package com.Programz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stud")
@CrossOrigin(origins="http://localhost:4200")
public class StudentController {
	@Autowired
	StudentService studService;
	
	@RequestMapping(value="")  
	public List<Student> getAllStuds()   
	{  
	return studService.getAllStuds();  
	}
	
	@RequestMapping("/{id}")  
	public Student getStuds(@PathVariable("id") int sNo)   
	{  
	return studService.getStud(sNo);  
	}  
	
	  
	@RequestMapping(method=RequestMethod.DELETE,value="/{id}")  
	private void deleteStuds(@PathVariable("id") int sNo)   
	{  
	studService.deleteStud(sNo);  
	}  
	
	  
	@RequestMapping(method=RequestMethod.POST,value="")  
	private int createStuds(@RequestBody Student studs)   
	{  
		studService.createStud(studs);  
		return studs.getId();  
	}  
	
	  
	@RequestMapping(method=RequestMethod.PUT,value="/{id}")  
	public void updateStuds(@RequestBody Student studs,@PathVariable("id") int sNo)   
	{  
		studService.updateStud(studs,sNo);   
	}


}
