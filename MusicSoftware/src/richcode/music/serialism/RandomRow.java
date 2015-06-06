package richcode.music.serialism;
import richcode.music.*;
public class RandomRow
{
	public static boolean inputIsInArray(int input, int[] inputArr)
	{
		boolean result = false;
		for (int i = 0; i < inputArr.length; i++)
		{
			if (input == inputArr[i])
			{
				result = true; 
			}
		}
		return result;
	}
	public static Row getRandomRow()
	{
		Row result = null;		
		Pitchclass[] randomResult = new Pitchclass[12];
		int[] rand = new int[12];
		for (int i = 0; i < rand.length; i++)
		{
			rand[i] = 0;
		}
		int[] usedNumbers = new int[12];
		for (int i = 0; i < usedNumbers.length; i++)
		{
			usedNumbers[i] = 13;
		}
		for (int i = 0; i < usedNumbers.length; i++)
		{
			do 
			{
				rand[i] = (int)(Math.random()*12);			
			} while (inputIsInArray(rand[i], usedNumbers));
			usedNumbers[i] = rand[i];
			//System.out.print(rand[i]+" ");
		}
		for (int i = 0; i < randomResult.length; i++)
		{
			randomResult[i] = Pitchclass.parse(usedNumbers[i]);
		}
		result = new Row(randomResult);	
		return result;
	}
	public static void main(String[] args)
	{
		System.out.println();
		Row randomPrimeRow = getRandomRow();
		Matrix randomMatrix = new Matrix(randomPrimeRow);
		System.out.println();
		randomMatrix.printLetters();
		System.out.println();
	}
}
//make boolean that checks a number against all elements in an array.