package com.demo.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.demo.spring.Emp;
import com.demo.spring.dao.EmpDao;
import com.demo.spring.log.MyLogger;

@Service
public class HrService {
	
	@Autowired
	@Qualifier("empDaoJPAImpl")
    EmpDao dao;
	//@Autowired
	//MyLogger logger;
	public String registerEmp(int id,String name,String city, Double salary)
	{
		//logger.logBefore();
		String resp=dao.save(new Emp(id,name,city,salary));
		//logger.logAfter();
		return resp;
	}

}
//@Qualifier("empDaoJPAImpl") //by name