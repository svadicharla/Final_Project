package toysOnline.builder;

import java.util.Scanner;

import toysOnline.state.AmazonPayState;
import toysOnline.state.ApplePayState;
import toysOnline.state.Context;
import toysOnline.state.MainMenuStatus;
import toysOnline.state.PayPalState;



public class PaymentMenu {
	public void chooseMenu() {
		@SuppressWarnings("resource")
		Scanner usrInpt = new Scanner(System.in);
		
		System.out.println("\n\n-------------SELECT PAYMENT MENU----------------\n\n"+
		"Enter number associated with your menu selection.\n"+
		"1) PayPal \n"+
		"2) Apple Pay \n"+
		"3) AmazonPay\n");
		
		
		int menuChoice = usrInpt.nextInt();
		
		
		if(menuChoice ==1) {
			System.out.println("Payment mode is PayPal ");
			PayPalState pstate = new PayPalState();
			
			pstate.createAccount();
			pstate.confirmAccount();
			
			PaymentBuilder PayPalBuilder = new PayPalBuilder();
			Payment pay = PayPalBuilder.addFullName().addMobileNumber().addEmail().addAccountNumber().build();
			System.out.println(pay);
		}
		if(menuChoice ==2) {
			System.out.println("Payment mode is Apple Pay ");
			ApplePayState amstate = new ApplePayState();
			amstate.createAccount();
			amstate.confirmAccount();
			
			PaymentBuilder ApplePayBuilder = new ApplePayBuilder();
			Payment pay = ApplePayBuilder.addFullName().addMobileNumber().addEmail().addAccountNumber().build();
			System.out.println(pay);


			}
		
		if(menuChoice ==3) {
			System.out.println("Payment mode is Amazon Pay ");
			AmazonPayState apstate = new AmazonPayState();
			apstate.createAccount();
			apstate.confirmAccount();
			
			PaymentBuilder AmazonPayBuilder = new AmazonPayBuilder();
			Payment pay = AmazonPayBuilder.addFullName().addMobileNumber().addEmail().addAccountNumber().build();
			System.out.println(pay);

			}
		else {
			Context context = new Context();
			MainMenuStatus goHome = new MainMenuStatus();
			goHome.posStatus(context);
		}
		
		}
}
