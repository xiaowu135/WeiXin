package pizaaStore.AbstractFactory;

/**
 * Created by tengj on 2016/4/4.
*/
public class SingleHamburger  implements Hamburger{
    @Override
    public void create() {
        System.out.println("单人套餐汉堡");
    }
}
