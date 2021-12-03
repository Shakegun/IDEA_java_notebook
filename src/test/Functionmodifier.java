package test;

public class Functionmodifier {
	//Ctrl + Shift + t = 查找依赖的文件
	//Ctrl + Shift + r = 查找自定义的文件
	
	//final 功能修饰符
	//不可变的/最终的
	public static void main(String[] args) {
		
	}
}
final class TestH{
	//1. 定义了一个final类
	/*
	 * 1. 类不可以被继承	例：String/Integer等是final类
	 * */
	//2. 可以修饰方法
	/*
	 * 2. 方法不可以被重写
	 * */
	//3. 可以修饰变量
	/*
	 * 1. 第一次被赋值后，不可以再次赋值
	 * 2. 成员变量：定义时必须赋值
	 * 3. 局部变量：一旦赋值，便不可以再赋值。
	 * 4. 形参变量：调用的时候已经对形参进行赋值了，所以被第一次赋值之后，方法中就不能再次被赋值了。
	 * */
	//4. 引用变量，final PersonModel model = new PersonModel();	定义时必须赋值。
	/*
	 * 1. 不可以再次赋值，但是可以通过调用来方法来修改对象中的成员
	 * */
	final int a =0;
	final Functionmodifier model = new Functionmodifier();
	final int[] array = new int[10];
	public final void test() {
		array[1] = 1000;
		
	}
}
