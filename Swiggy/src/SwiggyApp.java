
public class SwiggyApp {
	
	public static void main(String[] args) {
		OrderService ord = new OrderService();
		PaymentService pay = ord.PlaceOrder();
		boolean paymentstatus = pay.pay();
		NotificationService ns = new NotificationService();
		ns.notification(paymentstatus);
	}

}
