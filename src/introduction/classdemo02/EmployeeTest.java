package introduction.classdemo02;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//使用构造器创建两个对象
		Employee e1 = new Employee("xiao1");
		Employee e2 = new Employee("xiao2");
		//调用方法,设置信息
		e1.setAge(23);
		e1.setDesignation("专家");
		e1.setSalary(25);
		//调用方法，打印信息
		e1.printEmployee();
	}

}
