package com;

import java.security.MessageDigest;
import java.util.Arrays;

import Test.TestData;

public class Authen {
	private String signature;
	private String timestamp;
	private String nonce;
	private static final String token="123456";
	private static final char[] HEX_DIGITS = { '0', '1', '2', '3', '4', '5',
		            '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

	public Authen(String sign,String timestamp,String nonce){
		this.signature = sign;
		this.timestamp = timestamp;
		this.nonce = nonce;
		
	}
	public boolean checkSignature(){
		String[] arr = {token,this.timestamp,this.nonce};
		Arrays.sort(arr);
		String comStr = "";
		for(int i=0;i<arr.length;i++){
			comStr+=arr[i];
		}
		TestData.comStr = comStr;
		try{
			MessageDigest sha1 = MessageDigest.getInstance("SHA1");
			sha1.update(comStr.getBytes());
			String sha1Str = getFormattedText(sha1.digest());
			TestData.sha1Str = sha1Str;
			if(sha1Str.equals(this.signature)){
				return true;
			}
		}catch(Exception e){
			System.out.println("验证SHA1失败: "+e.toString());
			return false;
		}
		return false;
	}
	private static String getFormattedText(byte[] bytes) {
	    int len = bytes.length;
	    StringBuilder buf = new StringBuilder(len * 2);
	    // 把密文转换成十六进制的字符串形式
	    for (int j = 0; j < len; j++) {    
	    	buf.append(HEX_DIGITS[(bytes[j] >> 4) & 0x0f]);
	        buf.append(HEX_DIGITS[bytes[j] & 0x0f]);
	    }
	    return buf.toString();
	
	}

}
