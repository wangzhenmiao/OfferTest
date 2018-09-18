package designpattern.factory.demo1;

public class SendFactory {
	public Sender produce(String type){
		if("mail".equals(type)){
			return new MailSender();
		}else if("sms".equals(type)){
			return new SmsSender();
		}else{
			System.out.print("input correct type!");
			return null;
		}
	}
}
