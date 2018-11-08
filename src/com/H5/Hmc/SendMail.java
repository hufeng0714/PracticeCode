package com.H5.Hmc;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {
	public void sendmail() throws AddressException, MessagingException{
		Properties properties = new Properties();
		properties.put("mail.transport.protocol", "smtp");// 连接协议
		properties.put("mail.smtp.host", "smtp.qq.com");// 主机名
		properties.put("mail.smtp.port", 465);// 端口号
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.ssl.enable", "true");// 设置是否使用ssl安全连接 ---一般都使用
		properties.put("mail.debug", "true");// 设置是否显示debug信息 true 会在控制台显示相关信息
		// 得到回话对象
		Session session = Session.getInstance(properties);
		 // 获取邮件对象
		Message message = new MimeMessage(session);
		 // 设置发件人邮箱地址
		message.setFrom(new InternetAddress("969301352@qq.com"));
		// 设置收件人邮箱地址 
		message.setRecipient(Message.RecipientType.TO, new InternetAddress("969301352@qq.com"));//一个收件人
		// 设置邮件标题
		message.setSubject("自动化测试结果报告");
		
		Result result = new Result();
		result.result();
		if(result.result()==true){
			// 设置邮件内容
			message.setText("比价注册成功");
			System.out.println("比价注册成功");
		}else{
			message.setText("比价注册失败");
		}
		 
		 // 得到邮差对象
		Transport transport = session.getTransport();
		 // 连接自己的邮箱账户
		transport.connect("969301352@qq.com", "drqhlqinembwbcca");
		// 发送邮件
		transport.sendMessage(message, message.getAllRecipients());
		transport.close();
	}
	

}
