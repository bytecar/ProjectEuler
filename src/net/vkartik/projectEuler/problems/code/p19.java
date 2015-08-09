package net.vkartik.projectEuler.problems.code;

import java.util.Calendar;

public class p19 {

	public static void main(String[] args) {
		
		Calendar date = Calendar.getInstance();
		date.set(1901, 0, 1);
		
		Calendar end = Calendar.getInstance();
		end.set(2000, 11, 31);
		int sundays=0;
		while(date.compareTo(end) < 0)	{
			if(date.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)	{
				sundays++;	
				System.out.println(date.get(Calendar.DAY_OF_WEEK) +" "+ date.get(Calendar.MONTH) +" "+date.get(Calendar.YEAR));
			}
			
			if(date.get(Calendar.MONTH)==Calendar.DECEMBER){
				date.roll(Calendar.YEAR, true);
			}
			
			date.roll(Calendar.MONTH, true);
		}

		System.out.println(sundays);
	}

}
