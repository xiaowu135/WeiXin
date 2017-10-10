package org.xiaowu.email.test;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



/**
 * 发送短信链接验证
 * 邮箱验证的功能是什么?通过验证我们要完成什么?
 * 

	CREATE TABLE `verify_email` (
	  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '邮箱验证记录表',
	  `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
	  `verified` char(10) DEFAULT NULL COMMENT '是否验证,1已验证,0未验证',
	  `crt_time` datetime DEFAULT NULL COMMENT '验证码发送时间',
	  `code` varchar(255) DEFAULT NULL COMMENT '发送的随机字符串验证码',
	  `customer_id` bigint(20) DEFAULT NULL COMMENT '关联客户id',
	  PRIMARY KEY (`id`)
	) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;
	
	1.项目的本身的数据库中创建一个当前用户的待验证的邮箱的对象
	2.这里有五个关键(邮箱号码,状态是否已经验证,创建时间,随机的code,用户的主键ID)
    3.Message API调用发送邮件
    4.用户可以根据邮件的链接进入pub端的方法(关键是这里的随机的code)
    5.验证随机code
    6.验证时间是否失效
    7.验证用户邮箱是否已认证过
    8.修改用户邮箱的实名认证状态

 * 
 * @author WQ
 *
 */
public class EmailDemo {
	private static String  msg_fmt_utf_8="UTF-8";
	private static String  email_content_type="text/html;charset=UTF-8";
	
	public static void main(String[] args) throws Exception {
		/*String base = "9876543210abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";     
	    Random random = new Random();     
	    StringBuffer sb = new StringBuffer();     
	    int number=0;
	    for (int i = 0; i < 30; i++) {     
	    	number= random.nextInt(base.length());     
	        sb.append(base.charAt(number));     
	    } */   
		
		String sb = "s2mxg3abmUE1Gp7JL20qAg8Y89d8QS";
		
	    String url = "https://tunqun.tianxiapai.com/pub/email/goVerify";
	    
	    String s = url+"?emkey="+sb.toString();
	    
	    String href = "邮件正文\n 请点击如下链接完成邮箱验证\n <a href='HREF'>点击完成验证</a>HREF";
		
		Properties props = new Properties();
		props.setProperty("mail.transport.protocol","smtp"); 
		props.put("mail.smtp.host","smtp.163.com");// smtp服务器地址
		props.put("mail.smtp.auth",true); // 是否需要认证
		Session session = Session.getDefaultInstance(props);
		session.setDebug(false);// 打开debug模式，会打印发送细节到console
		// 实例化一个MimeMessage集成自abstract Message 。参数为session
		Message message = new MimeMessage(session); 
		Transport transport =null;
		try {
	        // From: 发件人,其中 InternetAddress 的三个参数分别为: 邮箱, 显示的昵称(只用于显示), 昵称的字符集编码
			message.setFrom(new InternetAddress("wrqtest@163.com","伍卿个人邮箱测试",msg_fmt_utf_8)); 
			// 设置标题
			message.setSubject("邮箱验证"); 
	        //Content: 邮件正文（可以使用html标签）
//	        message.setContent("邮件正文</br>请点击如下链接完成邮箱验证</br><a href='"+hrefLink+"'>点击完成验证</a>"+hrefLink,email_content_type);
	        message.setContent(href.replaceAll("HREF", s),email_content_type);        //设置显示的发件时间
	        message.setSentDate(new Date());
			//To: 收件人
			message.setRecipient(Message.RecipientType.TO,
					new InternetAddress("13584267651@163.com")); // 设置接收方
	        message.saveChanges();
			transport =session.getTransport() ;
	        //使用 邮箱账号 和 密码 连接邮件服务器
	        //这里认证的邮箱必须与 message 中的发件人邮箱一致，否则报错
	        transport.connect("wrqtest@163.com","qazwsx1");
	        //发送邮件, 发到所有的收件地址, message.getAllRecipients() 获取到的是在创建邮件对象时添加的所有收件人, 抄送人, 密送人
	        transport.sendMessage(message, message.getAllRecipients());
	        //关闭连接
	        transport.close();
	       System.out.println("true:"+true);
		} catch (AddressException e) {//when a wrongly formatted address
			e.printStackTrace();
			throw  e;
		} catch (MessagingException e) {
			e.printStackTrace();
			throw  e;
		}catch(Exception e){
			e.printStackTrace();
			throw  e;
		}finally{
			if(transport !=null&&transport.isConnected()){
				try {
					transport.close();
				} catch (MessagingException e) {
					throw  e;
				}
			 }
		}
	}
}
