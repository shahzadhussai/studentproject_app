package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.student.entites.Student;
import com.student.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/showPage")
	public String showStudentFile() {
		return "login";
	}
	
	@RequestMapping("saveDetails")
	public String saveStudentRecord(@ModelAttribute("stud") Student students, ModelMap model) {
		studentService.saveDetails(students);
		model.addAttribute("msg", "Student Registration saved!");
		return "login";
	}
	
	@RequestMapping("listStudent")
	public String getAllRecord(ModelMap model) {
		List<Student> students = studentService.getStudentDetails();
		model.addAttribute("students", students);
		return "student_file";
	}
	
	@RequestMapping("delete")
	public String deleteData(@RequestParam("id") long id, ModelMap model) {
		studentService.deteleStudentById(id);
		List<Student> students = studentService.getStudentDetails();
		model.addAttribute("students", students);
		return "student_file";
	}
	
	@RequestMapping("update")
	public String updateStudenetRecord(@RequestParam("id") long id, ModelMap model) {
		Student student = studentService.updateStudentById(id);
		model.addAttribute("student", student);
		return "update_file";
	}
	
	@RequestMapping("updateDetails")
	public String updateStudentRecordData(@ModelAttribute("stud") Student students, ModelMap model) {
		studentService.saveDetails(students);
		model.addAttribute("msg", "Student Record Updated!");
		return "update_file";
	}

}
