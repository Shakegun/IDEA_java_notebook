package test.jiekou;
	//接口不是类
	//类主要是用来描述对象的属性和方法
	//接口主要是用来定义方法特征的

import org.junit.jupiter.engine.descriptor.TestFactoryTestDescriptor;

//类主要是用来描述对象的属性和方法
public interface TestF {
	//可以在接口中定义变量，但是必须要初始化,类似final
	int a = 1; // static final public
	//jdk1.7:
	//不可以有构造方法
	//不可以有代码块
	//不可以有普通实例方法
	//jdk1.8
	//允许出现静态方法以及,默认方法
	static void ff() {System.out.println("static方法");}
	default void f() {System.out.println("default方法");}
	
}
abstract class TestE2 implements TestF{	//实现
	
}
//接口和抽象类之间的语法规则区别
/**
 * 1. 构造方法：接口中不能有，抽象类中可以有
 * 2. 方法体：接口中不能有(但是jdk1.8可以有default和static),抽象类中可以有
 * 3. 代码块：接口中不能有，抽象类中可以有
 * 4. 变量：接口中默认是public static final，抽象类中没有默认(可自定义)
 * */
//类/接口
//(单)继承=类+类
//(多)实现=类+接口		没有多继承，多实现来凑
//(多)继承=接口+接口
//接口和接口之间的关系
//继承=接口+接口
//接口和接口之间是继承关系












