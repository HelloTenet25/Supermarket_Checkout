
public class MealOffer extends Item{
	Item pairedItem;
	double discountedPrice;
	public MealOffer(String name, double price, Item pairedItem, double discountedPrice) {
		super(name, price);
		this.pairedItem = pairedItem;
		this.discountedPrice = discountedPrice;
	}
	public Item getPairedItem() {
		return pairedItem;
	}
	public void setPairedItem(Item pairedItem) {
		this.pairedItem = pairedItem;
	}
	public double getDiscountedPrice() {
		return discountedPrice;
	}
	public void setDiscountedPrice(double discountedPrice) {
		this.discountedPrice = discountedPrice;
	}
	
	
	

}
