/**
 * This subclass represents a single family home
 *
 */
public class SingleFamilyHome extends Residential
{
	private boolean garage;

	/**
	 * Empty-argument constructor
	 */
	public SingleFamilyHome() 
	{
		super();
		garage = false;
	}//end empty argument constructor

	/**
	 * Preferred constructor
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 */
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) 
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false;
		garage = false;
	}//end preferred constructor

	/**
	 * This method will eventually be used to draw the object to the screen.
	 * For now, it simply prints to the console which object type the drawing code is for.
	 */
	public void draw()
	{
		System.out.println("Drawing code for SingleFamilyHome");
	}//end draw
	
	/**
	 * This method displays the data of the SingleFamilyHome in a special way
	 */
	public String displayData()
	{
		String yOrN = laundryRoom ? "Yes" : "No";
		String yesOrNo = garage ? "Yes" : "No";
		
		return "==============================================================\nSingle Family Home\n==============================================================\n" 
				+ "Project Name: " + projectName + "\nComplete Address: " + completeAddress + "\nSquare Feet: "
				+ totalSquareFeet + "\nOccupancy Group: " + occupancyGroup + "\nOccupancy Subgroup: " + subgroup
				+ "\nNumber of Bedrooms: " + numBedrooms + "\nNumber of Bathrooms: " + numBathrooms
				+ "\nLaundry Room: " + yOrN + "\nGarage: " + yesOrNo;
	}
	//end displayData
	
	/**
	 * Getter for garage
	 * @return
	 */
	public boolean isGarage() 
	{
		return garage;
	}//end isGarage

	/**
	 * Setter for garage
	 * @param garage
	 */
	public void setGarage(boolean garage) 
	{
		this.garage = garage;
	}//end setGarage
	
}//end class
