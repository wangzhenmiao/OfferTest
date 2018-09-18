package introduction.branch;

public class BranchSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'C';
		switch(grade){
		case 'A':
			System.out.println("A is grade!");
			break;
		case 'B':
			System.out.println("B is grade!");
			break;
		case 'C':
			System.out.println("C is grade!");
			break;
		default:
			System.out.println("unknown grade!");
		}
	}

}
