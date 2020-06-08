package anuj_array_geeksforgeeks;

import java.util.ArrayList;

class Interval {
	int buy;
	int sell;
}

public class StockBuySell {

	public static void stockBuySell(int[] price, int n) {

		ArrayList<Interval> arrayList = new ArrayList<>();
		int count = 0;
		int i = 0;
		while (i < n - 1) {
			while ((i < n - 1) && price[i + 1] >= price[i])
				i++;

			System.out.println(i);
			if (i == n - 1)
				break;

			Interval e = new Interval();
			e.buy = i++;

			while ((i < n - 1) && price[i] >= price[i + 1])
				i++;

			System.out.println(i);

			e.sell = i - 1;
			arrayList.add(e);
			count++;

			if (count == 0)
				System.out.println("There is no day when buying the stock " + "will make profit");
			else
				for (int j = 0; j < count; j++)
					System.out
							.println("Buy on day: " + arrayList.get(j).buy + "        " + "Sell on day : " + arrayList.get(j).sell);

			return;
		}

	}

	public static void main(String[] args) {

		int[] price = { 100, 180, 260, 310, 40, 535, 695 };
		int n = price.length;
		stockBuySell(price, n);
	}
}
