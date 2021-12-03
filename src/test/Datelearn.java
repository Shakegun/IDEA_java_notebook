package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.junit.Test;

public class Datelearn {
	//时间日期	1.7/1.8
	//重要的内容：三个类
	@Test
	public void fDate() {
		Date d1 = new Date();			//使用java.util.Date
		System.out.println("java.util.Date的时间：");
		System.out.println(d1);//系统当前时间
		System.out.println(d1.toLocaleString());//删除线，说明此方法即将过时，不可在标准代码中使用
		
		//如何在一个文件中使用两个包中的同名文件？
		//使用全文件名的形式
		java.sql.Date d2 = new java.sql.Date(1000000L);//没有默认无参午餐的构造方法
		long l;	//时间的毫秒数
		System.out.println("java.sql.Date的时间：");
		System.out.println(d2);
	}
	public void fDate(Date d1,Date d2) {		//方法重载
		long time = d1.getTime();		//时间的毫秒数
		long time2 = d2.getTime();		
		System.out.println(time>time2); 
		System.out.println((time-time2)/100/60/60); 	//时间差
	}
	public void fcal() {
		Calendar cal=Calendar.getInstance();
		System.out.println(cal);
		
		Date d1=cal.getTime();
		long t1 = cal.getTimeInMillis();
		
		cal.set(2021, 11, 26, 10, 5, 0);			//其中月份是从零开始的，输入11会显示12月
		System.out.println(cal.getTime().toLocaleString());
		
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.MILLISECOND));  
		System.out.println(cal.get(Calendar.SECOND));  
		
		cal.set(Calendar.YEAR, 2020);		//用于设置某个地方的数字
		
		cal.add(Calendar.YEAR, -1);			//年份向回偏移1
		cal.add(Calendar.YEAR, 1);			//年份向后偏移1
		
	}
	//类型转换
	@Test
	public void f1(Date d1) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//HH是24小时制，hh是12小时制；MM是月，mm是分
		String dataString = sdf.format(d1);
		System.out.println(dataString);
		
		try {
			Date d2 = sdf.parse(dataString);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
	//时间日期格式的字符串--比较
	public void f2() {
		String s0="2021-11-26 10:22:00";
		String s1="2021-11-27 12:22:00";
		String s2="2021-11-26 20:22:00";
		//对比看看时间的先后
		System.out.println(s0.compareTo(s1));
		System.out.println(s0.compareTo(s2));
		//看看时间是不是在17点之后
		System.out.println("17:00:00".compareTo(s2.substring(11)));
	}
}













