package Filter;
import javax.servlet.Filter;
import javax.servlet.FilterConfig;
import javax.servlet.FilterChain;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;

import java.io.IOException;


public class LoginFilter implements Filter {
	public void init(FilterConfig filterConfig)throws ServletException{
		
	}
	
	public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain)
		throws IOException,ServletException{
		
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		
		HttpSession session = req.getSession(true);
		Boolean flag = (Boolean)session.getAttribute("flag");  //
		String root = req.getContextPath();
		
		//System.out.println("flag:" + flag);
		//System.out.println("url:" + req.getRequestURI());
	    //System.out.println("root:" + req.getContextPath());
		if (flag == null) {        
			res.sendRedirect(root + "/index.jsp?redirectflag=1"); 
		}else if(flag == false){
			res.sendRedirect(root + "/index.jsp?redirectflag=2");
		}else
		{
			chain.doFilter(request, response); 
		}
	}
	
	public void destroy(){
		
	}
}
