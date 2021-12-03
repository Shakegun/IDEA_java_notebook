package test;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

/**
 * @author 流程控制
 */
public class Processcontrol {
	
	Scanner ssScanner=new Scanner(System.in);

	public int fintInput() {//使用nextLine();方法输入整数
		return Integer.parseInt(ssScanner.nextLine());
	}
	
	public void bigsmall() {
		int[] array=new int[3];
		for(int i=0;i<3;i++) {
			array[i]=fintInput();
		}
		Arrays.sort(array);
		System.out.println(array[array.length-1]);

	}
	
	//if(boolean)
	static int f1() {
		int t=2;
		if(t==2) {
			System.out.println("aaa1");
			System.out.println("aaa2");
			return 10;//返回结果+结束执行
		}
		return 10;
	}
	static void f2() {
		//if else格式：if(boolean){}else{}
		System.out.println("hh");
	}
	static void f3() {
		//if(){}else if{}else if{}else{}
	}
	static int isOdd(int a) {
		return (a&1);
	}
	public static void main(String[] args) {
		//顺序执行：顺序+分支+循环
		System.out.println(111);
		System.out.println(222);
		System.out.println(333);
		
		Scanner ssScanner = new Scanner(System.in);
		int b = ssScanner.nextInt();
		String vString = ssScanner.nextLine();
//		int res = Integer.parseInt(vString);
//		int result = Integer.valueOf(vString);
		
		if(isOdd(b)==1) {
			System.out.println("ODD");
		}else {
			System.out.println("EVEN");
		}
		
		
		//两种输入方式的不同点
		//nextInt();不会读取输入的回车，如果后面有一个nextLine();则回车会被他拦截到，若是一个有效输入，则会变成无效输入。
		//nextLine();会读取输入的回车
		//因此，建议使用nextLine();作为输入方式，但如果需要使用nextInt();如此即可：nextInt();nextLine();
		
	}
	//jUnit注解, 可以单独执行此函数，与注释不同，有功能作用；可以放到：公有、非静态、无参方法前面;右键该方法，jUnit执行；否则会执行所有@Test

	public void f5() {
		int t = 1;
		switch (t) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		default:
			break;
		}
	}
	
	@Test
	public void f6() {
		//循环
		//for(a;b循环条件;d){c循环体}
		//循环 从什么时候后开始到什么时候结束
		//作用范围:循环体
		//循环中的变量作用范围仅仅是循环中，在循环之外不可用.
		int sum=0;
		for(int i=0;i<=100;i+=2) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
	public void f7() {							//循环是否可以提前结束
		for (int i = 0; i < 9; i++) {
			if (i==2) {
				continue;
			}
			if(i==3) {
//				break;//终止所在的这一个循环
				return;//返回结果，结束方法
			}
			System.out.println(i);
		}
		
		for (int i = 1; i < 5; i++) {			//break 和 return的区别体现，程序输出15行。
			for (int j = 1; j < 5; j++) {
				System.out.println(i+" "+j);
				if(j==3) break; 
			}
		}
		
	}
	@Test
	public void f8() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
	
//	public void f9() {
//		for
//	}
}
















