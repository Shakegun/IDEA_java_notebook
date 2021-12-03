package test;
//preferences-->Editor-->Spelling
//preferences-->workspaces
//编码方式UTF-8，一致
public class Membermethod{
	//成员实例方法(非静态)
	void f1(){}
	static void f2() {}
	static int k1;
	
	//main方法
	//成员静态方法
	//静态方法中可以直接使用静态方法，不可以直接使用实例成员
	//成员静态方法
	public static void main(String[] args){
		//f1(); //非静态，出错
		f2();
		System.out.println(k1);
		
		// 简单 使用格式 == 使用当前文件的成员(直接)
		// 标准 使用格式 == 可以使用其他文件中的成员
		Membermethod.f2();
		System.out.println(Membermethod.k1);
		
		//static main中使用非static方法的方法：
		//类的实例化，从而得到类的对象
		//在内存中开辟出一块空间
		// new 构造方法();
		//实例的使用类调用，静态的使用实例的对象调用
		Membermethod xyzC = new Membermethod();
		xyzC.f1();		
		
		//成员变量(C++中的全局变量)在类中定义
		//局部变量
		//静态变量
		//实例变量(非静态)
		
		//
		
	}
	//构造方法 = 方法名称与类名相同 + 没有返回类型
	//调用构造方法的方法：DemoC bb = new DemoC();
	//此时，构造方法中的功能将会被执行
	//因此，当一个类中有了任何一个构造方法，无参的调用就会失效
}