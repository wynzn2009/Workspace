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

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.wechat.vo.*;
import com.wechat.service.*;

public class tsfkSearch extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public tsfkSearch() {
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
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=GBK");
		ServletContext ctx = getServletConfig().getServletContext();
		BeanFactory factory = (BeanFactory) WebApplicationContextUtils.getWebApplicationContext(ctx); 
		TsxxfkService serv = (TsxxfkService)factory.getBean("TsxxfkService");
		TsxxService tsxxService = (TsxxService)factory.getBean("TsxxService");
		
		String serialNumString = "请输入办件流水号";
		String idNumString = "请输入验证码";
		String serialNum = request.getParameter("serialNum");
		serialNum = serialNum == serialNumString ? "" : serialNum;
		String idNum = request.getParameter("idNum");
		idNum = idNum == idNumString ? "" : idNum;
		
		String jsonStr = "";
		List<Tsxx> tsxxList = tsxxService.findByLsh(serialNum, idNum);
		if (tsxxList.size() == 0) {
			jsonStr = getJson3("未找到符合条件的投诉办件，请填写正确信息后查询。");
		}else {
		
		Tsxx tsxxInfo = tsxxService.findByLsh(serialNum, idNum).get(0);
		Tsxxfk info = serv.findById(serialNum, idNum);
		
		if (info != null && tsxxInfo != null) {
			jsonStr = info == null? "" : this.getJson(info);
		}else if (info == null && tsxxInfo != null) {
			jsonStr = tsxxInfo ==null? "" : this.getJson2(tsxxInfo);
		} 
		
		System.out.println("查询结果:bjlsh:" + tsxxInfo.getTsbjlsh() + "||cxmm:" + tsxxInfo.getCxmm());
		}
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

	private String getJson(Tsxxfk info){
		JSONObject json = new JSONObject();
		try {
			json.put("投诉办件状态", 1);
			json.put("投诉办件流水号", this.toString(info.getTsbjlsh()));
			json.put("投诉事项名称", this.toString(info.getTssxmc()));
			json.put("投诉渠道名称", this.toString(info.getTsqdmc()));
			json.put("投诉人姓名", this.toString(info.getTsrxm()));
			json.put("投诉人单位名称", this.toString(info.getTsrdwmc()));
			json.put("投诉人证件号码", this.toString(info.getTsrzjhm()));
			json.put("投诉人联系地址", this.toString(info.getTsrlxdz()));
			json.put("投诉人联系电话", this.toString(info.getTsrlxdz()));
			json.put("投诉人邮政编码", this.toString(info.getTsryzbm()));
			json.put("投诉人电子邮件", this.toString(info.getTsrdzyj()));
			json.put("被投诉部门名称", this.toString(info.getBtsbmmc()));
			json.put("被投诉人员姓名", this.toString(info.getBrsrxm()));
			json.put("被投诉办件流水号", this.toString(info.getBtsbjlsh()));
			json.put("希望处理部门名称", this.toString(info.getXwclbmmc()));
			json.put("投诉标题", this.toString(info.getTsbt()));
			json.put("投诉内容", this.toString(info.getTsnr()));
			json.put("问题发生日期", this.toString(info.getWtfsrq()));
			json.put("投诉提交日期", this.toString(info.getTstjrq()));
			json.put("接受投诉部门名称", this.toString(info.getTsjsbmmc()));
			json.put("接受投诉岗位名称", this.toString(info.getTsjsgwmc()));
			json.put("投诉接受人姓名", this.toString(info.getTsjsrxm()));
			json.put("投诉接受日期", this.toString(info.getTsjsrq()));
			json.put("承诺处理时限", this.toString(info.getCnclsx()));
			json.put("实际处理部门名称", this.toString(info.getSjclbmmc()));
			json.put("实际处理岗位名称", this.toString(info.getSjclgwmc()));
			json.put("实际处理人姓名", this.toString(info.getSjclrxm()));
			json.put("办件状态", this.toString(info.getBjzt()));
			json.put("处理结果结论", this.toString(info.getCljgjl()));
			json.put("处理日期",this.toString(info.getClrq()));	
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json.toString();
	}
	/**
	 * tsxx信息
	 * @param info
	 * @return
	 */
	private String getJson2(Tsxx info){
		JSONObject json = new JSONObject();
		try {
			json.put("投诉办件状态", 2);
			json.put("投诉办件流水号", info.getTsbjlsh());
			json.put("投诉人姓名", info.getTsrxm()==null? "未填写" : info.getTsrxm());
			
		} catch (JSONException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return json.toString();
	}
	/**
	 * 无符合条件返回信息
	 * @param info
	 * @return
	 */
	private String getJson3(String info){
		JSONObject json = new JSONObject();
		try {
			json.put("投诉办件状态", 3);
			json.put("提示", info);
		} catch (JSONException e) {
			// TODO: handle exception
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
