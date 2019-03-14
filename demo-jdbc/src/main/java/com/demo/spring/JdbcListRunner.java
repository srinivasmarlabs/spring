package com.demo.spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class JdbcListRunner implements CommandLineRunner {
	
   @Autowired
   JdbcTemplate jt;
   
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	List<Emp> empList=jt.query("select * from emp",new RowMapper<Emp>(){
		   
		   public Emp mapRow(ResultSet rs, int rowNum) throws SQLException
		   {
			   return new Emp(rs.getInt("EMPNO"),rs.getString("NAME"),rs.getString("ADDRESS"),rs.getDouble("SALARY"));
		   }
	   });
	   
	   for(Emp e:empList)
	   {
		   System.out.println(e);
	   }
	   
	   
  Emp e=jt.queryForObject("select * from emp where empno="+104,new RowMapper<Emp>(){
	  
		  @Override   
		   public Emp mapRow(ResultSet rs, int rowNum) throws SQLException
		   {
			   return new Emp(rs.getInt("EMPNO"),rs.getString("NAME"),rs.getString("ADDRESS"),rs.getDouble("SALARY"));
		   }
	   });
  
   System.out.println(e);

	}

}
