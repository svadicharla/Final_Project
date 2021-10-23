package toysOnline.state;

import java.util.Scanner;

public class MainMenuStatus implements State {

	@Override
	public void posStatus(Context context) {
		// TODO Auto-generated method stub
		Scanner usrInpt = new Scanner(System.in);
		
		System.out.print("--------TOYS ONLINE STORE-----\n" + 
		"1) Unique Features Selections \n" + 
		"2) Log Out\n");
		
		System.out.print("");

		int ToytndrInpt = usrInpt.nextInt();
		
		if(ToytndrInpt ==1) {
			ViewToyMenuState viewToys = new ViewToyMenuState();
			viewToys.posStatus(context);
		}
		if(ToytndrInpt ==2) {
			ViewPaymentMenuState viewPayType = new ViewPaymentMenuState();
			viewPayType.posStatus(context);
		}
		
		else {
			System.exit(0);
		}
	context.setState(this);
	}

	@Override
	public void createAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void confirmAccount() {
		// TODO Auto-generated method stub
		
	}

	
		
	}


