package pizaaStore.AbstractFactory;

/**
 * Created by tengj on 2016/4/1.
 */
public class SinglePizza implements Pizza{
    @Override
    public void create() {
        System.out.println("单人套餐披萨");
    }
}


