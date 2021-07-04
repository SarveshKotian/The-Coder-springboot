package com.Programz;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired  
	StudentRepository studRepository;
	
	public List<Student>getAllStuds()
	{
		List<Student> studs= new ArrayList<Student>();
		studRepository.findAll().forEach(studs1 -> studs.add(studs1));
		return studs;
	}
	
	public Student getStud(int id)
	{
		return studRepository.findById(id).get();
	}
	
	public void createStud(Student stud)
	{
		studRepository.save(stud);
	}
	
	public void deleteStud(int id)
	{
		studRepository.deleteById(id);
	}
	
	public void updateStud(Student stud,int id)
	{
		studRepository.save(stud);
	}


}
