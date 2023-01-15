package com.met.emp;


	public class Employee implements Comparable<Employee>{
	    private int id = -1;
	    private String firstName = null;
	    private float salary ;
	    private int age = -1;
	 
	    public Employee(int id, String fName, float sal, int age) {
	        this.id = id;
	        this.firstName = fName;
	        this.salary = sal;
	        this.age = age;
	    }
	 
	    // Setters and Getters
	    @Override
	    public int compareTo(Employee o) {
	        return this.id - o.id;
	    }
	 
	    @Override
	    public String toString() {
	        return "Employee : " + id + " - " + firstName + " - " + salary
	        + " - " + age + "n";
	    }
	}