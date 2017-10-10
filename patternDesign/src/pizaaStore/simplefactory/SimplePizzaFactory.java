package pizaaStore.simplefactory;

import pizaaStore.AbstractFactory.SinglePizza;
import pizaaStore.AbstractFactory.FamilyPizza;
import pizaaStore.AbstractFactory.Pizza;

/**
 * Created by tengj on 2016/4/2.
 */
public class SimplePizzaFactory {
    /**
     * 定义一个创建披萨的工厂方法
     * @param orderType
     * @return
     */
    public static Pizza CreatePizza(String orderType){
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new SinglePizza();
        } else if (orderType.equals("greek")) {
            pizza = new FamilyPizza();
        }
        return pizza;
    }

}
