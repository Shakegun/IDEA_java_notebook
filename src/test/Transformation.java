package test;

public class Transformation {
	public static void main(String[] args) {
		Aa a = new Aa();
		Bb b = new Bb();
		Cc c = new Cc();
		// 看方法调用“.”前面的变量是由什么对象触发的，该对象就调用哪个类中的方法
		a.test(a);	//调用Aa.test()
		a.test(b);	//调用Aa.test()
		a.test(c);	//调用Aa.test()
		b.test(a);	//调用Bb.test()
		b.test(b);	
		b.test(c);	//调用Bb.test(c) 继承最近一层的方法，使用Bb类
		c.test(a);	
		c.test(b);	
		c.test(c);	
	}
}
class Aa{
	public void test(Aa a) {
		System.out.println("A");
	}
}
class Bb extends Aa{
	public void test(Aa a) {
		System.out.println("BA");
	}
	public void test(Bb b) {
		System.out.println("BB");
	}
}
class Cc extends Bb{
	public void test(Aa a) {
		System.out.println("CA");
	}
	public void test(Bb b) {
		System.out.println("CB");
	}
	public void test(Cc c) {
		System.out.println("CC");
	}
}
