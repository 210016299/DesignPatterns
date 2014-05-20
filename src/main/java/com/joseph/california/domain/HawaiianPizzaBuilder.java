/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joseph.california.domain;

/**
 *
 * @author 210016299
 */
 /* "ConcreteBuilder" */
public class HawaiianPizzaBuilder extends PizzaBuilder {
  @Override
  public void buildDough()   { pizza.setDough("cross"); }
  @Override
  public void buildSauce()   { pizza.setSauce("mild"); }
  @Override
  public void buildTopping() { pizza.setTopping("ham+pineapple"); }
}