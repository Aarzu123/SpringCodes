package com.ioc.annot.config;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.context.annotation.Bean;

import com.ioc.annot.model.Address;
import com.ioc.annot.model.Employee;

public class AppConfig {

	@Bean("eObj1")
	public Employee getEmployee1()
	{
		return new Employee(1001,"Tim",22,new ArrayList(Arrays.asList(getAddress1(),getAddress2())));
	}
	
	@Bean("eObj2")
	public Employee getEmployee2()
	{
		return new Employee(1002,"Kim",21,new ArrayList(Arrays.asList(getAddress3())));
	}

	@Bean("addObj1")
	public Address getAddress1()
	{
		return new Address(1,"Pune","India");
	}
	
	@Bean("addObj2")
	public Address getAddress2()
	{
		return new Address(2,"Bangalore","India");
	}
	
	@Bean("addObj3")
	public Address getAddress3()
	{
		return new Address(3,"Chennai","India");
	}
	
	
	
//	@Bean
//	public Employee getEmployee()
//	{
//		return new Employee(1001,"Tim",22);
//	}
//
//	@Bean
//	public Address getAddress()
//	{
//		return new Address();
//	}

}