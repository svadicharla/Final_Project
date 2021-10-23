package toysOnline.builder;

public class AmazonPayBuilder extends PaymentBuilder {
	public AmazonPayBuilder() {
		this.name = "add details to the AmazonPay account";
	}

	@Override

	public PaymentBuilder addFullName() {
		
		this.details.add("1. Add your Full Name");
		return this;
	}

	@Override
	public PaymentBuilder addMobileNumber() {
		this.details.add("2. Add your Mobile Number");
		return this;
	}

	@Override
	public PaymentBuilder addEmail() {
		this.details.add("3. Add your Email address");
		return this;
	}

	@Override
	public PaymentBuilder addAccountNumber() {
		this.details.add("4. Add your Account Number");
		return this;
	}

	
}
