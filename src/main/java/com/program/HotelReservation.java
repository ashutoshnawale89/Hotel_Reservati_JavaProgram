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
	
	
	public void hotelNames(int[] date1,int[] date2) {
		LocalDate someDate = LocalDate.of(date1[2], date1[1], date1[0]);
		String days=someDate.getDayOfWeek().toString();
		System.out.println(days);
	}
	public void rating() {
		int lakewood =3;
		int bridgewood=4;
		int ridgewood=5;
		System.out.println(hotelNam1+"  Rating is "+lakewood+"  Star");
		System.out.println(hotelNam2+"  Rating is "+bridgewood+"  Star");
		System.out.println(hotelNam3+"  Rating is "+ridgewood+"  Star");
	}
 
	public void bestRatingHotel() {
		rating();
		int noOfHotel=3;
		int lakewood =3, bridgewood=4 , ridgewood=5;
		int array[]= {lakewood,bridgewood,ridgewood };
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
		int index=array.length/2;
		Arrays.sort(array);
		if (array[index]==lakewood) {
			System.out.println("The Best Rated Hotel is  "+hotelNam1+" & Price is "+rate1);
		}
		if (array[index]==bridgewood) {
			System.out.println("The Best Rated Hotel is  "+hotelNam2+" & Price is "+rate2);
		}
		if (array[index]==ridgewood) {
			System.out.println("The Best Rated Hotel is  "+hotelNam3+" & Price is "+rate3);
	}
		}
						
	public static void main(String args[]) throws ParseException {
		HotelReservation obj =new HotelReservation();
		// format put the date is (dd/mm/yyyy)
				int date1[]= {10,11,2020};
				int date2[]= {11,11,2020};
		obj.hotelNames(date1,date2);
		obj.bestRatingHotel();
	}
}