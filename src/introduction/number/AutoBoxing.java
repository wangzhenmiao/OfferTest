package introduction.number;

public class AutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//当 x 被赋为整型值时，由于x是一个对象，所以编译器要对x进行装箱。然后，为了使x能进行加运算，所以要对x进行拆箱。
		Integer x = 5;//装箱
		x = x + 10;//拆箱
		System.out.println("x:"+x);
	}

	//内置数据类型都有对应的包装类
	//所有的包装类（Integer、Long、Byte、Double、Float、Short）都是抽象类 Number 的子类
	//char的包装类Character类
	//boolean的包装类Boolean
	//至此，8个基本数据类型，都找到了对应的包装类
	//装箱：当内置数据类型被当作对象使用的时候，编译器会把内置类型装箱为包装类
	//拆箱：从包装类到内置类型
	//Number 类属于 java.lang 包
}
