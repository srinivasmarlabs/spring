package com.demo.spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.runners.model.RunnerScheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Component;

// @Component

public class JdbcInsertRunner implements CommandLineRunner{

	
	@Autowired
	JdbcTemplate jt;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		String insert_sql="insert into emp(empno,name,address, salary) values(?,?,?,?)";
		
		int rows=jt.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException
			
			{
				PreparedStatement pst=con.prepareStatement(insert_sql);
				
				pst.setInt(1, 105);
				pst.setString(2, "kk");
				pst.setString(3,"kota");
				pst.setDouble(4, 400.00);
				
				return pst;
			}

			
		});
		
		System.out.println("RowsInserted:"+rows);

}
}
