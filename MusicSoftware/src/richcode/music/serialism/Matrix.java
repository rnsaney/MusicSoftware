package richcode.music.serialism;
import richcode.music.*;
import java.util.*;
public class Matrix
{
	//following 2 are package private, indicated by no modifier. Previously was private
	Row[] m;
	Row pr;
	
	public Matrix(Row inputR)
	{
		this.pr = inputR;
		this.m = new Row[inputR.r.length];

		for (int i = 0; i < inputR.r.length; i++)
		{
			Row eachTransposition = Row.transposeRow(inputR, -inputR.r[i].value);
			this.m[i] = eachTransposition;
		}
	}
	//method for finding a row given the first pc
	public static Row searchMatrix (Matrix input, String userFirstPitchclass)
	{
		Pitchclass userPC = Pitchclass.parse(userFirstPitchclass);

		for (int i =0; i < input.m.length; ++i)
		{
			if (userPC == input.m[i].r[0])
			{	
				return input.m[i];
			}
		}
		return null;	
	}
	//method for printing the matrix
	public void printLetters()
	{
		for (int i = 0; i < this.m.length; i++)
		{
			this.m[i].printLetters();
		}
	}
	//method for printing a row in a Matrix starting with a specified pitchclass
	public static void searchThenPrintRow(Matrix chosenMatrix, String chosenPitchclass)
	{
		searchMatrix(chosenMatrix, chosenPitchclass);
		Pitchclass firstPC = Pitchclass.parse(chosenPitchclass); 
		for (int i =0; i < chosenMatrix.m.length; i++)
		{
			if (firstPC == chosenMatrix.m[i].r[0])
			{
				chosenMatrix.m[i].printLetters();
				break;
			}
		}
	}
}