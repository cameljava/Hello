package org.ktest.Hello;

import javax.xml.XMLConstants;

import org.omg.CORBA.portable.ApplicationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Logger logger=LoggerFactory.getLogger(App.class);
//        System.out.println( "Hello World!" );
        logger.info("Hello by logback.");
        
        ApplicationContext ap = new ClassPathXmlApplicationContext("spring/beans.xml");
        TestProperties testProperties = ap.getBean(TestProperties.class);
//        System.out.println("testsetst"+testProperties);
        logger.info(testProperties.getProperty1());
    }
}
