package org.xiaowu.text.test;

import java.util.Date;
import java.util.Random;

import org.apache.commons.lang.time.DateFormatUtils;
import org.junit.Test;

public class TimeDemo {
	public static void main(String[] args) {
		String time = DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss");
		System.out.println("time:"+time);
	}
	
	
	/**生成指定长度的字符串(没有规律)*/
	@Test
	public void Test(){
		String base = "9876543210abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";     
	    Random random = new Random();     
	    StringBuffer sb = new StringBuffer();     
	    int number=0;
	    for (int i = 0; i < 30; i++) {     
	    	number= random.nextInt(base.length());     
	        sb.append(base.charAt(number));     
	    }     
	    System.out.println("sb:"+sb.toString());
	}
	
}
