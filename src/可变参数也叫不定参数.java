import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//参数个数根据实际情况传几个都行
	//适用于参数个数不确定+类型确定
	//特点：
	//1-不定参数在参数列表中只能出现在最后(前面可以有别的参数)
	//2-...位于变量名称和变量之间，前后有无空格都可以
	//3-调用可变参数的时候,编译器为该可变参数隐含创建一个数组	
/**
 * @category 可变/不定参数
 *
 */
public class 可变参数也叫不定参数 {
	public static void f0(Integer a,String b,int c,String...strings) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(strings.length);
		System.out.println(strings);
		System.out.println(strings.toString());
	}
	//f0();		//写法错误，因为虽然有不定参数，但也有确定参数，所以不能置空
	public static void main(String[] args) {
		f0(12, "ssss", 111, "aaa","bbb","ddd");
		List<Integer> list = Arrays.asList(1,2,2,3,4,5);//作为不定参数来定义的(底层)
	}
}
