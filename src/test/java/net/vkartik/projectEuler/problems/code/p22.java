package net.vkartik.projectEuler.problems.code;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class p22 {


	public static void main(String[] args) {
		Scanner read = null;
		ArrayList<String> names = new ArrayList<String>();
		String alphabets="0ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		try 	{			
			read = new Scanner(new BufferedReader(new FileReader(new File("./src/names.txt"))));
			read.useDelimiter(",");
			
		while(read.hasNext())	{
			StringBuilder buffer = new StringBuilder(read.next());
			String str=buffer.substring(1, buffer.length()-1);
			names.add(str);
		}
		}
		catch(Exception ex)	{
			ex.printStackTrace();
		}
		
		Collections.sort(names);
		
		BigInteger sumRank = new BigInteger("0");
		
		for(int i=0;i<names.size();i++){
			int sum=0;
			for(char c:names.get(i).toCharArray()){
				sum+=alphabets.indexOf(c);
			}
			sum=sum*(i+1);			
			sumRank=sumRank.add(new BigInteger(String.valueOf(sum)));
		}
		
		System.out.println(sumRank.toString());
	}
	
	
}
