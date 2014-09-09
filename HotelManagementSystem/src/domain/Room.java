package domain;

import java.util.*;
import java.text.*;

public abstract class Room 
{
	
	 protected int roomNumber;
	 protected boolean roomAvailability;
	 protected double  price;
	 protected Date checkInDay;
	 protected Date checkOutDay;
	 
	 
	 public Room(int roomNumber)
	 {
		 this.roomNumber=roomNumber;
		 try
		 {
			SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
			this.checkInDay=sdf.parse("00/00/0000");
			this.checkOutDay=sdf.parse("00/00/0000");
	     }
		 catch(ParseException ex)
		 {
			 ex.printStackTrace();
		 }
		 
		
     }
	 
	 
	 public void setRoomNumber(int roomNumber)
	 {
		 this.roomNumber=roomNumber;
	 }
	 
	 
	 	 
	 
	 public void setCheckInDay(String checkInDay)
	 {
		
		try
		{
		  SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		  this.checkInDay=sdf.parse(checkInDay);
		}
		catch(ParseException ex)
		{
			ex.printStackTrace();
		}
	 
	 }
	 
	 
	 public void setCheckOutDay(String checkOutDay)
	 {
		 try
		 {
			 SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
			 this.checkOutDay=sdf.parse(checkOutDay);
		 }
		 catch (ParseException e)
		 {
			 e.printStackTrace();
		 }
	 }
	 
	 
	 public void setAvailability(boolean roomAvailability)
	 {
		 
		 this.roomAvailability=roomAvailability;
	 
	 }
	 
	 public void setPrice(double price)
	 {
		 
		 
		 this.price=price;
	 }
	 
	 public int getRoomNumber()
	 {
		 return roomNumber;
	 }
	 
	 public boolean getRoomAvailability()
	 {
		 return roomAvailability;
	 }

	 public double getPrice()
	 {
		 return price;
	 }
	 
	 public Date getCheckInDay()
	 {
		 
		 return checkInDay;
	 }
	 
	 public Date getCheckOutDay()
	 {
		 return checkOutDay;
	 }
	 

	 public int getNumberOfDays()
	 {
		 return (int)(checkOutDay.getTime()-checkInDay.getTime())/(1000*60*60*24)-1;
	 }
	 
	 public abstract String getRoomType();
	 
	 
	


}
