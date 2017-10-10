package pizaaStore.methodFactory;


/**
 * Created by tengj on 2016/4/2.
 */
public class CheesePizzaFactory implements PizzaFactory{
    @Override
    public Pizza createPizza() {
        return new CheesePizza();
    }
}
