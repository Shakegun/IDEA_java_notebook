package test;

public class 匿名内部类 {
	//匿名内部类--用这个匿名的类实例化出一个对象
	//语法格式规则
	//new AAA(){}
	//AAA=上级文件名
	//匿名内部类必须继承一个父类或实现了一个接口(只能有一个)
	
	Comparable<PersonBean> p1 = new Comparable<PersonBean>() {
		//new后面的是匿名内部类要实现的
		//大括号中放的是：匿名内部类体当中要写的代码
		@Override
		public int compareTo(PersonBean o) {
			// TODO Auto-generated method stub
			return 0;
		}
	};
}
class PersonBean implements Comparable<PersonBean>{
	@Override
	public int compareTo(PersonBean o) {
		return 0;
	}
}