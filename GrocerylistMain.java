package grocerylist;

public class GrocerylistMain {

	public static void main(String[] args)
	{
		GroceryList2 myList = new GroceryList2();
		
		GroceryItemOrder2 item1 = new GroceryItemOrder2("peanut butter", 1, 4.50);
		GroceryItemOrder2 item2 = new GroceryItemOrder2("Donut", 6, 1.70);
		GroceryItemOrder2 item3 = new GroceryItemOrder2("Pork", 2, 9.50);
		GroceryItemOrder2 item4 = new GroceryItemOrder2("Beans", 3, 2.50);
		GroceryItemOrder2 item5 = new GroceryItemOrder2("salad", 1, 1.50);
		
		myList.add(item1);
		myList.add(item2);
		myList.add(item3);
		myList.add(item4);
		myList.add(item5);
		
		myList.displayItems();
		
		System.out.println("Total = " + "$" + myList.getTotalCost());
	}
}
