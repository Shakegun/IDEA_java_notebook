package designpattern;

import org.omg.CORBA.PRIVATE_MEMBER;

public class 单例模式 {

	//单例模式
	//https://www.runoob.com/design-pattern/singleton-pattern.html
	/**
	 * 应用：
	 * 		设计模式-单例模式-保证类在内存中只有同一个对象
	 * 优点：
	 * 		1. 单例类只有一个实例，节省内存资源，对于一些需要频繁创建对象，使用单例可以提高系统性能
	 * 		2. 可以在系统设置全局的数据，优化和共享数据
	 * 缺点：
	 * 		1. 一般没有开放其他的API，扩展除了修改代码，基本没有其他部分
	 * */
	public static void main(String[] args) {
//		F f0 = new F();
//		F f1 = new F();
		
		
	}
}
class F{
//	public static F F0 = new F();
	private F() {
	}
	//比较：时间与空间
	//空间可由硬件进行优化，但是时间优化很难

	//1. 饿汉式(静态变量)--直接创建出对象
	//类被使用的时候加载并且初始化f1对象
	//所以可能导致没有用过，造成没必要的空间浪费
	private static F f1 = new F();
	public static F getInstance1(){
		return f1;
	}
	//2. 懒汉式--在需要的时候创建类的对象
	//只有调用方法时才会创建对象， 但只适合在单线程的情况下使用
	//多线程不推荐
	public static F f2 = null;
	public static F getInstance2() {
		if(f2 == null) {
			f2 = new F();
		}
		return f2;
	}
	//3. 第三种：临时的用法
	public final static F f3 = new F();
	
//	private static volatite F f4 = null;	无需理解
	//4. 第四种用法：
	private static F f4 = null;
	public static F getInstance4() {
		if(f4==null) {
			synchronized (F.class) {
				if(f4==null)
					f4 = new F();
			}
		}
		return f4;
	}
}








