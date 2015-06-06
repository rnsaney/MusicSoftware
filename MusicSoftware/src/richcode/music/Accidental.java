/*
Richard Saney
Last Edit: Oct 22, 2014
Purpose: Define the accidental modifiers
*/

package richcode.music;
import java.util.*;
public enum Accidental
{
	DOUBLEFLAT("bb", -2, "eses","bb"),
	FLAT("b", -1, "es","b"),
	NATURAL("", 0, "",""),
	SHARP("#", 1, "is","s"),
	DOUBLESHARP("##", 2, "isis","x");
	
	public final String modifier;
	public final int increment;
	public final String lpSyn;
	public final String lpLyr;
	
	Accidental(String modifier_input, int increment_input, String lpSyn_input, String lpLyr_input)
	{
		this.modifier = modifier_input;
		this.increment = increment_input;
		this.lpSyn = lpSyn_input;
		this.lpLyr = lpLyr_input;
	}
	public int getIncrement()
	{
		return this.increment;
	}
	public String getModifier()
	{
		return this.modifier;
	}
	public String getLPSyn(){
		return this.lpSyn;
	}
	public String getLPLyr(){
		return this.lpLyr;
	}	
	public static Accidental getRandomSingleAccidental(){
		Accidental result = Accidental.NATURAL;
		switch ((int)(Math.random()*3)){
			case 0:
				result = Accidental.FLAT;
				break;
			case 1:
				result = Accidental.NATURAL;
				break;
			case 2:
				result = Accidental.SHARP;
				break;
		}
		return result;
	}
}
