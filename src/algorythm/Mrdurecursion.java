package algorythm;

import org.junit.Test;

public class Mrdurecursion {

    // 递归：自身方法中调用自身方法+结束条件+执行的功能
    @org.junit.Test // 公有的+非静态的+无参的+默认构造方法可用
    public void test() {
        // y0(4);
        // y1(5);
        // test991(1);
        test999(9);
    }

    public void test991(int n) {// n=1
        // 输出每行多少个
        m9(n, n);
        // 输出多少行
        System.out.println();
        if (n == 9)
            return;
        test991(n + 1);
    }

    /**
     * @param k
     *            输出该行多少个
     * @param n
     *            输出第几行
     */
    public void m9(int k, int n) {
        if (k == 0)
            return;
        m9(k - 1, n);
        System.out.print(k + "*" + n + "=" + (k * n) + " ");
    }

    public void test999(int n) {// n=9
        if (n == 0)
            return;
        test999(n - 1);
        // 输出每行多少个
        m9(n, n);
        // 输出多少行
        System.out.println();
    }

    @Test
    public void test99() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + "*" + i + "=" + (i * j) + " ");
            System.out.println();
        }
    }

    // n!
    @Test
    public void testN() {
        System.out.println(mt(10));
    }

    public long mt(long n) {// n!
        return n < 2 ? 1 : n * mt(n - 1);
    }

    // 输入整数n，输出1到n的整数
    public int y1(int n) {
        if (n > 0) {
            System.out.println(y1(n - 1) + 1);
        }
        return n;
        // if (n == 0)
        // return;
        // y1(n - 1);
        // System.out.println(n);
    }

    public void y0(int n) {
        if (n == 0)
            return;
        System.out.println("---" + n);
        y0(n - 1);// y0(4-1) y0(3-1) y0(2-1) y0(1-1)
        System.out.println("+++" + n);
    }

    public static void main(String[] args) {
        Mrdurecursion t1 = new Mrdurecursion();
        System.out.println("1111");
        t1.f1();
        System.out.println("2222");
    }

    public void f1() {
        System.out.println("aaaa");
        // f1();
    }

}
