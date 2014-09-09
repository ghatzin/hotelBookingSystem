package domain;

public class EasterPeriod extends HighSeasonPeriod
{

	private double precentage;
	
	public EasterPeriod(String description,String startDate,String endDate,double precentage)
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
