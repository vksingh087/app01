package app01;

public class Invantry {

	String itemId;
	float unitItemPrice;
	int itemCount;
	
	public Invantry()
	{
		itemId="";
		unitItemPrice=0.0f;
		itemCount=0;
	}
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	
	public void setUnitItemPrice(float unitItemPrice) {
		this.unitItemPrice = unitItemPrice;
	}
	
	public String toString()
	{
		return "ITEM: "+itemId+" - "+unitItemPrice+" - "+itemCount;
	}
	public static void main(String[] args) {
	
		Invantry items[]=new Invantry[3];
		for(int i=0;i<items.length;i++)
		{
			items[i]=new Invantry();
		}
		
	    for(int i=0;i<items.length;i++)
	    {
	    	items[i].setUnitItemPrice(75.15f);
	    }
	    for(int i=0;i<items.length;i++)
	    {
	    	System.out.println(items[i]);
	    }
	}

}
