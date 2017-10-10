package org.xiaowu.pattern.demo;

import org.xiaowu.pattern.test.CheesePizza;
import org.xiaowu.pattern.test.GreekPizza;
import org.xiaowu.pattern.test.Pizza;


/**
 * 简单工厂模式
 * 
 * @author WQ
 *
 */
public class SimplePizzaFactory {
	public static Pizza CreatePizza(String orderType){
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (orderType.equals("greek")) {
            pizza = new GreekPizza();
        }
        return pizza;
    }
	
	
	/*
	 * 
	 try{ 
		  Pizza pizza; 
		  pizza=SimplePizzaFactory.CreatePizza("cheese");
		  pizza=SimplePizzaFactory.CreatePizza("greek"); 
	  }catch(Exception e){
	   	... 
	   }
	 */
	
}
