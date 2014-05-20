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
public class DogFactory
{
  public static Dog getDog(String criteria)
  {
    if ( !criteria.equals("small") )
        if ( criteria.equals("big") )
            return new Rottweiler();
        else if ( criteria.equals("working") )
            return new SiberianHusky();
    else return new Poodle();

    return null;
  }
}