package pizaaStore.AbstractFactory;

/**
 * Created by tengj on 2016/4/1.
 */
public class FamilyPizza implements Pizza{
    @Override
    public void create() {
        System.out.println("家庭套餐披萨");
    }
}
