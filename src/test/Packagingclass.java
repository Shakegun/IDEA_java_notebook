package test;
import java.awt.List;
import java.math.BigDecimal;
import java.util.Arrays;

public class Packagingclass {
	
	
	public void bigdecimal() {
		BigDecimal b1 = new BigDecimal(1.1);
		BigDecimal b2 = new BigDecimal("1.1");
		BigDecimal b3 = new BigDecimal("0.5");
		
		System.out.println(b3);
		System.out.println(b3.add(b3));
		System.out.println(b3.subtract(b2));
		System.out.println(b3.multiply(b2));
		System.out.println(b3.divide(b2, 4,BigDecimal. ROUND_HALF_UP));//数字，精度，舍入方式
		
		b2 = b2.setScale(2);			//精度保留
		System.out.println(b2);	
//************************************************
		//常用工具类/类/类型转化
		//字符串 String/StringBuffer/StringBuilder
		//基本数据类型的包装类  ---Integer等8个
		//高精度 BigDecimal
		//日期时间0Date/Calender/SimpleDateFormat以及JDK8中的时间体系相关实践体系香瓜你的API
		//数学随机 /Math/Random/StrictMath
		//数组 Arrays
		//集合 Collections
		//接口-- Comparable/Comparator/Iterable/Iterator/Serializable/Cloneable
		/*
		 * JDK8
		 * LocalDate/LocalTime/LocalDateTime
		 * Optional
		 * ScriptEngineManager
		 * Functionallnterfate
		 * Stream
		 * Lambda
		 * MethodTrference
		 * */
		
//*****************************************************
		 
	}
	
}
