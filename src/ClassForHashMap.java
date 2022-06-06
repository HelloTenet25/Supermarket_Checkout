
public class ClassForHashMap {
	
	int quantity;
	double priceTotal;
	public ClassForHashMap(int quantity, double priceTotal) {
		super();
		this.quantity = quantity;
		this.priceTotal = priceTotal;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPriceTotal() {
		return priceTotal;
	}
	public void setPriceTotal(double priceTotal) {
		this.priceTotal = priceTotal;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(priceTotal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + quantity;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClassForHashMap other = (ClassForHashMap) obj;
		if (Double.doubleToLongBits(priceTotal) != Double.doubleToLongBits(other.priceTotal))
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}
	
	
}
