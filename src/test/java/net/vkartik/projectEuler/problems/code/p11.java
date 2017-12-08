package net.vkartik.projectEuler.problems.code;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class p11 {


	public static void main(String[] args) {
		
		Integer[][] input = new Integer[20][20];
		int max=0,m1;
		Scanner read=null;
		try	{
		read = new Scanner( new BufferedReader( new FileReader(new File("./src/p11_input"))));
		int i=0,j=0;
		while(read.hasNextInt())	{
			input[i][j]=read.nextInt();
			j++;
			if(j%20==0)	{
				j=0;
				i++;
			}
		}

		for(i=0;i<20;i++){
			for(j=0;j<20;j++)	{
				
				
				m1=checkProductAllDirection(input,i,j);
				System.out.println("i:"+i+" j:"+j+" m1:"+m1);
				if (m1>max)
					max=m1;
			}
		}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		
		System.out.println("Maximum:"+max);
	}
	
	static int checkProductAllDirection(Integer[][] input,int i,int j){
		int max=0;
		
		int i1,i2,i3,i4;
		int j1,j2,j3,j4;
		int pcol1,pcol2,prow1,prow2,pdiag1,pdiag2,pdiag3 = 0,pdiag4;
		ArrayList<Integer> maximum = new ArrayList<Integer>();
		
		//Col
		i1=i+1;
		i2=i+2;
		i3=i+3;
		i4=i;
		
		if(i1<20&&i2<20&&i3<20&&i4<20)	{
			System.out.println(input[i1][j]+" "+input[i2][j]+" "+input[i3][j]+" "+input[i4][j]);
			pcol1 = input[i1][j]*input[i2][j]*input[i3][j]*input[i4][j];
		}
		else	{
			pcol1=0;
		}
		
		maximum.add(pcol1);
		i1=i-1;
		i2=i-2;
		i3=i-3;
		i4=i;
		
		if(i1>0&&i2>0&&i3>0&&i4>0)	{
			System.out.println(input[i1][j]+" "+input[i2][j]+" "+input[i3][j]+" "+input[i4][j]);
			pcol2 = input[i1][j]*input[i2][j]*input[i3][j]*input[i4][j];
		}
		else	{
			pcol2=0;
		}
		maximum.add(pcol2);
		//Row
		
		j1=j-1;
		j2=j-2;
		j3=j-3;
		j4=j;
		
		
		
		if(j1>0&&j2>0&&j3>0&&j4>0)	{
			System.out.println(input[i][j1]+" "+input[i][j2]+" "+input[i][j3]+" "+input[i][j4]);
			prow2 = input[i][j1]*input[i][j2]*input[i][j3]*input[i][j4];
		}
		else	{
			prow2=0;
		}
		
		maximum.add(prow2);
		j1=j+1;
		j2=j+2;
		j3=j+3;
		j4=j;
		
		if(j1<20&&j2<20&&j3<20&&j4<20)	{
			System.out.println(input[i][j1]+" "+input[i][j2]+" "+input[i][j3]+" "+input[i][j4]);
			prow1 = input[i][j1]*input[i][j2]*input[i][j3]*input[i][j4];
		}
		else	{
			prow1=0;
		}
		maximum.add(prow1);
		
		//Diagonal one
		
		i1=i+1;j1=j+1;
		i2=i+2;j2=j+2;
		i3=i+3;j3=j+3;
		i4=i;j4=j;
		
		if(i1<20&&i2<20&&i3<20&&i4<20 && j1<20&&j2<20&&j3<20&&j4<20 )	{
			System.out.println(input[i1][j1]+" "+input[i2][j2]+" "+input[i3][j3]+" "+input[i4][j4]);
			pdiag1 = input[i1][j1]*input[i2][j2]*input[i3][j3]*input[i4][j4];
		}
		else	{
			pdiag1=0;
		}
		maximum.add(pdiag1);
		
		//Diagonal two
		
		i1=i-1;j1=j-1;
		i2=i-2;j2=j-2;
		i3=i-3;j3=j-3;
		i4=i;j4=j;
		
		if(i1>0&&i2>0&&i3>0&&i4>0 && j1>0&&j2>0&&j3>0&&j4>0 )	{
			System.out.println(input[i1][j1]+" "+input[i2][j2]+" "+input[i3][j3]+" "+input[i4][j4]);
			pdiag2 = input[i1][j1]*input[i2][j2]*input[i3][j3]*input[i4][j4];
		}
		else	{
			pdiag2=0;
		}
		maximum.add(pdiag2);
		
		//Diagonal three
		
				i1=i+1;j1=j-1;
				i2=i+2;j2=j-2;
				i3=i+3;j3=j-3;
				i4=i;j4=j;
				
				if(i1<20&&i2<20&&i3<20&&i4<20 && j1>0&&j2>0&&j3>0&&j4>0 )	{
					System.out.println(input[i1][j1]+" "+input[i2][j2]+" "+input[i3][j3]+" "+input[i4][j4]);
					pdiag3 = input[i1][j1]*input[i2][j2]*input[i3][j3]*input[i4][j4];
				}
				else	{
					pdiag3=0;
				}
				maximum.add(pdiag3);
				
				
		//Diagonal four
				
				i1=i-1;j1=j+1;
				i2=i-2;j2=j+2;
				i3=i-3;j3=j+3;
				i4=i;j4=j;
				
				if(i1>0&&i2>0&&i3>0&&i4>0 && j1<20&&j2<20&&j3<20&&j4<20 )	{
					System.out.println(input[i1][j1]+" "+input[i2][j2]+" "+input[i3][j3]+" "+input[i4][j4]);
					pdiag4 = input[i1][j1]*input[i2][j2]*input[i3][j3]*input[i4][j4];
				}
				else	{
					pdiag4=0;
				}
				maximum.add(pdiag4);		
				
		
		max = Collections.max(maximum);
		
		
		return max;
	}

}
