package com.mail;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;


public class MyAuthenticator extends Authenticator {
	String userName = null;
	String passWord = null;
	public MyAuthenticator(){
		
	}
	public MyAuthenticator(String userName,String passWord){
		this.userName = userName;
		this.passWord = passWord;
	}
	protected PasswordAuthentication getPasswordAuthentication(){
		return new PasswordAuthentication(userName, passWord);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
