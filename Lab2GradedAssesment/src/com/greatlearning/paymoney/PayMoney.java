package com.greatlearning.paymoney;

import java.util.Scanner;

public class PayMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter size of transaction array: ");
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("\n Enter the values of array: ");
		int i;
		for(i=0;i<size;i++) {
			array [i]= sc.nextInt();

		}
		System.out.println("\n Enter total number of targets that need to be achived: ");
		int targetNo=sc.nextInt();
		while(targetNo--!=0) {
			int flag=0;
			int target;
			System.out.println("\n Enter the value of target: ");
			target =sc.nextInt();
			int sum=0;
			for(i=0;i<size;i++) {
				sum+=array[i];
				if(sum>=target) {
				System.out.println("\n Target achieved after : "+(i+1)+" transaction	");
				flag=1;
				break;
				}
			}
			if(flag==0) {
				System.out.println("\n Given target is not achieved");
			}
		}

	}
}