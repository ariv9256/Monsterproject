package modelpackage;

public class MarshmallowMonster
{
	//Declaration Section 
	private String name; 
	private double legCount; 
	private int eyeCount;
	private boolean hasNoses;
	private int armCount;
	
	public MarshmallowMonster()
	{
		//Default constructor, not very helpful.
	}
	
	public MarshmallowMonster(String name)
	{
		this.name = name;
	}
	public MarshmallowMonster (String name, double legCount, int eyeCount, boolean hasNose, int armCount)
	{
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNose;
		this.armCount = armCount;
		
	}
	
	public String toString()
	{
		String description = "This monster is named: " + name + " and it has " + legCount + " legs... " + "Its favorite silly/scary/spooky thing to say is: " + "boo!";
		
		return description;
	}
}
