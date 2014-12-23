import java.util.Scanner;
public class VehicleDriver {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Vehicle[] garage = new Vehicle[15];
		garage[0] = new Automobile("Galant", "Mitsubishi", 2002, 145);
		garage[0].setNoPassengers(4);
		garage[0].setTopSpeed(120);
		
		garage[1] = new Automobile("Edge", "Ford", 2006, 250);
		garage[1].setNoPassengers(4);
		garage[1].setTopSpeed(160);
		
		garage[2] = new Automobile("S60", "Volvo", 2002, 247);
		garage[2].setNoPassengers(4);
		garage[2].setTopSpeed(140);
		
		Airplane plane1 = new Airplane("Concorde", "British Aircraft Corporation", 2000, 6);
		plane1.setMaxAltitude(60000);
		plane1.setMaxRange(4500);
		garage[3] = plane1;
		garage[3].setNoPassengers(100);
		garage[3].setTopSpeed(1354);
		
		Airplane plane2 = new Airplane("B-52", "Boeing", 2003, 8);
		plane2.setMaxAltitude(50000);
		plane2.setMaxRange(10145);
		garage[4] = plane2;
		garage[4].setNoPassengers(5);
		garage[4].setTopSpeed(650);
		
		Airplane plane3 = new Airplane("A380", "Airbus", 2007, 8);
		plane3.setMaxAltitude(40000);
		plane3.setMaxRange(9600);
		garage[5] = plane3;
		garage[5].setNoPassengers(525);
		garage[5].setTopSpeed(587);
		
		Ship boat1 = new Ship("Amerigo Vespucci", "Italian Navy Engineering Corps", 1931, "A.F. Meyer & Associates");
		boat1.setTonnage(4146);
		garage[6] = boat1;
		garage[6].setNoPassengers(450);
		garage[6].setTopSpeed(22);
		
		Ship boat2 = new Ship("Colombo Express", "Hyundai Heavy Industries", 2005, "Hapag-Lloyd");
		boat2.setTonnage(93750);
		garage[7] = boat2;
		garage[7].setNoPassengers(15);
		garage[7].setTopSpeed(23);
		
		Ship boat3 = new Ship("SS John W. Brown", "Bethlehem-Fairfield Ship Yards Inc. ", 1942, "States Marine Corporation");
		boat3.setTonnage(10920);
		garage[8] = boat3;
		garage[8].setNoPassengers(97);
		garage[8].setTopSpeed(13);
		
		FlyingBoat seaplane1 = new FlyingBoat("Fabre Hydravion", "Henri Fabre", 1910, 1);
		seaplane1.setTonnage(200);
		seaplane1.setMaxAltitude(20000);
		seaplane1.setMaxRange(3400);
		garage[9] = seaplane1;
		garage[9].setNoPassengers(1);
		garage[9].setTopSpeed(55);
		
		FlyingBoat seaplane2 = new FlyingBoat("Curtiss NC", "Curtiss Aeroplane and Motor Company", 1918, 3);
		seaplane2.setTonnage(650);
		seaplane2.setMaxAltitude(35000);
		seaplane2.setMaxRange(4600);
		garage[10] = seaplane2;
		garage[10].setNoPassengers(6);
		garage[10].setTopSpeed(90);
		
		FlyingBoat seaplane3 = new FlyingBoat("US-2", "ShinMaywa", 2003, 6);
		seaplane3.setTonnage(1230);
		seaplane3.setMaxAltitude(45000);
		seaplane3.setMaxRange(6400);
		garage[11] = seaplane3;
		garage[11].setNoPassengers(11);
		garage[11].setTopSpeed(348);
		
		garage[12] = new Motorcycle("GS500", "Suzuki", 2004, 47);
		garage[12].setNoPassengers(2);
		garage[12].setTopSpeed(108);
		
		garage[13] = new Motorcycle("Electra Glide", "Harley-Davidson", 2011, 68);
		garage[13].setNoPassengers(2);
		garage[13].setTopSpeed(105);
		
		garage[14] = new Motorcycle("PW", "Yamaha", 2012, 44);
		garage[14].setNoPassengers(2);
		garage[14].setTopSpeed(96);
		
		System.out.println("Press 1 to see how many vehicles are in the system.");
		System.out.println("Press 2 to see the name and kind of each vehicle.");
		System.out.println("Press 3 to see which vehicles can fly.");	
		System.out.println("Press 4 to see which vehicles can float.");
		System.out.println("Press 5 to see which vehicles can float and fly.");
		System.out.println("Press 6 to see a description of each vehicle.");
		System.out.println("Press h to see brief help information for your system.");
		System.out.println("Press q to terminate the program.");
		
		
		
		if (keyboard.hasNextInt())
		{		
			int input = keyboard.nextInt();
			if (input == 1)
			{
				System.out.println("There are " + Vehicle.count + " vehicles in the system.");
			}
		
			else if (input == 2)
			{
				for (int i = 0; i < 15; i++)
					{
					if (garage[i] instanceof Automobile)
					{
						System.out.println("Name: " + garage[i].name);
						System.out.println("Kind: Automobile");
						System.out.println("");
					}
					else if (garage[i] instanceof Airplane)
					{
						System.out.println("Name: " + garage[i].name);
						System.out.println("Kind: Airplane");
						System.out.println("");
					}
					else if (garage[i] instanceof Ship)
					{
						System.out.println("Name: " + garage[i].name);
						System.out.println("Kind: Ship");
						System.out.println("");
					}
					else if (garage[i] instanceof FlyingBoat)
					{
						System.out.println("Name: " + garage[i].name);
						System.out.println("Kind: FlyingBoat");
						System.out.println("");
					}
					else 
					{
						System.out.println("Name: " + garage[i].name);
						System.out.println("Kind: Motorcycle");
						System.out.println("");
					}
				}	
			}
			else if (input == 3)
			{
				for (int i = 0; i < 15; i++)
				{
					if (garage[i] instanceof Airplane)
					{
						System.out.println("Name: " + garage[i].name);
						System.out.println("Kind: Airplane");
						System.out.println("");
					}
					else if (garage[i] instanceof FlyingBoat)
					{
						System.out.println("Name: " + garage[i].name);
						System.out.println("Kind: FlyingBoat");
						System.out.println("");
					}
				
				}
			}
			else if (input == 4)
			{
				for (int i = 0; i < 15; i++)
				{
					if (garage[i] instanceof Ship)
					{
						System.out.println("Name: " + garage[i].name);
						System.out.println("Kind: Ship");
						System.out.println("");
					}
					else if (garage[i] instanceof FlyingBoat)
					{
						System.out.println("Name: " + garage[i].name);
						System.out.println("Kind: FlyingBoat");
						System.out.println("");
					}
				
				}
			}
		
			else if (input == 5)
			{
				for (int i = 0; i < 15; i++)
				{
					if (garage[i] instanceof FlyingBoat)
					{
						System.out.println("Name: " + garage[i].name);
						System.out.println("Kind: FlyingBoat");
						System.out.println("");
					}
				
				}
			}	
		
			else if (input == 6)
			{
				for (int i = 0; i < 15; i++)
				{
					System.out.println(garage[i].toString());
					System.out.println("");
				}
			}
			else
			{
				System.out.println("Error: You must enter values 1, 2, 3, 4, 5, 6, h or q.");
			}
		}	
		else if (keyboard.hasNext()) 
		{	
			if (keyboard.next().equals("h"))
			{
				System.out.println("Enter values 1, 2, 3, 4, 5, 6, h, q depending on which option pertains to you. Then press enter. " +
					"You must restart the program to access the menu again.");
			}
		
			else if (keyboard.next().equals("q"))
			{
				System.exit(0);
			}
			else
			{
				System.out.println("Error: You must enter values 1, 2, 3, 4, 5, 6, h or q.");
			}
		}

	}
}