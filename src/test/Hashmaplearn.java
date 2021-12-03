package test;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmaplearn {
	void hash() {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("1", "aa");
		hashMap.put("4", "dd");
		hashMap.put("3", "cc");
		hashMap.put("2", "bb");
		hashMap.put("2", "bb");
		System.out.println("看看HashMap的自动排序：");
		System.out.println(hashMap);
		System.out.println("======================================================");
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("1", "aa");
		treeMap.put("3", "cc");
		treeMap.put("2", "bb");
		treeMap.put("4", "44");
		treeMap.put("1", "aa");
		System.out.println("看看TreeMap的自动排序：");
		System.out.println(treeMap);
		System.out.println("=====================================================");
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("aa");
		arrayList.add("cc");
		arrayList.add("bb");
		arrayList.add("ee");
		arrayList.add("dd");
		Iterator<String> it = arrayList.iterator();
		System.out.println("看看Iterator的遍历ArrayList：");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("=====================================================");
		System.out.println("试试entry迭代：");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("key1", 1);
		map.put("key2", 2);
		map.put("key6", 6);
		map.put("key3", 3);
		//迭代器只针对集合类型的数据，因此map类型的必须先转换成集合类型才能使用迭代器去获取元素。
		Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator();
		Entry<String, Integer> entry;
		while (iterator.hasNext()) {				//只有Iterator有hasnext，其他迭代器需要使用for-Each遍历
			entry = iterator.next();
			System.out.println("key值是："+entry.getKey());
			System.out.println("value是："+entry.getValue());
		}
		System.out.println("=======================================================");
		System.out.println("试试给HashMap的Value排序：");
		//参考：https://blog.csdn.net/weixin_43495429/article/details/86630017
		//原理参考：由于HashMap不属于list子类，所以无法使用Collections.sort方法来进行排序，所以我们将hashmap中的entryset取出放入一个ArrayList中，
		//		来对ArrayList中的entryset进行排序（根据entryset中value的值），达到我们对hashmap的值进行排序的效果。
	}
	
	void entryset() {
		HashMap<Integer, Integer> llHashMap = new HashMap<Integer, Integer>();
		Set<Entry<Integer,Integer>> llSets = llHashMap.entrySet();
		llHashMap.put(1, 135);
		llHashMap.put(2, 985);
		llHashMap.put(3, 545);
		llHashMap.put(4, 675);
	}
}
