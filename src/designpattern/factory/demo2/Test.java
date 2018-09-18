package designpattern.factory.demo2;

public class Test {
	public static void main(String args[]){
		Provider provider = new SendMailFactory();
		Sender sender = provider.produce();
		sender.Send();
	}
}
