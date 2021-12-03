package test;

public class OOStudent{
	private String number;//学生学号
	private String name;//学生姓名
	private int grade;//学生成绩
	public OOStudent(){
		
	}
	
	public String getNumber(){//用get方法得到学号
		return number;
	}
	public void setNumber(String number){//用set方法去设置学号
		this.number=number;
	}
	
	public String getName(){//用get方法得到姓名
		return name;
	}
	public void setName(String name){//用set方法去设置姓名
		this.name=name;
	}
	
	public int getGrade(){//用get方法得到成绩
		return grade;
	}
	public void setGrade(int grade){//用set方法去设置成绩
		this.grade=grade;
	}
	
	
    public static void main(String agrs[]){
	OOStudent st=new OOStudent();
	st.setNumber("2019001");
	st.setName("张三");
	st.setGrade(90);
	System.out.println("学号："+st.getNumber()+","+"姓名："+st.getName()+","+"成绩："+st.getGrade()+"。");
  }
}