import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class InventoryManagementSystem {
	public static void main(String[] args) {
		System.out.println("\t\t\t----$Welcome to Store!!$-----\n");
		Shopping();
	}

	public static int[] quantity_rate(int a, int b) {
		int[] c = { a, b };
		return c;
	}

	public static void Shopping() {
		int sum = 0;
		Map<String, int[]> Stationarys = new HashMap<String, int[]>();
		Scanner s = new Scanner(System.in);
		Item item = null;
		Integer no_of_quantity = 0;
		String Option = null;
		Stationarys.put("pen", quantity_rate(5, 10));
		Stationarys.put("pencil", quantity_rate(3, 5));
		Stationarys.put("notebook", quantity_rate(10, 20));

		String selection;
		if (Stationarys.isEmpty()) {
			System.out.println("Sorry! left out is: ");

		} else if (Stationarys.size() > 0) {
			System.out.println("Hurry! Stock avail!!!\n");
			System.out.println("List of products:\n");
			for (Map.Entry<String, int[]> e : Stationarys.entrySet()) {
				System.out.print(e.getKey() + " ");
				int[] k = e.getValue();
				System.out.println("quantity: " + k[0] + " price: " + k[1]);
			}
			System.out.println("\nSelect your order!");
		}

		do {
			System.out.print("\nproduct");
			Option = s.next();

			if (Stationarys.containsKey(Option.toLowerCase())) {
				System.out.print("quantity:");
				no_of_quantity = s.nextInt();

				int[] quant = Stationarys.get(Option);
				int Has_list = quant[0];
				int rate = quant[1];
				if (no_of_quantity <= Has_list) {
					Stationarys.put(Option, quantity_rate((Has_list - no_of_quantity), rate));
					sum += (no_of_quantity * rate);
				} else if (no_of_quantity > Has_list) {
					String Stock= ((Has_list == 0)?"Out of stock":("Sorry! It has only:" + Has_list+ " in Stock"));
						
					System.out.println(Stock);
				}

			} else {
				System.out.print("Invalid Entry \n");
			}

			System.out.println("\nDo you want to continue shopping \n yes  no");
			selection = s.next();
			// ItemCart.put(Option, no_of_quantity);
		} while (selection.equals("yes"));
		if (selection.equals("no")) {
			System.out.println("Thank you for shopping\n");
		}
		System.out.println("Your total bill amount: " + sum);
	}

}
