package com.ioc.annot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ioc.annot.config.AppConfig;
import com.ioc.annot.model.Address;
import com.ioc.annot.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Spring Annotation Based IOC .." );
        
        AnnotationConfigApplicationContext acappctx = new  AnnotationConfigApplicationContext(AppConfig.class);
        
//        Employee eobj = acappctx.getBean(Employee.class);
//        Address aobj = acappctx.getBean("addObj1",Address.class);
//      
//    
//        System.out.println(eobj);
//        System.out.println(aobj);
        
        Employee eobj1 = acappctx.getBean("eObj1",Employee.class);
        Employee eobj2 = acappctx.getBean("eObj2",Employee.class);
//        Address aobj = acappctx.getBean(Address.class);
//        aobj.setAddId(1);
//        aobj.setCity("Bangalore");
//        aobj.setCountry("India");
      
    
        System.out.println(eobj1);
        System.out.println(eobj2);
        
//        System.out.println(aobj);

    }
}