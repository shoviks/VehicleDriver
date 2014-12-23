
public class Automobile extends Vehicle {
	
	private int horsepower;//Private so only this class can access this variable
	
	public Automobile(String name, String manufacturer, int yearOfManufacturer, int horsepower)
	{
		super (name, manufacturer, yearOfManufacturer);
		this.horsepower = horsepower;
		
	}
	public int getHorsepower()
	{
		return horsepower;
	}
	public void setHorsepower(int horsepower)
	{
		this.horsepower = horsepower;
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
		return "Type: Automobile" + "\nName: " + name + "\nManufacturer: " + manufacturer + "\nManufacture year: " + yearOfManufacturer + 
				"\nEngine power: " + horsepower + " hp" + "\nNumber of passengers: " + noPassengers + "\nTop speed: " + topSpeed + " mph";
						
	}
}
