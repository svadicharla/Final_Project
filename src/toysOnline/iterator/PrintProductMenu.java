package toysOnline.iterator;

import toysOnline.LatestProducts;
import toysOnline.facade.PrintMenus;

public class PrintProductMenu implements PrintMenus{
	ProductMenu productMenu;
	LatestProducts latestProducts;
	
	public PrintProductMenu(ProductMenu productMenu) {
		this.productMenu = productMenu;
	}
	
	public void printMenu() {
		Iterator iterateProductMenu = productMenu.createIterator();
		printMenu(iterateProductMenu);
	}
	
	private void printMenu(Iterator iterator) {
		System.out.println("\n\n\n\n-------------------LATEST TOYS MENU-------------------\n\n");
		
		 
		while(iterator.hasNext()){
			  LatestProducts  latestProducts= (LatestProducts) iterator.next();
			  
			  System.out.print(latestProducts.getToyName() + "\t");
			  System.out.print(latestProducts.getMaterial()+"\t");
			  System.out.println(" $"+latestProducts.getCost()+"\n");
			
		}
		 
	}
}



