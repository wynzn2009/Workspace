package mss;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class MapTest {
	class A{
		private MapTest list = null;
		public A(){
			System.out.println(Calendar.getInstance().getTimeInMillis()+"A");
		}
	}
	class B extends MapTest{
		
	}
	class C extends A{
		public C(){
			System.out.println(Calendar.getInstance().getTimeInMillis()+"C");
		}
	}
	public MapTest(){
		System.out.println(Calendar.getInstance().getTimeInMillis()+"MapTest");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Wang");
		map.put(2, "Zhang");
		map.put(3, "Zhao");
		map.put(4, "Li");
		map.put(5, "Qin");
		Set<Map.Entry<Integer,String>> set = null;
		set = map.entrySet();
		for(Map.Entry<Integer,String> a: set){
			System.out.println(a.getKey()+"@@"+a.getValue());
		}
		*/
		MapTest m = new MapTest();
		//A a = m.new A();
		B b = m.new B();
		//C c = m.new C();
		//A ac = m.new C();
		//MapTest am = a.list;
	}
}
