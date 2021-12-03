package algorythm;

import org.junit.jupiter.api.Test;

public class Palindrome {//回文数
	@Test
	void mtt() {
		palindrome(12321);
	}
//	void test1(int k) {
//		String s = String.valueOf(k);
//		int len = s.length();
//		boolean flag = false;
//		for (int i = 0,j=-1; i < len/2,j>-len/2; i++,j--) {
//			if(flag=s.charAt(i)!=s.charAt(j)?true:false) {
//				System.out.println("不是回文数");
//				break;
//			}
//		}
//	}
	
	
	public void palindrome(int k) {
		char[] ch = String.valueOf(k).toCharArray();
		boolean is = true;
		int j = ch.length;
		for (int i = 0; i < j/2; i++) {
			if(ch[j] != ch[j-1-i]) {
				is = false;
				break;
			}
			System.out.println(is?"是回文数":"不是回文数");
		}
	}
	
	public boolean palindrome2(int k) {
		int m=0,n=k;
		while(n != 0) {
			m = m*10 + n%10;
			n/=10;
		}
		return m==k;
	}
	
	
}





















