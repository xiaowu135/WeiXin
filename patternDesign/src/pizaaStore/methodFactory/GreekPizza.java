package pizaaStore.methodFactory;

/**
 * Created by tengj on 2016/4/1.
 */
public class GreekPizza  extends Pizza {
    public void prepare(){
        System.out.println("准备GreekPizza~");
    }
    public void bake(){
        System.out.println("正在烤GreekPizza~");
    }
    public void cut(){
        System.out.println("正在切GreekPizza~");
    }
    public void box(){
        System.out.println("正在打包GreekPizza~");
    }
}
