package com.company;


import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	while(true) {
    	System.out.println("Select an option: ");
    	System.out.println("1: Buy Items ");
    	System.out.println("2: Show Offers ");
    	System.out.println("3: Quit ");
    	if(scan.hasNextInt()) {
    		int selectedOption = scan.nextInt();
    		
    		switch(selectedOption) {
    		case 1:
    			System.out.println("Select an option: ");
    	    	System.out.println("1: Buy Item A ");
    	    	System.out.println("2: Buy Item B ");
    	    	System.out.println("3: Buy Item C ");
    	    	System.out.println("4: Buy Item D ");
    	    	System.out.println("5: Buy Item E ");
    	    	if(scan.hasNextInt()) {
    	    		selectedOption = scan.nextInt();
    	    		switch(selectedOption) {
    	    		case 1:
    	    			break;
    	    		case 2:
    	    			break;
    	    		case 3:
    	    			break;
    	    		case 4:
    	    			break;
    	    		case 5:
    	    			break;
    	    		default:
    	    			break;
    	    		}
    	    	}
    	    	else {
    	    		System.out.println("Invalid input ");
    	        	
    	    	}
    			break;
    		case 2:
    			System.out.println("Select an option: ");
    	    	System.out.println("1: Buy 2 Item A for £1");
    	    	System.out.println("2: Buy 3 Item C, get one free ");
    	    	System.out.println("3: Buy Item D & E for £3 ");
    	    	if(scan.hasNextInt()) {
    	    		selectedOption = scan.nextInt();
    	    		switch(selectedOption) {
    	    		case 1:
    	    			break;
    	    		case 2:
    	    			break;
    	    		case 3:
    	    			break;
    	    		default:
    	    			break;
    	    		}
    	    	}
    	    	else {
    	    		System.out.println("Invalid input ");
    	        	
    	    	}
    			
    	    	
    			break;
    		default:
    			break;
    		}
    	}
    	else {
    		System.out.println("Invalid input ");
        	
    	}
    	}
    	
    	
    }
}
