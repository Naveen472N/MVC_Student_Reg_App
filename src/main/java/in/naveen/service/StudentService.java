package in.naveen.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.naveen.entity.Course;
import in.naveen.entity.Student;
import in.naveen.entity.Timings;

@Service
public interface StudentService {

	public boolean saveData(Student student);

	public List<Course> getCourses();

	public List<Timings> getTimings();
}
