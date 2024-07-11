/**
 * This class contains a main method to test the 
 * Building, Residential, Business, SingleFamilyHome, 
 * Apartment and Mall classes.
 * 
 */
public class Application 
{

	public static void main(String[] args) 
	{
		// ========================= TEST BUILDING ===============================
		
		//test empty argument constructor
		Building bldg1 = new Building();
		
		//test toString (empty because all instance fields are set to "" or 0.0)
		System.out.println(bldg1.toString());
		System.out.println();
		
		//test setters and getters
		bldg1.setProjectName("Building One");
		System.out.println("Project Name: " + bldg1.getProjectName());
		bldg1.setCompleteAddress("111 Main Street, Louisville, Kentucky 40205");
		System.out.println("Complete Address: " + bldg1.getCompleteAddress());
		bldg1.setTotalSquareFeet(100000);
		System.out.println("Total Square Feet: " + bldg1.getTotalSquareFeet());
		bldg1.setOccupancyGroup("Business");
		System.out.println("Occupancy Group: " + bldg1.getOccupancyGroup());
		bldg1.setSubgroup("B");
		System.out.println("Occupancy Subgroup: " + bldg1.getSubgroup());
		System.out.println();
		
		//test preferred constructor
		Building bldg2 = new Building("Building Two", "222 Main Street, Louisville, Kentucky 40205", 2000, "Residence", "R-1");
		
		//test draw
		bldg2.draw();
		System.out.println();
		
		//test displayData
		System.out.println(bldg2.displayData());
		System.out.println();
		
		// =========================== TEST BUSINESS =============================
		
		//test empty argument constructor
		Business bs1 = new Business();
		
		//test toString (empty because all instance fields are set to "" or 0.0)
		System.out.println(bs1.toString());
		System.out.println();
		
		//test setters and getters
		bs1.setProjectName("Business One");
		System.out.println("Project Name: " + bs1.getProjectName());
		bs1.setCompleteAddress("111 Market Street, Louisville, Kentucky 40205");
		System.out.println("Complete Address: " + bs1.getCompleteAddress());
		bs1.setTotalSquareFeet(50000);
		System.out.println("Total Square Feet: " + bs1.getTotalSquareFeet());
		bs1.setOccupancyGroup("Business");
		System.out.println("Occupancy Group: " + bs1.getOccupancyGroup());
		bs1.setSubgroup("B");
		System.out.println("Occupancy Subgroup: " + bs1.getSubgroup());
		bs1.setNumRentableUnits(10);
		System.out.println("Number of Rentable Units: " + bs1.getNumRentableUnits());
		System.out.println();
		
		//test preferred constructor and set number of units
		Business bs2 = new Business("Business Two", "222 Market Street, Louisville, KY 40205", 4000, "Business", "B");
		bs2.setNumRentableUnits(2);
		
		//test draw
		bs2.draw();
		System.out.println();
		
		//test displayData
		System.out.println(bs2.displayData());
		System.out.println();
		
		// ============================ TEST MALL =================================
		
		//test empty argument constructor
		Mall mall1 = new Mall();
		
		//test toString (empty because all instance fields are set to "" or 0.0)
		System.out.println(mall1.toString());
		System.out.println();
		
		//test setters and getters
		mall1.setProjectName("Mall One");
		System.out.println("Project Name: " + mall1.getProjectName());
		mall1.setCompleteAddress("111 Campbell Street, Louisville, Kentucky 40205");
		System.out.println("Complete Address: " + mall1.getCompleteAddress());
		mall1.setTotalSquareFeet(400000);
		System.out.println("Total Square Feet: " + mall1.getTotalSquareFeet());
		mall1.setOccupancyGroup("Business");
		System.out.println("Occupancy Group: " + mall1.getOccupancyGroup());
		mall1.setSubgroup("B");
		System.out.println("Occupancy Subgroup: " + mall1.getSubgroup());
		mall1.setNumRentableUnits(300);
		System.out.println("Number of Rentable Units: " + mall1.getNumRentableUnits());
		mall1.setNumRentedUnits(285);
		System.out.println("Number of Rented Units: " + mall1.getNumRentedUnits());
		mall1.setMedianUnitSize(1333.33);
		System.out.println("Median Unit Size: " + mall1.getMedianUnitSize());
		mall1.setNumParkingSpaces(2000);
		System.out.println("Number of Parking Spaces: " + mall1.getNumParkingSpaces());
		System.out.println();
		
		//test preferred constructor
		Mall mall2 = new Mall("Mall Two", "222 Campbell Street, Louisville, KY 40205", 900000, "Business", "B");
		mall2.setNumRentableUnits(500);
		mall2.setNumRentedUnits(490);
		mall2.setMedianUnitSize(1800);
		mall2.setNumParkingSpaces(4000);
		
		//test draw
		mall2.draw();
		System.out.println();
		
		//test displayData
		System.out.println(mall2.displayData());
		System.out.println();	
		
		// ============================ TEST RESIDENTIAL ==========================
		
		//test empty argument constructor
		Residential res1 = new Residential();
		
		//test toString (empty because all instance fields are set to "" or 0.0)
		System.out.println(res1.toString());
		System.out.println();
		
		//test setters and getters
		res1.setProjectName("Residential One");
		System.out.println("Project Name: " + res1.getProjectName());
		res1.setCompleteAddress("111 Adams Street, Louisville, Kentucky 40205");
		System.out.println("Complete Address: " + res1.getCompleteAddress());
		res1.setTotalSquareFeet(20000);
		System.out.println("Total Square Feet: " + res1.getTotalSquareFeet());
		res1.setOccupancyGroup("Residential");
		System.out.println("Occupancy Group: " + res1.getOccupancyGroup());
		res1.setSubgroup("R-1");
		System.out.println("Occupancy Subgroup: " + res1.getSubgroup());
		res1.setNumBedrooms(40);
		System.out.println("Number of Bedrooms: " + res1.getNumBedrooms());
		res1.setNumBathrooms(40);
		System.out.println("Number of Bathrooms: " + res1.getNumBathrooms());
		res1.setLaundryRoom(true);
		System.out.println("Laundry Room: " + res1.isLaundryRoom());
		System.out.println();
		
		//test preferred constructor
		Residential res2 = new Residential("Residential Two", "222 Adams Street, Louisville, KY 40205", 40000, "Residential", "R-1");
		res2.setNumBedrooms(80);
		res2.setNumBathrooms(80);
		res2.setLaundryRoom(true);
		
		//test draw
		res2.draw();
		System.out.println();
		
		//test displayData
		System.out.println(res2.displayData());
		System.out.println();
		
		
		// ============================ TEST APARTMENT ============================
		
		//test empty argument constructor 
		Apartment apt1 = new Apartment();
		
		//test toString (empty because all instance fields are set to "" or 0.0)
		System.out.println(apt1.toString());
		System.out.println();
		
		//test setters and getters
		apt1.setProjectName("Apartment One");
		System.out.println("Project Name: " + apt1.getProjectName());
		apt1.setCompleteAddress("111 Union Street, Louisville, Kentucky 40205");
		System.out.println("Complete Address: " + apt1.getCompleteAddress());
		apt1.setTotalSquareFeet(10000);
		System.out.println("Total Square Feet: " + apt1.getTotalSquareFeet());
		apt1.setOccupancyGroup("Residential");
		System.out.println("Occupancy Group: " + apt1.getOccupancyGroup());
		apt1.setSubgroup("R-2");
		System.out.println("Occupancy Subgroup: " + apt1.getSubgroup());
		apt1.setNumBedrooms(20);
		System.out.println("Number of Bedrooms: " + apt1.getNumBedrooms());
		apt1.setNumBathrooms(10);
		System.out.println("Number of Bathrooms: " + apt1.getNumBathrooms());
		apt1.setLaundryRoom(false);
		System.out.println("Laundry Room: " + apt1.isLaundryRoom());
		apt1.setNumRentableUnits(10);
		System.out.println("Number of Rentable Units: " + apt1.getNumRentableUnits());
		apt1.setAvgUnitSize(1000);
		System.out.println("Average Unit Size: " + apt1.getAvgUnitSize());
		apt1.setParkingAvailable(true);
		System.out.println("Parking Available: " + apt1.isParkingAvailable());
		System.out.println();
		
		//test preferred constructor
		Apartment apt2 = new Apartment("Apartment Two", "222 Union Street, Louisville, KY 40205", 30000, "Residential", "R-2");
		apt2.setNumBedrooms(60);
		apt2.setNumBathrooms(40);
		apt2.setLaundryRoom(false);
		apt2.setNumRentableUnits(20);
		apt2.setAvgUnitSize(1500);
		apt2.setParkingAvailable(false);
		
		//test draw
		apt2.draw();
		System.out.println();
		
		//test displayData
		System.out.println(apt2.displayData());
		System.out.println();
		
		// ======================= TEST SINGLE FAMILY HOME ========================
		
		//test empty argument constructor
		SingleFamilyHome home1 = new SingleFamilyHome();
		
		//test toString (empty because all instance fields are set to "" or 0.0)
		System.out.println(home1.toString());
		System.out.println();
		
		//test setters and getters
		home1.setProjectName("Home One");
		System.out.println("Project Name: " + home1.getProjectName());
		home1.setCompleteAddress("111 Baxter Street, Louisville, Kentucky 40205");
		System.out.println("Complete Address: " + home1.getCompleteAddress());
		home1.setTotalSquareFeet(2000);
		System.out.println("Total Square Feet: " + home1.getTotalSquareFeet());
		home1.setOccupancyGroup("Residential");
		System.out.println("Occupancy Group: " + home1.getOccupancyGroup());
		home1.setSubgroup("R-3");
		System.out.println("Occupancy Subgroup: " + home1.getSubgroup());
		home1.setNumBedrooms(3);
		System.out.println("Number of Bedrooms: " + home1.getNumBedrooms());
		home1.setNumBathrooms(2);
		System.out.println("Number of Bathrooms: " + home1.getNumBathrooms());
		home1.setLaundryRoom(true);
		System.out.println("Laundry Room: " + home1.isLaundryRoom());
		home1.setGarage(false);
		System.out.println("Garage: " + home1.isGarage());
		System.out.println();
		
		//test preferred constructor
		SingleFamilyHome home2 = new SingleFamilyHome("Home Two", "222 Baxter Street, Louisville, KY 40205", 3000, "Residential", "R-3");
		home2.setNumBedrooms(5);
		home2.setNumBathrooms(3);
		home2.setLaundryRoom(true);
		home2.setGarage(true);
		
		//test draw
		home2.draw();
		System.out.println();
		
		//test displayData
		System.out.println(home2.displayData());
		
	}//end main

}//end class

