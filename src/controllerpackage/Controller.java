package controllerpackage;

import java.util.Scanner;
import modelpackage.MarshmallowMonster;
import javax.swing.JOptionPane; // New Swing class!

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
		JOptionPane.showMessageDialog(null, myMonster);
		System.out.println(myMonster);// only my monster
		
		//System.out.println("What would you like to name your monster?");
		//JOptionPane.showMessageDialog(null, "What would you like to name your monster?");
		//String name = inputScanner.nextLine();
		
		String userInput = JOptionPane.showInputDialog(null, "What would you like to name your monster?");
		String name = userInput;
		userMonster.setName(name);
		
		//userMonster.setName(name);
		//System.out.println("Your monster's name is... " + userMonster.getName());
		
		///System.out.println("How many arms for your monster?");
		//JOptionPane.showMessageDialog(null, "How many arms for your monster?");
		//int arms = inputScanner.nextInt();
		
		userInput = JOptionPane.showInputDialog(null, "How many arms for your monster?");
		int armCount = 0;
		if (validInt(userInput))
		{
			armCount = Integer.parseInt(userInput);
		}
		
		userMonster.setArmCount(armCount);
		if(armCount > 0)
		{
			JOptionPane.showMessageDialog(null, "your monster has " + userMonster.getArmCount() + " legs");
			
		}
		else
		{
			JOptionPane.showMessageDialog(null, "your monster has " + userMonster.getArmCount() + " legs, so sad.");
		}
		//System.out.println("Your monster has " + userMonster.getArmCount() + " arms!");
		
		//System.out.println("How many eyes for your monster?");
		//JOptionPane.showMessageDialog(null,  "How many eyes for your monster?");
		//int eyeCount = inputScanner.nextInt();
		
		userInput = JOptionPane.showInputDialog(null, "How many eyes for your monster?");
		int eyeCount = 0;
		if (validInt(userInput))
		{
			eyeCount = Integer.parseInt(userInput);
		}
		
		userMonster.setEyeCount(eyeCount);
		//System.out.println("Your monster has " + userMonster.getEyeCount() + " eyes!");
		
		//System.out.println("How many legs for your monster?");
		//JOptionPane.showMessageDialog(null, "How many legs for your monster?");
		//double legCount = inputScanner.nextDouble();
		
		userInput = JOptionPane.showInputDialog(null, "How many legs for your monster?");
		int legCount = 0;
		if(validInt(userInput))
		{
			legCount = Integer.parseInt(userInput);
		}
		
		
		userMonster.setLegCount(legCount);
		//System.out.println("Your monster has " + userMonster.getLegCount() + " many legs!");
		
		//System.out.println("Do you want your monster to have a nose?");
		//JOptionPane.showMessageDialog(null,  "Does your monster have a nose?");
		//boolean hasNoses = inputScanner.nextBoolean();
		
		userInput = JOptionPane.showInputDialog(null, "Does your monster have a nose? T/F");
		boolean hasNoses;
		hasNoses = Boolean.parseBoolean(userInput);
		
		userMonster.setHasNoses(hasNoses);
		//System.out.println("Your monster has a nose: " + userMonster.getHasNoses());
		
		//System.out.println("Your monsters name is " + userMonster.getName() + " and he has " + userMonster.getArmCount() + " arms, " + userMonster.getLegCount() + " legs, " + userMonster.getEyeCount() + " eyes, and has nose: " + userMonster.getHasNoses());
		//Added over all output data of all the variables in one sentence.
		JOptionPane.showMessageDialog(null, userMonster);
		inputScanner.close();
		//All code above is based around asking for input, taking the input, and showing the input using the different variables.
		
	}
	
	public boolean validInt(String maybeInt) // Swing boolean window responses for whole numbers
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You'll need to type in a whole number :D");
		}
		
		return isValid;
	}
	
	public boolean validDouble(String mightBeDouble) // Swing boolean window for decimals
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(mightBeDouble);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Type in a decimal value AKA a number with a . in the middle");
		}
		return isValid;
	}
}


