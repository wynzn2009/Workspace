package menu;

import menu.AccessToken;
import menu.Button;
import menu.CommonButton;
import menu.ComplexButton;
import menu.Menu;
import menu.WeixinUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Test.TestData;

public class MenuManager {
	private static Logger log = LoggerFactory.getLogger(MenuManager.class);
	
	public static void createMenu(){
		String appId = "wx06dd4ce8ebe2206b";
		String appSecret = "17f1f2d2e49fc369f02673e95db17985";
		
		
		AccessToken at = WeixinUtil.getAccessToken(appId, appSecret);
	
		
		if(null != at){
			int result = WeixinUtil.createMenu(getMenu(),at.getToken());
			System.out.println("result:"+result);
			if(0 == result){
				TestData.step = "菜单创建成功";
				log.info("菜单创建成功！");
				}
			else 
				log.info("菜单创建失败，错误码:" + result);
			
		}
	}
	
	private static Menu getMenu(){
		CommonButton btn11 = new CommonButton();  
        btn11.setName("办件进度查询");  
        btn11.setType("CLICK");  
        btn11.setKey("Menu1_Click1");  
  
        CommonButton btn12 = new CommonButton();  
        btn12.setName("部门事项aa");  
        btn12.setType("CLICK");  
        btn12.setKey("Menu1_Click2");  
  
        CommonButton btn13 = new CommonButton();  
        btn13.setName("在线投诉");  
        btn13.setType("CLICK");  
        btn13.setKey("Menu1_Click3");  
  
        CommonButton btn21 = new CommonButton();  
        btn21.setName("新闻中心");  
        btn21.setType("CLICK");  
        btn21.setKey("Menu2_Click1");  
  
        CommonButton btn22 = new CommonButton();  
        btn22.setName("重要公告");  
        btn22.setType("CLICK");  
        btn22.setKey("Menu2_Click2");  
    
        CommonButton btn31 = new CommonButton();  
        btn31.setName("窗口电话");  
        btn31.setType("CLICK");  
        btn31.setKey("Menu3_Click1");  
  
        CommonButton btn32 = new CommonButton();  
        btn32.setName("单位简介");  
        btn32.setType("CLICK");  
        btn32.setKey("Menu3_Click2");  
  
        CommonButton btn33 = new CommonButton();  
        btn33.setName("大厅导航");  
        btn33.setType("CLICK");  
        btn33.setKey("Menu3_Click3");  
  
        ComplexButton mainBtn1 = new ComplexButton();  
        mainBtn1.setName("业务导航");  
        mainBtn1.setSub_button(new CommonButton[] { btn11, btn12, btn13 });  
  
        ComplexButton mainBtn2 = new ComplexButton();  
        mainBtn2.setName("消息资讯");  
        mainBtn2.setSub_button(new CommonButton[] { btn21, btn22 });  
  
        ComplexButton mainBtn3 = new ComplexButton();  
        mainBtn3.setName("便民服务");  
        mainBtn3.setSub_button(new CommonButton[] { btn31, btn32, btn33 });  
		
		
		Menu menu = new Menu();  
        menu.setButton(new Button[] { mainBtn1, mainBtn2, mainBtn3 });  
  
        return menu;
	}
	
}
