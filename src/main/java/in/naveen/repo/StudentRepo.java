package in.naveen.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.naveen.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
