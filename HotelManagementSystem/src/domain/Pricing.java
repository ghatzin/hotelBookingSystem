package domain;

public class Pricing
{
  
    private double totalAmount;
     
    
    public double calculateTotalAmount(Reservation reservation)
    {
    	
    	int numOfDays=reservation.getReservedRoom().getNumberOfDays();
    	
    	totalAmount=(reservation.getReservedRoom().getPrice())*numOfDays;
    	
    	if (reservation.getSeason()!=null)
    		totalAmount=totalAmount+(totalAmount * reservation.getSeason().getPercentage());
    				
    	if (reservation.getCancelAbility()==false)
             totalAmount=totalAmount-(totalAmount*0.25);    	
    	
    	if (reservation.getReservationFacilities()!=null)
    	{
    		for (HotelFacility facility:reservation.getReservationFacilities())
    		{
    			totalAmount=totalAmount+(numOfDays*facility.getCost());
    		}
    			
    	}

    	
    	int daysBeforeCheckIn=(int)(reservation.getReservationDate().getTime()-reservation.getReservedRoom().getCheckInDay().getTime())/(1000*60*60*24);
    			
   
    	if (daysBeforeCheckIn>30)
    	{
    		
    		totalAmount=totalAmount-((daysBeforeCheckIn-30)*0.10);
    		
    	}
         
         return totalAmount;
    
    }//end calculate totalAmount
    
    
    
}//end of class
