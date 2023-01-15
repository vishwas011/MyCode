
import java.util.*;
class Shopping{
	
	
	private static int id;
	private static double c;
	private static int q;
	private static int items;
	
	
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("---------------------------------------------");
	System.out.print("Enter Number of Items:");
	items=sc.nextInt();
	System.out.println("--------------------------------");
	//System.out.print("Enter Id ,cost per unit and Quantity:");
	
	List <Item> i=new ArrayList<>();
	for(int a=0;a<items;a++){
	
	System.out.print("Enter Id ,cost per unit and Quantity:");
	 id=sc.nextInt();
	 c=sc.nextDouble();
	 q=sc.nextInt();
	 i.add(new Item(id,c,q));
	}
	System.out.println("--------------------------------");
	System.out.println("Enter position which you want to remove");
	int x=sc.nextInt();
	System.out.println(i.remove(x));
	
        i.add(new Item(101,100,10));
	i.add(new Item(102,200,12));
	i.add(new Item(103,300,14));
	i.add(new Item(104,400,16));
	i.add(new Item(105,500,18));
	System.out.println("Enter position which you want to remove");
	int x=sc.nextInt();
	
	//System.out.printf("Third Item = %s%n", i.get(x));
	//i.remove(x);
	System.out.println("--------------------------------");
	System.out.println("Items in the carts");
	for(Item p: i)
		System.out.println(p);
	System.out.println("--------------------------------");
	System.out.println("Total price of cart's items:  ");
	
	int result=0;

	for(int a=0;a< items;a++){
	
	result+=cartprice();
	//
	}
	System.out.println(result);
	System.out.println("--------------------------------");
	} 
	//System.out.println("..............................");
	//System.out.print(i.get(2));
	
	public static double cartprice(){
	
	double price=0;
	//for(int a=0;a<=items;a++){
	price+=q*c;
	if(price>50000)
		return price*0.05;
	else if(price>100000)
		return price*0.10;
	else
		return price;


	

	}
	 
	//double res=cartprice();
		
	//System.out.printf("%f",res);	
	
		
	
	
	
	

	
}












//package com.arun.collection;
import java.util.*;
class Shopping{
	
	
	private static int id;
	private static double c;
	private static int q;
	private static int items;
	
	
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("---------------------------------------------");
	System.out.print("Enter Number of Items:");
	items=sc.nextInt();
	System.out.println("--------------------------------");
	//System.out.print("Enter Id ,cost per unit and Quantity:");
	
	List <Item> i=new ArrayList<>();
	for(int a=0;a<items;a++){
	
	System.out.print("Enter Id ,cost per unit and Quantity:");
	 id=sc.nextInt();
	 c=sc.nextDouble();
	 q=sc.nextInt();
	 i.add(new Item(id,c,q));
	}
	System.out.println("--------------------------------");
	System.out.println("Enter position which you want to remove");
	int x=sc.nextInt();
	System.out.println(i.remove(x));
	
	/*i.add(new Item(101,100,10));
	i.add(new Item(102,200,12));
	i.add(new Item(103,300,14));
	i.add(new Item(104,400,16));
	i.add(new Item(105,500,18));
	System.out.println("Enter position which you want to remove");
	int x=sc.nextInt();
	*/
	//System.out.printf("Third Item = %s%n", i.get(x));
	//i.remove(x);
	System.out.println("--------------------------------");
	System.out.println("Items in the carts");
	for(Item p: i)
		System.out.println(p);
	System.out.println("--------------------------------");
	System.out.println("Total price of cart's items:  ");
	
	int result=0;

	for(int a=0;a< items;a++){
	
	result+=cartprice();
	//
	}
	System.out.println(result);
	System.out.println("--------------------------------");
	} 
	//System.out.println("..............................");
	//System.out.print(i.get(2));
	
	public static double cartprice(){
	
	double price=0;
	//for(int a=0;a<=items;a++){
	price+=q*c;
	if(price>50000)
		return price*0.05;
	else if(price>100000)
		return price*0.10;
	else
		return price;


	

	}
	 
	//double res=cartprice();
		
	//System.out.printf("%f",res);	
	
		
	
	
	
	

	
}












//package com.arun.collection;
import java.util.*;
class Shopping{
	
	
	private static int id;
	private static double c;
	private static int q;
	private static int items;
	
	
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("---------------------------------------------");
	System.out.print("Enter Number of Items:");
	items=sc.nextInt();
	System.out.println("--------------------------------");
	//System.out.print("Enter Id ,cost per unit and Quantity:");
	
	List <Item> i=new ArrayList<>();
	for(int a=0;a<items;a++){
	
	System.out.print("Enter Id ,cost per unit and Quantity:");
	 id=sc.nextInt();
	 c=sc.nextDouble();
	 q=sc.nextInt();
	 i.add(new Item(id,c,q));
	}
	System.out.println("--------------------------------");
	System.out.println("Enter position which you want to remove");
	int x=sc.nextInt();
	System.out.println(i.remove(x));
	
	/*i.add(new Item(101,100,10));
	i.add(new Item(102,200,12));
	i.add(new Item(103,300,14));
	i.add(new Item(104,400,16));
	i.add(new Item(105,500,18));
	System.out.println("Enter position which you want to remove");
	int x=sc.nextInt();
	*/
	//System.out.printf("Third Item = %s%n", i.get(x));
	//i.remove(x);
	System.out.println("--------------------------------");
	System.out.println("Items in the carts");
	for(Item p: i)
		System.out.println(p);
	System.out.println("--------------------------------");
	System.out.println("Total price of cart's items:  ");
	
	int result=0;

	for(int a=0;a< items;a++){
	
	result+=cartprice();
	//
	}
	System.out.println(result);
	System.out.println("--------------------------------");
	} 
	//System.out.println("..............................");
	//System.out.print(i.get(2));
	
	public static double cartprice(){
	
	double price=0;
	//for(int a=0;a<=items;a++){
	price+=q*c;
	if(price>50000)
		return price*0.05;
	else if(price>100000)
		return price*0.10;
	else
		return price;


	

	}
	 
	//double res=cartprice();
		
	//System.out.printf("%f",res);	
	
		
	
	
	
	

	
}
