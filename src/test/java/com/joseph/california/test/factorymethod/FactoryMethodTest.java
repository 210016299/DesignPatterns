/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joseph.california.test.factorymethod;

import com.joseph.california.app.conf.ConnectionConfig;
import com.joseph.california.domain.HawaiianPizzaBuilder;
import com.joseph.california.domain.Pizza;
import com.joseph.california.domain.PizzaBuilder;
import com.joseph.california.domain.SpicyPizzaBuilder;
import com.joseph.california.domain.Waiter;
import com.joseph.california.domain.factorymethod.Dog;
import com.joseph.california.domain.factorymethod.DogFactory;
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

public class FactoryMethodTest {
    public static ApplicationContext ctx;
    private Long id;

    public FactoryMethodTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void isDog() {
         // create a small dog
    Dog dog = DogFactory.getDog("small");
    Assert.assertEquals("small", dog);

    // create a big dog
    dog = DogFactory.getDog("big");
    Assert.assertEquals("big", dog);

    // create a working dog
    dog = DogFactory.getDog("working");
    Assert.assertEquals("working", dog);
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
