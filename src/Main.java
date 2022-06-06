
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static Item itemA = new Item("A", 0.5);
	static Item itemB = new Item("B", 0.6);
	static Item itemC = new Item("C", 0.25);
	static Item itemD = new Item("D", 1.5);
	static Item itemE = new Item("E", 2);
	static BuyNGetOneFree buyNGetOneFree = new BuyNGetOneFree("C", 0.75, 4);
	static MultipricedItem multipricedItem = new MultipricedItem("B", 0.6, 2, 1.00);
	static MealOffer mealOfferOne = new MealOffer("D", 1.5, itemE, 3);
	static ArrayList<String> shoppedItems = new ArrayList<String>();
	static ArrayList<Item> offers = new ArrayList<Item>();

	public static void main(String[] args) {

		offers.add(mealOfferOne);
		offers.add(buyNGetOneFree);
		offers.add(multipricedItem);
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Select an option: ");
			System.out.println("1: Buy Items ");
			System.out.println("2: Buy Grocery Items ");
			System.out.println("3: Quit ");
			if (scan.hasNextInt()) {
				int selectedOption = scan.nextInt();

				switch (selectedOption) {
				case 1:
					System.out.println("Select an option: ");
					System.out.println("1: Buy Item A ");
					System.out.println("2: Buy Item B ");
					System.out.println("3: Buy Item C ");
					System.out.println("4: Buy Item D ");
					System.out.println("5: Buy Item E ");
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
						default:
							System.out.println("Wrong Choice");

							break;
						}
					} else {
						System.out.println("Invalid input ");

					}
					break;
				case 2:
					
					while(scan.nextInt() != 6) {
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
						default:
							System.out.println("Wrong choice");

							break;
						}
					} else {
						System.out.println("Invalid input ");

					}
					}

					break;
				default:
					break;
				}
			} else {
				System.out.println("Invalid input ");

			}
		}

	}

	public static HashMap<String, ClassForHashMap> buyitems(ArrayList<String> items) {
		HashMap<String, ClassForHashMap> hashMap = new HashMap<>();
		checkItem(items, hashMap, "A");
		checkItem(items, hashMap, "B");
		checkItem(items, hashMap, "C");
		checkItem(items, hashMap, "D");
		checkItem(items, hashMap, "E");

		return hashMap;
	}

	private static void checkItem(ArrayList<String> items, HashMap<String, ClassForHashMap> hashMap, String string) {
		int count = Collections.frequency(items, string);
		if (count > 0) {
			if (string.equals("A")) {

				ClassForHashMap classForHashMap = new ClassForHashMap(0, 0);
				hashMap.put(string, classForHashMap);
				hashMap.get(string).setQuantity(count);
				
				hashMap.get(string).setPriceTotal(count * itemA.getPrice());
		
			} else if (string.equals("B")) {
				ClassForHashMap classForHashMap = new ClassForHashMap(0, 0);
				hashMap.put(string, classForHashMap);
				if (count > 1) {
					if(count % 2 == 0) {
						int pairs = count / 2;
						hashMap.get(string).setQuantity(count);
						
						hashMap.get(string).setPriceTotal(pairs * multipricedItem.getDiscountedPrice());
						
					}
					else {
						int pairs = count / 2;
						hashMap.get(string).setQuantity(count);
						
						hashMap.get(string).setPriceTotal((pairs * multipricedItem.getDiscountedPrice()) + 0.6);
						
						
					}
				} else {
					hashMap.get(string).setQuantity(count);
					
					hashMap.get(string).setPriceTotal(count * itemB.getPrice());
				
				}
			} else if (string.equals("C")) {

			} else if (string.equals("D")) {

			} else if (string.equals("E")) {

			}
		}
	}
}
