package net.vkartik.projectEuler.problems.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DigitFifthPowers {

	public int run() {
		
		long sum=0;
		for(long i=10;i<=10000000;i++)	{
			if(i==digitsToFifthPowersSum(integerToDigits(i)))	{
				sum+=i;
			}
		}
		
		System.out.println(sum);
		
		return 0;
	}

	List<Integer> integerToDigits(long n){
		
		List<Integer> list = new ArrayList<Integer>();
		while(n>0){
			list.add((int) (n%10));
			n=n/10;
		}
		Collections.reverse(list);
		
		return list;
	}
	
	long digitsToFifthPowersSum(List<Integer> list){
		
		long num=0;
		for(Integer i:list){
			num+=(i*i*i*i*i);
		}
		
		return num;
	}
}
