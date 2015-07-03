package Test;

import org.json.*;

public class TestJson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jsonStr = "{" +
					"\"articles\": " +
					"[" +
					   "{\"id\":\"qe\",\"author\":\"xxw\"}," +
					   "{\"id\":\"qq\",\"author\":\"xxx\",\"title\":\"biaoti\"}," +
					   "hehe"+
					"]" +
				"}";
		try {
			/*JSONObject jo = new JSONObject(jsonStr);
			JSONArray ja = jo.getJSONArray("articles");
			for(int i=0;i<ja.length();i++){
				JSONObject article = (JSONObject)ja.get(i);
				System.out.println(article);
			}*/
			JSONObject json = new JSONObject();
			JSONArray articles = new JSONArray();
			JSONObject article1 = new JSONObject();
			article1.put("id", "qe");
			article1.put("author", "xxw");
			articles.put(article1);
			
			JSONObject article2 = new JSONObject();
			article2.put("id", "qq");
			article2.put("author", "xxx");
			article2.put("title", "biaoti");
			articles.put(article2);
			
			articles.put("hehe");
			
			json.put("articles", articles);
			System.out.println(json);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
