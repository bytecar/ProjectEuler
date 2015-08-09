package net.vkartik.projectEuler.problems.code;

import java.io.*;
import java.util.Scanner;

public class p18 {


	public static void main(String[] args) {
		
		int[][] input = new int[15][15];
		
		try {
		Scanner read = new Scanner(new BufferedReader(new FileReader(new File("./src/p18_input"))));
		int i=0,j=0;
		while(read.hasNextLine())	{
			String str = read.nextLine();
			for(String ints:str.split(" "))	{				
				input[i][j]=Integer.parseInt(ints);
				j++;				
			}
			j=0;
			i++;
		}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		
		System.out.println(input);
			
	}
	
	

}
