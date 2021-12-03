package test;

/**
 * 运算符
 *
 */
public class Operator {
	// 语句 = 一般认为，以分号结尾
	// 表达式 = 变量 常量 运算符 
	// int a = b - 1;表达式
	// a-1 语句
	//========================
	// 运算符 
	/* 1. 算术运算符 +-/*%
	 * 2. 赋值运算符+= -= *= /= %=
	 * 3. 比较运算符> < >= <= ==
	 * 4. 逻辑运算符&& ||
	 * 5. 条件运算符
	 * 6. 位运算符& | ^ << >> >>>
	 * */
	
	public static void main1(String[] args) {
		System.out.println(3%2);
		int a = 5;
		int b = a++;
		System.out.println(b);//a++先用后加，结果为5；若是++a，先加后用，结果为6；
		
		int j=2,p=2;
		System.out.println(j>1||++p<1);
		System.out.println(p); //输出2
		//与或短路现象， 左边已经可以决定表达式结果，右边不会执行
		//https://blog.csdn.net/weixin_42894555/article/details/82632016
		
		int c1=3,c2=3;
		double c = a>b?8:9.0;//此处，9.0为最高优先级，其他的会自动转换成最高级
//--------------------------------------------------------------------------------------------------
		//只有字符串两端都是数字，才会发生数值运算，当两个都是字符串时，会发生字符串的拼接
		String s1 = "aa",s2 = "bb";
		String s3 = s1 + s2;
		int a1 = 10;
		String s4 = s1 + a1;
		System.out.println(s1 + a1);
		
		//位运算符--只能处理整数
		System.out.println(1&1);//位与，转换为二进制，每个位与运算
		System.out.println(1|1);//位或
		System.out.println(1^1);//相同为0，不同为1
		System.out.println(~1);//取反,由于正负分界线是0，认为0作为正数的第一个数，因此，5取反成为-6，-4取反成为3.
//--------------------------------------------------------------------------------------------------
		//正负区别
		//取余运算：运算结果的符号和被除数一样		c=a/b
		//取模运算：运算结果的符号和除数一致			r=a-c*b
		//取余和取模在除数和被除数同为正数和负数时没有区别
		System.out.println(7 % 4);			//3
		System.out.println((-7) % 4);		//-3
		System.out.println(7 % (-4));		//3
		System.out.println((-7) % (-4));	//-3
		
		System.out.println(Math.floorMod(7, 4));
		System.out.println(Math.floorMod(-7, 4));
		System.out.println(Math.floorMod(7, -4));
		System.out.println(Math.floorMod(-7, -4));
//--------------------------------------------------------------------------------------------------
		//双精度除法
		double x1 = 64.0,y1 = 0.0;//浮点数的0.0只是一个近似值，并非真0
		System.out.println(x1/y1);//Infinity	无穷
		System.out.println(x1*y1);//NaN			not a number
		
		//位移运算 << >> >>>
		System.out.println(4 >> 1);//把4向右移一位
		//0000 0100
		//0000 0010
		System.out.println(4 << 1);
		//0000 0100
		//0000 1000
		//右移 时不考虑 符号 问题，即无论 右移 正数还是负数，其最高位都是补0
		
		short a3 = 1,b3=1;
//		a3 += 1;		正确：被转换成了整型
//		b3 = b+1		报错：原因是整型不会自动转换成short
		
		//单目运算符优先级
		int bb = 1;
		System.out.println(-+bb);	//变为正数后变成负数
		System.out.println(+--bb);	//前置自减后，变为正数
		
		int m,k=5;
		m = ++k + ++k + k++;
		System.out.println(m+" "+k);		//20 8(但是和C语言不一样)
		// C语言和java自增的区别：https://blog.csdn.net/m0_37215251/article/details/105071909
		// 在C语言中变量的内存空间是在编译时分配的
		// java中仅仅是创建了一种类型变量的对象模板
		
		//比较运算符 == equals
		//判空
		//equals在String中比较的是内容(重写)
		//equals方法在默认情况下，比较的是两个对象的地址引用是否相同
		//equals是个方法，所以是引用类型的变量使用
		//== 引用类型变量--地址引用是否相同
		//== 基本数据类型变量--数值大小是否相同
		System.out.println("hh");
		String ss1 = null;
		String ss2 = "";
		String ss3 = new String("");
		System.out.println(ss1 == null );
		System.out.println(ss1 == "");
		System.out.println(ss2 == "");
		System.out.println(ss3 == "");
		System.out.println(ss2 == ss3);
		System.out.println(s2.equals(ss3));
		System.out.println("abc".equalsIgnoreCase(ss3));
		if("".equals(ss2)) {}
		if(ss2==null || ss2.equals("")) {}
		if(ss2 != null && !ss2.equals("")) {}
		
		//字符串常量池
		//当以String st1 = "abc"形式创建对象时
		//会首先在字符串池中寻找是否存在abc的字符串
		//若存在则从字符串池中返回他的地址引用
		//若不存在，则将"abc"添加到字符串池中，然后返回该引用
		String st1 = "abc";
		String st2 = "abc";
		System.out.println(st1 == st2);		//字符串常量池中存在"abc"，所以地址相同，为true
		String st3 = new String("abc");		//在字符串常量池中找到"abc",将其地址放到String中作为实参传入，并new出一个新地址给st3赋值.
		System.out.println(st1 == st3);		//false
		st3 = st3.intern();					//看看字符串常量池中是否存在"abc",有就引用，没有就添加
		System.out.println(st1 == st3); 	//true
		
		String s0 = new String("ttt");
		s0 = s0 + "aaa" + "bbb"; 					//非常消耗内存的拼接方法
		StringBuffer s11 = new StringBuffer("ddd");	//不太消耗内存
		StringBuffer s22 = s11.append("hh");
		System.out.println(s11);			//dddhh
		System.out.println(s22);			//dddhh	二者一致，因为先给s11追加全部完成后，再追加到s22
		System.out.println(s11 == s22);
		StringBuilder s9 = new StringBuilder("yyy");
		//区别
		//StringBuffer线程安全
		//StringBuilder线程不安全
		//length 长度
		//capacity 容量--initial capacity of 16 characters(or +16)
		//容量扩充(扩容)；规则：new capacity = value.length <<2 + 2
		
		//拼接：
		String ub1="ssss";
		String ub2="aa"+"bb"+"cc"; 		//字符串常量拼接,在编译阶段就优化成一个常量
		String ub3 = ub2 + "aa" + "bb";	//字符串变量拼接,只有在执行的时候才会拼接
		//常量和变量作比较，结果输出false
	}
	public static void main(String[] args) {
		
		
		//字符串内容倒置
		
	}
}
















