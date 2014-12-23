
public abstract class Vehicle implements Movable{

	//Protected so only this class, subclasses and package can access these variables
	protected String name, manufacturer;
	protected int yearOfManufacturer, noPassengers, topSpeed;
	protected static int count = 0;
	//Static so memory is allocated at compile-time
	public Vehicle(String name, String manufacturer, int yearOfManufacturer)
	{
		this.name = name;
		this.manufacturer = manufacturer;
		this.yearOfManufacturer = yearOfManufacturer;
		count++;

	}
	public abstract int getNoPassengers();
	public abstract void setNoPassengers(int noPassengers);
	public abstract int getTopSpeed();
	public abstract void setTopSpeed(int topSpeed);

	

}
