package controllerpackage;

import java.util.Scanner;

import modelpackage.MarshmallowMonster;

public class Controller
{
	//Data member and Declaration section
	
	private MarshmallowMonster myMonster;
	
	private MarshmallowMonster userMonster;
	
	private Scanner inputScanner; 
	
	public Controller() // Defined Variables
	{
		myMonster = new MarshmallowMonster("Billy", 6.0, 4, false, 0);
		userMonster = new MarshmallowMonster();// Defines NOT myMonster but a different Monster
		inputScanner = new Scanner(System.in);// Defines the inputScanner variable
	}

	public void start() // Question, Input, Set/Get variable, Output.
	{
		System.out.println(myMonster);// only my monster
		
		System.out.println("What would you like to name your monster?");
		String name = inputScanner.nextLine();
		userMonster.setName(name);
		System.out.println("Your monster's name is... " + userMonster.getName());
		
		System.out.println("How many arms for your monster?");
		int arms = inputScanner.nextInt();
		userMonster.setArmCount(arms);
		System.out.println("Your monster has " + userMonster.getArmCount() + " arms!");
		
		System.out.println("How many eyes for your monster?");
		int eyeCount = inputScanner.nextInt();
		userMonster.setEyeCount(eyeCount);
		System.out.println("Your monster has " + userMonster.getEyeCount() + " eyes!");
		
		System.out.println("How many legs for your monster?");
		double legCount = inputScanner.nextDouble();
		userMonster.setLegCount(legCount);
		System.out.println("Your monster has " + userMonster.getLegCount() + " many legs!");
		
		System.out.println("Do you want your monster to have a nose?");
		boolean hasNoses = inputScanner.nextBoolean();
		userMonster.setHasNoses(hasNoses);
		System.out.println("Your monster has a nose: " + userMonster.getHasNoses());
		inputScanner.close();
		//All code above is based around asking for input, taking the input, and showing the input using the different variables.	
	}
}


