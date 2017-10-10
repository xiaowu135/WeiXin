package org.xiaowu.adapter.test;

public class Adapter extends Adaptee implements Target {

	private Adaptee adaptee;


    public Adapter(Adaptee adaptee) {
        super();
        this.adaptee = adaptee;
    }


    /**
     * 源类有方法simpleOperation1
     * 因此适配器类直接委派即可
     */
    @Override
    public void simpleOperation1() {
        adaptee.simpleOperation1();
    }


    /**
     * 源类没有方法simpleOperation2
     * 因此适配器类补充上这个方法
     */
    @Override
    public void simpleOperation2() {
        //write you code here
    }
}
