package domain;

import java.util.*;

/*
 * This class represents the reservation entity
 * 
 * 
 */

public class Reservation
{
    
	private int reservationId;
	private Date reservationDate;//This is the date where the customer has made the reservation.
	private Customer customer;
	private Room reservedRoom;
	private List<HotelFacility> reservationFacilities;
    private HighSeasonPeriod highSeasonPeriod;
    private boolean cancelationAbility;
	
	
	public Reservation(int reservationId)
	{
		this.reservationId=reservationId;
		reservationFacilities=new ArrayList<HotelFacility>();
		highSeasonPeriod=null;
		cancelationAbility=false;
		reservationDate=new Date();
	}
	
	
	
	public void setReservationId(int reservationId)
	{
		this.reservationId=reservationId;
	}
	
	
	public void setCheckInDate(String checkInDate)
	{
		reservedRoom.setCheckInDay(checkInDate);
	}
	
	
	
	public void setCheckOutDate(String checkOutDate)
	{
		reservedRoom.setCheckOutDay(checkOutDate);
	}
	
	public void setCustomer(Customer customer)
	{
		
		this.customer=customer;
	}
	
	public void setReservedRoom(Room reservedRoom)
	{
		
		this.reservedRoom=reservedRoom;
	}
	
	
	public void addreservationFacility(HotelFacility facility)
	{
		reservationFacilities.add(facility);
	}
	
	public void setSeason(HighSeasonPeriod highSeason)
	{
	    highSeasonPeriod=highSeason;
	}
	
	public void setCancelationAbility(boolean cancelAbility)
	{
		cancelationAbility=cancelAbility;
	}
	
	
	public int getReservationId()
	{
		return reservationId;
	}
	
	public Date getcheckInDate()
	{
		
		return reservedRoom.getCheckInDay();	
	}
	
	public Date getCheckOutDate()
	{
		return reservedRoom.getCheckOutDay();
	}
	
	public Room getReservedRoom()
	{
		
		return reservedRoom;
	}
	
	
	public Customer getCustomer()
	{
		return customer; 
	}
	
	public List<HotelFacility> getReservationFacilities()
	{
		return reservationFacilities;
	}
	
	
	public HighSeasonPeriod getSeason()
	{
		return highSeasonPeriod;
	}
	
	public boolean getCancelAbility()
	{
		return cancelationAbility;
	
	}
	
	public Date getReservationDate()
	{
       return reservationDate;
    		   
	}
	
	public double getTotalAmount(Reservation r)
	{
		Pricing pricing=new Pricing();
		double totalAmount=pricing.calculateTotalAmount(r);
		double initialRoomPrice=r.getReservedRoom().getPrice();
		
		try
		{
		 if (totalAmount<(initialRoomPrice/2))
		   throw new Exception("The totalAmount of the reservation cannot be lower than the half of the initial price");
		}
		catch (Exception ex)
		{
			ex.getMessage();
		}
		 
		return pricing.calculateTotalAmount(r);
	}
	
}

