package richcode.music;
import java.util.*;
/*This is a class to represent a musical note.
A most basic written(notated) musical note has:
Pitchclass
Octave (numerical pitch height)
Therefore the Note class is constructed with Note(Pitchclass, Octave).
Methods include 
1) finding the intervalic distance between two notes.
2) transposing a note by an interval
3) 
*/
public class Note
{
	//instance variables
	private Pitchclass pc;
	private Accidental a;
	private int octave;
	private int pitchHeight;
	private NoteName noteLetter;
	
	//Constructor method
	public Note(NoteName noteLetter_input, Accidental a_input, int input_octave)
	{
		this.a = a_input;                     //Accidental
		this.octave = input_octave;			  //Octave
		this.noteLetter = noteLetter_input;   //Letter
		//this is where it gets funky
		
		//How do you find the Pitchclass based on ^^^ ?
			//1. add integer pitchclass values of the NoteName and the Accidental 
			//2. take that number and find the corresponding Pitchclass
		
		this.pc = Pitchclass.parse(noteLetter_input.getBasePC().getValue() + a_input.getIncrement());
		
		//WRONG
		//1. Find the Note's Pitchclass's Value
		//2. Add this to 12*octave
		
		//this.pitchHeight = this.pc.getValue() + 12*input_octave;
	
		//CORRECT??		
		//1. Find NoteName's Pitchclass's int value
		//2. Then add that value to 12*the octave
		//3. Then last add the accidental value (-2 through 2) 
		
		this.pitchHeight = (this.noteLetter.getBasePC().getValue() + 12*this.octave) + this.a.getIncrement();
		
		
	}
	
	//methods of Note: 
	public Accidental getAccid(){
		return this.a;
	}
	public Pitchclass getPitchclass(){
		return this.pc;
	}
	public NoteName getNoteLetter(){
		return this.noteLetter;
	}
	public int getOctave(){
		return this.octave;
	}
	public int getPitchHeight()
	{
		return this.pitchHeight;
	}
	public String toString()
	{
		return this.noteLetter.getLetterName()+this.a.getModifier()+this.octave;
	}
	public String getSpecs(){
		return this+": "+this.noteLetter+" "+this.a+" "+this.pc+" "+this.octave+" "+this.pitchHeight;
	}
	public static Interval measureInterval(Note note1, Note note2)
	{
		Interval result = null;
		Note higherNote = note2;
		Note lowerNote = note1;
		Interval[] allIntervals = Interval.values();
		Set<Interval> possibleIntervals = new HashSet<Interval>();
		if (note1.pitchHeight > note2.pitchHeight)
		{
			higherNote = note1;
			lowerNote = note2;
		}
		else if (note1.pitchHeight == note2.pitchHeight)
		{
			if(note1.noteLetter.getValue() > note2.noteLetter.getValue())
			{
				higherNote = note1;
				lowerNote = note2;
			}
		}
		int letterDistance = higherNote.noteLetter.getValue() - lowerNote.noteLetter.getValue();
		if (letterDistance < 0)
		{
			letterDistance = letterDistance + 7 ;
		}
		int pitchDistance = (higherNote.pitchHeight - lowerNote.pitchHeight)%12;
		System.out.println("Letter Distance: "+letterDistance);
		switch (letterDistance)
		{
			case 0:
				//get the set of unison based intervals 
				for (Interval i : allIntervals)
				{
					if (i.getBasicForm() == 1 || i.getBasicForm() == 8)
					{
						possibleIntervals.add(i);
					}
				}
				break;
			case 1:
				for (Interval i : allIntervals)
					{
						if (i.getBasicForm() == 2)
						{
							possibleIntervals.add(i);
						}
					}
				break;
			case 2:
				for (Interval i : allIntervals)
					{
						if (i.getBasicForm() == 3)
						{
							possibleIntervals.add(i);
						}
					}			
				break;
			case 3:
				for (Interval i : allIntervals)
					{
						if (i.getBasicForm() == 4)
						{
							possibleIntervals.add(i);
						}
					}			
				break;
			case 4:
				for (Interval i : allIntervals)
					{
						if (i.getBasicForm() == 5)
						{
							possibleIntervals.add(i);
						}
					}			
				break;
			case 5: 
				for (Interval i : allIntervals)
					{
						if (i.getBasicForm() == 6)
						{
							possibleIntervals.add(i);
						}
					}			
				break;
			case 6:
				for (Interval i : allIntervals)
					{
						if (i.getBasicForm() == 7)
						{
							possibleIntervals.add(i);
						}
					}			
				break;
			default:
				System.out.println("\nERROR: The intervalic letter distance wasn't 0 - 6."
				+"\nLetter distance is: "+letterDistance
				+"\nExiting the program now.");
				System.exit(0);
				break;
		}
		Interval[] possibleIntervalsArray = possibleIntervals.toArray(new Interval[possibleIntervals.size()]);
		//check half step distance of pitch distance versus possible intervals
		System.out.print("Possible Intervals: ");
		for(Interval i : possibleIntervalsArray)
		{
			System.out.print(i.getText()+" ");
		}
		System.out.println();
		for(Interval i : possibleIntervalsArray)
		{
			if (pitchDistance == i.getHalfSteps())
			{
				result = i;
			}
		}
		if (result == null)
		{
		System.out.println("Pitch Distance "+pitchDistance);
			for(Interval i : allIntervals)
			{
				if (pitchDistance == i.halfSteps && i.preferredForm)
				{
					result = i;
				}
			}
// 			switch (result)
// 			{
// 				case dim2 : 
// 					result = Interval.per1;
// 					break;
// 				case dim3 :
// 					result = Interval.maj2;
// 					break;
// 				case dim4 :
// 					result = Interval.maj3;
// 					break;
// 				case dim6 :
// 					result = Interval.per5;
// 					break;
// 				case dim7 :
// 					result = Interval.maj6;
// 					break;
// 				case dim8 :
// 					result = Interval.maj7;
// 					break;
// 				case aug8 :
// 					result = Interval.min2;
// 					break;
// 				default :
// 					//Interval result is unchanged, hopefully already correct
// 					break;
// 			}
		}
	return result;
	}
	public static Note getRandomNote()
	{
		// letter accidental octave
		//int octave = (octave1 > octave2)? o
		
		int octave = (int)(10*Math.random());
		NoteName[] allNoteNames = NoteName.values();
		Accidental[] allAccidentals = Accidental.values();
		NoteName letter = allNoteNames[(int)(Math.random()*allNoteNames.length)];
		Accidental accid = allAccidentals[(int)(Math.random()*allAccidentals.length)];
		Note result = new Note(letter, accid, octave);
		return result;
	}
	public static Note getNaturalRandomNote(int lowestOctave, int octaveSpan){
		int octave = (int)(octaveSpan*Math.random())+lowestOctave;
		NoteName[] allNoteNames = NoteName.values();
		NoteName letter = allNoteNames[(int)(Math.random()*allNoteNames.length)];
		Note result = new Note(letter, Accidental.NATURAL, octave);
		return result;
	}
	
	public static Note getRandomNoteDMajCMaj(int lowestOctave, int octaveSpan){
		int octave = (int)(octaveSpan*Math.random())+lowestOctave;
		NoteName[] allNoteNames = NoteName.values();
		NoteName letter = allNoteNames[(int)(Math.random()*allNoteNames.length)];
		//if the letter is F or C, flip a coin to change it to sharp or not
		Accidental accid = Accidental.NATURAL;
		if(letter.value == 0 || letter.value == 3){
			if(Math.random() > .5){
				accid = Accidental.SHARP;
			}
		}
		Note result = new Note(letter, accid, octave);
		return result;
	}
	
	public static Note getSingleAccidRandomNote(int lowestOctave, int octaveSpan){
		int octave = (int)(octaveSpan*Math.random())+lowestOctave;
		NoteName[] allNoteNames = NoteName.values();
		NoteName letter = allNoteNames[(int)(Math.random()*allNoteNames.length)];
		Accidental acc = Accidental.getRandomSingleAccidental();
		Note result = new Note(letter, acc, octave);
		return result;
	}
	public static Note getSingleBassAccidRandomNote(){
		Note result = getSingleAccidRandomNote(2,3);
		if (result.getPitchHeight() < 25 || result.getPitchHeight() > 48){
			return getSingleBassAccidRandomNote();	
			}
		return result;
	}
	
	
	public Note transposeUp(Interval input)
	{
//		System.out.println(this+" up a "+input);
		Accidental newAccidental = null;
		NoteName newLetter = null;
		int newLetterValue = (this.noteLetter.getValue()+(input.getBasicForm()-1))%7;
		int newPitchHeight = this.pitchHeight + input.getHalfSteps();
		int newOctave = this.getOctave();
// 		System.out.println("this.pitchHeight: "+this.pitchHeight);
// 		System.out.println("newPitchHeight: "+newPitchHeight);
// 		System.out.println("input.getHalfSteps(): "+input.getHalfSteps());
// 		System.out.println("New Letter Value: "+newLetterValue);
		Interval[] allIntervals = Interval.values();
		NoteName[] allNoteNames = NoteName.values();
		for (NoteName letter : allNoteNames){
			if (letter.getValue() == newLetterValue){
				newLetter = letter;
				break;
			}
		}
		if (newLetter == null){
			System.out.println("Could not find new NoteName letter based on interval value and previous NoteName.");
			System.exit(0);
		}else{
//			System.out.println("newLetter: "+newLetter);
		}
		Pitchclass tempPC = newLetter.getBasePC();
		//System.out.println("");
// 		int distanceToNextOctave = 12-this.getPitchclass().getValue(); 
// 		if (input.getHalfSteps() >= distanceToNextOctave){
// 			newOctave++;
// 		}
		//System.out.println("newOctave: "+newOctave);
		//Case 1: The new note is within the same octave
		//Case 2: The new note is above one octave
		int letterDistanceToNextOctave = 7 - this.getNoteLetter().getValue();
		if ((input.getBasicForm()-1) >= letterDistanceToNextOctave) {
			newOctave++;
		}
		//System.out.println("newOctave after modify: "+newOctave);
		//int newOctave = (newPitchHeight - (this.getPitchclass().getValue()+input.getHalfSteps()))/12;	
		Note tempNote = new Note(newLetter, Accidental.NATURAL, newOctave);	
		Accidental[] allAccidentals = Accidental.values();
		//System.out.println("newPitchHeight: "+newPitchHeight);
		//System.out.println("tempNote.getPitchHeight(): "+tempNote.getPitchHeight());		
		//System.out.println("newPitchHeight - tempNote.getPitchHeight(): "+(newPitchHeight - tempNote.getPitchHeight()));
		for (Accidental accid : allAccidentals){	
			//System.out.println("accid.getIncrement(): "+accid.getIncrement());
			//System.out.print(accid.getModifier()+ " ");
			if ((newPitchHeight - tempNote.getPitchHeight()) == accid.getIncrement()){
				newAccidental = accid;
				break;
			}
		}
		if (newAccidental == null){
			System.out.println("No newAccidental found!");
			for (Interval i : allIntervals){
				if(input.halfSteps == i.halfSteps && i.preferredForm){
					System.out.println("Recursion using new interval "+i+" on Note "+this+"!");
					//recursion recursion
					return this.transposeUp(i);
				}
			}
		}
		if (newAccidental == null){
			System.out.println("Did not find accidental increment matching (newPitchHeight - tempPitchHeight).");
			System.exit(0);
		}
		Note result = new Note(newLetter, newAccidental, newOctave);
		return result;
	}
}