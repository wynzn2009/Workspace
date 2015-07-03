package com;

import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXHandler extends DefaultHandler {
	private Map xml = new HashMap();
	private String key;
	private String value;
	// 重载DefaultHandler类的方法 
	// 以拦截SAX事件通知。 
	// 
	// 关于所有有效事件，见org.xml.sax.ContentHandler 
	// 
	@Override
	public void startDocument( ) throws SAXException { 
		//System.out.println( "SAX Event: START DOCUMENT" ); 
	} 
	@Override
	public void endDocument( ) throws SAXException { 
		//System.out.println( "SAX Event: END DOCUMENT" ); 
	} 
	@Override
	public void startElement( String namespaceURI,String localName,String qName,Attributes attr ) throws SAXException { 
		/*System.out.println( "SAX Event: START ELEMENT[ " + 
		localName + " ]" ); 
	
		 如果有属性，我们也一并打印出来．．． 
		for ( int i = 0; i < attr.getLength(); i++ ){ 
		System.out.println( " ATTRIBUTE: " + 
		attr.getLocalName(i) + 
		" VALUE: " + 
		attr.getValue(i) ); 
		} */
		this.key = localName;
	} 
	@Override
	public void endElement( String namespaceURI,String localName,String qName ) throws SAXException { 
		/*System.out.println( "SAX Event: END ELEMENT[ " + 
		localName + " ]" );*/ 
		if(this.key.equals(localName)){
			xml.put(this.key, this.value);
		}
	} 
	@Override
	public void characters( char[] ch, int start, int length ) 
	throws SAXException { 
		/*System.out.print( "SAX Event: CHARACTERS[ " ); 
		try { 
			OutputStreamWriter outw = new OutputStreamWriter(System.out); 
			outw.write( ch, start,length ); 
			outw.flush(); 
		} catch (Exception e) { 
			e.printStackTrace(); 
		} 
	
		System.out.println( " ]" ); */
		this.value = String.copyValueOf(ch, start, length);
		//System.out.println(this.value);
	}
	public Map getXMLMap(){
		return this.xml;
	}
}
