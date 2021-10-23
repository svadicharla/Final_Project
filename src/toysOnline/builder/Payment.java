package toysOnline.builder;

import java.util.List;

public class Payment {
	String name;
	List<String> details ;
	public void addDetails(List<String> details) {
		this.details = details;
		
	}
	
		
	public void setName(String name ) {
		this.name = name;
	}
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("----" + this.name + "-----");
		for(String detail: details) {
			display.append( detail + "\n");
		}
		return display.toString();
	}

}
