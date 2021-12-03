package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

public class Sets {
	//set
	/*	HashSet和HashMap原理一样，相当于HashMap的简化版，HashMap中的key不能重复，HashSet中的值也不能重复
	 * 观察set源代码，它的add方法底层是用map.put实现的，在map中键值不能重复，所以在set中也不能重复
	 * */
	HashSet<String> hashSet;
	TreeSet<String> treeSet;
	
	public void hashset() {				//增删改查长度更改
		HashSet<String> s1 = new HashSet<String>();
		s1.add("bbb");
		s1.add("aaa");
		s1.add("aaa");
		s1.remove("bbb");
		s1.add("ccc");
		System.out.println(s1);
		//不存在是索引的概念
		
		// ArrayList 和   HashSet 区别
		//ArrayList-有索引+无序(默认添加顺序与迭代便利的顺序相同)+元素可以重复
		//HashSet---无索引+无序(默认添加顺序与迭代遍历顺序不同)默认添加的顺序和存储的顺序未必一样+元素不可重复
		
		//用for-Each进行遍历，或者使用迭代器
		System.out.println(s1.size());
		for(String s:s1) {
			System.out.println(s);
		}
	}
	
	@Test
	public void treeset() {	//认为是一个有序的集合
		//有序集合(自然顺序/自定义的顺序)
		TreeSet<String> t = new TreeSet<String>();
		t.add("c");//c
		t.add("d");//c d
		t.add("a");//a c d
		t.add("f");//a c d f
		t.add("b");//a b c d f
		t.add("e");//a b c d e f
		//每次添加进行比对，如果比它小就放到左子节点，如果比他大，就放到右子节点
		System.out.println(t);
		//元素比对
		System.out.println("a".compareTo("b"));//正数			//结果竟然不是boolean类型， 而是一个int！！！相等为零，大正小负
		System.out.println("a".compareTo("a"));//0
		System.out.println("b".compareTo("a"));//负数
	}
	Scanner ssScanner =new Scanner(System.in);
	public int fintInput() {//使用nextLine();方法输入整数
		return Integer.parseInt(ssScanner.nextLine());
	}
	
	@Test
	public void train() {
		//控制台输入姓名存入集合中
		//查询王姓存入新集合并输出
		Scanner ss=new Scanner(System.in);
		
		ArrayList<String> allname=new ArrayList<String>();
		ArrayList<String> wangname=new ArrayList<String>();
		String line="";
		System.out.println("开始输入名字叭：(以0结尾)");
		while(!(line=ss.nextLine()).equals("0")) {
			allname.add(line);
		}
		System.out.println("看来你已经输入完成了，让我们看看有哪些名字：");
		System.out.println(allname);
		System.out.println("王姓列表：");	
		for(String name:allname) {
			name.substring(0,1).equals("王");	//方法1
			if(name.charAt(0)=='王') {			//方法2
				wangname.add(name);
			}
		}
		System.out.println(wangname);
		//===============================================================
		//随机输入N个整数存入集合
		//在该集合中，进行排序，后遍历输出集合元素
		ArrayList<Integer> nums= new ArrayList<Integer>();
		Random random = new Random();
		System.out.println("请输入要几个数字进行排序：");
		int n = fintInput();
		for(int i=1;i<=n;i++) {
			nums.add(random.nextInt(100));
		}
		System.out.println("所得ArrayList为：");
		System.out.println(nums);
		System.out.println("=============================");
		System.out.println("排序所得数组：");
		for(int i=0;i<n;i++) {
			for(int j=1;j<n-i;j++) {
				if(nums.get(j-1)>=nums.get(j)) {
					Integer temp = new Integer(nums.get(j-1));
					nums.set(j-1, nums.get(j));
					nums.set(j, temp);
				}
			}
		}
		System.out.println(nums);
	}
}
