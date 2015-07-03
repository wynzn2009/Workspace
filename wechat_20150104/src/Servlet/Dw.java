package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.wechat.service.DwService;
import com.wechat.dao.DwDAO;

import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;


public class Dw extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Dw() {
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
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		ServletContext ctx = getServletConfig().getServletContext();
		BeanFactory factory = (BeanFactory) WebApplicationContextUtils.getWebApplicationContext(ctx); 
		DwService dwService = (DwService)factory.getBean("DwService");
		Dw d = new Dw();
		String newtel = request.getParameter("newtel")==null?"":request.getParameter("newtel");
		String name = request.getParameter("hidden")==null?"":request.getParameter("hidden");
		name = name.trim();
		ArrayList<com.wechat.vo.Dw> dd = dwService.findByDwfullname(name);
		for(int i = 0; i < dd.size(); i++){
			com.wechat.vo.Dw temp = dd.get(i);
			int dwid = temp.getDwid();
			dwService.updateTel(newtel,dwid);
		}
		out.print("ok");
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
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		ServletContext ctx2 = getServletConfig().getServletContext();
		BeanFactory factory2 = (BeanFactory) WebApplicationContextUtils.getWebApplicationContext(ctx2); 
		
		DwService dwService2 = (DwService)factory2.getBean("DwService");
		Dw dw = new Dw();
		String newintro = request.getParameter("newintro")==null?"":request.getParameter("newintro");
		String name = request.getParameter("hidden")==null?"":request.getParameter("hidden");
		ArrayList<com.wechat.vo.Dw> dd = dwService2.findByDwfullname(name);
		for(int i = 0; i < dd.size(); i++){
			com.wechat.vo.Dw temp = dd.get(i);
			int dwid = temp.getDwid();
			dwService2.updateIntro(newintro,dwid);
		}
		/*out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("修改成功！");
		out.println("  </BODY>");
		out.println("</HTML>");	*/
		out.print("ok");
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
