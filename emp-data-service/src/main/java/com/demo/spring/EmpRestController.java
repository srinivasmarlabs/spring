package com.demo.spring;

import java.util.Optional;

import javax.servlet.ServletRequest;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.entity.Emp;

@RestController
public class EmpRestController 
{
	@Autowired
	EmpRepository repo;
	
	//@RequestMapping(path="/emp/find/{id}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	@GetMapping(path="/emp/find/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	
	//public Emp findEmp(@PathVariable("id")int id)
	public ResponseEntity findEmp(@PathVariable("id")int id,ServletRequest req)
	{
		System.out.println("==="+req.getLocalPort());
	   Optional<Emp> o=repo.findById(id);
			   if(o.isPresent())
			   {
				   return ResponseEntity.ok(o.get());
			   }else
			   {
				   return ResponseEntity.ok(o.get());
			   }
			
			
	}
	
	
	@PostMapping(path="/emp/save",produces=MediaType.TEXT_PLAIN_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	//public String saveEmp(@RequestBody Emp e)
	public ResponseEntity<String> saveEmp(@RequestBody Emp e)
	{
		if(repo.existsById(e.getEmpId()))
		{
			return ResponseEntity.ok("hai");
		}else
		{
			repo.save(e);
			return ResponseEntity.ok("dal diya");
		}
	}

}
