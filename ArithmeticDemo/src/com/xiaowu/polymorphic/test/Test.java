package com.xiaowu.polymorphic.test;

public class Test {
    public static void main(String[] args) {
        //定义父类数组
        Wine[] wines = new Wine[2];
        //定义两个子类
        JNC jnc = new JNC();
        JGJ jgj = new JGJ();
        
        //父类引用子类对象
        wines[0] = jnc;
        wines[1] = jgj;
        
        for(int i = 0 ; i < 2 ; i++){
            System.out.println(wines[i].toString() + "--" + wines[i].drink());
        }
        System.out.println("-------------------------------");
        
        
        Object o = new JNC();
        System.out.println(o.toString());
        
        System.out.println("=============================");
        
        Object O = new Wine();
        System.out.println(O.toString());
        
    }
}
