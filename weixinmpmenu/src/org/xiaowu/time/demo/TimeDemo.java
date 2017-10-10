package org.xiaowu.time.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class TimeDemo {
	
	/**
	 * 获取当前时间是星期几?
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("E");  
		Date date = new Date();
		String s = format.format(date);
		System.out.println("s:"+s);
	}
	
	@Test
	public void Test(){
		Date date = new Date();  
		SimpleDateFormat weekFormat = new SimpleDateFormat("E");  
		System.out.println(weekFormat.format(date));  
		  
		SimpleDateFormat monthFormat = new SimpleDateFormat("MMMM");  
		System.out.println(monthFormat.format(date));  
		  
		SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");  
		System.out.println(yearFormat.format(date));  
		  
		SimpleDateFormat dayFormat = new SimpleDateFormat("dd");  
		System.out.println(dayFormat.format(date));  
		
		/**
		 * 
		 	星期三
			五月
			2017
			24
		 * 
		 */
	}
	
}
