/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joseph.california.domain.factorymethod;

/**
 *
 * @author 210016299
 */
class Poodle implements Dog
{
  @Override
  public void speak()
  {
    System.out.println("The poodle says \"arf\"");
  }
}