package in.naveen.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.naveen.entity.Timings;

public interface TimingsRepo extends JpaRepository<Timings, Integer> {

}
