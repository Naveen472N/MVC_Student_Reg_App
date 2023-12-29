package in.naveen.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.naveen.entity.Course;

public interface CourseRepo extends JpaRepository<Course, Integer> {

}
