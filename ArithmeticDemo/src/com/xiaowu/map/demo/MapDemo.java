package com.xiaowu.map.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

/**
 * 
 * Map集合的四种遍历方式
 * 
 * 
 * @author WQ
 *
 */
public class MapDemo {

	@Test
	public void Test() {
		Map<String, Object> map = new HashMap<String, Object>();
		for (int i = 0; i < 10; i++) {
			map.put("key" + i, "value" + i);
		}
		for (String i : map.keySet()) {
			Object object = map.get(i);
			System.out.println("object:" + object);
		}
	}

	@Test
	public void Test1() {
		Map<String, Object> map = new HashMap<String, Object>();
		for (int i = 0; i < 10; i++) {
			map.put("key" + i, "value" + i);
		}
		Iterator<Entry<String, Object>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, Object> next = it.next();
			System.out.println(next.getKey() + "---------" + next.getValue());
		}
	}

	@Test
	public void Test2() {
		Map<String, Object> map = new HashMap<String, Object>();
		for (int i = 0; i < 10; i++) {
			map.put("key" + i, "value" + i);
		}
		for (Map.Entry<String, Object> entry : map.entrySet()) {
			System.out.println("key= " + entry.getKey() + " and value= "
					+ entry.getValue());
		}
	}

	@Test
	public void Test3() {
		Map<String, Object> map = new HashMap<String, Object>();
		for (int i = 0; i < 10; i++) {
			map.put("key" + i, "value" + i);
		}
		for (Object v : map.values()) {
			System.out.println("value= " + v);
		}
	}

}
