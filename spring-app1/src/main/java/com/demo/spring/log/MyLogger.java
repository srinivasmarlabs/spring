package com.demo.spring.log;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLogger {
	
	@Pointcut("execution(* com.demo.spring.service.HrService.registerEmp(..))")
	private void pcut() {}
	
	@Before("pcut()")
	public void logBefore()
	{
		System.out.println("Log before:before save emp");
	}
	@AfterReturning("pcut()")
	public void logAfter()
	{
		System.out.println("Log After:after save emp");
	}

}

//@Component