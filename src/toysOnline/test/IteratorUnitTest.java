package toysOnline.test;

import toysOnline.*;
import toysOnline.iterator.Iterator;
import toysOnline.iterator.ProductMenu;


public class IteratorUnitTest {
	public static void main(String[] args) {
		ProductMenu productMenu = new ProductMenu();
		Iterator iterator = productMenu.createIterator();
		if(iterator.hasNext()) {
			System.out.println("Valid Test has next Item");
		}
		else {
			System.err.println("Invalid Call to iterator hasNext");
		}
	}

}
