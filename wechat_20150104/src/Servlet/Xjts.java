package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.*;
import org.omg.CORBA.Request;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.sun.org.apache.bcel.internal.generic.LSHL;
import com.wechat.service.*;
import com.wechat.vo.Tsxx;
import com.wechat.vo.Tsxxfk;

public class Xjts extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Xjts() {
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
		response.setContentType("text/html");
		ServletContext ctx = getServletConfig().getServletContext();
		BeanFactory factory = (BeanFactory) WebApplicationContextUtils.getWebApplicationContext(ctx); 
		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyyMMdd");
		java.util.Date currentTime = new java.util.Date();
		String str_currenttime = formatter.format(currentTime);
		str_currenttime="WTS"+str_currenttime;
		HttpSession session = request.getSession();
		
		TsxxService ts = (TsxxService)factory.getBean("TsxxService");
		
		String tsrxm = request.getParameter("tsrxm")==null?"":request.getParameter("tsrxm");
		String yzm = request.getParameter("yzm")==null?"":request.getParameter("yzm");
		String bdw = request.getParameter("bdw")==null?"":request.getParameter("bdw");
		String bxm = request.getParameter("bxm")==null?"":request.getParameter("bxm");
		String bjb = request.getParameter("bjb")==null?"":request.getParameter("bjb");
		String bdq = request.getParameter("bdq")==null?"":request.getParameter("bdq");
		String wtlb = request.getParameter("wtlb")==null?"":request.getParameter("wtlb");
		String zywt = request.getParameter("zywt")==null?"":request.getParameter("zywt");
		
		String flag = "visited";
		Tsxx t = new Tsxx();
		
		try {
			String tsbjlsh = ts.getNum();
			t.setTsbjlsh(tsbjlsh);
			t.setTsrxm(tsrxm);
			t.setCxmm(yzm);
			t.setBtsbmmc(bdw);
			t.setBrsrxm(bxm);
			t.setBtsrjb(bjb);
			t.setBtsrdq(bdq);
			t.setTslx(wtlb);
			t.setTsnr(zywt);
			ts.save(t);
			
			request.setAttribute("warm",tsbjlsh);
			request.setAttribute("cxmm", yzm);
			session.setAttribute("flag", flag);
			request.getRequestDispatcher("../yw/xjts.jsp").forward(request,response);
		} catch (Exception e) {
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			e.printStackTrace();
		}
		
		PrintWriter out = response.getWriter();
		
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
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		
		PrintWriter out = response.getWriter();
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
}
