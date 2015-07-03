package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.connection.UserSuppliedConnectionProvider;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.wechat.service.userInfoService;
import com.wechat.vo.Userinfo;

public class userInfo extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public userInfo() {
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
		PrintWriter out = response.getWriter();
		out
				.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
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
		String root = request.getContextPath();
		PrintWriter out = response.getWriter();
		ServletContext ctx = getServletConfig().getServletContext();
		BeanFactory factory = (BeanFactory) WebApplicationContextUtils.getWebApplicationContext(ctx); 
		HttpSession session = request.getSession();
		
		String user_id = request.getParameter("user_id")==null?"":request.getParameter("user_id");
		String old_psw = request.getParameter("old_psw")==null?"":request.getParameter("old_psw");
		String new_psw = request.getParameter("new_psw")==null?"":request.getParameter("new_psw");
		
		userInfoService users = (userInfoService)factory.getBean("userInfoService");
		ArrayList<Userinfo> list = users.findByName(user_id);
		
		
		boolean flag = users.checkIn(user_id, old_psw);
		//out.println(flag);
		//out.println(list.size());
		if(flag){
			for(int i = 0; i < list.size(); i++ ){
				Userinfo temp = list.get(i);
				int id = temp.getId();
				users.updatePsw(new_psw,id);
				}
			
			out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
			out.println("<HTML>");
			out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
			out.println("  <BODY>");
			out.print("用户信息修改成功！");
			out.println("  </BODY>");
			out.println("</HTML>");	
		}else{
			out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
			out.println("<HTML>");
			out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
			out.println("  <BODY>");
			out.print("输入旧密码不正确，修改失败！");
			out.println("  </BODY>");
			out.println("</HTML>");	
		}
		
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
