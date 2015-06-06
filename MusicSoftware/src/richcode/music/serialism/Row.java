package richcode.music.serialism;
import richcode.music.*;
import java.util.*;
public class Row
{
	//following is package private, indicated by no modifier. Previously was private
	Pitchclass[] r;
	
	public Row(Pitchclass[] inputR)
	{
		this.r = inputR;
	}
	public Row getRetrogradeRow()
	{
		Pitchclass[] result = new Pitchclass[this.r.length];
		
		for (int i = 0; i < this.r.length; i++)
		{
			result[i] = this.r[this.r.length - 1 - i];	
		}
		return new Row(result);
	}
	public Row getInversionRow()
	{
		Pitchclass[] result = new Pitchclass[this.r.length];
		
		for (int i = 0; i < this.r.length; i++)
		{
			result[i] = this.r[i].invertPitchclass();	
		}

		return new Row(result);
	}		
	public void printLetters()
	{
		for (Pitchclass pc : this.r)
		{
			System.out.print(pc.letter+" ");
		}
		System.out.println();
	}
	public static Row transposeRow(Row input, int x)
	{
		int[] rowIntegers = new int[input.r.length];
		 
		for (int i = 0; i < input.r.length; ++i)
		{
			rowIntegers[i] = input.r[i].value + x;
		}
		
		Pitchclass[] result = new Pitchclass[input.r.length];
		
		for (int i = 0; i < input.r.length; i++)
		{
			result[i] = Pitchclass.parse(rowIntegers[i]);	
		}
		return new Row(result);
	}
	
}