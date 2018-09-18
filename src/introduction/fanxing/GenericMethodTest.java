package introduction.fanxing;


public class GenericMethodTest {

	//泛型方法，printArray
	public static < E > void printArray( E[] inputArray ){
		//输出数组元素
		for ( E element : inputArray ) {
			System.out.printf( "%s ",element);
		}
		System.out.println();
	}
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建不同类型数组
		Integer [] intArray = {1,2,3,4,5};
		Double [] doubleArray = {1.1,2.2,3.3,4.4,5.5};
		Character [] charArray = {'a','b','c','d','e'};
		
		System.out.println( "整型数组元素为:" );
		printArray(intArray);
		
		System.out.println( "\n双精度型数组元素为:" );
		printArray(doubleArray);
		
		System.out.println( "\n字符型数组元素为:" );
		printArray(charArray);
	}

}
