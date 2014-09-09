package domain;

import java.util.*;
import java.text.*;

public abstract class HighSeasonPeriod 
{
  
     private String description;
     private Date startDate;
     private Date endDate;
   
     
     public HighSeasonPeriod(String description,String startDate,String endDate)
     {
   
    	 this.description=description;
    	 setStartDate(startDate);
    	 setEndDate(endDate);
     }
     
     
     
     public void setDescription(String description)
     {
    	 this.description=description;
     }
     
     public void setStartDate(String startDate)
     {
    	 try
    	 {
    	   this.startDate=new SimpleDateFormat("dd/MM/yyyy").parse(startDate);
    	 }
    	 catch (Exception ex)
    	 {
    		 ex.printStackTrace();
    	 }
     
     }
     
     
     public void setEndDate(String endDate)
     {
    	
    	 try
    	 {
    	   this.endDate=new SimpleDateFormat("dd/MM/yyyy").parse(endDate);
    	 }
    	 catch (Exception ex)
    	 {
    		 ex.printStackTrace();
    	 }
    	 
     }
     
     
     public Date getStartDate()
     {
    	return startDate;
     }
     
     
     public Date getEndDate()
     {
    	 return endDate;
     }
     
     
     
     
     public String getDescription()
     {
    	 return description;
     
     }
     
     
     public abstract double getPercentage();

}
