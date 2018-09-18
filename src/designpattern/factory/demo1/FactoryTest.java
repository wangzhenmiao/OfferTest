package designpattern.factory.demo1;

public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SendFactory factory = new SendFactory();
		Sender sender = factory.produce("sms");
		sender.Send();
		//
		SendFactory factory2 = new SendFactory();
		Sender sender2 = factory.produce("mail");
		sender2.Send();	
	}

}
