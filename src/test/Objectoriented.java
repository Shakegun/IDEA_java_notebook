package test;

public class Objectoriented {
	private int id;
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	//面向对象---三大特征特性
	/*
	 * (1)封装 = 数据+对数据的操作(想清楚类里面需要存储的数据有哪些,以及对这些数据的操作有哪些)
	 * 		private 访问修饰符，私有；所修饰的内容可以在当前作用范围内(类体内)使用
	 * 		好处:1. 实现了专业的分工。
	 * 		    2. 隐藏信息，实现细节。	举例：OOStudent.java
	 * (2)继承 = 继承就是子类继承父类的特征和行为，使得子类对象（实例)具有父类的实例域和方法，或子类从父类继承方法，使得子类具有父类相同的行为。
				理解继承：
	 * 			牛马羊属于食是草动物，狮虎狼属于食肉动物
	 * 			食草动物和食肉动物都属于动物
	 * is-a 代表继承关系
	 * 继承的关键字： extends
	 * --class Sheep extends GrassAnimals{}	class GrassAnimals{}	class GrassAnimals extends Animals{}
	 * 子类extends父类
	 * --派生类、下级类
	 * --基类、超类
	 * ----在使用其他文件中的类的时候需要引入包	
	 * 继承的本质：包含了并且可以使用所继承的类中可以访问的成员
	 * 默认规则：直接继承Object(即使不写extends，也默认继承Object),Object，被认为是所有类的基类
	 */
	//Java 不支持多继承
	//==============
		//继承的特点
	/*
	 * 1. 自雷可以使用父类的可访问的成员
	 * 2. 子类可以自定义成员
	 * 3. 子类可以重写父类的方法
	 * 4. 类与类之间只能是单继承或间接继承
	 * 5. 继承中类与类之间的包含关系
	 * */
	//==============	
	//@Override 说明本方法是一个重写的方法
		//可以不写也可以写，系统会自动声明出来
		//重载和重写的区别
		/* 重载的文件是在一个文件中
		 * 
		 * 
	     *String new str=
		 *重写是在子类中存在父类中的定义结构相同的方法(两个文件中存在继承关系的收的搓足)
		 * (3)多态
		 * 
		 * (抽象)
		 * */
	@Override
	public boolean equals(Object obj) {
	Objectoriented tc = (Objectoriented) obj;// 向下转型
	return this.id == tc.id; //this
	}
	public static void main( String[] args) {
		Objectoriented tc1 = new Objectoriented();
		tc1.setId(100) ;
		System.out.println(tc1);//
		System.out.println(tc1.toString( ));
		Objectoriented tc2 = new Objectoriented();
		tc2.setId(108);
		System.out.println(tc1.equals(tc2));
		int hash = tc1.hashCode();//内存地址hashset hashmap
		// tc1.clone();//深拷贝浅拷贝
		
		try {
			tc1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	//深拷贝浅拷贝
		tc1.getClass(); //反射
		 
		tc1.notify();//多线程
		tc1.notifyAll();
		try {
			tc1.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			tc1.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//不推荐
		//GC 垃圾回收自动回收机制
		
		}
		
	public void test() {
		//复习的内容：
		//equals到底比较的是什么？
		//比较地址，如果重写，按照重写的来;所有的引用类型可以使用
		//==基本变量类型比较的是地址
		//引用变量类型比较的是地址
	}
	
	
}


