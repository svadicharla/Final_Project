package toysOnline.state;

import toysOnline.factory.MenuFactory;

public class ViewPaymentMenuState implements State {
	public void posStatus(Context context) {
		MenuFactory menuFactory = new MenuFactory();
		menuFactory.chooseMenu();
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
