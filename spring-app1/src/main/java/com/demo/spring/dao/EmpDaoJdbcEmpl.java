package com.demo.spring.dao;

import org.springframework.stereotype.Repository;

import com.demo.spring.entity.Emp;



@Repository
public class EmpDaoJdbcEmpl  implements EmpDao{
	
	@Override
	public String save(Emp e){
		
		System.out.println("====jdbc:emp saved...");
		
		return "saved";
		
	}
	

}
