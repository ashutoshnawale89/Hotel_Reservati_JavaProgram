package com.program;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HotelReservation {
	public void cheapestHotel(int date1[],int date2[],String customerStatus) throws Exception{
		Scanner sc =new Scanner(System.in);
		int stayDays=date2[0]-date1[0]+1;
		String hotel1="Lakewood", hotel2="Ridgewood",hotel3="Bridgewood";
		int rating1=3;
		int rating2=4;
		int rating3=5;
		int hotelRate1,hotelRate2,hotelRate3;
		String days;
		try {
			LocalDate someDate=LocalDate.of(date1[2], date1[1], date1[0]);
			days=someDate.getDayOfWeek().toString();
		}
		catch (DateTimeException e) {
			throw new Exception(e);
		}
		if ("SUNDAY".equals(days) || "SATURDAY".equals(days)) {
			if ("reward"==customerStatus) {
				hotelRate1=80;  hotelRate2=150;   hotelRate3=100;
			}else {
				hotelRate1=150;  hotelRate2=180;   hotelRate3=210;
			}
		}
		else {
			if ("reward"==customerStatus) {
				hotelRate1=80;  hotelRate2=100;   hotelRate3=40;
			}
			else {
				hotelRate1=150;  hotelRate2=180;   hotelRate3=210;
			}
		}
		int arr[]= {rating1,rating2,rating3};
		Arrays.sort(arr);
		int rating=arr[arr.length-1];
		if (rating == rating1) {
			System.out.println("The Cheapest Best Rated Hotel is : "+hotel1+" The Rating is :"+rating1);
			System.out.println("Price is : "+(hotelRate1*stayDays));
		}
		if (rating == rating2) {
			System.out.println("The Cheapest Best Rated Hotel is : "+hotel2+" The Rating is :"+rating2);
			System.out.println("Price is : "+(hotelRate2*stayDays));
		}
		if (rating == rating3) {
			System.out.println("The Cheapest Best Rated Hotel is : "+hotel3+" The Rating is :"+rating3);
			System.out.println("Price is : "+(hotelRate3*stayDays));
		}


	}
	public static void main(String[] args) throws Exception {
		HotelReservation obj=new HotelReservation();
		int date1[]={9,10,2022};
		int date2[]={10,10,2022};
		obj.cheapestHotel(date1, date2,"reward");
	}
}