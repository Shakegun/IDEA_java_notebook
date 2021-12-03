package test;

import java.util.Set;

/**
 * @category 访问修饰符
 *
 */
public class Encapsulation {//实体类 = 封装(事物)对象所定义的咧
	//访问修饰符--私有的-所修饰的可以在当前作用范围内使用
	//实体类 = 创建对象，存储数据。 就是为了存储数据.
	//封装的过程：将各种相关数据封装在一起,类的对象主要用于存储每个数据。
	//实体类的命名规则： 加后缀:Model Entity Bean Pojo(简单的对象类型) VO
	//功能类、工具类
	
	//****实体类封装过程的组成部分：****
	/*
	 * 1. 私有的属性变量: 首字母必须小写(变量名长度至少三个字符,除了id),命名单词多一点
	 * 2. 公有的属性方法: getter/setter【必不可少的】
	 * 3. 可有可无的: 构造方法,方法名字和类名一样，无返回类型发。
	 * 4. 可有可无: 直接操作属性的其他方法
		*/
	//****封装的意义****
	/*
	 * 1. 隐藏类的实现细节：知道怎么用就行，无需理解运作原理
	 * 2. 让使用者只能通过事先定制好的方法来访问数据，可以方便的加入控制逻辑
	 * 限制对数据的不合法操作
	 * 3. 便于修改，增强代码的可维护性,直接在setAge中设置if限制输入年龄在[0,200]之间，减少了每次输入需要限制条件的语句，降低维护时间成本
	 * */
	public void pl私有(int number,int id) {// 构造方法，但不是必须的
		this.number = number;
		this.number = id;
	}
	private int number;
	private int count;
	//非常重要的this
	
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	
	
	public void setCount(int count) {
		this.count = count;
	}
	public int getCount() {
		return count;
	}
	//变量私有化，使用公有方法
}
