package pizaaStore.methodFactory;


import pizaaStore.AbstractFactory.FamilyPizza;

/**
 * Created by tengj on 2016/4/2.
 */
public class GreekPizzaFactory  implements PizzaFactory{
    @Override
    public Pizza createPizza() {
        return new GreekPizza();
    }
}
