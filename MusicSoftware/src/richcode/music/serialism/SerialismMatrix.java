/*
Richard Saney
Last Edit: Sat July 19 2014
Serialism Matrix
Goal: Create a program that takes an ordered row of 12 pitches and returns a Serialism Matrix (grid),
and allows the user to ask for any of the four types of ordered row modifications: Prime, 
Inversion, Retrograde, and Retrograde-Inversion. 
Prime is a transposition of the original Prime Row. Designated by first pitchclass.
Inversion reverses all intervalic directions from Prime Row. Designated by first pitchclass.
Retrograde reverses the pitch order, and therefore order of intervalic content. Designated by last pitchclass. 
Retrograde-Inversion reverses both the order and direction of intervalic content. Designated by last pitchclass. 
*/
//import informs the compiler of utilities that will be used
package richcode.music.serialism;
import richcode.music.*;
import java.util.Scanner;
import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.Arrays;
public class SerialismMatrix 
{
	//A boolean called containsDuplicates takes the input of the String array called anArray
	public static boolean containsDuplicates(String[] anArray)
	{
		List<String> inputList = Arrays.asList(anArray);
		//Converts the String array anArray into a List of Strings, 
		//then assigns that List of Strings to the variable named inputList
		Set<String> inputSet = new HashSet<>(inputList);
		//Coverts a List into a HashSet and then converts that into a Set called inputSet
		if(inputSet.size()< inputList.size())
		//Compares the collection size of the input in the forms of List and Set. If there were any duplicated elements,
		//they would have been lost between the List and Set forms, therefore making the Set smaller than the List. 
        {
            return true;     
        }
        return false;
	}
	
	public static void main(String[] args)
	{	
		System.out.println("\n\n___________________________________\n");
		System.out.println("This is the program SerialismMatrix.java\n");
		//PlayAudioClip.playAudio("/Users/richardsaney/Documents/ProgrammingwithNICK/SerialismMatrix/Anton Webern - Variations for orchestra op.30  part 1.wav");
		Scanner jimmy = new Scanner(System.in);
		//I love scanners that have names starting with J!
		Pitchclass[] primeRow = null;
		//An array of type Pitchclass exists, and it contains 12 elements. 	
		boolean invalidChoice = true;
		String userVerifyAnswer;
		Row prInput = null;
		while (invalidChoice)
		{
			System.out.println("Would you like a Random Row? (1)");
			System.out.println("Or would you like to choose your own Prime Row? (2)");
			userVerifyAnswer = jimmy.nextLine();
			if (userVerifyAnswer.trim().equalsIgnoreCase("1"))
			{
				invalidChoice = false;
				prInput = RandomRow.getRandomRow();
				primeRow = prInput.r;
				System.out.println("Establishing random Prime Row!");
				System.out.println();
			}
			else if (userVerifyAnswer.trim().equalsIgnoreCase("2"))
			{
				while (true)
				{
					System.out.println("\nWhat is your Prime Row?");
					System.out.println("\n(Incorrect input results in another prompting)");
					System.out.println("\nPlease use one of each pitch class with a space inbetween:");
					System.out.println("0 1 2 3 4 5 6 7 8 9 t e");
					String userPrimeRow = jimmy.nextLine();
					String delims = "[ ]+";
					//a regular expression that matches one or more consecutive space characters in a string. 
					//The split method recognizes the syntax of this String, but Java at this point only recognizes this as a String.
					String[] userPrimeRowElements = userPrimeRow.split(delims);
					//If the number of elements is not equal to 12 in the String array called userPrimeRowElements do the following			
					if (userPrimeRowElements.length != 12)
					{
						System.out.println("\n\nThe Prime Row length is not equal to 12, try again please.");
						continue;
						//run this while loop again 
					}
					//If there are duplicated elements in the array userPrimeRowElements, then do the following
					if (containsDuplicates(userPrimeRowElements))
					{ 
						System.out.println("\n\nThe Prime Row contained a duplicated pitchclass, try again please.");
						continue;
						//skip the rest of the loop and run this while loop again
					}
					try 
					{
						primeRow = Pitchclass.convertToPitchclassArray(userPrimeRowElements);
					}
					catch (RuntimeException rEx)
					{
						System.out.println(rEx.getMessage());
						continue;
					}
					System.out.println("\n\nGood Job! Your input was a valid Prime Row!");			
					break;
				}			
				//end while 
				//Assigns a Row calles prInput the Pitchclass [] primeRow
				prInput = new Row(primeRow);
				invalidChoice = false;
			}
			else
			{
				System.out.println("Answer is invalid. Please enter yes/no.");
			}
		}
		//Prints out the Prime Row as Pitchclasses
		System.out.println("\n\nYour Prime Row as Pitchclasses:");
		for (Pitchclass pc : primeRow)
		{
			System.out.print(pc+" ");
		}
		System.out.println();
		//Prints out the Prime Row in numbers
		System.out.println("\n\nYour Prime Row as numbers:");
		
		int[] primeRowNumbers = new int[primeRow.length];
		
		for (int i = 0; i < primeRow.length; ++i)
		{
			primeRowNumbers[i] = primeRow[i].value;
		}
		for (int x : primeRowNumbers)
		{
			System.out.print(x+" ");
		}
		System.out.println(" ");
		//Prints out the Inversion of the Prime Row 
		System.out.println("\n\nHere is the Inversion of your Prime Row in characters:  ");
		Row inversion_primeRow = prInput.getInversionRow();
		inversion_primeRow.printLetters();
		//Prints out the Retrograde in characters
		System.out.println("\n\nHere is the Retrograde of your Prime Row in characters:  ");
		Row retrograde_primeRow = prInput.getRetrogradeRow();
		retrograde_primeRow.printLetters();
		System.out.println("\n\nThe Retrograde Inversion:");
		Row retrograde_inversion_primeRow = prInput.getRetrogradeRow().getInversionRow();
		retrograde_inversion_primeRow.printLetters();	
		/*
		int count = 0;
		while (count < 2)
			{
			//Prints out a Pitchclass from any integer input
			System.out.println("\n\nPlease enter an integer by which to mod12 into a Pitchclass.");
			int userAnyInt = jimmy.nextInt();
		
			Pitchclass convertedInt = Pitchclass.parse(userAnyInt);
			System.out.println(convertedInt);
		
			count++;
			}
		System.out.println("\n\nNow let us modulate the prime row! Enter another integer by which to modulate.");
		int userModulateInt = jimmy.nextInt(); 
		jimmy.nextLine();
		Row modulated_primeRow = Row.transposeRow(prInput, userModulateInt);
		for (Pitchclass pc : modulated_primeRow.r)
		{
			System.out.print(pc+" ");
		}
		System.out.println();
		
		*/			
		//Prints out the Prime Row as Pitchclasses (again)
		System.out.println("\n\nYour Prime Row as Pitchclasses:");	
		for (Pitchclass pc : primeRow)
		{
			System.out.print(pc+" ");
		}
		System.out.println();		
		//Prints out the Matrix as a series of Prime Form Rows
		Matrix primeMatrix = new Matrix(prInput);
		System.out.println("\n\nThe Matrix as characters:");
		primeMatrix.printLetters();
		Matrix inversionMatrix = new Matrix(inversion_primeRow);
		Matrix retrogradeMatrix = new Matrix(retrograde_primeRow);
		Matrix retrograde_inversionMatrix = new Matrix(retrograde_inversion_primeRow);
//CONTINUE ROW SEARCH
		String userWantsToSearch = "y";
		do
		{
			String rowTypeChoice;
			System.out.println("\nChoose from one of the following options (1-5):");
			System.out.println("1) \tSearch for a prime row.");
			System.out.println("2) \tSearch for a inversion row.");
			System.out.println("3) \tSearch for a retrograde row.");
			System.out.println("4) \tSearch for a retrograde-inversion row.");
			System.out.println("5) \tQuit searching, and end your session.");
			System.out.print("\nPlease enter a number from 1 through 5: ");
			String userWhichRowSearch = jimmy.nextLine();
			if (userWhichRowSearch.toLowerCase().contains("prime") || userWhichRowSearch.startsWith("1"))
			{
				rowTypeChoice = "prime";
			}
			else if (userWhichRowSearch.equalsIgnoreCase("inversion") || userWhichRowSearch.startsWith("2"))
			{
				rowTypeChoice = "inversion";
			}
			else if (userWhichRowSearch.equalsIgnoreCase("retrograde") || userWhichRowSearch.startsWith("3"))
			{
				rowTypeChoice = "retrograde";
			}
			else if (userWhichRowSearch.equalsIgnoreCase("retrograde-inversion") || userWhichRowSearch.startsWith("4"))
			{
				rowTypeChoice = "retrograde-inversion";
			}
			else if (userWhichRowSearch.equalsIgnoreCase("quit") || userWhichRowSearch.equalsIgnoreCase("end") || userWhichRowSearch.startsWith("5"))
			{	
				rowTypeChoice = "quit";
				System.out.print("Are you sure? (y/n): ");
				String userWantsToExit = jimmy.nextLine();
				if (userWantsToExit.startsWith("y"))
				{
					break;
				}
				else
				{
					continue;
				}
			}
			else
			{
			System.out.println("\nYou entered an invalid response. So let's try again!\n");
			continue;
			}
			System.out.print("\nEnter the first Pitchclass of the "+rowTypeChoice+" row you would like to know: ");
			String userPC1 = jimmy.nextLine();
			switch (rowTypeChoice)
			{
				case "prime": 
					Matrix.searchThenPrintRow(primeMatrix, userPC1); //method at line 243 (at time of edit)
					break;
				case "inversion":
					Matrix.searchThenPrintRow(inversionMatrix, userPC1);
					break;
				case "retrograde":
					Matrix.searchThenPrintRow(retrogradeMatrix, userPC1);
					break;
				case "retrograde-inversion":
					Matrix.searchThenPrintRow(retrograde_inversionMatrix, userPC1);
					break;
			}
				System.out.print("\nWould you like to search a new row? (y/n): ");
				userWantsToSearch = jimmy.nextLine();

		} while (userWantsToSearch.startsWith("y"));		
		
		System.out.println("Thank you for using the SerialismMatrix program!");
		System.out.println("\nMusic Credit:");
		System.out.println("Anton Webern - Variations for orchestra op.30 part 1");
		System.out.println("Musica Viva Orchestra\nConductor Vladimir Yurovsky\nLive Concert\nTchaikovsky concert hall Moscow");
		System.out.println("\n\n___________________________________\n");
	}
}
