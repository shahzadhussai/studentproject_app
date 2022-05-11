package com.student.service;

import java.util.List;

import com.student.entites.Student;

public interface StudentService {

	public void saveDetails(Student students);

	public List<Student> getStudentDetails();

	public void deteleStudentById(long id);

	public Student updateStudentById(long id);

}
