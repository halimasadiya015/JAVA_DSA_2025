package abstraction;

abstract class Payment{
	abstract void pay(int amount);
	void showPaymentGateway() {
		System.out.println("using secure Payment Gateway");
	}
}
class CreditCardPayment extends Payment{
	void pay(int amount) {
	System.out.println("paid"+amount+"using CreditCard");
	}g 
}
class UPIPayment extends Payment{
	void pay(int amount) {
	System.out.println("paid"+amount+"using UPI");
	}
}
class CashPayment extends Payment{
	void pay(int amount) {
		System.out.println("paid"+amount+"in cash");
	}
}
public class AbstractionExample{
	public static void main(String[] args) {
		Payment p1=new CreditCardPayment();
		Payment p2=new UPIPayment();
		Payment p3=new CashPayment();
		
		p1.showPaymentGateway();
		p1.pay(500);
		
		p2.showPaymentGateway();
		p2.pay(1000);
		
		p3.showPaymentGateway();
		p3.pay(1500);
}
}
