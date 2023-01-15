import java.util.*;

class Item{

	private int ID;
	private int CostPerUnit; 
	private int Qty;

	public Item(int id,int cpu, int Q){
		ID=id;
		CostPerUnit=cpu;
		Qty=Q;
	} 
	
	public int getId(){return ID;}
	public void setId(int value){ID=value;}

	public int getCostPerUnit(){return CostPerUnit;}
	public void setCostPerUnit(int value){CostPerUnit=value;}

	public int getQty(){return Qty;}
	public void setQty(int value){Qty=value;}
	
	public double sellingprice(){
		return CostPerUnit * Qty;
	}
	public String toString(){
		return String.format("%d %d %d",ID,CostPerUnit,Qty);
	}

	
}






