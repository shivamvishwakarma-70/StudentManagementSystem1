package com.example.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.entity.Student;
import com.example.main.repositories.Studentrepository;
import com.example.main.service.StudentService;

@Service
public class ServiceImpl implements StudentService{
	@Autowired
	Studentrepository studentrepository;

	@Override
	public List<Student> getAllStudents() {
		
		List<Student> list = studentrepository.findAll();
		return list;
	}

	@Override
	public Student saveStudent(Student student) {
		
		return studentrepository.save(student);
	}

	@Override
	public Student getById(int id) {
	
		return studentrepository.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		studentrepository.deleteById(id);
		
	}

}
