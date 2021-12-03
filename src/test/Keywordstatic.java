package test;

import javax.jws.soap.SOAPBinding;

/**
 * @category static关键字
 *
 */
public class Keywordstatic {
	public static void main(String[] args) {
		Keywordstatic.f1();
		a=101;
		//有static修饰符的方法、变量，直接调用
		//无static修饰符的方法、变量，先实例化， 使用对象调用
		
		//同个类的不同实例变量互不影响
		Keywordstatic t1 = new Keywordstatic();
		Keywordstatic t2 = new Keywordstatic();
		System.out.println(t1.b);
		System.out.println(t2.b);
		t1.b=100;
		t2.b=300;
		System.out.println(t1.b);
		System.out.println(t2.b);
		//同个类的不同对象中的静态变量公用的使用一个
		System.out.println(t1.a);
		System.out.println(t2.a);
		System.out.println(Keywordstatic.a);
		t2.a=304;
		System.out.println(t1.a);
		System.out.println(t2.a);
		System.out.println(Keywordstatic.a);
	}
	
	// static修饰符
	static int a = 100;
	int b=200;
	static void f1() {}
	void f2() {}
	
	static class E{
		private static void testMethod() {
			System.out.println("testMethod");
		}
		public static void main(String[] args) {
			((E) null).testMethod();
			E e1 = (E) null;		//e1是E的类型的变量，没有对象
			e1.testMethod();//e1没有对象，抛异常NullPointExpetion
							//静态的东西不需要对象就可以调用
							//因此此处的e1对象为null，可以调用静态的testMethod()
		}
	}
	
}
