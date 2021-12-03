package algorythm;
//9.1
//输出第n项斐波那契数
import java.util.Scanner;

public class Fibonacci {
	static Scanner numScanner = new Scanner(System.in);
	public static void main(String[] args) {
//		int a=1,b=1,i=numScanner.nextInt();
//		
//		while(i-->0) {
//			if(i==0) {
//				System.out.println(a);
//				break;
//			}else {
//				a+=b;
//				a^=b;
//				b^=a;
//				a^=b;
//			}
		
//		Fibonacci ffFibonacci = new Fibonacci();
//		ffFibonacci.febb();
		
		feb();
		}
	void febb() {
		int a=1,b=1,i=numScanner.nextInt();
		while(i-->0) {
			if(i==0) {
				System.out.println(a);
				break;
			}else {
				a+=b;
				a^=b;
				b^=a;
				a^=b;
			}
		}
	}
	static void feb() {
		int a=1,b=1,i=numScanner.nextInt();
		while(i-->0) {
			if(i==0) {
				System.out.println(a);
				break;
			}else {
				a+=b;
				a^=b;
				b^=a;
				a^=b;
			}
		}
	}
	
}
