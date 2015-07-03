package Test;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ApplicationContextUtils;
import com.Msg.BaseMsg;
import com.Msg.MsgSimpleText;
import com.wechat.service.BjService;
import com.wechat.vo.BjJbxx;
import com.wechat.vo.BjLcclxx;

public class Testbjjdcx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		ApplicationContext ctx = ApplicationContextUtils.getApplicationContext();
		System.out.println(System.currentTimeMillis()-start);
		BjService bjService = (BjService)ctx.getBean("BjService");
		String bjlsh = "13020000201309230040";
		BjJbxx bj = bjService.findBjjbxx(bjlsh);
		List list = bjService.findLcclxxbyBjlsh(bjlsh);
		String bjjd = "";
		for(int i=0;i<list.size();i++){
			BjLcclxx lcxx = (BjLcclxx)list.get(i);
			String bzbm = lcxx.getBzbm();
			String bzmc = lcxx.getBzmc();
			String rwzt = lcxx.getRwzt();
			if(rwzt.equals("处理中")){
				bjjd = bzmc;
				break;
			}else if(bzbm.equals("600")){
				bjjd = "已办结";
				break;
			}
		}
		String sxbm = bj.getSxbm();
		System.out.println(bjjd);
		System.out.println(sxbm);
		//test msgSimpleText
		start = System.currentTimeMillis();
		Map map = new HashMap();
		map.put("Content", "bj13020000201307310015");
		BaseMsg bm = new MsgSimpleText(map);
		System.out.println((String)bm.getHandledMap().get("Content"));
		System.out.println(System.currentTimeMillis()-start);
		System.out.println("end");
	}

}
