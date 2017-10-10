package com.xiaowu.java.demo;


/**
 * 关于多态的一些测试
 * 
 * 
 * this.show(O)、super.show(O)、this.show((super)O)、super.show((super)O)
 * 
 * 没有理解???
 * 
 * 
 * 当超类对象引用变量引用子类对象时，被引用对象的类型而不是引用变量的类型决定了调用谁的成员方法，
 * 但是这个被调用的方法必须是在超类中定义过的，也就是说被子类覆盖的方法。这句话对多态进行了一个概括。
 * 
 * @author WQ
 *
 */
public class Test {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new B();
		B b = new B();
		C c = new C();
		D d = new D();

		System.out.println("1--" + a1.show(b));
		System.out.println("2--" + a1.show(c));
		System.out.println("3--" + a1.show(d));
		System.out.println("--------------------------------------------");
		System.out.println("4--" + a2.show(b));
		System.out.println("5--" + a2.show(c));
		System.out.println("6--" + a2.show(d));
		System.out.println("--------------------------------------------");
		System.out.println("7--" + b.show(b));
		System.out.println("8--" + b.show(c));
		System.out.println("9--" + b.show(d));
		
		
		/**
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
	}
}
