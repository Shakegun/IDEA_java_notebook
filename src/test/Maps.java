package test;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import java.util.jar.Attributes.Name;

public class Maps {
	// HashMap
	HashMap<String, String> hashMap;
	//java数据结构中的映射定义了一个接口 Java.util.Map;
	//实现类HashMap Hashtable LinkedHashMap TreeMap
	
	//用于存储键值对key-value,根据key得到value(像查字典一样)
	//因此不允许存在重复的key(重复则吧之前的那个覆盖掉),但是允许value重复
	
	//HashMap
	//根据key的hashcode值存储数据，根据key可以直接获取对应的value，具有很快的访问速度
	//底层数据结构
	//HashMap(jdk<=1.7)数组+链表
	//HashMap(>=jdk1.8)数组+链表/红黑树
	//TreeMap-红黑树
	
	//HashMap中最多只允许有一个key=null,允许多个记录的value=null;
	//不支持线程同步(线程不安全),即任意一个时刻可以有多个线程同时写入hashmap
	//从而可能导致数据不一致(错乱)
	
	
	//HashSet 和  HashMap的底层地层结构一致，所以HashMap也是无序的;HashSet相当于HashMap只有key没有value
	public void hmp() {
		HashMap<String, String> map2=new HashMap<String, String>();
		map2.put("aa","bb");					//添加
		map2.put("a1","giao");
		map2.put("a1","guy");					//覆盖改数(修改)
		System.out.println(map2);
		map2.remove("aa");						//删除
		System.out.println(map2);
		String val=map2.get("a1");				//按图索骥
		System.out.println(val);
		System.out.println(map2.get("asdfjk"));	//不存在，输出null
		System.out.println(map2.size());		//键值对个数
		System.out.println(map2.containsKey("laowang"));		//判断key是否存在
		System.out.println(map2.containsValue("laozhang"));		//判断value是否存在
		
		//遍历,使用entry节点
		Set<Entry<String, String>> entry=map2.entrySet();
		for(Entry<String, String> e:entry) {						//key-value遍历
			System.out.println(e.getKey()+" "+e.getValue());
		}
		Set<String> keys=map2.keySet();								//key遍历
		for(String key:keys) {
			System.out.println(key);
		}
		for(String value:map2.values()) {							//value遍历
			System.out.println(value);
		}
		//TreeMap	根据key排序，树会自动排序
		TreeMap<String, String> treeMap;//TreeSet
		//根据key找value
		//如何遍历
		
		//Hashtable
		Hashtable<String, String> hashtable;//少用，但是会考察线程安全 synchronized线程问题
		Properties properties;//可能会遇到,属性集合(属性名-属性值)
		LinkedHashMap<String, String> linkedHashMap;//按照存入的顺序存储数据(按照人为put进去的顺序)--有序集合
	}
	
}
