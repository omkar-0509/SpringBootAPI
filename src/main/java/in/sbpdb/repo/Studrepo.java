package in.sbpdb.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.sbpdb.model.Stud;

public interface Studrepo extends JpaRepository <Stud, Integer> {
	@Query(value = " select name,city from stud" , nativeQuery = true)
	public List<Stud> getAllstud();
	

}
 