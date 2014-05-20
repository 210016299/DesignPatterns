/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joseph.california.test.builder;

import com.joseph.california.app.conf.ConnectionConfig;
import com.joseph.california.domain.HawaiianPizzaBuilder;
import com.joseph.california.domain.Pizza;
import com.joseph.california.domain.PizzaBuilder;
import com.joseph.california.domain.SpicyPizzaBuilder;
import com.joseph.california.domain.Waiter;
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

public class PizzaBuilderTest {
    public static ApplicationContext ctx;
    private Long id;

    public PizzaBuilderTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void notNullPizzaBuilders() {
         Waiter waiter = new Waiter();
        PizzaBuilder hawaiian_pizzabuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicy_pizzabuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder( hawaiian_pizzabuilder );
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
        Assert.assertNotNull(hawaiian_pizzabuilder);
        Assert.assertNotNull(spicy_pizzabuilder);
        Assert.assertNotNull(pizza);
    }
     
      @Test
     public void testPizzaBuilders() {
         Waiter waiter = new Waiter();
        PizzaBuilder hawaiian_pizzabuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicy_pizzabuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder( hawaiian_pizzabuilder );
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
        Assert.assertEquals(pizza, hawaiian_pizzabuilder.getPizza());
        
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
