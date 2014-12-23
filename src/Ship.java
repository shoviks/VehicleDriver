
public class Ship extends Vehicle implements Floatable {

private String shippingLineOwner;
private int tonnage;
//Private so only this class can access these variables
	public Ship(String name, String manufacturer, int yearOfManufacturer, String shippingLineOwner)
	{
		super (name, manufacturer, yearOfManufacturer);
		this.shippingLineOwner = shippingLineOwner;
		
	}
	public String getShippingLineOwner()
	{
		return shippingLineOwner;
	}
	public void setShippingLineOwner(String shippingLineOwner)
	{
		this.shippingLineOwner = shippingLineOwner;
	}
	public int getTonnage()
	{
		return tonnage;
	}
	public void setTonnage(int tonnage)
	{
		this.tonnage = tonnage;
	}
	public int getNoPassengers()
	{
		return noPassengers;
	}
	public void setNoPassengers(int noPassengers)
	{
		this.noPassengers = noPassengers;
	}
	public int getTopSpeed()
	{
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed)
	{
		this.topSpeed = topSpeed; 
	}
	public String toString()
	{
		return "Type: Ship" + "\nName: " + name + "\nManufacturer: " + manufacturer + "\nManufacture year: " + yearOfManufacturer + 
				"\nTonnage: " + tonnage + " t" + "\nOwner: " + shippingLineOwner + " \nNumber of passengers: " + noPassengers + "\nTop speed: " + topSpeed + " mph";
						
	}
	
}
