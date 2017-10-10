package pizaaStore.AbstractFactory;

/**
 * Created by tengj on 2016/4/4. */
public class FamilyHamburger implements Hamburger{
    @Override
    public void create() {
        System.out.println("家庭套餐汉堡");
    }
}
