package interview.tonghuashun;

public class TestTonghua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//数组的初始化
		Card [] cardArr = {new Card("Spade", 3),new Card("Spade", 7),new Card("Spade", 5),new Card("Spade", 6),new Card("Spade", 4)};
		System.out.println(isTongH(cardArr)?"是同花顺":"不是同花顺");
	}

	public static boolean isTongH(Card [] arr){
		//不是同花顺则返回false，最后返回true
		//第一个对象，作为原始花色，原始最大值，原始最小值
		String suit = arr[0].getSuit();
		int min = arr[0].getNum();
		int max = arr[0].getNum();
		for(int i=0 ;i<arr.length;i++){
			if (!suit.equals(arr[i].getSuit())) {
				//如果花色不同，说明不是同花顺，则返回false
				return false;
			}
			//拿到当前号码，因为这个变量在以后会多次使用
			int num = arr[i].getNum();
			//更新最小值
			if(min > num){
				min = num;
			}
			//更新最大值
			if (max < num) {
				max = num;
			}
			//如果是最后一张扑克牌，从索引判断
			if (i == (arr.length-1)) {
				if((max - min) != (arr.length-1)){
					return false;
				}
			}
		}
		return true;
	}
}
