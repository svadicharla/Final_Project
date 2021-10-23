package toysOnline.factory;

import java.util.Scanner;

import toysOnline.builder.PaymentMenu;
import toysOnline.iterator.PrintProductMenu;
import toysOnline.iterator.ProductMenu;
import toysOnline.state.Context;
import toysOnline.state.MainMenuStatus;

public class MenuFactory {
	public void chooseMenu() {
		Scanner usrInpt = new Scanner(System.in);
		
		System.out.println("\n\n-------------SELECT MENU----------------\n\n"+
		"Enter number associated with your menu selection.\n"+
		"1) Latest Products Menu\n"+
		"2) Payment Types Menu\n"+
		"3) Home Screen" );
		
		
		int menuChoice = usrInpt.nextInt();
		
		
		if(menuChoice ==1) {
			ProductMenu productmenu = new ProductMenu();
			PrintProductMenu prntpmnu = new PrintProductMenu(productmenu);
			
			prntpmnu.printMenu();
		}
		if(menuChoice ==2) {
			PaymentMenu paymentmenu = new PaymentMenu();
			paymentmenu.chooseMenu();
			
		}
		else {
			Context context = new Context();
			MainMenuStatus goHome = new MainMenuStatus();
			goHome.posStatus(context);
		}
		
		
		
		
		Context context = new Context();
		
		
	}
}



