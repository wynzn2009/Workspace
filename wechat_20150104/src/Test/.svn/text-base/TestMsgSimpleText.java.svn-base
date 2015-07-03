package Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import com.MsgHandler;
import com.Msg.MsgXmlFormat;

public class TestMsgSimpleText {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String xmlStr = MsgXmlFormat.RecSimpleText;
		InputStream xmlData = new ByteArrayInputStream(xmlStr.getBytes());
		MsgHandler msg = new MsgHandler(xmlData);
		System.out.println("xmlStr: "+msg.getResult());
	}

}
