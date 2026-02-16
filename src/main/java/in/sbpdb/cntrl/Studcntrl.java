package in.sbpdb.cntrl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import in.sbpdb.model.Stud;
import in.sbpdb.repo.Studrepo;

@RestController
public class Studcntrl {
	@Autowired
	private Studrepo repo;
	@GetMapping("/stud")
	public List<Stud> allStud(){
		List<Stud> list = repo.findAll();
		return list;
	}
	
	@GetMapping("/std")
	public Map<String,Object> allStd(){
		List<Stud> lst = repo.findAll();
		Map<String,Object> mp = new LinkedHashMap<>();
		mp.put("status", "200");
		mp.put("menulst", lst);
		return mp;
	}
	
	@PostMapping("/save")
	public Stud savestud (@RequestBody Stud s) {
		return repo.save(s);
	}
	
	
	
	@PutMapping("/update")
	public Stud updtstd(@RequestBody Stud s) {
		return repo.save(s);
	}
	
	@DeleteMapping("/delstud/{id}")
	public String delstud(@PathVariable int id) {
		repo.deleteById(id);
		return "delete success";
	}


}
