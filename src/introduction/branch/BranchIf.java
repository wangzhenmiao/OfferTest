package introduction.branch;

public class BranchIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 30;
		if(x > 20){
			System.out.println("x>20");
		}else{
			System.out.println("x<=20");
		}
		
		//if...else if...else 语句
		if(x == 10){
			System.out.println("x==10");
		}else if(x == 20){
			System.out.println("x==20");
		}else if(x == 30){
			System.out.println("x==30");
		}else{
			System.out.println("x out!");
		}
		
		//嵌套的 if…else 语句
		if(x > 10){
			if(x >20){
				System.out.println("x>30");
			}else{
				System.out.println("only x>10");
			}
		}
		
	}

}
