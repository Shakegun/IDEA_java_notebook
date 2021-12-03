package test;

/**
 * @category 功能修饰符：抽象类
 *
 */
public abstract class 抽象类 {
	//抽象类
	//所有的对象都是通过类进行描述(new)
	//反过来讲，并不是所有的类都是用来描述对象的
	
	//如果一个类中没有包含足够的信息来描述一个具体的对象
	//这样的类就是抽象类
	
	//普通类
	//抽象类 abstract--功能修饰符、抽象的
	//主要修饰：类+成员方法	
	//抽象类不能直接new调用构造方法进行实例化
	//抽象类最大的用途就是为了继承的
}

abstract class TestD1{
	
}
class TestD2 extends TestD1{
	
	
}
abstract class TestD5{//抽象类
	//抽象方法
	//在抽象类中定义出没有方法体的方法(没有被实现的方法)
	//在抽象类中可以没有抽象方法
	//抽象类中不一定有抽象方法+有抽象方法的类一定是抽象类
	//抽象类的构造方法可以在子类实例化的时候间接被执行调用
	
	//abstract语法规则
	//1.修饰位置=类/方法
	//2.使用规则=继承/重写
	//继承/抽象
	//抽象类的构造方法
	//普通子类中必须对抽象父类中的抽象方法进行重写实现，或将子类变成抽象类
	abstract void test();
	public TestD5() {
		// TODO Auto-generated constructor stub
		//构造方法就可以存在
		System.out.println("hh");
	}
	
	
}
abstract class TestD6{//抽象类
	
}











