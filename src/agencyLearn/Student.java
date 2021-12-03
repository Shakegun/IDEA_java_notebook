package agencyLearn;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Student {
    public static void main(String[] args) {
        Student sys = new Student();
        sys.gui();
        Scanner ssScanner = new Scanner(System.in);
        Integer ii = new Integer(0);

        ArrayList<String[]> allstu = new ArrayList<String[]>();
        String[] arr = new String[5];
        
        allstu.add(arr);
        //"1","张三","男","13355667788","黄土高坡"
        //"2","李四","女","13355668899","青藏高原"
        //随便加的注释，试试push
        init:
        System.out.println("学号"+"姓名"+"性别"+"   手机号      "+"家庭住址");


        while(!(ii==ssScanner.nextInt())) {
            switch (ii) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 0:
                    break;
                default:
                    System.out.println("请输入正确的数字！");
                    continue;
            }
        }

    }
    public void gui() {
        Date cal = new Date();
        System.out.println("======================================");
        System.out.println("*                                    *");
        System.out.println("*                                    *");
        System.out.println(cal);
        System.out.println("          欢迎使用List员工管理系统                                ");
        System.out.println("*                                    *");
        System.out.println("*                                    *");
        System.out.println("*                                    *");
        System.out.println("======================================");
        System.out.println("---功能选择：键入数字，以回车做结");
        System.out.println("1. 增");
        System.out.println("2. 删");
        System.out.println("3. 改");
        System.out.println("4. 查");
        System.out.println("0. 退出");
    }
    public void addUsr() {

    }
    public void delUsr() {

    }
    public void changeUsr() {

    }
    public void searchUsr() {

    }
    public void init() {

    }
    public void start() {

    }
    public void exit() {

    }
}
