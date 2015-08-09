package net.vkartik.projectEuler.problems.code;

import java.math.BigInteger;
import java.util.ArrayList;

public class p25 {


	public static void main(String[] args) {
		
		BigInteger f1= new BigInteger("1");
		BigInteger f2= new BigInteger("1");		
		BigInteger f3 = new BigInteger("0");
		
		
		int i=0;
		i+=2;
		while(!detectDigits(f3))	{
			f3= new BigInteger("0");
			f3=f3.add(f1);
			f3=f3.add(f2);
			
			f1=f2;
			f2= new BigInteger(f3.toString());
			i++;
			//System.out.println(f3.toString()+" "+i);
		}
		
		System.out.println(i);
		
			
	}
	
	static boolean detectDigits(BigInteger tmp){
		
		if(tmp.toString().length()==1000)	{
			return true;
		}
		else	{
			return false;
		}
		
	}

}
