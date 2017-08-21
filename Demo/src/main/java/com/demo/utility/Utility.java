package com.demo.utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility {
	public static String getSysDateAndTime() {
		String currDateAndTime = "01/01/1990 HH:mm:ss";
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		Date date = new Date();
		currDateAndTime = dateFormat.format(date);
		return currDateAndTime;

	}

	public static String splitSring(String stringToSplit, int stringPosition, String delimiter) {
		String splitedSubstring = "test";

		String[] fullString = stringToSplit.split(delimiter);
		splitedSubstring = fullString[stringPosition];

		return splitedSubstring;

	}

	
	public static String getTimeForScreenShot() {
		String currDateTime = "01_01_01";
		String timeOnly = splitSring(getSysDateAndTime(), 1, " ");
		
		String hh = splitSring(timeOnly, 0, ":");
		String mm = splitSring(timeOnly, 1, ":");
		String ss = splitSring(timeOnly, 2, ":");
		currDateTime = hh+"-"+mm+"-"+ss;
		return currDateTime;
	}
	
	public static String getDateTimeForScreenShot() {
		String currDateTime = "01_01_1990";
		String Date = splitSring(getSysDateAndTime(), 0, " ");
		currDateTime = Date+"_"+getTimeForScreenShot();
		return currDateTime;
	}
	
	
}
