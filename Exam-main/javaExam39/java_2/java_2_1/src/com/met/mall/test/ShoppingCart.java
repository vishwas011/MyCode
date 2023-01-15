package com.met.mall.test;

import com.met.mall.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {
	
	public static void main(String args) {
		List<Product> cart = new ArrayList<>();
		int ch = 0;
		while(ch !=4 ){
			System.out.println("1.Add Product\n"
								+ "2.Delete product\n"
								+ "3.View Cart Price\n"
								+ "4.Exit");
			ch = new Scanner(System.in).nextInt();
			
			switch(ch){
				case 1:	cart.add(new Product());
						System.out.println("Product Added");
						break;
				default:System.out.println("Invalid input !");
			
			}
			
		}
	}
	
}
