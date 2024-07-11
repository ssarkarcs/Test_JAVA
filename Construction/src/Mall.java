/**
 * This subclass represents a mall
 *
 */
public class Mall extends Business
{
	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	/**
	 * Empty-argument constructor
	 */
	public Mall() 
	{
		super();
		numRentedUnits = 0;
		medianUnitSize = 0;
		numParkingSpaces = 0;
	}//end empty argument constructor
	
	/**
	 * Preferred constructor
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 */
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) 
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		numRentableUnits = 0;
		numRentedUnits = 0;
		medianUnitSize = 0;
		numParkingSpaces = 0;	
	}//end preferred constructor

	/**
	 * This method will eventually be used to draw the object to the screen.
	 * For now, it simply prints to the console which object type the drawing code is for.
	 */
	public void draw()
	{
		System.out.println("Drawing code for Mall");
	}//end draw
	
	/**
	 * This method displays the data of the Mall in a special way
	 */
	public String displayData()
	{
		return "==============================================================\nMall\n==============================================================\n" 
				+ "Project Name: " + projectName + "\nComplete Address: " + completeAddress + "\nSquare Feet: "
				+ totalSquareFeet + "\nOccupancy Group: " + occupancyGroup + "\nOccupancy Subgroup: " + subgroup
				+ "\nNumber of Rentable Units: " + numRentableUnits + "\nNumber of Rented Units: " + numRentedUnits
				+ "\nMedian Unit Size: " + medianUnitSize + "\nNumber of Parking Spaces: " + numParkingSpaces;
	}//end displayData

	/**
	 * Getter for numRentedUnits
	 * @return
	 */
	public int getNumRentedUnits() 
	{
		return numRentedUnits;
	}//end getNumRentedUnits

	/**
	 * Setter for numRentedUnits
	 * @param numRentedUnits
	 */
	public void setNumRentedUnits(int numRentedUnits) 
	{
		this.numRentedUnits = numRentedUnits;
	}//end setNumRentedUnits

	/**
	 * Getter for medianUnitSize
	 * @return
	 */
	public double getMedianUnitSize() 
	{
		return medianUnitSize;
	}//end getMedianUnitSize

	/**
	 * Setter for medianUnitSize
	 * @param medianUnitSize
	 */
	public void setMedianUnitSize(double medianUnitSize) 
	{
		this.medianUnitSize = medianUnitSize;
	}//end setMedianUnitSize

	/**
	 * Getter for numParkingSpaces
	 * @return
	 */
	public int getNumParkingSpaces() 
	{
		return numParkingSpaces;
	}//end getNumParkingSpaces

	/**
	 * Setter for numParkingSpaces
	 * @param numParkingSpaces
	 */
	public void setNumParkingSpaces(int numParkingSpaces) 
	{
		this.numParkingSpaces = numParkingSpaces;
	}//end setNumParkingSpaces
	
	@Override
	public String toString() 
	{
		return "Mall [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet=" 
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup 
				+ ", numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + ", numRentableUnits=" + numRentableUnits + "]";
	}//end toString
	
}//end class
