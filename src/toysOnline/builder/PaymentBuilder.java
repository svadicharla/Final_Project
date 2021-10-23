package toysOnline.builder;

import java.util.ArrayList;
import java.util.List;

public abstract class PaymentBuilder {
	String name;
	List<String> details = new ArrayList<String>();
	public abstract PaymentBuilder addFullName();
	public abstract PaymentBuilder addMobileNumber();
	public abstract PaymentBuilder addEmail();
	public abstract PaymentBuilder addAccountNumber();
	


	public Payment build() {
		Payment  payment = new Payment();
		payment.setName(this.name);
		payment.addDetails(details);
		return payment;
	}

}
