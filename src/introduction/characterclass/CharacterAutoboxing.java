package introduction.characterclass;

public class CharacterAutoboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'a';
		//unicode字符表示形式
		char uniCh = '\u039A';
		// 字符数组
		char [] arr = {'a','c','d','e'};
		
		//使用Character的构造方法创建一个Character类对象
		Character ch1 = new Character('a');
		
		//将一个char类型的参数传递给需要一个Character类型参数的方法时，那么编译器会自动地将char类型参数转换为Character对象。 这种特征称为装箱，反过来称为拆箱。
		
		// 原始字符 'a' 装箱到 Character 对象 ch 中
		Character ch2 = 'a';
		 
		// 原始字符 'x' 用 test 方法装箱
		// 返回拆箱的值到 'c'
		//char c = test('x');
	}

}
