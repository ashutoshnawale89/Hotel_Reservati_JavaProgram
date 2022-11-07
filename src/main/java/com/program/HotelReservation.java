package com.program;

import java.time.LocalDate;
import java.util.HashMap;

public class HotelReservation {
	 String hotelNam1="Lakewood",hotelNam2="Bridgewood",hotelNam3="Ridgewood";
	 int regilrHotelPric1=110, regilrHotelPric2=160 ,regilrHotelPric3=220;
	 int weekendHotelPric1=90, weekendHotelPric2=60,weekendHotelPric3=150;
	 String weekend="SUNDAY";
	 String weekend2="SATURDAY";
	 String days;
	public boolean HotelNames(int[] date1,int[] date2) {
		try {
			LocalDate someDate = LocalDate.of(date1[2], date1[1], date1[0]);
			 days=someDate.getDayOfWeek().toString();
			System.out.println(days);	
			CheapHotel();
		}
		catch(Exception e) {
		    System.out.println(e);
		}
		return true;
		}
	public void CheapHotel()  {
		if (days==weekend || days==weekend2) {
			if (weekendHotelPric1 > weekendHotelPric2 ) {
				if (weekendHotelPric2 >weekendHotelPric3) {
					System.out.println("The Cheapest Hotel is  "+hotelNam3+" "+weekendHotelPric3);	
				}  else {
					System.out.print("The Cheapest Hotel is  "+hotelNam2+" "+weekendHotelPric2);
				}
			} else  {
				if (weekendHotelPric1 > weekendHotelPric3) {
					System.out.println("The Cheapest Hotel is  "+hotelNam3+" "+weekendHotelPric3);
				}  else {
					System.out.println("The Cheapest Hotel is  "+hotelNam1+" "+weekendHotelPric1);
				}
			} 
		} else { 
			if (regilrHotelPric1 > regilrHotelPric2 ) {
				if (regilrHotelPric2 > regilrHotelPric3) {
					System.out.println("The Cheapest Hotel is  "+hotelNam3+" "+regilrHotelPric3);
				}  else {
					System.out.print("The Cheapest Hotel is  "+hotelNam2+" "+regilrHotelPric2);
				}
			} else  {
				if (regilrHotelPric1 > regilrHotelPric3) {
					System.out.println("The Cheapest Hotel is  "+hotelNam3+" "+regilrHotelPric3);
				}  else {
					System.out.println("The Cheapest Hotel is  "+hotelNam1+" "+regilrHotelPric1);
				}
			}
		}

		}
	public static void main(String args[])  {
		HotelReservation obj =new HotelReservation();
				int date1[]= {12,10,2022};
				int date2[]= {15,10,2022};
		obj.HotelNames(date1,date2);
	}
}