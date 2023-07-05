package com;

import java.util.Arrays;
import java.util.Scanner;

public class PayMoney {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of  transcation array");
    int size = sc.nextInt();
    int[] transcations = new int[size];
    for (int i = 0; i< transcations.length; i++) {
    	System.out.println("Enter the values of array: ");
    transcations[i] = sc.nextInt();
    }
	
    System.out.println("Given  transcation Array : " +Arrays.toString(transcations));
    System.out.println("Enter the number of targets that need to be achieved:");
    int numTargets = sc.nextInt();
    
   
     for  (int i = 0;i < transcations.length; i++) {
    	 System.out.println("Enter the value of target");
    	 int target = sc.nextInt();
    	 
    	 int sum = 0;
    	 for(int j=0; j< transcations.length; j++) {
    		 sum+= transcations[j];
    		 
    		 if (sum>= target) {
    			 
    			 System.out.println("Target achieved after " +(j+1) + "transcations");
    			break; 
    		 }
    	 }
    	 
    	 
    	 }
    		 
     }
    
	}

