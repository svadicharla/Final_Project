package toysOnline.state;

public class AmazonPayState implements PayState{
	
	@Override
	public void posStatus(Context context) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void createAccount() {
		System.out.println("create a AmazonPay account before you add your details");
	}

	@Override
	public void confirmAccount() {
		System.out.println("confirm your account details");
	}
	public String toString() {
		return " AmazonPay ";
	}
	
	

}
