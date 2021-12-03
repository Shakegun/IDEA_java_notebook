package algorythm;

import java.util.Random;
import java.util.Scanner;

public class Exerciese {
	public static void main(String[] args) {
		Exerciese start = new Exerciese();
//		start.departFive();
//		start.fallDown(10);
//		start.roosterHen();
//		start.nums();
		start.waterfallMmatrix();
		
	}
	//0~1000内5的倍数，每行7个
	public void departFive() {
		for(int i=5;i<1000;i+=35) {
			for(int j=i;j<i+35&&j<1000;j+=5) {
				System.out.printf("%3d ",j);	//让每个数占3个空，实现右对齐
			}
			System.out.println();
		}
	}
	/*
	 * 	从高度A米，开始下落后反弹远高度一半，以此类推直到不再反弹。
		问：此过程经历的路程为？
		注：过程中的数据以整数来计算即可。（若以浮点数计算则结果可能不同）
	 * */
	public void fallDown(int A) {
		int res = 0;
		for(int i=A;i>0;i/=2) {
			res+=i;
		}
		System.out.printf("路程是：%d米\n",res);
	}
//	public void fallDownDG(int A) {
//		if(A==0)
//			return;
//		fallDownDG(A/2+=A);
//		res+=A/2;
//	}
	/*
	 * 	鸡翁一，值钱伍
		鸡母一，值钱三
		鸡雏三，值钱一
		百钱买鸡百只，问鸡翁、母、雏各几？
	 * */
	//x+y+z=100
	//5x+3y+z/3=100
	public void roosterHen() {
		for(int x=1;x<=100;x++) {
			for(int y=1;y<=100-x;y++) {
				for(int z=3;z<=100-x-y;z+=3) {
					if(5*x+3*y+z/3==100&&x+y+z==100) {
						System.out.printf("公鸡有%d只,母鸡有%d只,小鸡有%d只。\n",x,y,z);
					}
				}
			}
		}
	}
	/*
	 * 随机（输入）n个数，输出奇数个数，偶数个数，最大值，最小值。
	 * */
	Scanner sc = new Scanner(System.in);
	//随机输入n个数模块暂未实现
	public void nums() {
		int odd=0,even=0,max=0,min=max;
		Random random = new Random();
		int n=Integer.parseInt(sc.nextLine());
		for(int i=1;i<=n;i++) {
			int ii = random.nextInt(10);
			max=max<ii?ii:max;
			min=min>ii?ii:min;
			System.out.printf("%d ",ii);
			if((ii&1)==1)
				odd+=1;
			else
				even+=1;
		}
		System.out.println();
		System.out.printf("奇数个数:%d,偶数个数:%d,最大值:%d,最小值:%d\n",odd,even,max,min);
	}
	/*
	 * 生成n*n的二维数组（矩阵）例如n=9，生成的矩阵是
		1 2 3
		4 5 6
		7 8 9
	 * */
	public void waterfallMmatrix() {
		int n=Integer.parseInt(sc.nextLine());
		for(int i=1;i<=n;i++) {
			for(int j=i*n-n+1;j<=n*i;j++) {
				System.out.printf("%2d ",j);
			}
			System.out.println();
		}
	}
	/*
	 * 
	 * */
	
	
}















