package introduction.datatype;

public class ConstantDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//常量
		//用final修饰常量，程序运行过程中不可修改
		final double PI = 3.14;
		
		//字面量可以赋给任何内置类型的变量
		byte a = 68;
		char b = 'A';
		
		//byte、int、long、和short都可以用十进制、16进制以及8进制的方式来表示
		//当使用常量的时候，前缀 0 表示 8 进制，而前缀 0x 代表 16 进制
		int decimal = 100;
		int octal = 0100;
		int hexa = 0x64;
		
		//字符串常量和字符常量都可以包含任何Unicode字符
		char c = '\u0001';
		String d = "\u0001"; //是16进制Unicode字符 (0001)
		
	}

}
