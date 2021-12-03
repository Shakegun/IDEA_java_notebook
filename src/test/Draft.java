package test;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

import javax.management.modelmbean.ModelMBean;
import javax.xml.stream.events.StartDocument;

import org.junit.experimental.max.MaxCore;

public class Draft {
	public static void main(String[] args) {
		HashMap<String, String> sites = new HashMap<String, String>();
		sites.put("周一", "Monday");
		sites.put("周二", "Tuesday");
		sites.put("周三", "Wensday");
		sites.put("周四", "Thursday");
		sites.put("周五", "Friday");
		for (Entry<String, String> entry : sites.entrySet()) {
			System.out.printf("key是：%s，value是：%s\n", entry.getKey(), entry.getValue());
		}
	}

	public void start() {
		// 1-随机
		random(10, 5);

		// 1-随机
		ArrayList<TestA1Model> list = random(10, 5);
		print(list);
//		int max = max(list);
		int max = 0;
		printByMax(list, max);
	}

	public ArrayList<TestA1Model> random(int n, int k) {
		ArrayList<TestA1Model> list = new ArrayList<TestA1Model>();
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			int p = random.nextInt(k);
			if (!isExist(list, p)) {
				TestA1Model ta1 = new TestA1Model();
				ta1.setNumber(p);
			}
		}
		return list;
	}

	public boolean isExist(ArrayList<TestA1Model> list, int p) {
		for (TestA1Model model : list) {
			if (model.getNumber() == p) {
				model.setCount(model.getCount() + 1);
				return true;
			}
		}
		return false;
	}

	public void printByMax(ArrayList<TestA1Model> list, int max) {
		for (TestA1Model model : list) {
			int count = model.getCount();
			if (count == max) {
				System.out.println(model.getNumber() + " " + count);
			}
		}
	}

	public void sort(ArrayList<TestA1Model> list) {
		int len = list.size();
		for (int i = 0; i < len - 1; i++) {
			for (int j = 1; j < len - i; j++) {
				TestA1Model m1 = list.get(j - 1);
				TestA1Model m2 = list.get(j);
				if (m1.getCount() > m2.getCount()) {
					list.set(j, m2);
					list.set(j + 1, m1);
				}
			}
		}
	}

	public void print(ArrayList<TestA1Model> list) {
		for (TestA1Model model : list) {
			System.out.println(model.getNumber() + " " + model.getCount());
		}
	}

	public void sort1(HashMap<Integer, Integer> map) {
		Set<Entry<Integer, Integer>> entry = map.entrySet(); // 先指定一个Set容器类型的Entry作为map的节点(便于遍历)
		ArrayList<Entry<Integer, Integer>> list = new ArrayList<>(entry); // 使用ArrayList存储这些节点(便于排序)
		int len = list.size();
		for (int i = 0; i < len - 1; i++) { // 冒泡排序
			for (int j = 0; i < len - 1 - i; j++) {
				Entry<Integer, Integer> left = list.get(j);
				Entry<Integer, Integer> right = list.get(j + 1);
				if (left.getValue() > right.getValue()) {
					list.set(j, right);
					list.set(j + 1, left);
				}
			}
		}
		System.out.println(list);
	}

	public void sort2(HashMap<Integer, Integer> map) {
		// TreeMap<Integer,Integer> treeMap0 = new TreeMap<>();
		// key=次数value=数据
		TreeMap<Integer, HashSet<Integer>> treeMap = new TreeMap<>();
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			Integer key = entry.getKey();		// 数据
			Integer val = entry.getValue();		// 次数
			if (treeMap.containsKey(val)) {
				// HashSet<Integer> value = treeMap.get(val);
				// value.add( key );
				treeMap.get(val).add(key);
			} else {
				HashSet<Integer> value = new HashSet<>();
				value.add(key);
				treeMap.put(val, value);
			}
		}
		System.out.println(treeMap);
	}
}
