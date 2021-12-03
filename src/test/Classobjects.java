package test;

import org.junit.Test;
public class Classobjects {
	@Test
	public void 自动装箱() {
		//自动装箱：基本数据类型->对应包装类的引用类型
		int i=10;//栈内存
		int i0=10;
		Integer in1 = 10;//在直接赋值的时候会自动装箱,直接赋值，直接赋值！！
		Integer in2 = 10;
		Integer in3 = new Integer(10);
		Integer in4 = new Integer(10);
		Integer in5 = 199;
		Integer in6 = 199;
		System.out.println(i==i0);		//True 基本数据类型对比，没有特殊操作
		System.out.println(i==in1);		//True 自动拆箱(在赋值的时候是自动装箱，因此在使用的时候就是自动拆箱)
/*III*/	System.out.println(i==in3);		//True 由于等号左边是基本数据类型，右边是引用数据类型，因此也会发生自动拆箱			line:18与line:17有异曲同工之妙
		System.out.println(in1==in2);	//true 二者都是引用类型，比对的是地址,结果为真，二者地址相等
		
		System.out.println(in1==in3);	//false new出来的，是新的地址，因此地址不用
		System.out.println(in3==in4);	//false
		System.out.println(in5==in6);	//false 受缓冲区范围影响，创建了新的对象
		// 对于Integer，有一个静态内部类名为IntegerCache，(整数缓存区)
		// 里面有个cache[],也就是Integer常量池，类似字符串常量池，存储了某个范围内的缓存好的数据
		// 而此常量池中，大小为一个字节的存储范围(-128)~127,在此范围内的数据都会放到缓冲区中
		/*规则：
		 * 1. 当赋值在这个区间的时候，不会创建新的对象,而是从缓冲区中获取已经创建好的对象[]
		 * 2. 而当超出了此范围，相当于new Integer来创建Integer对象
		 * */
		//因此，199超出了缓冲范围，而10未超出，从缓冲区中取出同一个对象
		/*其他有缓冲区的存在：
		 * Byte
		 * Integer
		 * Short
		 * Long
		 * Float(特例：没有缓冲区)
		 * Double(特例：没有缓冲区)
		 * Character(有，但没有负数区域)[0,127]
		 */
	}
	public static void main(String[] args) {
		
	}
	
	public void 类型转换() { //类型转换(与字符串)
		
		
	}
	public void 装箱问题自增改数() {
		Byte a=123;
		Byte c = a;
		System.out.println(c==a);
		a++;
		//引用类型自增发生的情况：
		//byte a0 = 123
		//a0++;
		//a=a0
		System.out.println(c==a);
		
		Byte b1=100;
		testB(b1);
		System.out.println(b1);			//结果为100，数值没变
	}
	public void testB(Byte b2) {
		b2++;
		//收到传过来的数
		//但是发生了重新赋值
		//产生了新的对象
		//所以回传后原数值不变
	}
}
