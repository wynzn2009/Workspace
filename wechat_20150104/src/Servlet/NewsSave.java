package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.exception.Nestable;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.wechat.service.NewsSaveService;
import com.wechat.dao.NewssaveDAO;
import com.wechat.vo.Newssave;

public class NewsSave extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public NewsSave() {
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
		
		String title=request.getParameter("tit")==null?"":request.getParameter("tit");
		String author=request.getParameter("aut")==null?"":request.getParameter("aut");
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		//String time=request.getParameter("tim")==null?"":request.getParameter("tim");
		String cover=request.getParameter("cov")==null?"":request.getParameter("cov");
		String content=request.getParameter("con")==null?"":request.getParameter("con");
		String fbbz=request.getParameter("fbb")==null?"":request.getParameter("fbb");
		String type=request.getParameter("typ")==null?"":request.getParameter("typ");
		
		System.out.println(title);
		System.out.println(author);
		System.out.println(ts);
		System.out.println(cover);
		System.out.println(content);
		System.out.println(fbbz);
		System.out.println(type);
		
		ServletContext ctx = getServletConfig().getServletContext();
		BeanFactory factory = (BeanFactory) WebApplicationContextUtils.getWebApplicationContext(ctx); 
		NewsSaveService nss = (NewsSaveService)factory.getBean("NewsSaveService");
		NewssaveDAO nsd=(NewssaveDAO)factory.getBean("NewssaveDAO");
		
		String flag = "Y";
		Newssave ns = new Newssave();
		
		try {
			if(type.equals("2")){
				List list=nss.findByFbbzType(false, 2);
				Newssave del=list==null?null:(Newssave)list.get(0);
				System.out.println(del.getTitle());
				nsd.delete(del);
			}else if ("0".equals(title)) {
				List<Newssave> exist = nss.findByFbbzType(true, 0);
				for (int i = 0; i < exist.size(); i++) {
					Newssave temp = exist.get(i);
					Long id =temp.getId();
					nss.updateFbbz(false, id);
				}
				
				ns.setTitle(title);
				ns.setAuthor(author);
				ns.setTime(ts);
				ns.setCover(cover);
				ns.setContent(content);
				ns.setFbbz(Boolean.parseBoolean(fbbz));
				ns.setType(Integer.parseInt(type.trim()));
				nss.save(ns);
			}else {
				List<Newssave> exist = nss.findByFbbzType(true, 1);
				for (int i = 0; i < exist.size(); i++) {
					Newssave temp = exist.get(i);
					Long id =temp.getId();
					nss.updateFbbz(false, id);
				}
				
				ns.setTitle(title);
				ns.setAuthor(author);
				ns.setTime(ts);
				ns.setCover(cover);
				ns.setContent(content);
				ns.setFbbz(Boolean.parseBoolean(fbbz));
				ns.setType(Integer.parseInt(type.trim()));
				nss.save(ns);
			}
			
			
		} catch (Exception e) {
			PrintWriter out = response.getWriter();
			out.println("保存失败！");
			flag = "N";
			e.printStackTrace();
		}
		PrintWriter out = response.getWriter();
		out.println("保存成功");
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
