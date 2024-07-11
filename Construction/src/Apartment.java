/**
 * This subclass represents an apartment
 *  
 */
public class Apartment extends Residential
{
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	/**
	 * Empty-argument constructor
	 */
	public Apartment() 
	{
		super();
		numRentableUnits = 0;
		avgUnitSize = 0;
		parkingAvailable = false;
	}//end empty argument constructor
	
	/**
	 * Preferred constructor
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 */
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) 
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false;
		numRentableUnits = 0;
		avgUnitSize = 0;
		parkingAvailable = false;		
	}//end preferred constructor

	/**
	 * This method will eventually be used to draw the object to the screen.
	 * For now, it simply prints to the console which object type the drawing code is for.
	 */
	public void draw()
	{
		System.out.println("Drawing code for Apartment");
	}//end draw
	
	/**
	 * This method displays the data of the Apartment in a special way
	 */
	public String displayData()
	{
		String yOrN = laundryRoom ? "Yes" : "No";
		String yesOrNo = parkingAvailable ? "Yes" : "No";
		
		return "==============================================================\nApartment\n==============================================================\n" 
				+ "Project Name: " + projectName + "\nComplete Address: " + completeAddress + "\nSquare Feet: "
				+ totalSquareFeet + "\nOccupancy Group: " + occupancyGroup + "\nOccupancy Subgroup: " + subgroup
				+ "\nNumber of Bedrooms: " + numBedrooms + "\nNumber of Bathrooms: " + numBathrooms
				+ "\nLaundry Room: " + yOrN + "\nNumber of Rentable Units: " + numRentableUnits
				+"\nAverage Unit Size: " + avgUnitSize + "\nParking Available: " + yesOrNo;
	}//end displayData
	
	/**
	 * Getter for numRentableUnits
	 * @return
	 */
	public int getNumRentableUnits() 
	{
		return numRentableUnits;
	}//end getNumRentableUnits

	/**
	 * Setter for numRentableUnits
	 * @param numRentableUnits
	 */
	public void setNumRentableUnits(int numRentableUnits) 
	{
		this.numRentableUnits = numRentableUnits;
	}//end setNumRentableUnits

	/**
	 * Getter for avgUnitSize
	 * @return
	 */
	public double getAvgUnitSize() 
	{
		return avgUnitSize;
	}//end getAvgUnitSize

	/**
	 * Setter for avgUnitSize
	 * @param avgUnitSize
	 */
	public void setAvgUnitSize(double avgUnitSize) 
	{
		this.avgUnitSize = avgUnitSize;
	}//end setAvgUnitSize

	/**
	 * Getter for parkingAvailable
	 * @return
	 */
	public boolean isParkingAvailable() 
	{
		return parkingAvailable;
	}//end isParkingAvailable

	/**
	 * Setter for parkingAvailable
	 * @param parkingAvailable
	 */
	public void setParkingAvailable(boolean parkingAvailable) 
	{
		this.parkingAvailable = parkingAvailable;
	}//end setParkingAvailable
	
	@Override
	public String toString() {
		return "Apartment [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + ", projectName=" + projectName + ", completeAddress=" + completeAddress
				+ ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup="
				+ subgroup + ", numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + "]";
	}//end toString
	
}//end class

