package test;

import org.junit.Test;

public class Method {
//	@Test
//	void functionB() {
//	int[] array = new int[] { 1，2，3，4 };System.out.println( "----传递前:");
//	print( array );																//调用的自己写的函数
//	int t = 2;
//	functionA( array, t);//参数传递
//	System.out.println(t + "----传递后:");print( array ) ;
//	}
	
	
 
	//改数：在方法中对形参进行重新赋值，实参不变
	//在System.out.println();中对数值型变量进行加号运算，是加法运算；对字符串进行加号运算，是字符串拼接。
	//对形参进行赋值，实参是引用类型，实参不会改变数值
	
	public static void main(String[] args) {
		char[] arr = {'d','e','f'};
		change(arr);
		System.out.println(new String(arr));//变成字符串了
		
		String aaString = "aaaaaaa";
		String b = aaString;
		System.out.println(b);
	}
	public static void change(char[] arr) {		//数组是个对象，传过来的是指针地址；因为string的操作会生成新的对象，形参里的指针是拷贝传过去实参的指针。拷贝的指针指向新的string，和老的指针没关系。
												//简言之：想要改数，如果是对象就不能改；如果是其他类型，在函数中改变了形参的值，也不会影响到实参；
		
		//在主方法中定义了，传给方法的一瞬间，二者指向同一个对象
		//但当方法中的参数再次赋值的时候，就有了一个新的对象，二者就失去了关系
		//发生重新赋值，就会指向新的对象
		//
		arr[1]='z';
	}
	
	
	


}
