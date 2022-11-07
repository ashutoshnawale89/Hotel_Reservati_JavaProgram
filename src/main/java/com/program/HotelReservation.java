package com.program;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.*;

public class HotelReservation {

	 HashMap<String,ArrayList<String>> hotelDetail=new HashMap<String,ArrayList<String>>();
	public void hotelNames(String hotelName,String regularPrice,String weekEndPrice) {
	ArrayList<String> price=new ArrayList<String>();
	price.add("Regular Day Price -> "+regularPrice);
	price.add("WeekEnd Day Price -> "+weekEndPrice);	
	hotelDetail.put(hotelName, price);
	}
	public static void main(String args[])  {
		HotelReservation obj =new HotelReservation();
		obj.hotelNames("lakewood","110","150");
		obj.hotelNames("Bridgewood", "60", "160");
		System.out.println(obj.hotelDetail);
	}
}