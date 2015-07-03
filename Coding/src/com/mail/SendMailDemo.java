package com.mail;

public class SendMailDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MailSenderInfo mailInfo = new MailSenderInfo();
		mailInfo.setMailServerHost("smtp.163.com");
		mailInfo.setMailServerPort("25");
		mailInfo.setValidate(true);
		mailInfo.setUserName("m15210831566@163.com");
		mailInfo.setPassword("11618024");
		mailInfo.setFromAddress("m15210831566@163.com");
		mailInfo.setToAddress("wangyuning0229@163.com");
		StringBuffer buffer = new StringBuffer();
		buffer.append("1234567890");
		buffer.append("09876543321");
		mailInfo.setContent(buffer.toString());
		SimpleMailSender sms = new SimpleMailSender();
		sms.sendTextMail(mailInfo);
		SimpleMailSender.sendHtmlMail(mailInfo);
		System.out.print("OK...");
	}

}
