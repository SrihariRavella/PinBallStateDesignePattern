package com.Pinball.Package;

public class PinballmainClass {
	
	public static void main(String[] args) {
		
		NotificationModelController notification = new NotificationModelController();
		
		notification.setOrderNotification(new OrderNotification());
		notification.setShippingNotification(new ShippingNotification());
		notification.setDelieveryNotofication(new DelieveryNotification());
		
		notification.notifyUser("ordered");
		notification.notifyUser("shipped");
		notification.notifyUser("delievaried");
		
	}

}
