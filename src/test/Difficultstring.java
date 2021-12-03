package test;
/**
 * @author 
 * 对于字符串的特殊说明
 * */
public class Difficultstring {
	String s0 = null;				//未赋值的时候就是null,没有对象的变量
	String s1 = "abc";				//字符串,有对象的变量
	String s2 = new String("abc");	//有对象的变量
	
	String s3 = s2;					//地址赋值
	String s4 = String.valueOf(100);
	
	public static void main(String[] args) {
		Difficultstring ddDemoG = new Difficultstring();
		System.out.println(ddDemoG.s1.length());//字符串长度
		System.out.println(ddDemoG.s1.charAt(1));//打印第一个字符
		System.out.println(ddDemoG.s1.valueOf(100));//赋值100的整形值
		char[] ss = ddDemoG.s1.toCharArray();//转换成字符数组
		String s2 = "aa,bb,cc,dd,ee";//定义字符串
		String[] s2tem = s2.split(",");//以","分隔为字符串数组
		String ssString = " a   b ".trim();//去掉两端的空格
	}
	//一个变量没有对象的死后是不允许对他进行其他的操作的
	//
	
	
}
