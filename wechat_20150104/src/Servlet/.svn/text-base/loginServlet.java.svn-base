package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.wechat.service.DutyService;
import com.wechat.service.DutyUserService;
import com.wechat.service.userInfoService;
import com.wechat.vo.Userinfo;


public class loginServlet extends HttpServlet {
	
		
	/**
	 * Constructor of the object.
	 */
	public loginServlet() {
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
		
		String username = request.getParameter("user")==null?"":request.getParameter("user");
		String psw = request.getParameter("psw")==null?"":request.getParameter("psw");
		
		userInfoService users = (userInfoService)factory.getBean("userInfoService");
		DutyUserService dutyUsers = (DutyUserService)factory.getBean("DutyUserService");
		DutyService duty = (DutyService)factory.getBean("DutyService");
		session.setAttribute("userId", username);
		
		boolean f1 = users.checkIn(username, psw);
		boolean flag = false;
		List<String> levelList = new ArrayList<String>();
		List<String> dutyCodeList = dutyUsers.dutyCodeList(username);
		for (int i = 0; i < dutyCodeList.size(); i++) {
			String temp = duty.level(dutyCodeList.get(i));
			levelList.add(temp);
		}
		if (f1) {
			
			if (levelList.contains("56")) {
				flag = true;
				session.setAttribute("flag", flag);
			}else{session.setAttribute("flag", flag);}
			
		}else{session.setAttribute("flag", flag);}
		
		if(flag){
			session.setAttribute("flag", flag);
		}else{
			
		}
		response.sendRedirect(root + "/htgl/ueditor.html");
		out.println(session);
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
