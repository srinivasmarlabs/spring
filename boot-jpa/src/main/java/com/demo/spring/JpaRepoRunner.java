package com.demo.spring;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.demo.spring.entity.Emp;

@Component
public class JpaRepoRunner implements CommandLineRunner {

	@Autowired
	EmpRepository repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Optional<Emp> o=repo.findById(105);
		
		if(o.isPresent())
		{
			System.out.println(o.get());
			
		}else
		{
			
		}
		repo.save(new Emp(110,"ss","ko",345678));

		 for(Emp e:repo.findAll())
		 {
			 System.out.println(e);
		 }
			 
	}

}
