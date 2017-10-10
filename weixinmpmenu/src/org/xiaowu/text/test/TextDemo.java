package org.xiaowu.text.test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;

public class TextDemo {
	
	
	/**
	 * 阿里大鱼发送短信模板消息
	 * 
	 * @param args
	 * @throws ApiException
	 */
	public static void main(String[] args) throws ApiException {
		Map<String, String> map = new HashMap<String, String>();
		
		String url = "http://gw.api.taobao.com/router/rest";
		String appKey = "23858114";
		String appSecret = "4aa43a04063b378669088a89b488ac98";
		
		String time = "2017年5月23日";

        TaobaoClient client = new DefaultTaobaoClient(url, appKey,appSecret);
        AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
        Random rnd = new Random();
        int code = rnd.nextInt(8999) + 1000;//(0到9999四位数验证码)
        req.setSmsType("normal");
        req.setSmsFreeSignName("伍卿的个人短信测试");//签名
        req.setSmsParamString("{\"time\":\"" + time + "\"}");//套用模板
        req.setRecNum("13584267651");//发送的号码
        req.setSmsTemplateCode("SMS_68025023");//模板ID值
        AlibabaAliqinFcSmsNumSendResponse response = client.execute(req);
        if (response.getBody().contains("error_response")) {// true
            map.put("resultCode", "1");
            map.put("resultMsg", "短信发送次数超出限制,请稍后再试。");// 对同一个手机号可发送1条/分钟,7条/小时,50条/天
        } else if (response.getResult().getSuccess()) {
            map.put("resultCode", "0");
            map.put("smsPhone", "13584267651" + "");
            map.put("smsTime", (new Date()).getTime() + "");
            map.put("smsCode", code + "");
        }
        System.out.println("map:"+map);

	}

}
