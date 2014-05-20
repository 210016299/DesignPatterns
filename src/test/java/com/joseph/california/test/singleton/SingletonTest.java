/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joseph.california.test.singleton;


import com.joseph.california.app.conf.ConnectionConfig;
import com.joseph.california.domain.singleton.Singleton;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author 210016299
 */

public class SingletonTest {
    public static ApplicationContext ctx;
    private Long id;

    public SingletonTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void isSingleton() {
         //     Singleton obj = new Singleton();	Compilation error not allowed
		int count = 0;
		//create the Singleton Object..
		Singleton obj = Singleton.getSingletonObject();
                count = count+1;
		// Your Business Logic
		//System.out.println("Singleton object obtained");
                Assert.assertNotNull(obj);
                Assert.assertEquals(count, 1);
     }
    

    @BeforeClass
    public static void setUpClass() throws Exception {
        	 ctx = new AnnotationConfigApplicationContext(ConnectionConfig.class);
		
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
