package domain;

import java.util.*;

public class RoomCatalog 
{
	private String roomType;
	private double roomTypePrice;
	private List<Room> rooms;
	
	public RoomCatalog()
	{
		rooms=new ArrayList<Room>();
	}
	
	public void setRoomType(String roomType)
	{
		this.roomType=roomType;
	}
	
	public void setPrice(double roomTypePrice)
	{
		this.roomTypePrice=roomTypePrice;
	}
	
	public String getRoomType()
	{
		return roomType;
	}
	
	public Double getRoomTypePrice()
	{
	   return roomTypePrice;
	}
	
	public void addRoom(Room room)
	{
		
		rooms.add(room);
	}
	
	
	public List<Room> getAvailableRooms()
	{
		List<Room> availableRooms=new ArrayList<Room>();
		for (Room r:rooms)
		{
			if (r.getRoomAvailability()==false)
			    availableRooms.add(r);
		}
		
		return availableRooms;
	
	}


}
