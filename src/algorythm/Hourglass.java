package algorythm;

public class Hourglass {
	
	public void f65() {  			//沙漏[任何有两组对应映射关系的for循环嵌套都可以用直线思维解读]
		// 1234567	==> k = |(0-1)/(7-6)|  1	<由于有增有减，所以是轴对称，加绝对值符号>
		// 0123210	==>	y=3-|x-4|
		
		// 1234567	==> k = |(7-5)/(7-6)|  2	<由于有增有减，所以是轴对称，加绝对值符号>
		// 7531357	==> y=2*|x-4|+1
		for (int i = 1; i <= 7; i++) {
			for (int n = 1; n <= 3-Math.abs(4-i); n++) {
				System.out.println(" ");
			}
			for (int m = 0; m <= 2*Math.abs(4-i)+1; m++) {
				System.out.println("*");
			System.out.println();
			}
		}
	}
	
	public void f67() {				//矩阵点方式，49次循环，效率不高
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if(Math.abs(i - 4) >= Math.abs(j-4)) 
					System.out.println('*');
				else 
					System.out.println(' ');
			}
			System.out.println();
		}		
	}
	
	//递归算法打印沙漏
	public void f661(int n) {
		if(n==0)
			return;
		f661(n-1);
		//1234567
		//0123210
		f662(3 - Math.abs(4-n));
		//1234567
		//7531357
		f663(Math.abs(4 - n) * 2 + 1);
		System.out.println();
	}
	
	public void f662(int p) {
		if(p==0)
			return;
		System.out.println(' ');
		f662(--p);
	}
	
	public void f663(int k) {
		if(k==0)
			return;
		System.out.println('*');
		f663(--k);
	}
	
	public void f64() {		//菱形
		// 1234567
		// 3210123	==> y=|x-4|
		// 1234567
		// 1357531	==> y=7-2*|x-4|
		for(int i=1;i<=7;i++) {
			for(int m=1;m<=Math.abs(4-i);m++) {
				System.out.println(" ");
			}
			for(int n=1;n<=7-2*Math.abs(4-i);n++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}
}
