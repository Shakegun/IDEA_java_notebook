package outline;

import java.util.Arrays;
import java.util.Random;
public class Needabsorb {
	//不太会的内容
	/*
	 * 1. 使用迭代器给list遍历(不熟练)
	 * 2. 看看HashSet在内存中的存储方法
	 * 3. entry遍历
	 * 4. HashMap存储原理(百度云)		
	 * 5. 红黑树
	 * 6. while循环输入非零
	 * 6.5.  gitee使用方法
	 * 7. return Integer.parseInt(ssScanner.nextLine());
	 * 9. 调用方法的时候，如果子类中存在，则调用子类中的方法；
	 *  重写方法的调用
	 * 	  调用的方法在子类中不存在，则使用exitends中出现
	 * */
//	public void bug() {
//	Integer[] q;			//局部变量声明、初始化必须要赋值之后才可以使用
//	//System.out.println(q);			//错误的
//}
	public static void main(String[] args) {
		//Arrays
		int[] array=new int[] {1,2,3,4,5};
		Arrays.sort(array);
		//Math
		Random random=new Random();
		int a = random.nextInt(10);
		double b = random.nextDouble();
		int c = Math.abs(-5);
		//String
		String ccString = new String("abcdefg");
		String ccString2 = ccString;
		ccString.charAt(2);
		ccString.indexOf("cde");
		ccString.compareTo("abcdefg");
		ccString.contains("z");
		boolean bb = ccString.equals(ccString2);
		System.out.println(bb);
		//
	}
	
	
	
}
