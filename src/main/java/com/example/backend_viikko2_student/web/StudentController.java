package com.example.backend_viikko2_student.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.backend_viikko2_student.domain.Student;

@Controller
public class StudentController {
	
	@GetMapping("hellos")
	public String sayHelloToStudents(Model model) {
		ArrayList<Student> students =new ArrayList<>();
		students.add(new Student("Henni", "Ylipekka"));
		students.add(new Student("Anis", "Mökkönen"));
		students.add(new Student("Pekka", "Henninen"));
		model.addAttribute("students", students);
		return "studentlist";
	}

}
