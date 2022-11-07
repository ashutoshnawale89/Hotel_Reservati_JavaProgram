package com.program;

import java.util.*;

public class HotelReservation { 
	HashMap<ArrayList<String>,String> hotelDetail=new HashMap<ArrayList<String>,String>();
	public void hotelNames(String hotelName,String regularPrice,String weekEndPrice,String star) {
		ArrayList<String> price=new ArrayList<String>();
		price.add("Hotel Name :"+hotelName);
		price.add("Regular Day Price -> "+regularPrice);
		price.add("WeekEnd Day Price -> "+weekEndPrice);	
		hotelDetail.put( price,"The Rating is :"+star);
	}
	public static void main(String args[])  {
		HotelReservation obj =new HotelReservation();
		obj.hotelNames("lakewood","110","150","3");
		obj.hotelNames("Bridgewood", "60", "160","4");
		obj.hotelNames("RidgeWood", "140", "180","5");
		System.out.println(obj.hotelDetail);
	}
}
