package introduction.listandmap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//一、打印数组
		int [] intArray = {43,8,7,65,44,32};
		String intArrayString = Arrays.toString(intArray);
		
		//直接打印,则会打印出引用对象的Hash值,如：I@7852e922
		System.out.println(intArray);
		//输出：[43, 8, 7, 65, 44, 32]
		System.out.println(intArrayString);
		
		//二、根据数组创建ArrayList-没感觉到有用
		System.out.println("===我是快乐的分隔符===");
		String[] stringArray = { "a", "b", "c", "d", "e" };
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
		System.out.println(arrayList);
		/*public static <T> List<T> asList(T... a)
		 * 返回一个受指定数组支持的固定大小的列表*/
		
		// 三、检查数组是否包含某个值
		System.out.println("===我是快乐的分隔符===");
		boolean b = Arrays.asList(stringArray).contains("d");
		System.out.println(b);
		/*
		 * contains方法：boolean java.util.List.contains(Object paramObject)*/
		
		// 四、将ArrayList转换为数组
		System.out.println("===我是快乐的分隔符===");
		String[] stringArray4 = { "a", "b", "c", "d", "e" };
		ArrayList<String> arrayList4 = new ArrayList<String>(Arrays.asList(stringArray4));
		String[] stringArr4 = new String[arrayList4.size()];
		arrayList4.toArray(stringArr4);
		for(String str:stringArr4)
			System.out.println(str);
	}
}
