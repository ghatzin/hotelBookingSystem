package domain;

public class HotelFacility
{
     
	private String facilityId;
	private String description;
	private double cost;
	
	
	public HotelFacility(String facilityId,String description,double cost)
	{
		this.facilityId=facilityId;
		this.description=description;
		this.cost=cost;
	}
	
	public void setFacilityId(String facilityId)
	{
		this.facilityId=facilityId;
	}

	public void setDescription(String description) 
	{
		this.description = description;
	}

	public void setCost(double cost)
	{
		this.cost = cost;
	}

	public String getFacilityId() {
		return facilityId;
	}

	public String getDescription() {
		return description;
	}

	public double getCost() {
		return cost;
	}
	
}
