package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HrController {

	
	@Autowired
	HrService service;
	
	@GetMapping(path="/hr/get",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> findEmp(@RequestParam("id") int id)
	{
		return service.getEmp(id);
	}
	
	@GetMapping(path="/hr/lst",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> listAllEmps()
	{
		return service.getAllEmp();
	}
}
