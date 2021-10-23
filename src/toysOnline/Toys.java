package toysOnline;

public abstract class Toys {
		String ToyName;
		double cost;
		String description;
		public String getToyName() {
			return ToyName;
		}
		public void setToyName(String toyName) {
			ToyName = toyName;
		}
		
		public double getCost() {
			return cost;
		}
		public void setCost(double cost) {
			this.cost = cost;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		

		
	}
