package introduction.operator;

class Vehicle{}

public class InstanceofOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car = new Vehicle();
		//该运算符用于操作对象实例，检查该对象是否是一个特定类型（类类型或接口类型）
		//类或者接口类型
		if(car instanceof Vehicle){
			System.out.print("instanceof 用法，car是vehicle的类！");
		}
	}

}
