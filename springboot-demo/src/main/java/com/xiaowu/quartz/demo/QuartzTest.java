package com.xiaowu.quartz.demo;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 1.定时器任务怎样保证在项目中一直保持运行的状态
 * 2.定时任务的主要的几个类
 *    	---触发器                  		CronTrigger       
 *      ---核心调度器			Scheduler
 *      ---任务类				Scheduler   通过构造工厂获取
 * 3.定时任务的常用的方法
 * 4.定时任务一般配合什么一起使用
 *      ---
 * 
 * 
 * 
 * @author WQ
 *
 */
public class QuartzTest {
	 public static void main(String[] args) {  
	        SimpleDateFormat DateFormat = new SimpleDateFormat("yyyyMMddHHmmss");  
	        Date d = new Date();  
	        String returnstr = DateFormat.format(d);          
	          
	        TestJob job = new TestJob();  
	        String job_name ="11";  
	        try {  
	            System.out.println(returnstr+ "【系统启动】");  
	            QuartzManager.addJob(job_name,job,"0/2 * * * * ?"); //每2秒钟执行一次  
	              
//	            Thread.sleep(10000);  
//	            System.out.println("【修改时间】");  
//	            QuartzManager.modifyJobTime(job_name,"0/10 * * * * ?");  
//	            Thread.sleep(20000);  
//	            System.out.println("【移除定时】");  
//	            QuartzManager.removeJob(job_name);  
//	            Thread.sleep(10000);  
//	              
//	            System.out.println("/n【添加定时任务】");  
//	            QuartzManager.addJob(job_name,job,"0/5 * * * * ?");  
	              
	        }  catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	    }  
}
