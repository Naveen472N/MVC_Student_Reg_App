package in.naveen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.naveen.entity.Course;
import in.naveen.entity.Student;
import in.naveen.entity.Timings;
import in.naveen.repo.CourseRepo;
import in.naveen.repo.StudentRepo;
import in.naveen.repo.TimingsRepo;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepo repo;
	
	@Autowired
	private CourseRepo crepo;
	
	@Autowired
	private TimingsRepo trepo;

	@Override
	public boolean saveData(Student student) {
		
		Student list = repo.save(student);
		if(list.getId()!=null) {
			return true;
		}
		return false;
	}

	@Override
	public List<Course> getCourses() {
		  List<Course> list =crepo.findAll();
		return list;
	}

	@Override
	public List<Timings> getTimings() {
		List<Timings> list = trepo.findAll();
		return list;
	}

}
