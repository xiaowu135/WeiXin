package pizaaStore.simplefactory;


/**
 * Created by tengj on 2016/4/1.
 */
public class OrderPizza {
    public static void main(String[] args){
        Pizza pizza= (Pizza) SimplePizzaFactory.CreatePizza("cheese");

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
