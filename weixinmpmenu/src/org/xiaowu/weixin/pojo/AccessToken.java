package org.xiaowu.weixin.pojo;

/**
 * 微信公众号平台的唯一票据,调用微信其他接口的唯一凭证
 * 
 * @author WQ
 *
 */
public class AccessToken {
	    // 接口访问凭证
	    private String accessToken;
	    // 凭证有效期，单位：秒
	    private int expiresIn;

	    public String getAccessToken() {
	        return accessToken;
	    }

	    public void setAccessToken(String accessToken) {
	        this.accessToken = accessToken;
	    }

	    public int getExpiresIn() {
	        return expiresIn;
	    }

	    public void setExpiresIn(int expiresIn) {
	        this.expiresIn = expiresIn;
	    }
}
