package introduction.loop;

public class LoopFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=10;a<12;a++){
			System.out.println("value of a :"+a);
		}
		
		//java增强for循环
		
		//for(声明语句 : 表达式)
		//声明语句：声明新的局部变量，该变量的类型必须和数组元素的类型匹配。其作用域限定在循环语句块，其值与此时数组元素的值相等。
		//表达式：表达式是要访问的数组名，或者是返回值为数组的方法。
		int [] numbers = {1,2,3,4,5,6,88,33};
		for(int i:numbers){
			System.out.println("value of i :"+i);
		}
		
		String [] arrStrings ={"xxx","eee","cccc"};
		for(String str:arrStrings){
			System.out.println("value of arr :"+str);
		}
	}

}
