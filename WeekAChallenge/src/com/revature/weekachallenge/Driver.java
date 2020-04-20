package com.revature.weekachallenge;

import java.util.Scanner;

import com.revature.bean.UNSCSoldier;
import com.revature.bean.Spartan;

public class Driver {

	public static Scanner scanner = new Scanner(System.in); //Input
	
	public static void main(String[] args) {
		
		UNSCSoldier unscSoldier = new UNSCSoldier(); //object inizialite
		Spartan spartanSoldier = new Spartan(); //object inizialite
		
		String[] weaponsCarry = new String[3]; //array that holds weapons carry of soldier
		String weapons = "";
		
		
		
		System.out.println("Please choose which program to apply:");
		System.out.println("1.UNSC Soldier");
		System.out.println("2.Spartan Soldier");
		int userInput = scanner.nextInt();
	
		switch (userInput) {
		case 1:
			GetSoldierMethod(unscSoldier,scanner,weaponsCarry,weapons,userInput);
			break;
		case 2:
			GetSpartanMethod(spartanSoldier,scanner,weaponsCarry,weapons,userInput);
			
		default:
				System.out.println("You didn't choose anything");
				
		
			
		}

	}//class
	
	
	
	
	
	//Methods()
	
	
	
	
	
	public static void GetSpartanMethod(Spartan spartanSoldier,Scanner scanner,String[] weaponsCarry,String weapons,int userInput) {
		while(true)
		{
			System.out.println("What's your name soldier? ");
			spartanSoldier.setName(scanner.nextLine());
			if(!spartanSoldier.getName().isEmpty())
			{
				break;
			}
			System.out.println("Real funny soldier....");
			continue;
		}

		System.out.println("Please enter you're age: ");
		spartanSoldier.setAge(scanner.nextInt());
		
		System.out.println("Enter you weight: ");
		spartanSoldier.setWeight(scanner.nextInt());

		
		System.out.println("What's your rank soldier? ");
		spartanSoldier.setRank(scanner.nextLine());
		switchCaseValue(spartanSoldier.getRank().toLowerCase()); //switch case
		
		
		for(int i = 0; i <= 2; i++) // for loop
		{
			System.out.println("What's your weapon of used: ");
			while(true)
			{
				weapons = scanner.next().toLowerCase();
					if(weapons.isEmpty())
					{
					System.out.println("You just can't just go out there without a weapon soldier..");
						System.out.println("What's your weapon of used: ");
						continue;	
					}
				
				weaponsCarry[i] = weapons;
				break;
			}
			
		}
		
		for(String item:weaponsCarry) //foreach weapon you type
		{
			System.out.println("You choose:" +item +" ");
		}

		spartanSoldier.displayinfo(userInput);
		spartanSoldier.displayinfo(spartanSoldier.getName(), spartanSoldier.getRank());
		spartanSoldier.displayinfo(spartanSoldier.getAge(), spartanSoldier.getWeight(), spartanSoldier.getSpartanTag());
	}
	
	public static void GetSoldierMethod(UNSCSoldier unscSoldier,Scanner scanner,String[] weaponsCarry,String weapons,int userInput) {
		while(true)
		{
			System.out.println("What's your name soldier? ");
			unscSoldier.setName(scanner.nextLine());
			if(!unscSoldier.getName().isEmpty())
			{
				break;
			}
			System.out.println("Real funny soldier....");
			continue;
		}

		System.out.println("Please enter you're age: ");
		unscSoldier.setAge(scanner.nextInt());
		
		
		System.out.println("Enter you weight: ");
		unscSoldier.setWeight(scanner.nextInt());
		
		
		
		System.out.println("What's your rank soldier? ");
		unscSoldier.setRank(scanner.nextLine());
		switchCaseValue(unscSoldier.getRank().toLowerCase()); //switch case
		
		
		for(int i = 0; i <= 2; i++) // for loop
		{
			System.out.println("What's your weapon of used: ");
			while(true)
			{
				weapons = scanner.next().toLowerCase();
					if(weapons.isEmpty())
					{
					System.out.println("You just can't just go out there without a weapon soldier..");
						System.out.println("What's your weapon of used: ");
						continue;	
					}
				
				weaponsCarry[i] = weapons;
				break;
			}
			
		}
		
		for(String item:weaponsCarry) //foreach weapon you type
		{
			System.out.println("You choose:" +item +" ");
		}
		
		unscSoldier.displayinfo(userInput);
		unscSoldier.displayinfo(unscSoldier.getName(), unscSoldier.getRank());
		unscSoldier.displayinfo(unscSoldier.getAge(), unscSoldier.getWeight());
	}
	

	
	public static String switchCaseValue(String rank) {
	
		switch (rank.toLowerCase()) {
		case "recruit":
			System.out.println("Welcome Recruit");
			break;
			
		case "private":
			System.out.println("Welcome private");
			break;
			
		case "corporal":
			System.out.println("Welcome corporal");
			break;
			
		case "sergeant":
			System.out.println("Welcome corporal");
			break;
			
		case "captain":
			System.out.println("Welcome captain");
			break;
		
		default:
			System.out.println("Hmmm... I don't know that one, I'll put you on recruit");

		}
		
		return rank;
	}
	
	
	

}
