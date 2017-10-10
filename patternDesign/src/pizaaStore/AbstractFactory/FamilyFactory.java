package pizaaStore.AbstractFactory;

/**
 * Created by tengj on 2016/4/4.
 */
public class FamilyFactory implements Factory{
    @Override
    public Pizza createPizza() {
        return new FamilyPizza();
    }
    @Override
    public Hamburger createHamburger() {
        return new FamilyHamburger();
    }
}
