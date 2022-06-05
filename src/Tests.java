

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Tests {
	Item itemA = new Item("A", 0.5);
	Item itemB = new Item("B", 0.6);
	Item itemC = new Item("C", 0.25);
	Item itemD = new Item("D", 1.5);
	Item itemE = new Item("E", 2);
	BuyNGetOneFree buyNGetOneFree = new BuyNGetOneFree("C", 0.25, 3);
	MultipricedItem multipricedItem = new MultipricedItem("B", 0.6, 2, 1);
	
	@Test 
	public void buyItemsTestCaseOne() {
		Map<String , ClassForHashMap> hashmap = new HashMap<>();
		hashmap.put("C", new ClassForHashMap(3, 0.75));
		ArrayList<Item> items  = new ArrayList<>();
		items.add(itemC);
		items.add(itemC);
		items.add(itemC);
		
		assertEquals(hashmap, Main.buyitems(items));
	}
	@Test 
	public void buyItemsTestCaseTwo() {
		Map<String , ClassForHashMap> hashmap = new HashMap<>();
		hashmap.put("C", new ClassForHashMap(1, 0.25));
		hashmap.put("A", new ClassForHashMap(2, 1.00));
		
		
		ArrayList<Item> items  = new ArrayList<>();
		items.add(itemA);
		items.add(itemA);
		items.add(itemC);
		
		assertEquals(hashmap, Main.buyitems(items));

	}
	@Test 
	public void buyItemsTestCaseThree() {
		Map<String , ClassForHashMap> hashmap = new HashMap<>();
		hashmap.put("B", new ClassForHashMap(3, 1.6));
		
		ArrayList<Item> items  = new ArrayList<>();
		items.add(itemB);
		items.add(itemB);
		items.add(itemB);
		
		assertEquals(hashmap, Main.buyitems(items));

	}
	@Test 
	public void buyItemsTestCaseFour() {
		Map<String , ClassForHashMap> hashmap = new HashMap<>();
		hashmap.put("C", new ClassForHashMap(4, 0.75));
		
		ArrayList<Item> items = new ArrayList<>();
		items.add(itemC);
		items.add(itemC);
		items.add(itemC);
		items.add(itemC);
		
		assertEquals(hashmap, Main.buyitems(items));

	}
	@Test 
	public void buyItemsTestCaseFive() {
		Map<String , ClassForHashMap> hashmap = new HashMap<>();
		hashmap.put("B", new ClassForHashMap(2, 1.00));
		hashmap.put("C", new ClassForHashMap(3, 0.75));
		
		ArrayList<Item> items  = new ArrayList<>();
		items.add(itemB);
		items.add(itemB);
		items.add(itemC);
		items.add(itemC);
		items.add(itemC);
		items.add(itemC);
		
		assertEquals(hashmap, Main.buyitems(items));

	}
	
}
