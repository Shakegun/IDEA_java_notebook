package test;
	//this关键字
//https://www.yiibai.com/java/this-keyword.html#:~:text=%E5%9C%A8java%E4%B8%AD%EF%BC%8C%E8%BF%99%E6%98%AF,%E5%BD%93%E5%89%8D%E5%AF%B9%E8%B1%A1%E7%9A%84%E5%BC%95%E7%94%A8%E5%8F%98%E9%87%8F%E3%80%82&text=this%20%E5%85%B3%E9%94%AE%E5%AD%97%E5%8F%AF%E7%94%A8%E6%9D%A5,%E5%BD%93%E5%89%8D%E7%B1%BB%E7%9A%84%E6%9E%84%E9%80%A0%E5%87%BD%E6%95%B0%E3%80%82
public class Keywordthis {
	//this:当前对象的引用。用来访问当前对象中的成员

	//this的关键字在使用的时候要注意这些规则：
	
	private int testThis = 100;
	
	public static void main(String[] args) {
		Keywordthis t1 = new Keywordthis();
		t1.setTestThis(200);				//this到底是谁？this所在的方法是谁调用，this就是谁
	}
	

	
	public int getTestThis() {
		return testThis;
	}
	public void setTestThis(int testThis) {
		this.testThis = testThis;
	}
}

class TestG{
	//super：上级对象的引用+用来访问上级中的成员
	//super(￣△￣；)代指=调用super所在的对象在实例化时先实例化的父类对象
	
	
	
}