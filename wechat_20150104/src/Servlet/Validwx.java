package Servlet;

import java.io.*;
import java.security.MessageDigest;
import java.util.Map;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Test.TestData;

import com.Authen;
import com.MsgHandler;
import com.XMLToMap;

import menu.MenuManager;

public class Validwx extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Validwx() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String signature = request.getParameter("signature")==null?"":request.getParameter("signature");
		String timestamp = request.getParameter("timestamp")==null?"":request.getParameter("timestamp");
		String nonce = request.getParameter("nonce")==null?"":request.getParameter("nonce");
		String echostr = request.getParameter("echostr")==null?"":request.getParameter("echostr");
		Authen au = new Authen(signature,timestamp,nonce);
		boolean fromWX = au.checkSignature();
		if(fromWX&&!echostr.equals("")){
			out.print(echostr);
		}else{
			
		}
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/xml;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		System.out.println("doPost");
		PrintWriter out = response.getWriter();
		String signature = request.getParameter("signature")==null?"":request.getParameter("signature");
		String timestamp = request.getParameter("timestamp")==null?"":request.getParameter("timestamp");
		String nonce = request.getParameter("nonce")==null?"":request.getParameter("nonce");
		String url = request.getQueryString();
		TestData.url = url;
		TestData.signature = signature;
		TestData.timestamp = timestamp;
		TestData.nonce = nonce;
		
		String tipStr = request.getParameter("tip");
		System.out.println("tipStr:");
		System.out.println(tipStr);
		if("loading...".equals(tipStr)){
			System.out.println("createMenu()");
			MenuManager menuManager = new MenuManager();
			menuManager.createMenu();
		}
		//diy code here
		Authen au = new Authen(signature,timestamp,nonce);
		boolean fromWX = au.checkSignature();
		if(fromWX){
			InputStream xmlData = request.getInputStream();
			TestData.step = xmlData.toString();
			//TestData.step = "msgHandler前";
			MsgHandler msg = new MsgHandler(xmlData);
			//TestData.step = "msgHandler";
			//saveAsFileWriter(msg.getResult());
			out.print(msg.getResult());
		}else{
			out.println("");
		}
		//end here
		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

	private void saveAsFileWriter(String content) {

		FileWriter fwriter = null;
		try {
			fwriter = new FileWriter("lastpost.html");
			fwriter.write(content);
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				fwriter.flush();
				fwriter.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
