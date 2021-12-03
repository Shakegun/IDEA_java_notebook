package test;

import java.math.BigDecimal;
import java.util.function.BinaryOperator;

/**
 * 变量
 *
 */
public class Variable {
	// 变量-分类
	// 1.引用类型
	// 2.基本数据类型
	//关于默认值： 前提是此成员被实例化之后，才会具有默认值
	// 静态变量： 类使用时具有默认值
	// 实例变量： 类实例化时具有默认值
	
	//静态成员： 类被第一次使用时，加载全部静态成员的定义
	//实例成员： 类被第一次实例化时，加载全部实例成员
	byte 	bt1;//-128-127,//默认值为0，1字节
	int 	i1;//默认值为0，2字节
	short 	s1;//默认值为0，4字节
	long 	l1;//默认值为0l，8字节
	float 	f1;//默认值为0.0f,4字节
	double 	d1;//默认值为0.0d，8字节
	BigDecimal bd1;//高精确度大范围精确小数，float/double做比较大小，但二者都不是准确值。
	
	//所有0.0默认为double，因此除double外，都需要加符号。
	char 	c1;////默认值为' ',字符数字符号中文，只能含有并有且只有一个字符，2字节，Unicode字符、转义字符
	//转义字符：\\ \' \" \n \t
	boolean bl1;//默认值为false,(具体要看jvm虚拟机的效率)1或4个节
	//true 和 false 和 null不是关键字，只是字面量
//===================================================================
	//1字节=8位二进制
	//赋值运算的过程当中，数值如果是常量会自动识别成所赋值的类型
	//byte bb = 0; 为byte类型
	//int ba = 0;  为int类型
	
	//自动类型转换：在混和运算中:常量、整形、浮点型、字符型、
	//===========！！在运算中，不同类型的数据先转换成同一类型的数据，再进行运算
	//转换的规则：从低级到高级
	//byte short char < int <long <float < double
	
	
	//引用类型(包装类)
	// Byte, Short, Integer, Long | Float, Double| Character, Boolean
	public static void main(String[] args) {
		int c1 = 'A'+1;
		System.out.println(c1);
		
		//强制类型转换
		//规则=转换时从高级到低级的
		//转换过程中可能会导致范围溢出、精度损失
		int a = -129;
		byte b = (byte)a;
		System.out.println("强制转换int-->byte,转化-129: "+b);//范围一处，从反方向开始循环
		
//		char bb = 191;
//		System.out.println(bb);
//		for(char i=191;i<=255;i++) {
//			System.out.print(i+" ");
//		}
		
		//引用变量有无省略形式要根据该引用变量情况，标准写法: 引用类型 变量名  = new 引用类型(); 
		byte b0 = 0;
		Byte b3 = new Byte((byte) 10);
		Byte b2 = 10;
		System.out.println(b0);
		System.out.println(b3.SIZE);
		System.out.println(Byte.SIZE+" "+Byte.MIN_VALUE+" "+Byte.MAX_VALUE);
		
		
		int ak = 0;
		Byte btByte = 9;
		int ak2 = btByte.intValue();//将byte类型的变量btByte的int值赋值给ak2.
		
		int i = 10;
		String s1 = Integer.toBinaryString(i);//把int转换成二进制,赋值给字符串变量
		//不同的进制问题
		int ii = 10;
		System.out.println(Integer.toBinaryString(ii));
		System.out.println(Integer.toOctalString(ii));
		System.out.println(Integer.toHexString(ii));
				
		int x = 10,y = 012, z = 0xa;
		System.out.println(x+" "+y+" "+z);
		
		
		
	}
	// Alt + Shift + J  添加javadoc，鼠标一到方法前面添加，鼠标移到方法名上可以看到javadoc.
	/**
	 *歪比巴比
	 */
	void sldkfj() {
		
	}
}
















