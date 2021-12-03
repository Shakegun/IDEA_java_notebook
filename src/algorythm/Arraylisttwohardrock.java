package algorythm;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Arraylisttwohardrock {
	//这两个题目源自：集合Set
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
