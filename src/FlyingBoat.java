
public class FlyingBoat extends Vehicle implements Floatable, Flyable {
	
	private int tonnage, numOfEngines, maxAltitude, maxRange;
	//Private so only this class can access these variables
	
	public FlyingBoat (String name, String manufacturer, int yearOfManufacturer, int numOfEngines)
	{
		super(name, manufacturer, yearOfManufacturer);
		this.numOfEngines = numOfEngines;
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
	public int getMaxAltitude()
	{
		return maxAltitude;
	}
	public void setMaxAltitude(int maxAltitude)
	{
		this.maxAltitude = maxAltitude;
	}
	public int getMaxRange()
	{
		return maxRange;
	}
	public void setMaxRange(int maxRange)
	{
		this.maxRange = maxRange;
	}
	public int getNumOfEngines()
	{
		return numOfEngines;
	}
	public void setNumOfEngines(int numOfEngines)
	{
		this.numOfEngines = numOfEngines;
	}
	public String toString()
	{
		return "Type: FlyingBoat" + "\nName: " + name + "\nManufacturer: " + manufacturer + "\nManufacture year: " + yearOfManufacturer + 
				"\nNumber of engines: " + numOfEngines + "\nMax altitude: " + maxAltitude + " ft" + "\nMax range: " + maxRange + " mi" +
				"\nTonnage: " + tonnage + " t" + "\nNumber of passengers: " + noPassengers + "\nTop speed: " + topSpeed + " mph";
						
	}
	


}
