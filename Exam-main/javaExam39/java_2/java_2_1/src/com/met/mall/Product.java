package com.met.mall;

public class Product{
	
	private int ID;
	private double CostPerUnit;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public double getCostPerUnit() {
		return CostPerUnit;
	}

	public void setCostPerUnit(double costPerUnit) {
		CostPerUnit = costPerUnit;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(CostPerUnit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ID;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (Double.doubleToLongBits(CostPerUnit) != Double.doubleToLongBits(other.CostPerUnit))
			return false;
		if (ID != other.ID)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [ID=" + ID + ", CostPerUnit=" + CostPerUnit + "]";
	}
	
	public double sellingPrice(int quantity) {
		return quantity * CostPerUnit;
		
	}
	
}
