package net.vkartik.projectEuler.problems.code;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class p26 {

	 public static void main(String[] args) {
	      int longestCycle = 0;
	      long dividend = 0;
	      for(int i=2;i<1000;i++){
	         int cycle = getCycleLength(i);
	         if(cycle>longestCycle){
	            dividend = i;
	            longestCycle=cycle;
	         }
	      }
	      System.out.println("Longest Cycle : "+longestCycle+" For 1/"+dividend);
	   }
	   
	   public static int getCycleLength(int i){
	      int position = 0;
	      int value =1;
	      int[] foundRemainders = new int[i];
	      while(foundRemainders[value] == 0 && value!=0){
	         foundRemainders[value] = position;
	         value  = (value*10) % i;
	         position++;						
	      }
	      return position;
	   }
}
