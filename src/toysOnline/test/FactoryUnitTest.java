package toysOnline.test;

import toysOnline.*;
import toysOnline.factory.MenuFactory;
import toysOnline.state.Context;
public class FactoryUnitTest {
	public static void main(String[] args) {
		Context context = new Context();
		MenuFactory testFactory = new MenuFactory();
		testFactory.chooseMenu();

}
}
