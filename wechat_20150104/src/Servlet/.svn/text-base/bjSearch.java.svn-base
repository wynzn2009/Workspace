package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.wechat.dao.BjJbxxDAO;
import com.wechat.service.*;
import com.wechat.vo.*;

public class bjSearch extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructor of the object.
	 */
	public bjSearch() {
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
		System.out.println("doget");
		doPost(request, response);
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
		ServletContext ctx = getServletConfig().getServletContext();
		BeanFactory factory = (BeanFactory) WebApplicationContextUtils.getWebApplicationContext(ctx); 
		BjService bjService = (BjService)factory.getBean("BjService");
		
		String cxbjlsh=request.getParameter("cxbjlsh")==null?"":request.getParameter("cxbjlsh");
		String cxsqz=request.getParameter("cxsqz")==null?"":request.getParameter("cxsqz");
		String cxphone=request.getParameter("cxphone")==null?"":request.getParameter("cxphone");
		
		System.out.println("接收传值：cxbjlsh" + cxbjlsh + "cxsqz" + cxsqz + "cxphone" + cxphone);  //根据信息查找符合条件的办件list
		List<BjJbxx> bjList = bjService.findBj2(cxbjlsh ,cxsqz, cxphone);   
		String jsonStr = this.getErrorJson("未找到符合条件的办件，请核实后查询！");
		System.out.println("size:" + bjList.size());
		
		if(bjList.size() == 1){
		System.out.println("size = 1");
		BjJbxx bj = bjList.get(bjList.size()-1);                        
		String bjlsh = bj.getBjlsh();

		System.out.println("bjlsh" + bjlsh);
		List<BjLcclxx> lcclList = bjService.findLcclxxbyBjlsh(bjlsh);
		String sxmc = bj.getSxmc();
		String cljgms = lcclList.get(lcclList.size()-1).getCljgms();
		String zhxgsj = lcclList.get(lcclList.size()-1).getCssj().toString();

		//查询信息list遍历写入json
		List<String> res = new ArrayList<String>(); 
		res.add(bjlsh);
		res.add(sxmc);
		res.add(zhxgsj);
		res.add(cljgms);
		jsonStr = this.getJson(res) == null ? "" : this.getJson(res);
		}else if(bjList.size() > 1) {
			List<String> res = new ArrayList<String>(); 
			for (int i = 0; i < bjList.size(); i++) {
				res.add(bjList.get(i).getBjlsh());
				res.add(bjList.get(i).getBjztms());
			}
			jsonStr = this.getJson(res) == null ? "" : this.getJsons(res);
		}
				
		System.out.println("json结果" + jsonStr);
		PrintWriter out = response.getWriter();
		out.print(jsonStr);
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
	
	private String handle(String bjlsh,String sxmc,String sqz,String phone){
		ServletContext ctx = getServletConfig().getServletContext();
		BeanFactory factory = (BeanFactory) WebApplicationContextUtils.getWebApplicationContext(ctx); 
		BjService bjs = (BjService)factory.getBean("BjService");
		List<BjLcclxx> listlcclxx=bjs.findBj(bjlsh,sxmc,sqz,phone);
		
		JSONArray all = new JSONArray();
		try{
			for(int i=0;i<listlcclxx.size();i++)
			{
			    JSONObject json = new JSONObject();
			    BjLcclxx lc=listlcclxx.get(i);
				BjJbxx bj = bjs.findBjjbxx(lc.getBjlsh());
				json.put("flag", "Y");
				json.put("bjlsh", bj.getBjlsh());
				json.put("sxbm", bj.getSxbm());
				json.put("sxmc", bj.getSxmc());
				json.put("sqz", bj.getSqdwmc());
				json.put("lxfs", bj.getLxdh());
				json.put("bjjd", lc.getBzmc());
				json.put("cbjg", bj.getCbjgmc());
				all.put(json);
			}
		}catch(JSONException e){
			e.printStackTrace();
		}
		return all.toString();
	}
	
	private String getJson(List<String> info){
		JSONObject json = new JSONObject();
		try {
			json.put("办件流水号", info.get(0));
			json.put("事项名称", info.get(1));
			json.put("最后处理时间", info.get(2));
			json.put("处理步骤",info.get(3));
			json.put("flag", 1);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json.toString();
	}
	private String getJsons(List<String> info){
		JSONObject json = new JSONObject();
		try {
			for (int i = 0; i < info.size(); i+=2) {
				json.put("办件流水号:  " + info.get(i), "    状态：" + info.get(i+1));
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json.toString();
	}
	private String getErrorJson(String info){
		JSONObject json = new JSONObject();
		try {
			json.put("error", info);
			json.put("flag", 3);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json.toString();
	}
	
	private String toString(Integer i) {
		// TODO Auto-generated method stub
		return i == null ? "" : i.toString();
	}

	private String toString(Timestamp timestamp){
		return  timestamp == null ? "" : timestamp.toString() ;
	}
	
	private String toString(String str){
		return  str == null ? "" : str.toString() ;
	}
	

	
}
