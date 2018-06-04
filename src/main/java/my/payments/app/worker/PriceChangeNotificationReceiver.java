package my.payments.app.worker;

import org.springframework.stereotype.Component;

import my.payments.app.pojo.PriceChangeNotificationMsg;

@Component
public class PriceChangeNotificationReceiver {
	
	public void receiveMessage(PriceChangeNotificationMsg msg) {
		System.out.println("Sending email to: " + msg.getTo());
		
		//TODO
		System.out.println("Sending response message");
		//Send response message
	}

}
