package test;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

import org.junit.jupiter.api.Test;

public class Lists {
	//集合定义(引用类型变量)
	ArrayList<String> arrayList;			//集合类型的变量对象[基于动态数组实现的非线程安全的集合]		数组列表
	//<泛型>: 集合中存储的元素类型,泛指某种引用类型
	//==========================================================
	LinkedList<String> llist;				//[基于链表实现的非线程安全的集合]						链表列表
	//==========================================================
	Iterator<String> ite;						//											迭代器
	//==========================================================
	Vector<String> v1;							//											线程安全的list
	
	//用处：增删改查长度更改
	//ArrayList 和   LinkedList,  《主要区别》
	/* 1.
	 * 	ArrayList是实现了基于动态数组的数据结构
	 * 	LinkedList是实现了基于双向链表的数据结构
	 * 2.
	 * 	对于随机访问(借助索引号的方式进行快速访问get/set)操作，ArrayList更佳。
	 * 	原因：LinkedList本身是链表的结构，是需要通过从头节点依次移动指针方式来访问查找
	 * 3.
	 * 	对于增加/删除(add/remove)操作，更佳
	 * 	原因：ArrayList是一个数组结构，需要把插入的后面的所有数据进行移动
	*/
	
	//注意：
	/*
	 * 1. 索引方式正序遍历时删除元素，必须注意索引号，避免遍历遗漏元素或索引越界
	 * 2. 索引方式逆序删除元素时，正确运行；
	 * 4. 迭代器遍历时删除元素，正确运行;
	 * PS： 切记不要使用集合对象的删除方法remove
	 * 4. for-Each 遍历删除元素
	 * 4-1. 一次删除后，执行break/return，正确运行
	 * 4-2. 删除元素是倒数第二个，则不出现异常，但是最后一个元素未被遍历到
	 * 4-3. 除了上述两个情况外，删除时会出现异常
	 * */
	
	@Test
	public void ss() {
		System.out.println("hh");
		ArrayList<String> list= new ArrayList<String>();	//标准定义
		ArrayList<String> list2= new ArrayList<>();			//省略式
		
		int[] a1;
		//数组：元素类型(int/Integer) + 长度(元素个数)固定 + [index]/length
		//泛型：元素类型(Integer) + 长度(元素个数)不确定 + 方法调用
		ArrayList<Integer> a2;
		
		list.add("sldkfjlskdjf");
		list.add("bb");
		list.add(2,"hello");		//数字不能太大了
		list.add("baaaaaa");
		list.add("(*&(*%$b");
		list.remove(3);
		System.out.println("list中是否包含\"bb\"");
		System.out.println(list.contains("bb"));
		System.out.println("输出集合list");
		System.out.println(list);
		System.out.println("=========================================");
		//数组集合
//		ArrayList<String[]> list = new ArrayList<String[]>();
//		String[] arr = new String[] {"baixu","123456","100"};
//		list.add(arr);
//		System.out.println(list.add(arr));
		System.out.println("输出集合元素数量");
		System.out.println(list.size());
		ArrayList<String> list3 = list;
		System.out.println("看看赋值是否相等");
		System.out.println(list3);
		list.addAll(list3);
		System.out.println("看看addall");
		System.out.println(list);
		System.out.println("==========================================");
		//遍历集合
		System.out.println("普通for循环输出list");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("================================");
		//for-Each可以吗？左边：集合中每个元素的类型定义的变量;右边:集合。
		System.out.println("for-Each输出list");
		for(String s:list) {
			System.out.println(s);
		}
		System.out.println("================================");
		//判空!!!!只要对象是有对象的就可以调用，如果没有对象，就会空指针异常
		System.out.println("看看集合是不是空的");
		ArrayList<String> listEmpty=new ArrayList<String>();
		System.out.println(list.isEmpty());
		System.out.println(listEmpty.isEmpty());
		System.out.println("================================");
		System.out.println("试试定义的时候判空");
		ArrayList<String> aa1 = null;
//		System.out.println(aa1.size());  //空指针异常
		ArrayList<String> aa2 = new ArrayList<String>();
		System.out.println(aa2.size());
		System.out.println("===============================");
		if(aa2 == null || aa2.isEmpty()) {
			
		}
		if(!(aa2 == null) && !aa2.isEmpty()) {
			
		}
	}
		
	@Test
	public void lss() {
		LinkedList<String> llist = new LinkedList<String>();
		llist.add("aaa");
		llist.add("bbb");
		llist.add("ccc");
		System.out.println("试试和ArrayList一样的方法");
		System.out.println(llist.isEmpty());
		System.out.println("试试和ArrayList不一样的方法");
		llist.peek();
		System.out.println(llist);
		llist.poll();
		System.out.println(llist);
		System.out.println("=============================");
		System.out.println("栈操作");
		System.out.println(llist.pop());
		llist.push("hhhh");
	}
	
	@Test
	public void arryListErgodic() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		list.add("ee");
		//========================================================
		//对元素进行遍历删除操作
		//最优解：使用迭代器
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) {
			String s=ite.next();
			System.out.println(s);
			if("bb".equals(s)) {
				ite.remove();
			}
		}
		//正确形式：
		//由于是动态数组，删除后发生补位，i会发生变化,不妥(解决方案：)
		/*
		 * 解决方案：
		 * 1. 在删除操作后面，增加一次i--		//好
		 * 2. 使用逆向i--遍历的方式			//更好
		 * 3. 使用迭代器					//最佳
		 * */
		for(int i=0;i<=list.size();i++) {		//for(int i=list.size()-1;i>=0;i--){}
			String p = list.get(i);
			if("bb".equals(p)) {
				list.remove(p);
				i--;
			}
		}
		//错误示例：
		//for-Each遍历时很有可能会出错，因此不建议使用for-Each遍历改变集合的个数
		for(String p:list) {			
			System.out.println(p);
			if("cc".equals(p)) {
				list.remove(p);
				break;					//不加break就会报错
			}
		}
	}
	
	public void vectorList() {
		//线程安全的list
		Vector<String> v1=new Vector<String>();
		//List<Object> list = Collections.synchronizedList(null);					//工具类
	}
	
}
