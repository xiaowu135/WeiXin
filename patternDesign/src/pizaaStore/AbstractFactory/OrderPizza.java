package pizaaStore.AbstractFactory;

/**
 * Created by tengj on 2016/4/1.
 */
public class OrderPizza {
    public static void main(String[] args){
        Factory factory=new SingleFactory();
        Pizza pizza=factory.createPizza();
        pizza.create();
        Hamburger hamburger=factory.createHamburger();
        hamburger.create();
        factory= new FamilyFactory();
        pizza=factory.createPizza();
        pizza.create();
        hamburger=factory.createHamburger();
        hamburger.create();
    }
}
