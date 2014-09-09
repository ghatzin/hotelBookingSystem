package domain;

public class ChristmasPeriod extends HighSeasonPeriod
{
	private double precentage;
	
	public ChristmasPeriod(String description,String startDate,String endDate,double precentage)
	{
	    super(description,startDate,endDate);
		this.precentage=precentage;
	}

	public void setPrecentage(double precentage)
    {
   	 	this.precentage=precentage;
    }
    
	
	public double getPercentage()
    {
   	 	return precentage;
    }

	

}
