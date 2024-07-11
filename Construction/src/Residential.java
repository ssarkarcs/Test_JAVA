/**
 * This subclass represents a residential building
 *
 */
public class Residential extends Building
{
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	/**
	 * Empty-argument constructor
	 */
	public Residential() 
	{
		super();
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false;
	}//end empty argument constructor
	
	/**
	 * Preferred constructor
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 */
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) 
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false;
	}//end constructor

	/**
	 * This method will eventually be used to draw the object to the screen.
	 * For now, it simply prints to the console which object type the drawing code is for.
	 */
	public void draw()
	{
		System.out.println("Drawing code for Residential");
	}//end draw
	
	/**
	 * This method displays the data of the Residential building in a special way
	 */
	public String displayData()
	{
		String yOrN = laundryRoom ? "Yes" : "No";
		
		return "==============================================================\nResidential\n==============================================================\n" 
				+ "Project Name: " + projectName + "\nComplete Address: " + completeAddress + "\nSquare Feet: "
				+ totalSquareFeet + "\nOccupancy Group: " + occupancyGroup + "\nOccupancy Subgroup: " + subgroup
				+ "\nNumber of Bedrooms: " + numBedrooms + "\nNumber of Bathrooms: " + numBathrooms
				+ "\nLaundry Room: " + yOrN;
	}
	//end displayData
	
	/**
	 * Getter for numBedrooms
	 * @return
	 */
	public int getNumBedrooms() 
	{
		return numBedrooms;
	}//end getNumBedrooms

	/**
	 * Setter for numBedrooms
	 * @param numBedrooms
	 */
	public void setNumBedrooms(int numBedrooms) 
	{
		this.numBedrooms = numBedrooms;
	}//end setNumBedrooms

	/**
	 * Getter for numBathrooms
	 * @return
	 */
	public int getNumBathrooms() 
	{
		return numBathrooms;
	}//end getNumBathrooms

	/**
	 * Setter for numBathrooms
	 * @param numBathrooms
	 */
	public void setNumBathrooms(int numBathrooms) 
	{
		this.numBathrooms = numBathrooms;
	}//end setNumBathrooms

	/**
	 * Getter for laundryRoom
	 * @return
	 */
	public boolean isLaundryRoom() 
	{		
		return laundryRoom;
	}//end isLaundryRoom

	/**
	 * Setter for laundryRoom
	 * @param laundryRoom
	 */
	public void setLaundryRoom(boolean laundryRoom) 
	{
		this.laundryRoom = laundryRoom;
	}//end setLaundryRoom
	
	@Override
	public String toString() 
	{
		return "Residential [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + ", numBedrooms="
				+ numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom=" + laundryRoom + "]";
	}//end toString
	
}//end class
