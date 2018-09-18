package introduction.loop;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {5, 6, 44, 3};
		for (int i : numbers) {
			if (i == 44) {
				break;
			}
			System.out.println("value of i:"+i);
		}
		System.out.println("===我是快乐的分隔符===");
		for(int i:numbers){
			if(i == 44){
				continue;
			}
			System.out.println("value of i:"+i);
		}
	}

}
