using ItemTest;
using System;
using System.Collections.Generic;

static class ShoppingCart
{

	static public double CartPrice(IList<Item> data) {
		
		double total = 0;
		
		foreach(Item ele in data){
			total = total+ele.SellingPrice();		
		}
		//Console.WriteLine(total);
		return total;
	}


	public static void Main()
	{
		IList<Item> cart = new List<Item>();
		cart.Add(new Item(1, 15000));	
		cart.Add(new Item(2, 25000));
		cart.Add(new Item(3, 35000));
		cart.Add(new Item(4, 45000));
		cart.Add(new Item(5, 55000));	
		cart.Add(new Item(6, 65000));

		foreach(Item i in cart)
			Console.WriteLine(i);

		Console.WriteLine("Displaying Cart Price and Discount::");
			
			if (CartPrice(cart) >= 50000 && CartPrice(cart)<100000){
				
				Console.WriteLine("5% Discout is applicable");
				
				double dis = (CartPrice(cart)/100)*5;
				
				Console.WriteLine(dis);
				
				
			}
			else if (CartPrice(cart)>=100000){
				Console.WriteLine("10% Discout is applicable");
				
				double dis = (CartPrice(cart)/100)*10;
				
				Console.WriteLine(dis);
				
				
			}
			else{
				Console.WriteLine("No Discout is applicable");
				
				double dis = CartPrice(cart);
				
				Console.WriteLine(dis);
				
			}
	}
}
