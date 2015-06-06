/*
All compositions by Ralph Norris Smith
*/

package richcode.music;
import java.io.File;
import java.util.ArrayList;


public class NotesToLP{
 
	private static String addLPOctaveMark(Note n, int relOctave, int letterValueCutoff){
		String octaveMarks = "";
		int octave = n.getOctave();
		if (octave < relOctave){
			for (int i = 0; i < (relOctave-octave); i++){
				octaveMarks += ",";
			}
		}
		else if (n.getNoteLetter().getValue() <= letterValueCutoff){
			for (int i = 0; i < (octave-relOctave); i++){
				octaveMarks += "'";
			}
		}
		return octaveMarks;
	}

	private static String addLPOctaveMark(Note n, int relOctave){
		String octaveMarks = "";
		int octave = n.getOctave();
		if (octave < relOctave){
			for (int i = 0; i < (relOctave-octave); i++){
				octaveMarks += ",";
			}
		}
		else {
			for (int i = 0; i < (octave-relOctave); i++){
				octaveMarks += "'";
			}
		}
		return octaveMarks;
	}
	
// 	public String getRandomLPBassRootTriads(int iterations){
// 		for (int i = 0; i < iterations; i++){
// 		Note n = Note.getSingleBassAccidRandomNote();
// 		ChordQuality cq = ChordQuality.getRandomTriadQuality();
// 
// 		}
// 	}
	public static String getLPNoteSyntax(Note n, int relOctave){
			String noteSyn = "";
			noteSyn += n.getNoteLetter().getLetterName().toLowerCase();
			noteSyn += n.getAccid().getLPSyn();
			noteSyn += addLPOctaveMark(n, relOctave);
			return noteSyn;
	}
	public static String getLPTriadSyntax(Chord chord, int relOctave){
		String chordSyn = "< ";
		ArrayList<Note> notes = chord.getAllNotes();
		
		for (Note n : notes){
			chordSyn += getLPNoteSyntax(n, relOctave);
		}
		chordSyn += ">";
		return chordSyn;
	}
	
	
	public static void main(String[] args){
		String lpSyntaxStart = "\n\\version \"2.18.2\"\n"
								+"\\header { \n\ttitle = \"Treble Staff Worksheet\""
								+"\n composer = \"Name:__________________\""
								+"\n}";
		String lpSyntaxScore = "\n\\score{"
							  +"\n\t\\new Staff{"
							  +"\n\t\t\\clef treble";
		String lpSyntaxEnd = "\n}";
		
		//music note streams 
		//this stream of LP notes syntax is attached 
		String high = "\n";
							 
		// String middle = "\n{";
// 							 	
// 		String low = "\n{";
		
		//String answerLyrics = "\n\t\t\\addlyrics \n\t\t{";
		String testLyrics = "\n\t\t\\addlyrics \n\t\t{ ";
		
		String notestream = "";
		Note prevN = Note.getRandomNoteDMajCMaj(4,2);
		//HARD CODED: How many notes are in the worksheet
		int iterations = 150;
		for (int i = 0; i < iterations; i++){
			testLyrics += "[___] ";
			Note n = Note.getRandomNoteDMajCMaj(4,2);
			
			while(n.getPitchHeight() == prevN.getPitchHeight()){
				n = Note.getRandomNoteDMajCMaj(4,2);
			}
			prevN = n;
			//ChordQuality cq = ChordQuality.getRandomTriadQuality();
			//ChordInversion ci = ChordInversion.getRandomTriadInversion();
			
			//print notes to stream
			if (i%10 == 0){ 
				System.out.println(n);
			} else {
				System.out.print(n+" ");
			}
			
			//Things with chords:
			
			//Chord c = new Chord(n, cq, ci);
			//answerLyrics += c.getRoot().getNoteLetter().toString()+c.getRoot().getAccid().getLPLyr()+cq.qual+" ";
			//String chord = getLPTriadSyntax(c, 3);
			//ArrayList<Note> chordNotes = c.getAllNotes();
			// Note highestNote = chordNotes.get(2);
// 			Note middleNote = chordNotes.get(1);
// 			Note lowestNote = chordNotes.get(0);			
			
			high += getLPNoteSyntax(n,3);
			if (i == 0){
				high += "1";
			}
			if (i%10 == 0){
				high += "\n";
			}
			high += " ";
			// middle += " ";
// 			low += " ";
// 			if (!(i%10 == 0) && i != iterations){
// 				high += "\\glissando ";
// 			}
// 			if (i == iterations - 1){
// 				high += "\n}\n";
// 			}
		}
		high += "}";
		//noteStream += "}";
		//answerLyrics += "}";
		testLyrics += "}";
		System.out.println();
		String timeStamp = ""+new java.util.Date().getTime();
		
		// String targetDir = "./LPTextFiles";
// 		File createdTargetDir = WriteToTextFile.createLPFile(targetDir);

		// String targetAnswersFile = "/Users/richardsaney/Documents/ProgrammingwithNICK/MusicSoftware/LPTextFiles/LPAnswers"+timeStamp+".ly";
// 		File createdAnswersFile = WriteToTextFile.createLPFile(targetAnswersFile);
		
		String targetTestFile = "/Users/richardsaney/Documents/ProgrammingwithNICK/MusicSoftware//LPTextFiles/LPTest"+timeStamp+".ly";
		File createdTestFile = WriteToTextFile.createLPFile(targetTestFile);
				
		//String lpFullTextAnswers = lpSyntaxStart+noteStream+answerLyrics+lpSyntaxEnd;
		String lpFullTextTest = lpSyntaxStart
								+lpSyntaxScore
								+high
								+testLyrics
								+lpSyntaxEnd;

		
		WriteToTextFile.writeToFile(lpFullTextTest, createdTestFile);
		//WriteToTextFile.writeToFile(lpFullTextAnswers, createdAnswersFile);
	}
}