package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.wechat.service.SxJbxxService;
import com.wechat.entity.SxJbxxEntity;;

public class sxSearch extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public sxSearch() {
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
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		ServletContext ctx = getServletConfig().getServletContext(); 
		BeanFactory factory = (BeanFactory) WebApplicationContextUtils.getWebApplicationContext(ctx);
		SxJbxxService serv = (SxJbxxService)factory.getBean("SxJbxxService");
		
		String dwname = request.getParameter("dwname");
		int pageNum = 0;
		int pageIndex = 1;
		int perPage = 0;
		try{
		    pageIndex = Integer.parseInt(request.getParameter("pageIndex"));
		    perPage = Integer.parseInt(request.getParameter("perPage"));
		    pageNum = serv.getTotalCount(dwname)/perPage+1;
		}catch(NumberFormatException ex){
			System.out.println("获取int失败！"+ex);
		}
		ArrayList<SxJbxxEntity> list = serv.findByCbjgmb(dwname,pageIndex,perPage ); 
		request.setAttribute("list", list);
		request.setAttribute("pageIndex", pageIndex);
		request.setAttribute("perPage", perPage);
		request.setAttribute("pageNum", pageNum);
		request.getRequestDispatcher("/yw/sxlist.jsp?dwname"+dwname).forward(request, response);
		//out.flush();
		//out.close();
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
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the POST method");
		out.println("  </BODY>");
		out.println("</HTML>");
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
