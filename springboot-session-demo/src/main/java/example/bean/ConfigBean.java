package example.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 有时候属性太多了，一个个绑定到属性字段上太累，官方提倡绑定一个对象的bean，
 * 这里我们建一个ConfigBean.java类，顶部需要使用注解@ConfigurationProperties(prefix = “com.xiaowu”)来指明使用哪个
 * 
 * @author WQ
 *
 */

@Configuration
@ConfigurationProperties(prefix = "com.xiaowu")
@PropertySource("classpath:test.properties")
public class ConfigBean {
	private String name;
	private String want;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWant() {
		return want;
	}
	public void setWant(String want) {
		this.want = want;
	}
	
}
