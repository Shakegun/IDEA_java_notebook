package algorythm;

import java.util.Scanner;

public class Tools {
	public static void main(String[] args) {
		//循环输入非零
		Scanner ss = new Scanner(System.in);
		String line="";
		while(!(line=ss.nextLine()).equals("0")) {
			System.out.println(line);
		}
	}
	
	//输入整数
	public static int finput() {
		Scanner ssScanner = new Scanner(System.in);
		return Integer.parseInt(ssScanner.nextLine());
	}
}
