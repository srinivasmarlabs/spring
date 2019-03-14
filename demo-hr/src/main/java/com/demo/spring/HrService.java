package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HrService 
{
	@Autowired
	RestTemplate rt;
	
	public ResponseEntity<String> getEmp(int id)
	{
	
		
       HttpHeaders headers=new HttpHeaders();
		
		headers.set("Accept",MediaType.APPLICATION_JSON_VALUE);
		
		HttpEntity  req=new HttpEntity<>(headers);
		
		ResponseEntity<String> resp=rt.exchange("http://localhost:8080/emp/find/"+id, HttpMethod.GET,req,String.class);
		
		return resp;
	
		
	}
	public ResponseEntity getAllEmp()
	{
		
       HttpHeaders headers=new HttpHeaders();
		
		headers.set("Accept",MediaType.APPLICATION_JSON_VALUE);
		
		HttpEntity  req=new HttpEntity<>(headers);
		
		ResponseEntity<String> resp=rt.exchange("http://localhost:8080/emp/list", HttpMethod.GET,req,String.class);
		
	   return resp;
		
	}
	

}
