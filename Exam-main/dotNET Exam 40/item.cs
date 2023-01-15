using System;

namespace ItemTest
{

public class Item 
{
	public int Id {get; set;}

	public int CostPerUnit {get; set;}

	public Item(int i, int c)
	{
		Id = i;
		CostPerUnit = c;
	}

	public double SellingPrice()
	{
		return CostPerUnit + (0.10 * CostPerUnit);
	}

	public override string ToString()
	{
		return $"Product Id is: {Id} CostPerUnit is: {CostPerUnit} Selling Price is: {SellingPrice()}";
	}

}

}