package algorythm;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.processor.MultiBeanListProcessor;

public class Recursion {
	//关键标志：在自身方法中调用自身+结束条件(无结束条件则判为死循环)
	//连续调用，最后连续释放
	public void digui() {
		//输出
		//return;
		//式子
		
		//与for循环结合起来记忆，有几层循环嵌套，就有几组递归
	}
	Scanner ssScanner =new Scanner(System.in);
	public int fintInput() {//使用nextLine();方法输入整数
		return Integer.parseInt(ssScanner.nextLine());
	}
	
	public void test() {
		y0(4);
	}
	public void y0(int n){
		if(n==0)
			return;
		y0(n-1);
		System.out.println("---"+n);
		y0(n-1);// y0(4-1) y0(3-1) y0(2-1) y0(1-1),正向调用，反向释放，两个syso各执行4次
		System.out.println("+++"+n);
	}
	
	@Test
	public void test1() {
		int n=fintInput();
		output(1,n);					//打印1~n自然数遍历(self)
		System.out.println();
		System.out.println("================");
		output2(n);						//打印1~n自然数遍历(DX)
		test991(1);						//双递归模拟for循环乘法表
		m(9);							//单递归乘法表
	}
	public void test991(int n) {		//双递归模拟双嵌套
		//输出每行多少个
		m9(n,n);
		//输出多少行
		System.out.println();
		if(n==9) 
			return;
		test991(n+1);
	}
	public void m9(int k,int n) {
		if(k==0) return;
		m9(k-1, n);
		System.out.print(k+"*"+n+"="+(k*n)+" ");
	}
	
	public static void m(int i) {		//单递归
	    if (i == 1) {
	      System.out.println("1*1=1 ");
	    } else {
	      m(i - 1);
	      for (int j = 1; j <= i; j++) {
	        System.out.print(j + "*" + i + "=" + j * i + " ");
	      }
	      System.out.println();
	    }
	  }
	
	
	
	
	
	
	
	public void output(int n,int i) {	//正向输出1~n
		if(n==i+1) return;
		System.out.printf("%d ",n);
		output(n+1,i);
//		System.out.printf("%d ",n);
		
		System.out.println(n);
		System.out.println(mt(10));
	}
	public int output2(int n) {			//正序打印所给数值从1开始的遍历
		if(n>0) {
			System.out.println(output2(n-1)+1);
		}
		return n;
	}	
	
	public long mt(int n) {				//阶乘
		return n<2?1:n*mt(n-1);
	}
	
}




