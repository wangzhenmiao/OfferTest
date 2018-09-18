package introduction.operator;

public class LogicTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = true;
		boolean b = false;
		System.out.println("a && b :"+(a&&b));
		System.out.println("a || b :"+(a||b));
		System.out.println("!b :"+(!b));
		
		//短路逻辑运算符
		//当使用与逻辑运算符时，在两个操作数都为true时，结果才为true，但是当得到第一个操作为false时，其结果就必定是false，这时候就不会再判断第二个操作了
		int i = 5;
		boolean j = (i<4)&&(i++>10);
		System.out.println("i :"+i);
		System.out.println("j :"+j);
	}

}
