import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Invent {
	public static void main(String[] args) {
		System.out.println("----$Welcome to Store!!$-----");
		Shopping();
		}
	public static int[] quantity_rate(int a, int b) {
		int[] c = { a, b };
		return c;
	}
	public static void Shopping() {
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
			System.out.println("Hurry! Stock avail!!!");
			System.out.println("List of products:");
			for (Map.Entry<String, int[]> e : Stationarys.entrySet()) {

				System.out.println(e.getKey() + "hh " + e.getValue());
				int[] k = e.getValue();}
			System.out.println("Select your order!");
		}
		do {
			System.out.print("product");
			Option = s.next();

			if (Stationarys.containsKey(Option.toLowerCase())) {
				System.out.print("quantity:");
				no_of_quantity = s.nextInt();
				int[] quant = Stationarys.get(Option);
				int Has_list = quant[0];
				int rate = quant[1];
				if (no_of_quantity <= Has_list) {
					Stationarys.put(Option, quantity_rate((Has_list - no_of_quantity), rate));
				} else if (no_of_quantity > Has_list) {
					if (Has_list == 0)
						System.out.println("Out of stock");
					System.out.println("Sorry! It has only:" + Has_list);
				}

			} else {
				System.out.print("Invalid Entry");
			}

			System.out.println("Do you want to continue shopping /n yes /n no");
			selection = s.next();
			// ItemCart.put(Option, no_of_quantity);
		} while (selection.equals("yes"));
		if (selection.equals("no")) {
			System.out.println("Thank you for shopping");
		}
		
	}

}
