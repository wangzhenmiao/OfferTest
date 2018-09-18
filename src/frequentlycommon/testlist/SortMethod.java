package frequentlycommon.testlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Comparator<Student> comparator = new Comparator<Student>() {
				@Override
				public int compare(Student s1, Student s2) {//重写接口中的抽象方法
					// 先排年龄
					if (s1.getAge() != s2.getAge()) {
						return s1.getAge() - s2.getAge();
					} else if (!s1.getStudentName().equals(s2.getStudentName())) {
						// 年龄相同则按姓名排序
						return s1.getStudentName().compareTo(s2.getStudentName());
					} else {
						// 姓名也相同则按学号排序
						return s1.getStudentId() - s2.getStudentId();
					}
				}
			};  //实例化了一个接口
			Student stu1 = new Student(1, "zhangsan", 28);
			Student stu2 = new Student(2, "zhagnsan", 19);
			Student stu3 = new Student(3, "wangwu", 19);
			Student stu4 = new Student(4, "wangwu", 19);
			Student stu5 = new Student(5, "zhaoliu", 18);

			ArrayList<Student> list = new ArrayList<Student>();
			list.add(stu1);
			list.add(stu2);
			list.add(stu3);
			list.add(stu4);
			list.add(stu5);
			// 这里就会自动根据规则进行排序
			Collections.sort(list, comparator);//调用工具类的排序方法
			for (int i = 0; i < list.size(); i++) {
				Student stu = list.get(i);
				System.out.println("年龄:" + stu.getAge() + "   姓名:" + stu.getStudentName() + "   学号:" + stu.getStudentId());
			}
		}
	}

