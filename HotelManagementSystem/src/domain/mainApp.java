package domain;

import java.util.*;

/*
 * This is the main
 * It is an exhibition of how the program works
 */

public class mainApp {

	public static void main(String[] args)
	{
		
		
		Hotel portMarina=new Hotel(); //create a new hotel which is called portMarina
		
		portMarina.populateDoubleRooms(); //populate the hotel with 10 double rooms
		
		portMarina.populateSingleRooms(); //populate the hotel with 10 single rooms
		
		portMarina.populateHighSeasonPeriods(); //populate the hotel with the high season periods
		
		portMarina.populateHotelFacilities(); //populate the hotel with hotel facilities
		
		
		
		portMarina.showRooms();
		
		List<Room> availableRooms=new ArrayList<Room>();
		
		availableRooms=portMarina.getRooms(); //we get all the rooms here
		
		
		Reservation reservation=new Reservation(1); //we create a new reservation with Id 1
		
		Room room=availableRooms.get(0); //we get the first room from the availableRooms
		
		reservation.setReservedRoom(room); //here we associate the room with the reservation with the specific room 
		
		reservation.setCheckInDate("20/12/2014"); //here we set the checkInDay 
		reservation.setCheckOutDate("29/12/2014"); //here we set the checkOutDay
		
		reservation.addreservationFacility(portMarina.getHotelFacilities().get(0)); //here we add a hotel facility in the reservation
		reservation.addreservationFacility(portMarina.getHotelFacilities().get(1)); //here we add a hotel facility in the reservation
		
		reservation.setCancelationAbility(false); //here we determine if the reservation can be cancelled
		
		
		System.out.println("The total amount you should pay is: "+reservation.getTotalAmount(reservation));
		
		System.out.printf("%s\t\t%d\n","The number of days is:",reservation.getReservedRoom().getNumberOfDays());
		
		System.out.println(reservation.getReservationDate());
		
		
		Customer customer=new Customer("NHE2510","GEORGE","CHATIZNIKOLAOU","6973853244","ghatzin@gmail.com","Karolidou 16"); // here we create a new customer
		
		reservation.setCustomer(customer); //here we associate the reservation with the customer
		
		portMarina.addCustomer(reservation.getCustomer()); //here we add the customer to the hotel customer base
	
		portMarina.addReservation(reservation); //here we add the reservation to the reservations of the hotel
		
		
		portMarina.showReservationsDetails(); //here we print the details of all reservations which is actually 1
		
		System.out.println();
		
		
		
		
		
		
	}
	
	
	
	
	
}

