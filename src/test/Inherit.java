package test;
/**
 * @category 继承
 * 实例化子类的时候，父类也会被实例化
 *
 */
public class Inherit {
	//子类可以使用父类的变量、方法
	//子类在调用方法时候如果定义对象，当父类中有构造方法时，会先执行构造方法中的功能.
	public static void main(String[] args) {
		new B();		//结果输出"AA","BB"
		//子类实例化时，必须先实例化父类，再实例化子类
		//换句话说，子类在new的时候，先new父类，再new子类
		new D().print();
	}
	
}

//结果输出"AA","BB"
class A{
	A(){
		System.out.println("AA");
	}
}
class B extends A{
	B(){
		System.out.println("BB");
	}
}

//输出：---1,+++2,===3
//需要明白的点：1. 变量是在哪被定义的，定义之后执行输出语句之后，变量的值会被改变
//2. 子类实例化的时候，父类先被实例化，所以以下代码按照"顺序"执行了
class C{
	int a=1;
	C(){
		System.out.println("--"+a);
		a=2;
	}
}
class D extends C{
	D(){
		System.out.println("+++"+a);
		a=3;
	}
	void print() {
		System.out.println("==="+a);
	}
}