package in.naveen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.naveen.entity.Course;
import in.naveen.entity.Student;
import in.naveen.entity.Timings;
import in.naveen.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService service;
	@GetMapping("/")
	public String courseData(Model model) {
		List<Course> courses = service.getCourses();
		List<Timings> timings = service.getTimings();
		model.addAttribute("student",new Student());
		model.addAttribute("timings", timings);
		model.addAttribute("courses", courses);
		return "index";

	}
	@PostMapping("/register")
	public String saveStudent(@ModelAttribute("student") Student student, Model model) {

		boolean status = service.saveData(student);
		if (status) {
			model.addAttribute("success", "registration successfull..!");
		} else {
			model.addAttribute("error", "failed to register");
		}
		return "index";

	}

}
