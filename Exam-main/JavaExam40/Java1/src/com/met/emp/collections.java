package com.met.emp;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
public class collections 
{	    public static void main(String args[]){
				   ArrayList<String> arraylist = new ArrayList<String>();
				   arraylist.add("Neha");
				   arraylist.add("Sharayu");
				   arraylist.add("Dipti");
				   arraylist.add("Nitin");
				   /* ArrayList before the sorting*/
				   System.out.println("Before Sorting:");
				   for(String counter: arraylist){
						System.out.println(counter);
					}

				   /* Sorting of arraylist using Collections.sort*/
				   Collections.sort(arraylist);

				   /* ArrayList after sorting*/
				   System.out.println("After Sorting:");
				   for(String counter: arraylist){
						System.out.println(counter);
					}
				}
			}