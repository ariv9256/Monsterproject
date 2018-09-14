package modelpackage;

public class MarshmallowMonster
{
	//Declaration Section 
	private String name; 
	private double legCount; 
	private int eyeCount;
	private boolean hasNoses;
	private int armCount;
	// 12-58 Is Getter values
	// 59-83 Is Setter values
	public MarshmallowMonster()
	{
		//Default constructor, not very helpful.
	}
	
	public MarshmallowMonster(String name)
	{
		this.name = name;
	}
	
	public MarshmallowMonster (String name, double legCount, int eyeCount, boolean hasNoses, int armCount)
	{
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNoses;
		this.armCount = armCount;
		
	}
	
	// Getting leg, arm, eye, name, and nose count
	public String getName()
	{
		return name;
	}
	
	public double getLegCount()
	{
		return legCount;
	}
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public boolean getHasNoses()
	{
		return hasNoses;
	}
	
	public int getArmCount()

	{
		return armCount;
	}
	
	// Sets name, legs, eyes, noses, and arms variable names
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setLegCount(double legCount)
	{
		this.legCount = legCount;
	}
	
	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}
	
	public void setHasNoses(boolean hasNoses)
	{
		this.hasNoses = hasNoses;
	}
	
	public void setArmCount(int armCount)
	{
		this.armCount = armCount;
	}
	
	public String toString() //Outputting monster information that the user types in
	{
		String description = "This monster is named: " + name + " and it has " + legCount + " legs... " + "Its favorite silly/scary/spooky thing to say is: " + "boo!";
		
		return description;
	}
}
