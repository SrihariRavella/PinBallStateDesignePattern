package com.Pinball.Package;

public class NotificationModelController {
	
	private OrderNotification orderNotification ;
	private ShippingNotification shippingNotification;
	private DelieveryNotification delieveryNotofication;
	public OrderNotification getOrderNotification() {
		return orderNotification;
	}
	public void setOrderNotification(OrderNotification orderNotification) {
		this.orderNotification = orderNotification;
	}
	public ShippingNotification getShippingNotification() {
		return shippingNotification;
	}
	public void setShippingNotification(ShippingNotification shippingNotification) {
		this.shippingNotification = shippingNotification;
	}
	public DelieveryNotification getDelieveryNotofication() {
		return delieveryNotofication;
	}
	public void setDelieveryNotofication(DelieveryNotification delieveryNotofication) {
		this.delieveryNotofication = delieveryNotofication;
	}
	
	public void notifyUser(String variable) {
		switch(variable) {
		case "ordered" :this.orderNotification.notification();
			break;
		case "shipped" :this.shippingNotification.notification();
		break;
		case "delievaried" :this.delieveryNotofication.notification();
		break;
		}
	}

}
