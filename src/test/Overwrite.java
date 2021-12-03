package test;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

//重写+向上转型+instanceof
//参考博文：http://c.biancheng.net/view/6503.html
/**
	方法的重写规则:
	参数列表必须完全与被重写方法的相同;返回类型必须完全与被重写方法的返回类型相同;
	·访问权限不能比父类中被重写的方法的访问权限更低。例如:如果父类的一个方法被声明为public,那么在子类中重写该方法就不能声明为protected。
	·父类的成员方法只能被它的子类重写。
	声明为final的方法不能被重写。
	声明为static的方法不能被重写，但是能够被再次声明。
	子类和父类在同一个包中，那么子类可以重写父类所有方法，除了声明为private和final的方法。
	子类和父类不在同一个包中，那么子类只能够重写父类的声明为public和protected的非final方法。
	。重写的方法能够抛出任何非强制异常，无论被重写的方法是否抛出异常。但是，重写的方法不能抛出新的强制性异常，或者比被重写方法声明的更广泛的强制性异常，反之则可以。
	。构造方法不能被重写。
	如果不能继承一个方法，则不能重写这个方法。
 *
 */
public class Overwrite {
	//重写Override
	//子类对父类的允许访问的方法的实现过程进行重新定义
	//返回类型和参数都不能改变改鬓
	//外壳不变，核心重写
	//好处在于子类可以根据需要，定义特定自己的行为动作
	//也就是说子类能够根据需要实现父类的方法
	
	//重写规则:
	/*
	 * 两同两小一大
	 * 1. 方法名称+参数
	 * 2. 子类方法返回值类型比父类方法返回类型更小
	 * 3. 子类方法定义抛出的异常类应比父类方法定义抛出的异常类更小或相同
	 * 4. 访问权限--更大或者相等
	 * */
//==============================================================================================================================
	public static void main(String[] args) {
		Animal aa = new Dog();
		aa.move();							//发生自动向上转型，结果输出了子类中重写后的方法						// 3号区域
		aa.a();		//Tips：此种情况，非重写方法，只能使用父类的(要看所定义的对象的变量是谁)	
	}	
	//自动向上转型
	//父类引用指向子类对象为向上转型
	// fatherClass obj = new sonClass();
	/*
	 * 解释：
	 * 1. 向上转型就是把子类对象直接复制给父类引用，无需强制转换
	 * 2. 可以调用父类类型中的所有成员，不能调用子类中的特定成员
	 * */
	//强制向下转型
	//子类对象指向父类引用为向下转型
	// sonClass obj = (sonClass) fatherClass;
	/*
	 * 解释:
	 * 1. 可以调用子类类型中的所有成员
	 * 2. 如果是父类引用对象指向的是子类对象，转型过程安全，编译不出错
	 * 3. 如果是父类引用对象是父类本身，转型不安全，编译NullPointerException
	 * 4. 解决方案： 使用instanceof,如果满足错误条件，即返回false
	 * */
//==============================================================================================================================	
	@Override
	public String toString() {
		return "abcsdf";
	}
	
	@Test
	public void test4() {
		Animal a = new Animal();
		Dog b = new Dog();
		Animal c = new Dog();
		Object d = new Dog();
		System.out.println(b instanceof Dog);	//true	//instance：实例，作用是看看左边是不是右边的一个实例
		System.out.println(b instanceof Animal);//true
		System.out.println(d instanceof Dog);	//true
		System.out.println(a instanceof Dog);	//false
		//instanceof左侧变量的对象，能否给右侧类型的变量赋值
		//多尝试使用Instanceof调试，看看
	}
	@Test
	public void test6() {
		Animal c = new Dog();
		
		int t0 = 100;
		int t1 = t0;
		int t2 = (int) t1;
		
		Dog e = (Dog) c;//(强制)向下转型
//		e.p
//		e.b()
		e.move();		//变量是什么类型，就能调用哪的方法
		
		//强制向下转型的时候要看，提前定义的对象是什么类型的
		//如果是Animal a = new Animal();
		//则后面代码不成立: Dog f = (Dog)a;
		//fatherClass obj = new fatherClass();				//另一种写法
		//sonClass obj2 = (sonClass)obj;			//不成立
//******//试试看f调用的是Animal的还是Dog的方法
		
		//如果是使用Aniaml定义的对象，但是对象是使用Dog定义的对象，则成立
		//Animal a = new Dog();
		//Dog f = (Dog) a;
		//fatherClass obj = new sonClass();					//另一种写法
		//sonClass obj2= (sonClass) obj;			//成立
		//如果无法确定强制转换类型是否成功，可以使用instanceof判断，结果为true则说明可以实现
//******//试试看f调用的是Animal的还是Dog的方法
		//https://zhuanlan.zhihu.com/p/34026164
		//http://c.biancheng.net/view/6503.html
	}
	@Test
	public void seeUpDownChange1() {	//错误示例，会报错
		Animal a = new Animal();
		Dog f = (Dog) a;
		f.a();
		f.b();
	}
	@Test
	public void seeUpDownChange2() {	//正确示例，正确运行
		Animal a = new Dog();			//定义了Animal型变量,赋了个Dog型
		Dog f = (Dog) a;				//向下转型,把Animal转换成了Dog
		f.a();							//Animal this animal aaa.
		f.b();							//Dog extends Animal bbb.
		f.move();	//向下转型，
	}
	//非官方理解：
	//通俗理解，父类权限大于子类权限，直接定义完全父类的对象不可转成子类
	//所以，定义了父类对象，赋了子类，才能强制转换成子类(不会发生权限丢失..?<不会发生空指针异常>)
}
class Temp{
	public Object test() {return null;}
}

//==============================================================================================================================
class Animal{
	public void move() {
		System.out.println("动物可以移动");
	}
	public void a() {
		System.out.println("Animal this animal aaa.");
	}
}
class Dog extends Animal{															// 3号区域
	public void move() {
		System.out.println("狗会跑");
	}
	public void b() {
		System.out.println("Dog extends Animal bbb.");
	}
}
//==============================================================================================================================
//======================================================
//======================================================
//======================================================
//Father object = new Son();	//自动向上转型
								//一个对象，用父类定义出来之后，使用子类的类初始化
								//可以调用的方法：由于object是一个Father类型的变量，所以只能调用父类中的方法
								//研究变量可以调用到的东西是什么，看他的变量类型是什么
								//但是当它调用父子重名方法的时候，执行的是子类的方法
/*
 * [自动向上转型]官方解释：
 * 向上转型： 下级对象赋值给上级变量
 * 赋值条件：在发生直接或间接继承(实现)上下级关系的时候。即，存在上下级关系
 * 调用规则：仅能调用变量类型的成员(方法和变量)
 *	***若调用的是重写的方法，则调用子类中该重写的方法***
 *  **由于只有方法而非变量发生了重写，所以当调用变量的时候，所定义的对象是谁的类型，就可以调用什么的变量**
 * 
 * */

//如果发现一个对象直接输出的时候，输出的不是@符号的地址，而是其他字符串，则可以判定toString()方法被重写

//======================================================
//======================================================
//======================================================







