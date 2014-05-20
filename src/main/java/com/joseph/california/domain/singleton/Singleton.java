/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joseph.california.domain.singleton;

/**
 *
 * @author 210016299
 */
public class Singleton{
  
	private static Singleton singletonObject;
	
	/** A private Constructor prevents any other class from instantiating. */
	private Singleton(){
		  //	 Optional Code
	}
	
	public static synchronized Singleton getSingletonObject()
	{
	    if (singletonObject == null){
	    	singletonObject = new Singleton();
	    }
	    return singletonObject;
	}
	
	public Object clone()throws CloneNotSupportedException
	{
	    throw new CloneNotSupportedException(); 
	}
		  
}