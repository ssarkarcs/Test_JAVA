/**
 * This subclass represents a business
 *
 */
public class Business extends Building
{
	protected int numRentableUnits;

	/**
	 * Empty-argument constructor
	 */
	public Business() 
	{
		super();
		numRentableUnits = 0;
	}//end empty argument constructor

	/**
	 * Preferred constructor
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 */
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) 
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		numRentableUnits = 0;
	}//end preferred constructor
	
	/**
	 * This method will eventually be used to draw the object to the screen.
	 * For now, it simply prints to the console which object type the drawing code is for.
	 */
	public void draw()
	{
		System.out.println("Drawing code for Business");
	}//end draw
	
	/**
	 * This method displays the data of the Business in a special way
	 */
	public String displayData()
	{
		return "==============================================================\nBusiness\n==============================================================\n" 
				+ "Project Name: " + projectName + "\nComplete Address: " + completeAddress + "\nSquare Feet: "
				+ totalSquareFeet + "\nOccupancy Group: " + occupancyGroup + "\nOccupancy Subgroup: " + subgroup
				+ "\nNumber of Rentable Units: " + numRentableUnits;
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

	@Override
	public String toString() 
	{
		return "Business [projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + ", numRentableUnits=" + numRentableUnits + "]";
	}//end toString
	
}//end class

