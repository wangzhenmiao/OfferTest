package interview.tonghuashun;

public class Card {
	//花色
	private String suit;
	//大小
	private int num;
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	//构造函数，花色+数字两个变量构造
	public Card(String suit, int num) {
		this.suit = suit;
		this.num = num;
	}
}
