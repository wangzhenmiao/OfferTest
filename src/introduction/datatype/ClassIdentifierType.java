package introduction.datatype;

public class ClassIdentifierType {

	static int allClicks = 0; // 类变量
	
	
	//实例变量具有默认值。数值型变量的默认值是0，布尔型变量的默认值是false，引用类型变量的默认值是null。变量的值可以在声明时指定，也可以在构造方法中指定
	//实例变量可以直接通过变量名访问。但在静态方法以及其他类中，就应该使用完全限定名：ObejectReference.VariableName
	String memberClicks; // 实例变量

	public void method() {
		//局部变量是在栈上分配的
		//局部变量没有默认值，所以局部变量被声明后，必须经过初始化，才可以使用
		int methodClicks; // 局部变量
	}
}
