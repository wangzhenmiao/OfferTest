package introduction.fanxing;

import java.util.ArrayList;
import java.util.List;

public class GenericTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> name = new ArrayList<String>();
 		List <Integer> age = new ArrayList<Integer>();
 		List <Number> number = new ArrayList<Number>();
 		
 		name.add("name1");
 		age.add(13);
 		number.add(444);
 		
 		 //getUperNumber(name);//1
        getUperNumber(age);//2
        getUperNumber(number);//3
	}

	public static void getData(List<?> data){
		System.out.println("1输出："+data.get(0));
	}
	
	public static void getUperNumber(List<? extends Number> data){
		System.out.println("2输出："+data.get(0));
	}
}
