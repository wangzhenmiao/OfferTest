package interview.list;

import java.util.ArrayList;
import java.util.List;

/*假设：一对兔子，满三个月后，成年，就可以生一对兔子，小的这对兔子，
 * 在满三个月后，又可以生兔子,如此发展下去；假定成年兔子每个月，生一对兔子，
 * 现在要算一下，给你一对兔子，过N个月之后，会有多少只兔子*/
public class TestRabbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("我要算一算一共有多少只兔子！");
		System.out.println("月数N："+7+"兔子的个数"+sumRabbit(7));
	}

	public static int sumRabbit(int n){
		if(n < 2){
			return 1*2;
		}
		List<Integer> list = new ArrayList<>();
		list.add(-2);
		for(int i=0;i<=n;i++){
			for(int j=0;j<list.size();j++){
				//判断是需要加一个月年龄的
				if(list.get(j)<=0){
					list.set(j, list.get(j)+1);
					//System.out.println("<0的list"+list);
				}else {//如果是大于三个月的兔子，每过一个月，要生一对兔子
					list.add(-2);
					list.set(j, list.get(j)+1);
					//System.out.println("else的list"+list);
				}
				//System.out.println("===内层for循环=====");
				System.out.println("list:"+list);
			}
			System.out.println("XXX外层for循环xxx");
		}
		return list.size()*2;
	}
}
