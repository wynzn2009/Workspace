package Test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.wechat.dao.TestwechatDAO;
import com.wechat.dao.TsxxDAO;
import com.wechat.vo.Testwechat;
import com.wechat.vo.Tsxx;

public class testtsxx {
	public static void main(String[] args){
		ApplicationContext ctx =new ClassPathXmlApplicationContext("applicationContext.xml");
		TsxxDAO dao= (TsxxDAO) ctx.getBean("TsxxDAO");
		Tsxx u = new Tsxx();
		
		u.setTsbjlsh("6234566");
		u.setCxmm("145641156456");
		dao.save(u);
		
	}
}
