package org.xiaowu.jsonobject.test;

import net.sf.json.JSONObject;

public class TemplateMessageJsonDemo {
	public static void main(String[] args) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.element("touser", "伍卿");
		jsonObject.element("template_id", "www.baidu.com");
		jsonObject.element("url", "www.baidu.com");
		jsonObject.element("topcolor", "#173177");
		
		
		JSONObject firstJson = new JSONObject();
		firstJson.element("value", "第一个");
		firstJson.element("color", "#173177");
		
		JSONObject keyword1Json = new JSONObject();
		keyword1Json.element("value", "关键词1");
		keyword1Json.element("color", "#173177");
		
		JSONObject keyword2Json = new JSONObject();
		keyword2Json.element("value", "关键词2");
		keyword2Json.element("color", "#173177");
		
		JSONObject keyword3Json = new JSONObject();
		keyword3Json.element("value", "关键词3");
		keyword3Json.element("color", "#173177");
		
		JSONObject keyword4Json = new JSONObject();
		keyword4Json.element("value", "关键词4");
		keyword4Json.element("color", "#173177");
		
		
		
		JSONObject nameJson = new JSONObject();
		nameJson.element("value", "张三");
		nameJson.element("color", "#173177");
		
		JSONObject typeJson = new JSONObject();
		typeJson.element("value", "拍卖");
		typeJson.element("color", "#173177");
		
		JSONObject numberJson = new JSONObject();
		numberJson.element("value", "11111");
		numberJson.element("color", "#173177");
		
		JSONObject statusJson = new JSONObject();
		statusJson.element("value", "开始");
		statusJson.element("color", "#173177");
		
		JSONObject payJson = new JSONObject();
		payJson.element("value", "支付");
		payJson.element("color", "#173177");
		
		JSONObject dateJson = new JSONObject();
		dateJson.element("value", "20170519");
		dateJson.element("color", "#173177");
		
		JSONObject deadlineJson = new JSONObject();
		deadlineJson.element("value", "20170519");
		deadlineJson.element("color", "#173177");
		
		JSONObject remarkJson = new JSONObject();
		remarkJson.element("value", "备注");
		remarkJson.element("color", "#173177");
		
		JSONObject dataChild = new JSONObject();
		dataChild.element("first", firstJson);
		dataChild.element("keyword1", keyword1Json);
		dataChild.element("keyword2", keyword2Json);
		dataChild.element("keyword3", keyword3Json);
		dataChild.element("keyword4", keyword4Json);
		dataChild.element("name", nameJson);
		dataChild.element("type", typeJson);
		dataChild.element("number", numberJson);
		dataChild.element("deadline", deadlineJson);
		dataChild.element("status", statusJson);
		dataChild.element("pay", payJson);
		dataChild.element("date", dateJson);
		dataChild.element("remark", remarkJson);
		
		
		jsonObject.element("data", dataChild);
		System.out.println("jsonObject:"+jsonObject);
		
		
		
		
		
		/***********************输出数据格式化展示****************************/
		/*
		 jsonObject: {
		    "touser": "伍卿",
		    "template_id": "www.baidu.com",
		    "url": "www.baidu.com",
		    "topcolor": "#173177",
		    "data": {
		        "first": {
		            "value": "第一个",
		            "color": "#173177"
		        },
		        "keyword1": {
		            "value": "关键词1",
		            "color": "#173177"
		        },
		        "keyword2": {
		            "value": "关键词2",
		            "color": "#173177"
		        },
		        "keyword3": {
		            "value": "关键词3",
		            "color": "#173177"
		        },
		        "keyword4": {
		            "value": "关键词4",
		            "color": "#173177"
		        },
		        "name": {
		            "value": "张三",
		            "color": "#173177"
		        },
		        "type": {
		            "value": "拍卖",
		            "color": "#173177"
		        },
		        "number": {
		            "value": "11111",
		            "color": "#173177"
		        },
		        "deadline": {
		            "value": "20170519",
		            "color": "#173177"
		        },
		        "status": {
		            "value": "开始",
		            "color": "#173177"
		        },
		        "pay": {
		            "value": "支付",
		            "color": "#173177"
		        },
		        "date": {
		            "value": "20170519",
		            "color": "#173177"
		        },
		        "remark": {
		            "value": "备注",
		            "color": "#173177"
		        }
		    }
		}*/
		
		
		
		
		
	}
}
