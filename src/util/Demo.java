package util;

import java.util.HashMap;
import java.util.Map;

public class Demo {
	public static void main(String[] args) throws Exception{
		User user=new User();
//		user.setName("tom");
//		user.setAge("2");
		Map<String,String[]> map= new HashMap<String, String[]>();
		String[] names={"tom"};
		String[] ages={"10"};
 		map.put("name",names);
 		map.put("age", ages);
		Object uObject= Common.toBean(map, user.getClass());
		System.out.println(uObject);
	}
}
