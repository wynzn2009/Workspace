package Test;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wechat.vo.BjJbxx;
import com.wechat.vo.BjLcclxx;
import com.wechat.dao.BjJbxxDAO;
import com.wechat.service.*;

public class testservice {
	
	public static void main(String[] args) {
		ApplicationContext ctx =new ClassPathXmlApplicationContext("applicationContext.xml");
		BjService bjs=(BjService) ctx.getBean("BjService");		
		List<BjLcclxx> list=bjs.findBj("",null,"唐山市开滦第二中学","15931908778");
		
		if(list.size()==0)
		{
			System.out.println("it is null");
		}
		else
		{
			System.out.println("it is not null");
		    for(int i=0;i<list.size();i++){
		    BjLcclxx lc=list.get(i);
		    BjJbxx bj = bjs.findBjjbxx(lc.getBjlsh());
			System.out.println(bj.getBjlsh());
		}
	}
	}
}
