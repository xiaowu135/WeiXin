package org.xiaowu.jsonobject.test;

import java.text.ChoiceFormat;
import java.text.MessageFormat;
import java.util.Date;

import org.junit.Test;

public class MessageFormatDemo {

	public static void main(String[] args) {
		String s1 = MessageFormat.format("我几年多少岁呢?{0}{1}", 1, 2); // 结果12
		String s2 = MessageFormat.format("'{0}{1}", 1, 2); // 结果{0}{1}
		String s3 = MessageFormat.format("'{0}'{1}", 1, 2); // 结果{0}
		System.out.println("s1:" + s1);
		System.out.println("s2:" + s2);
		System.out.println("s3:" + s3);
	}

	@Test
	public void test1() {
		double[] limit = { 0, 1, 3 };
		String[] format = { "hello0", "hello1", "hello3" };
		ChoiceFormat cf = new ChoiceFormat(limit, format);
		for (int i = 0; i < 4; ++i) {
			System.out.println(cf.format(i));
		}
	}

	@Test
	public void test2() {
		double[] limit = { 0, 1 };
		String[] format = { "Hello0", "Hello1{1}" };
		ChoiceFormat cf = new ChoiceFormat(limit, format);
		MessageFormat mf = new MessageFormat("{0}");
		mf.setFormatByArgumentIndex(0, cf);
		for (int i = 0; i < 2; ++i) {
			System.out.println(mf.format(new Object[] { new Integer(i),
					new Integer(i + 1) }));
		}
	}

	@Test
	public void test3() {

		Object[] arguments = { new Integer(7),
				new Date(System.currentTimeMillis()),
				"a disturbance in the Force" };
		String result = MessageFormat
				.format("At {1,time} on {1,date}, there was {2} on planet {0,number,integer}.",
						arguments);
		System.out.println("result:" + result);
	}

	@Test
	public void test4() {
		Object[] testArgs = { new Long(3), "MyDisk" };
		MessageFormat form = new MessageFormat(
				"The disk \"{1}\" contains {0} file(s).");
		System.out.println(form.format(testArgs));
//		输出的结果为:The disk "MyDisk" contains 3 file(s).
	}

}
