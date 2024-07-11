/**
 * This superclass represents a building
 *
 */
public class Building 
{
	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup;
	
	/**
	 * Empty-argument constructor
	 */
	public Building()
	{
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0.0;
		occupancyGroup = "";
		subgroup = "";
	}//end empty argument constructor
	
	/**
	 * Preferred constructor
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 */
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup)
	{
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
	}//end preferred constructor

	/**
	 * This method will eventually be used to draw the object to the screen.
	 * For now, it simply prints to the console which object type the drawing code is for.
	 */
	public void draw()
	{
		System.out.println("Drawing code for Building");
	}//end draw
	
	/**
	 * This method returns the data of the Building in a special way
	 * @return
	 */
	public String displayData() 
	{
		return "==============================================================\nBuilding\n==============================================================\n" 
				+ "Project Name: " + projectName + "\nComplete Address: " + completeAddress + "\nSquare Feet: "
				+ totalSquareFeet + "\nOccupancy Group: " + occupancyGroup + "\nOccupancy Subgroup: " + subgroup;

	}//end displayData

	/**
	 * Getter for projectName
	 * @return
	 */
	public String getProjectName() 
	{
		return projectName;
	}//end getProjectName

	/**
	 * Setter for projectName
	 * @param projectName
	 */
	public void setProjectName(String projectName) 
	{
		this.projectName = projectName;
	}//end setProjectName

	/**
	 * Getter for completeAddress
	 * @return
	 */
	public String getCompleteAddress() 
	{
		return completeAddress;
	}//end getCompleteAddress

	/**
	 * Setter for completeAddress
	 * @param completeAddress
	 */
	public void setCompleteAddress(String completeAddress) 
	{
		this.completeAddress = completeAddress;
	}//end setCompleteAddress

	/**
	 * Getter for totalSquareFeet
	 * @return
	 */
	public double getTotalSquareFeet() 
	{
		return totalSquareFeet;
	}//end getTotalSquareFeet

	/**
	 * Setter for totalSquareFeet
	 * @param totalSquareFeet
	 */
	public void setTotalSquareFeet(double totalSquareFeet) 
	{
		this.totalSquareFeet = totalSquareFeet;
	}//end setTotalSquareFeet

	/**
	 * Getter for occupancyGroup
	 * @return
	 */
	public String getOccupancyGroup() 
	{
		return occupancyGroup;
	}//end getOccupancyGroup

	/**
	 * Setter for occupancyGroup
	 * @param occupancyGroup
	 */
	public void setOccupancyGroup(String occupancyGroup) 
	{
		this.occupancyGroup = occupancyGroup;
	}//end setOccupancyGroup

	/**
	 * Getter for subgroup
	 * @return
	 */
	public String getSubgroup() 
	{
		return subgroup;
	}//end getSubgroup

	/**
	 * Setter for subgroup
	 * @param subgroup
	 */
	public void setSubgroup(String subgroup) 
	{
		this.subgroup = subgroup;
	}//end setSubgroup
	
	@Override
	public String toString() 
	{
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "]";
	}//end toString
	
}//end class

