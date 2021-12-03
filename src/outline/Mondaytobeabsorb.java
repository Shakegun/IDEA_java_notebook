package outline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.activation.MailcapCommandMap;

import java.util.Set;

public class Mondaytobeabsorb {
	//1. 周测试题
	
	//2. HashMap小题
	/* 随机生成n个整数(范围:[0,k))
	   1. 输出出现次数最多的整数和相应的次数
	   2. 按次序排序，输出数据和对应的次数
	 * */
	
	public void sort1(HashMap<Integer, Integer> map) {
		Set<Entry<Integer, Integer>> entry = map.entrySet();
		ArrayList<Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>();
		// list.addAll(entry);
		int len = list.size();
		for (int i = 0; i < len-1; i++) {
			for (int j = 1; j < len-i; j++) {
				Entry<Integer, Integer> left = list.get(j-1);
				Entry<Integer, Integer> right = list.get(j);
				if(left.getValue() > right.getValue()) {
					list.set(j, right);
					list.set(j+1, left);
				}
			}
		}
		System.out.println(list);
	}
}
