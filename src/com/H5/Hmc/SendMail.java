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
		properties.put("mail.transport.protocol", "smtp");// ����Э��
		properties.put("mail.smtp.host", "smtp.qq.com");// ������
		properties.put("mail.smtp.port", 465);// �˿ں�
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.ssl.enable", "true");// �����Ƿ�ʹ��ssl��ȫ���� ---һ�㶼ʹ��
		properties.put("mail.debug", "true");// �����Ƿ���ʾdebug��Ϣ true ���ڿ���̨��ʾ�����Ϣ
		// �õ��ػ�����
		Session session = Session.getInstance(properties);
		 // ��ȡ�ʼ�����
		Message message = new MimeMessage(session);
		 // ���÷����������ַ
		message.setFrom(new InternetAddress("969301352@qq.com"));
		// �����ռ��������ַ 
		message.setRecipient(Message.RecipientType.TO, new InternetAddress("969301352@qq.com"));//һ���ռ���
		// �����ʼ�����
		message.setSubject("�Զ������Խ������");
		
		Result result = new Result();
		result.result();
		if(result.result()==true){
			// �����ʼ�����
			message.setText("�ȼ�ע��ɹ�");
			System.out.println("�ȼ�ע��ɹ�");
		}else{
			message.setText("�ȼ�ע��ʧ��");
		}
		 
		 // �õ��ʲ����
		Transport transport = session.getTransport();
		 // �����Լ��������˻�
		transport.connect("969301352@qq.com", "drqhlqinembwbcca");
		// �����ʼ�
		transport.sendMessage(message, message.getAllRecipients());
		transport.close();
	}
	

}