package com.ioc.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.xml.model.Address;
import com.ioc.xml.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Spring IOC Demo .....!" );
        
//        Employee eobj = new Employee(1001,"Tim",23);
//        Address aobj = new Address(1,"Pune","India");
//        
//        System.out.println(eobj);
//        System.out.println(aobj);
        
        ApplicationContext appctx = new ClassPathXmlApplicationContext("beans.xml");

//        Employee eobj = appctx.getBean("empObj",Employee.class);
//        Address aobj1 = appctx.getBean("addObj1",Address.class);
//        Address aobj2 = appctx.getBean("addObj2",Address.class);
//        Address aobj3 = appctx.getBean("addObj3",Address.class);
//      
//        System.out.println(eobj);
//        System.out.println(aobj1);
//        System.out.println(aobj2);
//        System.out.println(aobj3);

        
      Employee eobj1 = appctx.getBean("empObj1",Employee.class);
      Employee eobj2 = appctx.getBean("empObj2",Employee.class);

    System.out.println(eobj1);
    System.out.println(eobj2);
        
    }
}
