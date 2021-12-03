package algorythm;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Sortlookups {
	static void outputArray(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.printf("%d ",a[i]);
		}
	}
//	static void swapTwoint(int a,int b) {			//无法交换,方法无法交换基本变量的值
//		a^=b;
//		b^=a;
//		a^=b;
//	}
	//排序+查找
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8};
		maopao(a);
		outputArray(a);
	}
	//1-冒泡
	/*
	 * 1. 比较相邻的两个元素。若第一个元素>第二个元素，交换位置；
	 * 2. 依次对每一对相邻元素做同样的工作，一轮次后末尾元素为最大值。
	 * 3. 除去该轮次得到的末尾元素外，再次对剩余所有元素重复1~3步骤，直到无剩余元素。
	 * */
	static void maopao(int[] arr) {					//空间逻辑版
		int len = arr.length;						
		for(int i=0;i<len;i++) {	
			for(int j=1;j<len-i;j++) {
				if(arr[j-1]<arr[j]) {
					arr[j-1]^=arr[j];
					arr[j]^=arr[j-1];
					arr[j-1]^=arr[j];
				}
			}
		}
	}
	
	static void maopaoDX(int[] arr) {							//冒泡排序：数学逻辑for循环
		int len = arr.length;									//嵌套for循环原理:使用直线函数表示变化关系
		//x=12345(len-1)			   //从1到5在移动				//最外层控制行数(x)，内存控制列(y)
		//y=(len-1)54321 => y=-x+len   //每轮次范围在从5到1减小		//定义 y=kx+b,根据行列两个变量数值变化关系得到斜率k,可得直线方程
		for(int x=1;x<=len-1;x++) {					
			for(int y=1;y<=-x+len;y++) {
				if(arr[y-1]<arr[y]) {
					arr[y-1]^=arr[y];
					arr[y]^=arr[y-1];
					arr[y-1]^=arr[y];
				}
			}
		}
	}
	//2-选择
	//3-插入
	//4-希尔
	//5-归并
	//6-堆
	//7-计数
	//8-桶
	//9-基数
	//10-!!!快排
	
	//1-顺序查找
	//2-二分查找(折半查找)
	//3-插值查找
	//4-斐波那契数列
	//5-树表查找
	//6-分块查找
	//7-哈希查找
}
