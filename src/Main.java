
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Item itemA = new Item("A", 0.5);
		Item itemB = new Item("B", 0.6);
		Item itemC = new Item("C", 0.25);
		Item itemD = new Item("D", 1.5);
		Item itemE = new Item("E", 2);
		BuyNGetOneFree buyNGetOneFree = new BuyNGetOneFree("C", 0.75, 4);
		MultipricedItem multipricedItem = new MultipricedItem("B", 0.6, 2, 1.00);
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Select an option: ");
			System.out.println("1: Buy Items ");
			System.out.println("2: Show Offers ");
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
					System.out.println("Select an option: ");
					System.out.println("1: Buy 2 Item A for £1");
					System.out.println("2: Buy 3 Item C, get one free ");
					System.out.println("3: Buy Item D & E for £3 ");
					if (scan.hasNextInt()) {
						selectedOption = scan.nextInt();
						switch (selectedOption) {
						case 1:

							break;
						case 2:
							break;
						case 3:
							break;
						default:
							break;
						}
					} else {
						System.out.println("Invalid input ");

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

	public static HashMap<String , ClassForHashMap> buyitems(ArrayList<Item> items) {
		HashMap<String, ClassForHashMap> hashMap = new HashMap<>();
		
		return hashMap;
	}
}
