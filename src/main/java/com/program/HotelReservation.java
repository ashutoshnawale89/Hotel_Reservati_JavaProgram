package com.program;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.*;


public class HotelReservation { 
	HashMap<String,ArrayList<String>> rewardCustomer=new HashMap<String,ArrayList<String>>();
	
	
	public void specialCustomerRate(String hotelName,String regularRate,String weekendRate,String rewardRateRegular,String rewardRateWeekend) {
		ArrayList<String> rate=new ArrayList<String>();
		rate.add("Weekend Rate is : "+weekendRate);
		rate.add("Regular Rate is : "+regularRate);
		rate.add("Reward Rate is :"+rewardRateRegular);
		rate.add("Weekend Rate For Reward : "+ rewardRateWeekend);
		rewardCustomer.put(hotelName, rate);
	}
	
	public static void main(String args[]) throws ParseException {
		HotelReservation obj =new HotelReservation();
		 String hotelNam1="Lakewood",hotelNam2="Bridgewood",hotelNam3="Ridgewood";
		 String regulrHotelPric1="110", regulrHotelPric2="160" ,regulrHotelPric3="180";
		 String weekendHotelPric1="150", weekendHotelPric2="180",weekendHotelPric3="210";
		 String rewardRegulrHotelPric1="80", rewardRegulrHotelPric2="110",rewardRegulrHotelPric3="40";
		 String rewardWeekendHotelPric1="80", rewardWeekendHotelPric2="150",rewardWeekendHotelPric3="100";

		 obj.specialCustomerRate(hotelNam1, regulrHotelPric1,weekendHotelPric1, rewardRegulrHotelPric1,rewardWeekendHotelPric1);
		 obj.specialCustomerRate(hotelNam2, regulrHotelPric2,weekendHotelPric2, rewardRegulrHotelPric2,rewardWeekendHotelPric2);
		 obj.specialCustomerRate(hotelNam3, regulrHotelPric3,weekendHotelPric3, rewardRegulrHotelPric3,rewardWeekendHotelPric3);
		 
		 for(Map.Entry m:obj.rewardCustomer.entrySet()) {
			 System.out.println(m.getKey()+"  "+m.getValue());
		 }
		 // format put the date is (dd/mm/yyyy)
				int date1[]= {10,11,2020};
				int date2[]= {11,11,2020};
				
		
	}
}