package org.xiaowu.jsonobject.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.xml.XMLSerializer;

import org.junit.Test;

/**
 * json,xml,bean三者之间的转换(对于Java后台)
 * 
 * @author WQ
 *
 */
public class JsonObjectDemo {
	@Test
	public void jsonToJAVA() {
		System.out.println("json字符串转java代码");
		String jsonStr = "{\"password\":\"123456\",\"username\":\"张三\"}";
		JSONObject jsonObj = JSONObject.fromObject(jsonStr);
		String username = jsonObj.getString("username");
		String password = jsonObj.optString("password");
		System.out.println("json--->java\n username=" + username
				+ "\t password=" + password);
	}
	
	
	/**
	 * JSON转换为  MAP  进行测试
	 * 
	 * 
	 */
	@Test
	public void jsonToJAVA1() {
		System.out.println("json字符串转java代码");
		String jsonStr = "{\"password\":\"123456\",\"username\":\"张三\"}";
		JSONObject jsonObj = JSONObject.fromObject(jsonStr);
		HashMap<String, Object> map = reflect(jsonObj);
		if (map != null) {
			String username = map.get("username").toString();
			String password = map.get("password").toString();
			System.out.println("username:"+username);
			System.out.println("password:"+password);
		}
	}
	
	public static HashMap<String, Object> reflect(JSONObject json) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		Set<?> keys = json.keySet();
		for (Object key : keys) {
			Object o = json.get(key);
			if (o instanceof JSONArray)
				map.put((String) key, reflect((JSONArray) o));
			else if (o instanceof JSONObject)
				map.put((String) key, reflect((JSONObject) o));
			else
				map.put((String) key, o);
		}
		return map;
	}
	
	
	public static Object reflect(JSONArray json) {
		List<Object> list = new ArrayList<Object>();
		for (Object o : json) {
			if (o instanceof JSONArray)
				list.add(reflect((JSONArray) o));
			else if (o instanceof JSONObject)
				list.add(reflect((JSONObject) o));
			else
				list.add(o);
		}
		return list;
	}
	

	@Test
	public void javaToJSON() {
		System.out.println("java代码封装为json字符串");
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("username", "张三");
		jsonObj.put("password", "");
		System.out.println("java--->json \n" + jsonObj.toString());
	}

	
	
	
	@Test
	public void jsonToXML() {
		System.out.println("json字符串转xml字符串");
		String jsonStr = "{\"password\":\"\",\"username\":\"张三\"}";
		JSONObject json = JSONObject.fromObject(jsonStr);
		XMLSerializer xmlSerializer = new XMLSerializer();
		xmlSerializer.setRootName("user_info");
		xmlSerializer.setTypeHintsEnabled(false);
		String xml = xmlSerializer.write(json);
		System.out.println("json--->xml \n" + xml);
	}
	
	
	

	@Test
	public void xmlToJSON() {
		System.out.println("xml字符串转json字符串");
		String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><user_info><password></password><username>张三</username></user_info>";
		XMLSerializer xmlSerializer = new XMLSerializer();
		JSON json = xmlSerializer.read(xml);
		System.out.println("xml--->json \n" + json.toString());
	}
	
	
	

	@Test
	public void javaBeanToJSON() {
		System.out.println("javabean转json字符串");
		UserInfo userInfo = new UserInfo();
		userInfo.setUsername("张三");
		userInfo.setPassword("");
		JSONObject json = JSONObject.fromObject(userInfo);
		System.out.println("javabean--->json \n" + json.toString());
	}
	
	
	
	

	@Test
	public void javaBeanToXML() {
		System.out.println("javabean转xml字符串");
		UserInfo userInfo = new UserInfo();
		userInfo.setUsername("张三");
		userInfo.setPassword("");
		JSONObject json = JSONObject.fromObject(userInfo);
		XMLSerializer xmlSerializer = new XMLSerializer();
		String xml = xmlSerializer.write(json, "UTF-8");
		System.out.println("javabean--->xml \n" + xml);
	}

}
