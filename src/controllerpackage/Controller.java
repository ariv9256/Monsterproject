package controllerpackage;

import modelpackage.MarshmallowMonster;

public class Controller
{
	//Data member and Declaration section
	
	private MarshmallowMonster myMonster;
	
	public Controller()
	{
		myMonster = new MarshmallowMonster("Billy", 6.0, 4, false, 0);
	}
	
	public void start()
	{
		System.out.println(myMonster);
	}
}
