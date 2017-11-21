package com.daytonadayneRestaurantRole;

import java.util.*;
import java.util.Scanner;

public class RestaurantRole {
  
	static int dice1;
	static int dice2;
	static String contYorN = "Y";
	Scanner userScan = new Scanner(System.in);
	
	
	public static void main(String[] args) 
	{
		welcomeRole();
		rollDice();
	}
	
	public static void welcomeRole() 
	{
		System.out.print("Welcome to 'Where to eat Random Restaurant Role Game'.\n");
	}
	
	public static void rollDice()
	{
		dice1 = (int)(Math.random() * 6)+ 1;
		dice2 = (int)(Math.random() * 6)+ 1;
		
		int sum = dice1 + dice2;
		
		if(sum == 1)
		{
			System.out.print("Your winning number is: " + sum + ".\nThat means we need to head to those Golden Archers.\n" 
		+ "McDOnald's, I'm Lovin it.");
		}else if(sum == 2)
		{
			System.out.print("Your winning number is: " + sum + ".\nGo to Burger King where you can have it your way.");
		} else if (sum == 3)
		{
			System.out.print("Your winning number is: " + sum + ".\nIt waaaaay better than Fast Food. It's Wendy's.");
		}else if (sum == 4)
		{
			System.out.print("Your winning number is: " + sum + ".\nTime for some of that finger lickin good KFC.");
		}else if (sum == 5)
		{
			System.out.print("Your winning number is: " + sum + ".\nLove that chicken from Popeyes.");
		}else if (sum == 6)
		{
			System.out.print("Your winning number is: " + sum + ".\nChurch's got a whole lot of Chicken Genius's.");
		}else if (sum == 7)
		{
			System.out.print("Your winning number is: " + sum + ".\nThe only place were a kid can be a kid and an adult can be a kid is Chuck E. Cheese.");
		}else if (sum == 8)
		{
			System.out.print("Your winning number is: " + sum + ".\nGet the Door. It's Domino's.");
		}else if (sum == 9)
		{
			System.out.print("Your winning number is: " + sum + ".\nDo something different. Try Dairy Queen.");
		}else if (sum == 10)
		{
			System.out.print("Your winning number is: " + sum + ".\nEat mor Chickin from Chic-fil-A.");
		}else if (sum == 11)
		{
			System.out.print("Your winning number is: " + sum + ".\nLittle Caesars is all about that Pizza! Pizza!.");
		}else if (sum == 12)
		{
			System.out.print("Your winning number is: " + sum + ".\nIf you want food with integrity go to Chipotle Mexican Grill.");
		}
	}
}
