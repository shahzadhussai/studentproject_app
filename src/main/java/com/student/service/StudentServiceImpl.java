package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entites.Student;
import com.student.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	public void saveDetails(Student students) {
		studentRepo.save(students);
	}

	@Override
	public List<Student> getStudentDetails() {
		List<Student> student = studentRepo.findAll();
		return student;
	}

	@Override
	public void deteleStudentById(long id) {
		studentRepo.deleteById(id);
		
	}

	@Override
	public Student updateStudentById(long id) {
		Optional<Student> findById = studentRepo.findById(id);
		Student student = findById.get();
		return student;
	}

}
