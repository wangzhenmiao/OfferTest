package introduction.classdemo01;


public class Puppy {
	int puppyAge;
	public Puppy(String name){
		System.out.println("小狗的名字是："+name);
	}
	public void setAge(int age){
		this.puppyAge = age;
	}
	public int getAge(){
		System.out.println("小狗的年龄是："+this.puppyAge);
		return this.puppyAge;
	}
	public static void main(String[]args){
		//创建对象
		Puppy myPuppy = new Puppy("doudou");
		//通过方法设定年龄
		myPuppy.setAge(3);
		//调用方法获取年龄
		myPuppy.getAge();
		//也可以这样访问成员变量
		System.out.println("puppy的年龄是："+myPuppy.puppyAge);
	}
}
