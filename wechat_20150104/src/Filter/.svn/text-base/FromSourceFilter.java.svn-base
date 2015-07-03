package Filter;

import java.io.*;


import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Test.TestData;

public class FromSourceFilter implements Filter {

	public FilterConfig config ;
	public void destroy() {
		// TODO Auto-generated method stub
		this.config = null;

	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest request = (HttpServletRequest)arg0;
		HttpServletResponse response = (HttpServletResponse)arg1;
		response.setHeader("Cache-Control","no-cache"); //HTTP 1.1    
		response.setHeader("Pragma","no-cache"); //HTTP 1.0    
		response.setDateHeader ("Expires", 0); //prevents caching at the proxy server   

		arg2.doFilter(request, response);
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		this.config = arg0;
	}

}
