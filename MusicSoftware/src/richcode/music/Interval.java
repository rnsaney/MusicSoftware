package richcode.music;
import java.util.*;
/*
An interval is the distance between two notes. This involves having the pitchclass and the
note name for the two notes.

*/
public enum Interval
{
//	dim1("1˚", 1),
	per1("P1", 0, 1, true), //correct 0 F
	aug1("1+", 1, 1, false), //to min2   F
	dim2("2˚", 0, 2, false), //to per1   L
	min2("m2", 1, 2, true), //correct 1 L
	maj2("M2", 2, 2, true), //correct 2 F
	aug2("2+", 3, 2, false), //to min3   F
	dim3("3˚", 2, 3, false), //to maj2   L
	min3("m3", 3, 3, true), //correct 3 L
	maj3("M3", 4, 3, true), //correct 4 F
	aug3("3+", 5, 3, false), //to per4   F
	dim4("4˚", 4, 4, false), //to maj3   L
	per4("P4", 5, 4, true), //correct 5 L
	aug4("4+", 6, 4, true), //correct 6 F
	dim5("5˚", 6, 5, true), //correct 6 L (either 4+/5˚ works)
	per5("P5", 7, 5, true), //correct 7 F
	aug5("5+", 8, 5, false), //to min6   F
	dim6("6˚", 7, 6, false), //to per5   L
	min6("m6", 8, 6, true), //correct 8 L
	maj6("M6", 9, 6, true), //correct 9 F
	aug6("6+", 10, 6, false),//to min7   F
	dim7("7˚", 9, 7, false), //to maj6   L
	min7("m7", 10, 7, true),//correct 10L
	maj7("M7", 11, 7, true),//correct 11F
	aug7("7+", 12, 7, false),//to per8   F
	dim8("8˚", 11, 8, false),//to maj7   L
	per8("P8", 12, 8, true),//correct 12L
	aug8("8+", 13, 8, false);//to min2   FL
	public final String text;
	public final int halfSteps;
	public final int basicForm;
	public final boolean preferredForm;
	Interval(String text_input, int halfSteps_input, int basicForm_input, boolean preferredForm_input)
	{
		this.text = text_input;	
		this.halfSteps = halfSteps_input;
		this.basicForm = basicForm_input;
		this.preferredForm = preferredForm_input;
	}
	public String getText()
	{
		return this.text;	
	}
	public int getHalfSteps()
	{
		return this.halfSteps;
	}
	public int getBasicForm()
	{
		return this.basicForm;
	}
	public boolean getPreferredForm()
	{
		return this.preferredForm;
	}
	public static Interval getRandomInterval()
	{
		Interval[] allIntervals = Interval.values();
		int randomIndex = (int)(Math.random()*allIntervals.length);
		return allIntervals[randomIndex];
	}
}
