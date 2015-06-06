package richcode.music;
import java.util.*;
//An enum creates a finite set of identifiable constants 
//-- also, an enum creates a type, which means objects of that type are to be recognized and treated similarly. 
public enum Pitchclass 
{
	_0(0,"0",'0'), 
	_1(1,"1",'1'), 
	_2(2,"2",'2'), 
	_3(3,"3",'3'), 
	_4(4,"4",'4'), 
	_5(5,"5",'5'), 
	_6(6,"6",'6'), 
	_7(7,"7",'7'), 
	_8(8,"8",'8'), 
	_9(9,"9",'9'), 
	t(10,"t",'t'), 
	e(11,"e",'e');
	//objects of the Enum type Pitchclass have three properties, an int, a String, and a char
	public final int value;
	//declares an integer named value
	public final String text;
	//declares an String named text
	public final char letter;
	//The following method is a special method, a constructor method
	//a constructor method does not have a return type, and its name must
	//be the same as the name of the class or enum it is defined inside of.
	//A constructor method is called when a new object is being created.
	Pitchclass(int correlatoryValue, String correlatoryText, char correlatoryLetter)
	{
		this.value = correlatoryValue; //defines the declared integer named value (assigns it the value of correlatoryValue)
		this.text = correlatoryText; //defines the declared String named text (assigns it the value of correlatoryText)
		this.letter = correlatoryLetter;
	}
	//Correlates the identifiers to instantiated objects
	public int getValue()
	{
		return this.value;
	}
	public String getText()
	{
		return this.text;
	}
	public Pitchclass invertPitchclass()
	{
		Pitchclass inverted_pc = null;
		switch (this)
		{
			case _0 : 
				inverted_pc = _0;
				break;
			case _1 : 
				inverted_pc = e;
				break;
			case _2 : 
				inverted_pc = t;
				break;
			case _3 : 
				inverted_pc = _9;
				break;
			case _4 : 
				inverted_pc = _8;
				break;
			case _5 : 
				inverted_pc = _7;
				break;
			case _6 : 
				inverted_pc = _6;
				break;
			case _7 : 
				inverted_pc = _5;
				break;
			case _8 : 
				inverted_pc = _4;
				break;
			case _9 : 
				inverted_pc = _3;
				break;
			case t : 
				inverted_pc = _2;
				break;
			case e : 
				inverted_pc = _1;
				break;					
		}	
		return inverted_pc;
	}
	public static Pitchclass parse(String input)
	//Coverts String input into Enum 
	{
		
		Pitchclass[] allPitchclasses = Pitchclass.values();
		//An Array called allPitchclasses contains all elements of the finite set of the enum Pitchclass
		
		for (Pitchclass pc : allPitchclasses)
		//enhanced for loop. the variable pc of type Pitchclass holds the current value of the allPitchclasses array.
		//Designed for iteration through an array
		{
			if (input.equals(pc.text))
			{
				return pc; 
			}
		}
		throw new RuntimeException("Pitchclass parse FAILURE: "+input);
		//an exception is something that stops the execution of the current method, because we can't return 
		//an object of the return type -- that wouldn't make any sense at this point in the method	
	}
	public static Pitchclass parse(int input)
	{
		Pitchclass[] allPitchclass = Pitchclass.values();
		for (Pitchclass pc : allPitchclass)
		{
			if (input%12 == pc.value)
			{
				return pc;
			}
			else if (input%12 + 12 == pc.value)
			{
				return pc;
			}
		}
		throw new RuntimeException("Pitchclass parse FAILURE: "+input);	
	}	
	public static Pitchclass[] convertToPitchclassArray(String[] inputArray)
	{
		Pitchclass[] result = new Pitchclass[inputArray.length];
		
		for (int i = 0; i < inputArray.length; ++i)
		{
			result[i] = parse(inputArray[i]);
		}
		return result;
	}
}