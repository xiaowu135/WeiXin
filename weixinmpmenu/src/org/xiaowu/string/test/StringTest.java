package org.xiaowu.string.test;

import org.junit.Test;

public class StringTest {

	public void swap(char[] arr, int begin, int end) {
		while (begin < end) {
			char temp = arr[begin];
			arr[begin] = arr[end];
			arr[end] = temp;
			begin++;
			end--;
		}
	}

	public String swapWords(String str) {
		char[] arr = str.toCharArray();
		swap(arr, 0, arr.length - 1);
		int begin = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == ' ') {
				swap(arr, begin, i - 1);
				begin = i + 1;
			}
		}

		return new String(arr);
	}

	@Test
	public void Test() {
		String str = " one two three four five";
		System.out.println(new StringTest().swapWords(str));
	}

}
