package test;

import java.awt.font.NumericShaper.Range;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.CancellationException;

import javax.swing.text.StyledEditorKit.ForegroundAction;
import org.junit.*;
import org.junit.experimental.ParallelComputer;
import org.junit.platform.commons.util.ToStringBuilder;
import org.omg.CORBA.PUBLIC_MEMBER;

public class Arrayslearn {
	
	int[] array1 = new int[] {1,2,3,4,5};
	int len = array1.length;
	
	public void copyArray(String[] args) {
		int[] array2 = new int[len];
		System.arraycopy(array1, 0, array2, 0, len);
		int[] array4 = Arrays.copyOf(array2, len);
		System.out.println(Arrays.equals(array4, array2));
	}

	public static void main(String[] args) {
//		System.out.println("hh");
//		数组 bb数组 = new 数组();
//		bb数组.copyArray(args);
		Arrayslearn bb=new Arrayslearn();
		bb.easyArray();
		
		
 	}
	/**
	 * 	基本数组定义方法
	 */
	void f1() {
		//数组
		//最为常见的一种数据结构
		//效率最高的的存储和访问元素的方式
		
		//数组是将一些数据按照线性顺序连续存储的序列
		//数组定义==个事规则：元素类型[] 数组名称;
		//
		int[] array11;
		int array12[];
		String[] array13;
		Arrayslearn[] array14;
		//数据类型：可以使基本数据类型，也可以使应用类型
		int i=1;
		String string = new String("");
		
		int[] array21 = new int[5];				//普通形式,元素未初始化,各元素为该类型默认值
		int[] array22 = new int[] {1,2,3,4,5};	//标准形式
		int[] array23 = {1,2,3,4,5};			//省略形式
	}
	
	/**
	 *	数组定义 
	 */
	void f2() {
		//数组的基本特点
		//1-元素类型遵循数组类型(基本数据类型+引用类型)
		//2-初始化赋值后元素长度固定不变
		
		 String[] a1;					//没有对象的变量
		 String[] a2 = new String[]{};	//有对象，无元素，长度为0
		 Integer[] a3= new Integer[] {};	//有对象，长度为0
		
		//数组是简单的线性的序列
		//每个元素拥有一个索引(下标)
		//通过下标索引检索访问该元素
		// 数组索引的计数取值范围<0~(length-1)>
	}
	
	public void easyArray() {
//		System.out.println(a1);			// null
//		System.out.println(a2);			// [Ljava.lang.String;@15db9742
//		System.out.println(a3);			// [Ljava.lang.Integer;@6d06d69c
		
		// random随机数
		// StrictMath.random();带有大于或等于0.0且小于1.0的正号的双精度值
		// Math.random();	   随机生成0~1的浮点数
		
		//随机一个整数
		Random random = new Random();
		//范围：[0，n)
		int ii = random.nextInt(10);
		System.out.println(ii);
		//[30,50)
		System.out.println(random.nextInt(50-30) + 30);			//nextInt(50-30)，输出的是0~20之间的随机整数，加上30就是最大为50最小为30的随机数。
		//[0,10)
		System.out.println(random.nextInt(10));	
		
		
//		=========================================================================
		System.out.println("已经生成数组:");
		int[] dd=new int[10];					//此处再new一个而不是直接等于的原因：新建不同的对象，避免指向相同引起错误。(新建后二者值相同，内存地址不同) 
		for(int i=0;i<10;i++) {
			double j=Math.random()*10;
			dd[i] = (int)Math.floor(j);
			System.out.printf("%d ",dd[i]);
		}
		//让新生成的数组和原数组值相同，但地址不同
		int[] ddnew = new int[10];			
		for(int i=0;i<10;i++) {
			ddnew[i]=dd[i];
		}
		System.out.println();
		//------------------------------------------
		System.out.println("倒置后：");
		for(int i=9;i>=0;i--) {
			System.out.printf("%d ",dd[i]);
		}
		System.out.println();
		//-------------------------------------------------
		System.out.println("sort二分快排(从小到大)：");
		Arrays.sort(dd);
		for(int k:dd) {
			System.out.printf("%d ",k);
		}
		System.out.println();
		System.out.printf("最大值为%d,最小值为%d",dd[9],dd[0]);
		System.out.println();
		//-----------------------------------------------------
		//冒泡排序
		System.out.println("冒泡排序(从大到小)：");
		for(int i=0;i<10;i++) {
			for(int j=1;j<10-i;j++) {
				if(dd[j-1]<=dd[j]) {
					dd[j]^=dd[j-1];
					dd[j-1]^=dd[j];
					dd[j]^=dd[j-1];
				}
			}
		}
		for(int k:dd) {
			System.out.printf("%d ",k);
		}
		System.out.println();
		//-----------------------------------------------------
		System.out.println("数值5存在情况(以排序前数组下标为准):");
		boolean flag = false;
		for(int i=0;i<10;i++) {
			if(ddnew[i]==5) {
				System.out.printf("存在数值5，下标为:%d\n",i);
				flag = true;
			}
		}
		if(!flag) System.out.println("不存在数值5！");
		//-------------------------------------------------------
		//是否找到问题，是否存在
	}
	
	public void bigArray() {
		//数组可以分为: 一维数组、二维数组、多维数组
		
		//二维数组：类似于Excel表格的结构，表格中的信息是以行和列的形式组织的
		//数组定义：有几个中括号就是几维数组
		//**二维数组也可以看成是数组的数组
		//即他是一个一维数组，其中每个元素又是一个一维数组
		int[][] array31;
		int     array32[][];
		int[]   array33[];
		
		// 1 2 3
		// 4 5 6
		int[][] array41 = new int[2][3];
		int[][] array42 = new int[][] {{1,2,3},{4,5,6}};
		int[][] array43 = {{1,2,3},{4,5,6}};
		
		int[][] array51 = new int[2][];
		int[] aa1		= array51[0];
		int[][] aa2		= new int[][] {};
		
		System.out.println(array51[0]);
		System.out.println();
		
		//遍历数组元素：使用普通for循环或增强for循环
		int[][] max = new int[3][2];
		int[][] arr = new int[3][3];
		for(int p[]:max) {
			for(int k:p) {
				System.out.println(k);
			}
		}
		int t = 1;
		for(int[] a:arr) {
			for(int b:a) {
				if(b==5) {
					t=2;
					break;
				}
			}
		}
		
	}

	
	/**
	 * 增强for循环，对数组使用
	 */
	@org.junit.jupiter.api.Test
	public void bigDasent() {
		int[] big = new int[] {1,2,3,4,5,6,6,7,8};
		//for(A;B;D){C}		普通for循环
		//for(A:B){C}		增强for循环
		//每次遍历数组中的一个元素，赋值给循环变量，并执行一此循环体
		//区别：若程序运行过程中，无需用到数组的下标，则使用一般的for循环
		//如果程序运行过程中，需要用到数组的下标，则使用第二种增强for循环
		for(int k:big) {
			System.out.println(k);
		}
			
	}
	
	@org.junit.jupiter.api.Test
	static void printNums() {
		int[] ssInt = new int[8];
		for (int i = 0; i < 8; i++) {
			ssInt[i] = i;
			System.out.printf("%d ",ssInt[i]);
		}
	}
	
	//整型数组筛选最大值:定义temp=arr[0]; 而非	temp=0;避免涉及优先级问题时候被自动转换类型。
	//使用单一职责原则，把代码块包含到方法中，而不是整体写入主函数，造成冗余
	//先搞清代码思路，再开始写代码
	//通过注释大纲或思维导图.	
	public static int finput() {
		Scanner ssScanner = new Scanner(System.in);
		return Integer.parseInt(ssScanner.nextLine());
	}

	

}


