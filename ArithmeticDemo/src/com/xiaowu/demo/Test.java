package com.xiaowu.demo;

import java.util.HashMap;
import java.util.Map;

class Test {
	
	public int aaa() {
        int x = 1;

        try {
            return ++x;
        } catch (Exception e) {

        } finally {
             ++x;
        }
        return x;
    }
	
	
	
    /*@SuppressWarnings("finally")
	public int aaa() {
        int x = 1;

        try {
            return ++x;
        } catch (Exception e) {

        } finally {
            return ++x;
        }
//        return x;
    }*/

    public static void main(String[] args) {
        Test t = new Test();
        int y = t.aaa();
        System.out.println(y);
        
        
        Map map = new HashMap<>();
        
    }
}
