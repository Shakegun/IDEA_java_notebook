package algorythm;

public class Triangle {
	public static void main(String[] args) {
		//左下直角三角形
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=============================");
		//左上
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=6-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=============================");
		//右上
		for(int i=1;i<=5;i++) {
			for(int k=3;k>=5-i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=6-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=============================");
		//右下
		for(int i=1;i<=5;i++) {
			for(int k=4;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=============================");
		//1 3 5 7 等腰三角形
		for(int i=1;i<=7;i+=2) {
			for(int j=(7-i)/2;j>=0;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==============================");
		//13 9 5 1 等腰倒三角形
		for (int i = 13; i >=0 ; i-=4) {
			for(int k=0;k<=5-(i/2);k++) {			//k<=(6-(i-1)/2)	公差为2的等差数列，倒数
				System.out.print(" ");			
			}
			for (int j =1 ; j <=i; j++) {		//与i同步
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==============================");
	}
}
