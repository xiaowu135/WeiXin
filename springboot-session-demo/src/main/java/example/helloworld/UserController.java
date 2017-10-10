package example.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.bean.ConfigBean;

@RestController
public class UserController {
	
		//直接通过value属性获取配置文件中的值
	   /* @Value("${com.xiaowu.name}")
	    private  String name;
	    @Value("${com.xiaowu.want}")
	    private  String want;*/
	
		@Autowired
		ConfigBean configBean;

	    
	    
//	    我们启动工程输入http://localhost:8080 就可以看到打印了"小伍,希望大家每天都开开心心"。
	    @RequestMapping("/")
	    public String hexo(){
	        return configBean.getName()+","+configBean.getWant();
	    }
}
