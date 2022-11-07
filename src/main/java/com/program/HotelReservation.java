package com.program;

import java.util.HashMap;

public class HotelReservation {
	public boolean hotelAddSystem(String hotelName,String hotelDetails){
	if (hotelName.isEmpty()) {
		return false;
	}
	else {
		HashMap<String,String> hotelEntry=new HashMap<String,String>();
		hotelEntry.put(hotelName, hotelDetails);
		if (hotelEntry.isEmpty()) {
			return false;
		}
		else {
			return true;
		}
	}

}
}
