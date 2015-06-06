/*Richard Saney

This program enumerates the notenames

*/
package richcode.music;
import java.util.*;
public enum NoteName
{
	C(0,"C", Pitchclass._0),
	D(1,"D", Pitchclass._2),
	E(2,"E", Pitchclass._4),
	F(3,"F", Pitchclass._5),
	G(4,"G", Pitchclass._7),
	A(5,"A", Pitchclass._9),
	B(6,"B", Pitchclass.e);
	public final int value;
	public final String letterName;
	public final Pitchclass basePitchclass;
	NoteName(int value_input, String letterName_input, Pitchclass basePitchclass_input)
	{
		this.value = value_input;
		this.letterName = letterName_input;
		this.basePitchclass = basePitchclass_input;
	}
	public int getValue()
	{
		return this.value;
	}
	public String getLetterName()
	{
		return this.letterName;
	}
	public Pitchclass getBasePC()
	{
		return this.basePitchclass;
	}
}