package pizaaStore.methodFactory;


/**
 * Created by tengj on 2016/4/1.
 */
public class OrderPizza {
    public static void main(String[] args){
        PizzaFactory factory=new CheesePizzaFactory();
        Pizza pizza=factory.createPizza();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        factory=new GreekPizzaFactory();
        pizza=factory.createPizza();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
