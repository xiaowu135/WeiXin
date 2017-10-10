package org.xiaowu.course.demo;

import java.io.UnsupportedEncodingException;

public class BytelengthDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		System.out.println("伍卿".getBytes().length);
		System.out.println("----------------------------------------");
		
		// 运行结果：2
		System.out.println("伍卿".getBytes("ISO8859-1").length);
		// 运行结果：4
		 System.out.println("伍卿".getBytes("GB2312").length);
		// 运行结果：4
		System.out.println("伍卿".getBytes("GBK").length);
		// 运行结果：6
		System.out.println("伍卿".getBytes("UTF-8").length);
	}
}
