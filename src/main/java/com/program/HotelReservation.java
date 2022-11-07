package com.program;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.*;


public class HotelReservation { 
	private String hotelNam1="Lakewood",hotelNam2="Bridgewood",hotelNam3="Ridgewood";
	private int regilrHotelPric1=110, regilrHotelPric2=160 ,regilrHotelPric3=220;
	private int weekendHotelPric1=90, weekendHotelPric2=60,weekendHotelPric3=150;
	private String weekend="SUNDAY";
	private String weekend2="SATURDAY";
	private String days;
	
	
	public void HotelNames(int[] date1,int[] date2) {
		LocalDate someDate = LocalDate.of(date1[2], date1[1], date1[0]);
		String days=someDate.getDayOfWeek().toString();
		System.out.println(days);
		if (weekend==days || weekend2==days ) {
			System.out.println(hotelNam1+" WeekEndDays Hotel Rate is  "+90+" $");
			System.out.println(hotelNam2+" WeekEndDays Hotel Rate is  "+50+" $");
			System.out.println(hotelNam3+" WeekEndDays Hotel Rate is  "+150+" $");   }
		else  {
			System.out.println(hotelNam1+" WeekDays Hotel Rate is  "+regilrHotelPric1+" $");
			System.out.println(hotelNam2+" WeekDays Hotel Rate is  "+regilrHotelPric2+" $");
			System.out.println(hotelNam3+" WeekDays Hotel Rate is  "+regilrHotelPric3+" $"); 
		}
	}
	public void Rating() {
		int lakewood =3;
		int bridgewood=4;
		int ridgewood=5;
		System.out.println(hotelNam1+"  Rating is "+lakewood+"  Star");
		System.out.println(hotelNam2+"  Rating is "+bridgewood+"  Star");
		System.out.println(hotelNam3+"  Rating is "+ridgewood+"  Star");
	}
	public void CheapestBestRating() {
		int noOfHotel=3;
		int lakewood =3, bridgewood=4 , ridgewood=5;
		int sum=(lakewood+bridgewood+ridgewood)/noOfHotel;
		int rate1, rate2, rate3;
		if (days==weekend || days==weekend2) {
			 rate1=weekendHotelPric1;
			 rate2=weekendHotelPric2;
			 rate3=weekendHotelPric3;
		}    else  {
			 rate1=regilrHotelPric1;
			 rate2=regilrHotelPric2;
			 rate3=regilrHotelPric3;	
		}
		if (lakewood >=sum) {
			System.out.println("The Best Rated Hotel is  "+hotelNam1+" & Rate is "+rate1);
		}
		else if (bridgewood >=sum) {
			System.out.println("The Best Rated Hotel is  "+hotelNam2+" & Rate is "+rate2);	
			}
		else if (ridgewood >=sum)  {
			System.out.println("The Best Rated Hotel is  "+hotelNam3+" & Rate is "+rate3);
		}
		}   

	public static void main(String args[]) throws ParseException {
		HotelReservation obj =new HotelReservation();
		// format put the date is (dd/mm/yyyy)
				int date1[]= {11,11,2020};
				int date2[]= {10,11,2020};
		obj.HotelNames(date1,date2);
		obj.CheapestBestRating();
	}
}
