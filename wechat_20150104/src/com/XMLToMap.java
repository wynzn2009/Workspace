package com;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import Test.TestSAX;

public class XMLToMap {
	//private Map xmlMap;
	public XMLToMap(){
		//xmlMap = new HashMap();
	}
	public Map ParseXML(InputStream reply) throws Exception{
		SAXHandler sh = new SAXHandler();
		XMLReader xr = XMLReaderFactory.createXMLReader("org.apache.xerces.parsers.SAXParser");
		xr.setContentHandler(sh);
		InputStream is = reply;
		xr.parse(new InputSource(is));
		return sh.getXMLMap();
		
	}
	public Map ParseXML(String reply) throws Exception{
		SAXHandler sh = new SAXHandler();
		XMLReader xr = XMLReaderFactory.createXMLReader("org.apache.xerces.parsers.SAXParser");
		xr.setContentHandler(sh);
		InputStream is = new ByteArrayInputStream(reply.getBytes());
		xr.parse(new InputSource(is));
		return sh.getXMLMap();
	}
}
