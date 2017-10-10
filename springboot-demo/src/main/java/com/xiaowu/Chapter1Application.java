package com.xiaowu;

import java.io.IOException;

import org.apache.commons.httpclient.HttpException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



//Servlet容器默认的Context路径是/
//DispatherServlet匹配的路径(servlet-mapping中的url-patterns)是/*
//@ComponentScan路径被默认设置为SampleController的同名package，
//也就是该package下的所有@Controller，@Service, @Component, @Repository都会被实例化后并加入Spring Context中。



//没有一行配置代码、也没有web.xml。基于Spring Boot的应用在大多数情况下都不需要我们去显式地声明各类配置，而是将最常用的默认配置作为约定，在不声明的情况下也能适应大多数的开发场景。

/**
 * 这是一个配置了热部署启动的springBoot项目
 * 
 * 
 * @author WQ
 *
 */
@RestController
@SpringBootApplication
public class Chapter1Application {
	@RequestMapping("/index")
	public String index() throws HttpException, IOException {
		 return "Hello Spring Boot,我是WQ!!!!!!!!!!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Chapter1Application.class, args);
	}
}
