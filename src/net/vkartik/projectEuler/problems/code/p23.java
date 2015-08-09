package net.vkartik.projectEuler.problems.code;

import java.util.ArrayList;

public class p23 {


	public static void main(String[] args) {
			
		boolean[] sumOfTwoAbundantList = new boolean[28123];
		ArrayList<Integer> abundantNumbers = new ArrayList<Integer>();
	
		for(int i=0;i<28123;i++)	{
			if(sumOfFactors(i)>i)	{
				abundantNumbers.add(i);
			}
		}
		
		for(int i=0;i<abundantNumbers.size();i++){
			for(int j=0;j<abundantNumbers.size();j++){
				if(abundantNumbers.get(i)+abundantNumbers.get(j) < 28123)
					sumOfTwoAbundantList[abundantNumbers.get(i)+abundantNumbers.get(j)] = true;
			}
		}
		
		int sum=0;
		
		for(int i=0;i<28123;i++){
			if(sumOfTwoAbundantList[i]==false)	{
				sum+=i;
			}
		}
		
		System.out.println(sum);
			
	}

	
	
	static int sumOfFactors(int i){
		int sum=0;
		for(int j=1;j<i;j++){
			if(i%j==0)	{
				sum+=j;
			}
		}		
		return sum;
	}
}
