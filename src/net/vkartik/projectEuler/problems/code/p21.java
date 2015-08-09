package net.vkartik.projectEuler.problems.code;

public class p21 {
	
	public static void main(String[] args) {
			
		boolean[] amicableList = new boolean[10000];
		
		int sum=0;
		for(int i=1;i<10000;i++)	{
			
			if(!amicableList[i])	{
			
				int pair = testAmicable(i);
				if(pair !=0){
				amicableList[i]=true;
				amicableList[pair]=true;
				System.out.println(i+" "+pair);
				sum+=i;
				sum+=pair;
			}
		}
	
			
	}

		System.out.println(sum);
}
	static int testAmicable(int i)	{
	
		int s1 = sumOfFactors(i);
		int s2 = sumOfFactors(s1);
		
		if(i==s2 && s1!=s2){
			return s1;
		}
		else	{
			return 0;
		}
		
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
