package com.practice;

import java.util.Scanner;

import javax.swing.SortingFocusTraversalPolicy;

public class SystemDemo {

	public static void main(String[] args) {

		
	int i,j,counter,num;
	i=j=0;
	counter=0;
	int arr[]={2,5,4,7,3,4,5,1,2,5,4,7};
	//System.out.println(arr.length-);
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the range");
	num=sc.nextInt()-1;
	for(i=0;i<arr.length;)
	{
		
		j=arr[arr.length-1-num];
		//System.out.print(j);
		if(arr[i]==j)
		{
			counter++;
			System.out.print(j+" ");
			i++;
			if(num==0)
				break;
			--num;				
		}
		else
		{
			System.out.println("No match found");
			break;
		}
	}
	if(counter>3)
	System.out.println("Match Found");
	}
}
