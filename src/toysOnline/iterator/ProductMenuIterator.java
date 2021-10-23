package toysOnline.iterator;

import toysOnline.LatestProducts;

public class ProductMenuIterator implements Iterator {
	LatestProducts[] productMenu;
	int position;
	
	public ProductMenuIterator(LatestProducts[] productMenu) {
		this.productMenu = productMenu;
	}
	
	@Override
	public boolean hasNext() {
		if(position > productMenu.length || productMenu[position] == null) {
			return false;
		}
		else return true;
	}

	@Override
	public LatestProducts next() {
		
		LatestProducts productMenuPos = (LatestProducts) productMenu[position];
		position = position +1;
		
		return productMenuPos;
	}

}
