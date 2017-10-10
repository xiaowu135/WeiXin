package pizaaStore.AbstractFactory;

/**
 * Created by tengj on 2016/4/4.
 */
public class SingleFactory implements Factory{
    @Override
    public Pizza createPizza() {
        return new SinglePizza();
    }

    @Override
    public Hamburger createHamburger() {
        return new SingleHamburger();
    }
}
