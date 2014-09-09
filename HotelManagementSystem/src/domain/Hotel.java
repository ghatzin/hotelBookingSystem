/* The class Hotel is a class that holding
 * the customers, the rooms, the reservations, the hotelFacilities,
 * and the highSeasonPeriods which are the periods which are consider
 * as highSeaon and this practically means that room price is increased 
 */



package domain;

import java.util.*;
import java.text.*;

public class Hotel
{
 
   private List<Customer> customers;
   private List<Room> rooms;
   private List<Reservation> reservations;
   private List<HotelFacility> hotelFacilities;
   private List<HighSeasonPeriod> highSeasonPeriods;
  
   
   /*This is the constructor of the class where
    * the initialization of the private fields takes place 
    */
   public Hotel()
   {
	   customers=new ArrayList<Customer>();
	   rooms=new ArrayList<Room>();
	   reservations=new ArrayList<Reservation>();
	   hotelFacilities=new ArrayList<HotelFacility>();
	   highSeasonPeriods=new ArrayList<HighSeasonPeriod>();
   }
   
   
   
   /*This method is a helper method and populates
    * the rooms list with 10 Double rooms. 
    */
   public void populateDoubleRooms()
   {
	   
	   
	   for (int i=0;i<10;i++)
	   {	  
		   
		   int j=i+1;
		   Room room=new DoubleRoom(j);
		   room.setPrice(60.00);
		   rooms.add(room);
	   }
	   
   }
   
   
   /*This method is a helper method and populates
    * the rooms list with 10 Single rooms. 
    */
   public void populateSingleRooms()
   {
	   
	   
	   for (int i=0;i<10;i++)
	   {	  
		   
		   int j=i+1;
		   Room room=new SingleRoom(j);
		   room.setPrice(30.00);
		   rooms.add(room);
	   }
	   
   }
   
   /*This method show all the rooms of the Hotel
    * More specific for the each room display the room number,the room type (single,double) and the price
    */
   public void showRooms()
   {
	   
	   for (Room r:rooms)
		   System.out.printf("%d,\t\t,%s\t\t,%.2f,\n",r.getRoomNumber(),r.getRoomType(),r.getPrice());
   
   }
   
   

  /*
   * This method adds a Reservation to the the reservations list.
   * Also checks if the reservation belongs to a highSeasonPeriod 
   */
  public void addReservation(Reservation reservation)
  {
	  
	   Date date1=reservation.getcheckInDate();
	   Date date2=reservation.getCheckOutDate();
	
	   
	   for (HighSeasonPeriod highPeriod:highSeasonPeriods)
	   {
		   
		   Date sDate=highPeriod.getStartDate();
		   Date endDay=highPeriod.getEndDate();
		   boolean firstDay=date1.after(sDate);
		   boolean lastDay=date2.before(endDay);
		   
		   if (firstDay==true && lastDay==true)
			  reservation.setSeason(highPeriod);
		  
	   
	   }
	  
	   	
	    reservations.add(reservation);
  }
   
  /*
   * This method adds a customer to the customer list 
   */
   public void addCustomer(Customer customer)
   {
	   customers.add(customer);
   }
   
   
   
   /*
    * This methods return the list of rooms
    */
   public List<Room> getRooms()
   {
	   
	   return rooms;
   }
   
   
   /*
    * This method iterate through the reservations list
    * and show the details of each reservation.
    */
   public void showReservationsDetails()
   {
	   for (Reservation r:reservations)
		   System.out.printf("%d\t\t\t,%d\t\t\t%s\t\t\t,%s\t\t\t,%s,\n",r.getReservationId(),r.getReservedRoom().getRoomNumber(),r.getReservedRoom().getRoomType(),r.getReservedRoom().getCheckInDay(),r.getReservedRoom().getCheckOutDay());
	   
   }
   
   
   
   /*
    * This method returns the number of available roooms
    */
   public int getNumberOfAvailableRooms()
   {
	   
	   return rooms.size()-reservations.size();
   }
   
   
   
   /*
    * This method finds available rooms between two day. The checkInDay and the checkOutDay
    */
   public List<Room> findAvailableRooms(String checkInDay,String checkOutDay)
   {
	   
	      List<Room> availableRooms=new ArrayList<Room>();
	      
	      SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
	      
	
	      try
	      {
	         Date CheckInDay=sdf.parse(checkInDay);
	         Date CheckOutDay=sdf.parse(checkOutDay);
	         int i=0;
	         for (Room r:rooms)
	         {	 
		    	 i++;
	        	 boolean result=((r.getCheckInDay().equals(CheckInDay)==true) && (r.getCheckOutDay().equals(CheckOutDay)==true)); 
		    	 System.out.print(i);
	        	 System.out.println(result);
		    	 if (result==false )
	        	 {
		    		  
	        		 availableRooms.add(r);
		    	 
	        	 }//end if
		    	 
	         }//end for
	      }    
	      catch (Exception e)
	      {
	    	  e.printStackTrace();
	      
	      }//end catch 
	      
	      return availableRooms;
	     
   }
   
   
   
   /* 
    * This method show the available rooms between the checkInDay and the checkOutDay
    */
   public void showAvailableRooms(String checkInDate,String checkOutDate)
   {
	   
        List<Room> aRooms=new ArrayList<Room>();
        
        aRooms=findAvailableRooms(checkInDate,checkOutDate);
        
        for (Room r:aRooms)
        	System.out.printf("%d\t\t%s\t\t%s\t\t%s\n",r.getRoomNumber(),r.getRoomType(),r.getCheckInDay(),r.getCheckOutDay());
   
        
   
   }
   
   
   /*
    * This method add some hotel facilities in the list hotelFacilities
    */
   public void populateHotelFacilities()
   {
	   
	   hotelFacilities.add(new HotelFacility("POOL","EXTERNAL POOL 50M",10.00));
	   hotelFacilities.add(new HotelFacility("GYM","INTERNAL GYM",20.00));
	   hotelFacilities.add(new HotelFacility("SAUANA","INTERNAL SAUANA",5.00));
	   hotelFacilities.add(new HotelFacility("HALFDIET","Breakfast and Dinner",15.00));
	   
   }
   
   
   /*
    * This method add some high season periods to the list highSeasonPeriods
    */
   
   public void populateHighSeasonPeriods()
   {
	   highSeasonPeriods.add(new ChristmasPeriod("CHRISTMAS PERIOD","01/12/2014","15/01/2015",0.30) );
	   highSeasonPeriods.add(new EasterPeriod("EASTER HOLIDAY PERIOD","01/4/2015","15/05/2015",0.20) );
	   highSeasonPeriods.add(new SummerPeriod("SUMMER PERIOD","01/07/2015","15/08/2015",0.40) );
   }
   
   
   /*
    * This method return the highSeasonPeriods
    */
   public List<HighSeasonPeriod> getHighSeasonsPeriods()
   {
	   
	   return highSeasonPeriods;
   }
   
   /*
    * This method return the hotel facilities
    */
   public List<HotelFacility> getHotelFacilities()
   {
	   return hotelFacilities;
   }
   
   
}
