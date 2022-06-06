
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	//Items and Offers objects to use to calculate the prices
	static Item itemA = new Item("A", 0.5);
	static Item itemB = new Item("B", 0.6);
	static Item itemC = new Item("C", 0.25);
	static Item itemD = new Item("D", 1.5);
	static Item itemE = new Item("E", 2);
	static BuyNGetOneFree buyNGetOneFree = new BuyNGetOneFree("C", 0.25, 4);
	static MultipricedItem multipricedItem = new MultipricedItem("B", 0.6, 2, 1.00);
	static MealOffer mealOfferOne = new MealOffer("D", 1.5, itemE, 3);
	
	
	//arrayList to use to add the grocerry items user select while shopping
	static ArrayList<String> shoppedItems = new ArrayList<String>();

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		while (true) {
			//clearing the list to use again after the shopping
			shoppedItems.clear();
			
			
			//Main Menu print
			System.out.println("Select an option: ");
			System.out.println("1: Buy Items ");
			System.out.println("2: Buy Grocery Items ");
			System.out.println("3: Quit ");
			
			//checking if the user input is integer or not
			if (scan.hasNextInt()) {
			
				int selectedOption = scan.nextInt();

				switch (selectedOption) {
				
				case 1://Buy individual Items
					System.out.println("Select an option: ");
					System.out.println("1: Buy Item A ");
					System.out.println("2: Buy Item B ");
					System.out.println("3: Buy Item C ");
					System.out.println("4: Buy Item D ");
					System.out.println("5: Buy Item E ");
					System.out.println("6: Cancel ");
					
					if (scan.hasNextInt()) {
						selectedOption = scan.nextInt();
						switch (selectedOption) {
						case 1:
							System.out.println("Enter the quantity, you want to buy: ");
							if (scan.hasNextInt()) {
								int quantity = scan.nextInt();
								System.out.println("Your have bought " + quantity + " Item A for total of £"
										+ itemA.getPrice() * quantity);
							} else {
								System.out.println("Invalid input ");

							}
							break;
						case 2:
							System.out.println("Enter the quantity, you want to buy: ");
							if (scan.hasNextInt()) {
								int quantity = scan.nextInt();
								System.out.println("Your have bought " + quantity + " Item B for total of £"
										+ itemB.getPrice() * quantity);
							} else {
								System.out.println("Invalid input ");

							}

							break;
						case 3:
							System.out.println("Enter the quantity, you want to buy: ");
							if (scan.hasNextInt()) {
								int quantity = scan.nextInt();
								System.out.println("Your have bought " + quantity + " Item C for total of £"
										+ itemC.getPrice() * quantity);
							} else {
								System.out.println("Invalid input ");

							}

							break;
						case 4:
							System.out.println("Enter the quantity, you want to buy: ");
							if (scan.hasNextInt()) {
								int quantity = scan.nextInt();
								System.out.println("Your have bought " + quantity + " Item D for total of £"
										+ itemD.getPrice() * quantity);
							} else {
								System.out.println("Invalid input ");

							}

							break;
						case 5:
							System.out.println("Enter the quantity, you want to buy: ");
							if (scan.hasNextInt()) {
								int quantity = scan.nextInt();
								System.out.println("Your have bought " + quantity + " Item E for total of £"
										+ itemE.getPrice() * quantity);
							} else {
								System.out.println("Invalid input ");

							}

							break;
						case 6:
							System.out.println("User Cancelled");
							break;
						default:
							System.out.println("Wrong Choice");

							break;
						}
					} else {
						System.out.println("Invalid input ");

					}
					break;
				case 2://Shopping different items in one go
					outer:
					while (true) {
						
						System.out.println("Select an option: ");
						System.out.println("1: Add Item A ");
						System.out.println("2: Add Item B ");
						System.out.println("3: Add Item C ");
						System.out.println("4: Add Item D ");
						System.out.println("5: Add Item E ");
						System.out.println("6: End Shopping ");

						if (scan.hasNextInt()) {
							selectedOption = scan.nextInt();
							switch (selectedOption) {
							//adding items to the list as the user selects the items
							case 1:
								shoppedItems.add("A");
								break;
							case 2:
								shoppedItems.add("B");

								break;
							case 3:
								shoppedItems.add("C");

								break;
							case 4:
								shoppedItems.add("D");

								break;
							case 5:
								shoppedItems.add("E");
								break;
							case 6:
								break outer;
								
							}
						} else {
							System.out.println("Invalid input ");

						}
					}
					
					//checking if user has added any items or not
					if (shoppedItems.size() > 0) {
						
						
						//calling the method to calculate the prices for the shopping list
						HashMap<String, ClassForHashMap> hashMap = buyitems(shoppedItems);
						System.out.println("Your purchased items details is as follows: ");
						double totalPrice = 0;
						//printing the shopping list and prices
						for (Entry<String, ClassForHashMap> entry : hashMap.entrySet()) {
							System.out.println("Item " + entry.getKey() + ":" + "\nQuantity: "
									+ entry.getValue().getQuantity() + "\nPrice: " + entry.getValue().getPriceTotal());
							totalPrice = totalPrice + entry.getValue().getPriceTotal();
						}
						System.out.println("Total Price: " + totalPrice);
					}

					break;
				case 3:
					System.out.println("GoodBye");
					System.exit(0);
					
				default:
					System.out.println("Wrong choice");
					break;
				}
			} else {
				System.out.println("Invalid input ");

			}
		}

	}
	
	//this method checks for each item in the shopping list
	//calculates the prices for individual items and the prices if any offer is there to apply 
	public static HashMap<String, ClassForHashMap> buyitems(ArrayList<String> items) {
		HashMap<String, ClassForHashMap> hashMap = new HashMap<>();
		checkItem(items, hashMap, "A");
		checkItem(items, hashMap, "B");
		checkItem(items, hashMap, "C");
		checkItem(items, hashMap, "D");
		
		return hashMap;
	}

	
	private static void checkItem(ArrayList<String> items, HashMap<String, ClassForHashMap> hashMap, String string) {
		//taking total count of a particular item in the shopping list
		int count = Collections.frequency(items, string);
		if (count > 0) {//checking if there is any item  
			
			if (string.equals("A")) {
				// \if item is A, no offers are there for A so only individual
				//items are calculated
				
				//creating an object to save the quantity and total price of Item A
				ClassForHashMap classForHashMap = new ClassForHashMap(0, 0);
				hashMap.put(string, classForHashMap);//adding it to hashmap
				hashMap.get(string).setQuantity(count);//setting the quantity to the total count we took before

				hashMap.get(string).setPriceTotal(count * itemA.getPrice()); //setting the price by taking product of quantity and unit price

			} else if (string.equals("B")) {
				
				ClassForHashMap classForHashMap = new ClassForHashMap(0, 0);
				hashMap.put(string, classForHashMap);
				//if count is greater than 1 then offer applies for item B
				if (count > 1) {
					//checking if the items are in even number or odd
					if (count % 2 == 0) {
						//if even, items can be divided in pairs and the offer can be applied easily
						int pairs = count / 2;
						hashMap.get(string).setQuantity(count);

						hashMap.get(string).setPriceTotal(pairs * multipricedItem.getDiscountedPrice());
					//if the item number is odd
					} else {
						//first diving the item number by 2, we get an int, which denotes pairs, after that only one item
						//will be there to calculate as an individual item
						
						int pairs = count / 2;
						hashMap.get(string).setQuantity(count);
						//total price is calculated by adding the offers and one individual items price
						hashMap.get(string).setPriceTotal((pairs * multipricedItem.getDiscountedPrice()) + 0.6);

					}
				} else {//if only item is there of this particular name
					hashMap.get(string).setQuantity(count);

					hashMap.get(string).setPriceTotal(count * itemB.getPrice());

				}
			} else if (string.equals("C")) {
				ClassForHashMap classForHashMap = new ClassForHashMap(0, 0);
				hashMap.put(string, classForHashMap);
				//checking if count is greater than 3 or not
				//offer applies at 4
				if (count > 3) {
					//if count is the multiple of 4, offer can be applied easily
					if (count % 4 == 0) {
						int pairs = count / 4;
						hashMap.get(string).setQuantity(count);

						hashMap.get(string)
								.setPriceTotal(pairs * buyNGetOneFree.getPrice() - (pairs * itemC.getPrice()));
						
					} else {//if count is not multiple of 4
						int pairs = count / 4;//divide the count in pairs of 4
						int difference = count - (pairs * 4);//find the remaining items other than pairs

						hashMap.get(string).setQuantity(count);
						//total price is calculated by adding pairs price and the product of difference and unit price
						hashMap.get(string).setPriceTotal((pairs * buyNGetOneFree.getPrice())
								- (pairs * itemC.getPrice()) + (difference * itemC.getPrice()));

					}
				} else {
					hashMap.get(string).setQuantity(count);

					hashMap.get(string).setPriceTotal(count * itemC.getPrice());

				}
				//this part calculates the item D and E
			} else if (string.equals("D")) {
				//takes count of item E
				int countE = Collections.frequency(items, "E");
				if (countE != 0) {//if count is greater than 0
					//add an entry for in the hashmap for D & E offer 
					ClassForHashMap classForHashMapBoth = new ClassForHashMap(0, 0);
					String stringBoth = "DE";
					hashMap.put(stringBoth, classForHashMapBoth);

					if (count > countE) {//if item D is greater then item E in number
						//only add individual item if there is a difference in number of both D & E
						//otherwise only DE item is added to hashmap
						ClassForHashMap classForHashMap = new ClassForHashMap(0, 0);
						hashMap.put(string, classForHashMap);
						//take difference between both items number
						int difference = count - countE;
						//add offers prices and quanity to hashmap
						hashMap.get(stringBoth).setQuantity(countE);
						hashMap.get(stringBoth).setPriceTotal(countE * mealOfferOne.getDiscountedPrice());
						//add individual item after offers
						hashMap.get(string).setQuantity(difference);
						hashMap.get(string).setPriceTotal(difference * itemD.getPrice());
						//if item E is greater in number then item D
					} else if (countE > count) {
						String stringE = "E";
						ClassForHashMap classForHashMap = new ClassForHashMap(0, 0);
						hashMap.put(stringE, classForHashMap);

						int difference = countE - count;
						hashMap.get(stringBoth).setQuantity(count);
						hashMap.get(stringBoth).setPriceTotal(count * mealOfferOne.getDiscountedPrice());
						hashMap.get(stringE).setQuantity(difference);
						hashMap.get(stringE).setPriceTotal(difference * itemE.getPrice());

					} else {//if botha re equal in number
						hashMap.get(stringBoth).setQuantity(count);
						hashMap.get(stringBoth).setPriceTotal(count * mealOfferOne.getDiscountedPrice());

					}

				} else {
					hashMap.get(string).setQuantity(count);
					hashMap.get(string).setPriceTotal(count * itemD.getPrice());
				}

			} 
		
		}
		else {//this part is there if item D is zero but there are item E present.
			if (string.equals("D")) {
				//takes count of item E
				
				int countE = Collections.frequency(items, "E");
				if (countE != 0) {//if count is greater than 0
					String stringE = "E";
					ClassForHashMap classForHashMap = new ClassForHashMap(0, 0);
					hashMap.put(stringE, classForHashMap);

					hashMap.get(stringE).setQuantity(countE);
					hashMap.get(stringE).setPriceTotal(countE * itemE.getPrice());
				

				} 

			} 
		}
	}
}
