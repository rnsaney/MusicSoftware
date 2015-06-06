package richcode.music;
import java.util.ArrayList;

public class Chord{

	private ArrayList<Note> allNotes = new ArrayList<>();
	private ChordQuality quality;
	private ChordInversion inversion;
	private Note root;
	
	
	public Chord(Note n, ChordQuality qlt, ChordInversion ci){
		this.quality = qlt;
		this.inversion = ci;
		this.allNotes.add(n);
		switch(this.quality){
		case MAJ:
			switch(this.inversion){
			case ROOT:
				this.root = n; 
				this.allNotes.add(n.transposeUp(Interval.maj3));
				this.allNotes.add(n.transposeUp(Interval.per5));			
				break;
			case FIRST:
				this.root = n.transposeUp(Interval.min6);
				this.allNotes.add(n.transposeUp(Interval.min3));
				this.allNotes.add(this.root);
				break;
			case SECOND:
				this.root = n.transposeUp(Interval.per4);
				this.allNotes.add(n.transposeUp(Interval.per4));
				this.allNotes.add(n.transposeUp(Interval.maj6));
				break;
			}
			break;
		case MIN:
			switch(this.inversion){
			case ROOT:
				this.root = n; 
				this.allNotes.add(n.transposeUp(Interval.min3));
				this.allNotes.add(n.transposeUp(Interval.per5));
				break;
			case FIRST:
				this.root = n.transposeUp(Interval.maj6);
				this.allNotes.add(n.transposeUp(Interval.maj3));
				this.allNotes.add(this.root);
				break;
			case SECOND:
				this.root = n.transposeUp(Interval.per4);
				this.allNotes.add(n.transposeUp(Interval.per4));
				this.allNotes.add(n.transposeUp(Interval.min6));
				break;
			}
			break;
		case AUG:
			switch(this.inversion){
			case ROOT:
				this.root = n; 
				this.allNotes.add(n.transposeUp(Interval.maj3));
				this.allNotes.add(n.transposeUp(Interval.aug5));
				break;
			case FIRST:
				this.root = n.transposeUp(Interval.min6); 
				this.allNotes.add(n.transposeUp(Interval.maj3));
				this.allNotes.add(n.transposeUp(Interval.min6));
				break;
			case SECOND:
				this.root = n.transposeUp(Interval.dim4); 
				this.allNotes.add(n.transposeUp(Interval.dim4));
				this.allNotes.add(n.transposeUp(Interval.min6));
				break;
			}
			break;
		case DIM:
			switch(this.inversion){
			case ROOT:
				this.root = n;
				this.allNotes.add(n.transposeUp(Interval.min3));
				this.allNotes.add(n.transposeUp(Interval.dim5));
				break;
			case FIRST:
				this.root = n.transposeUp(Interval.maj6);
				this.allNotes.add(n.transposeUp(Interval.min3));
				this.allNotes.add(n.transposeUp(Interval.maj6));
				break;
			case SECOND:
				this.root = n.transposeUp(Interval.aug4);
				this.allNotes.add(n.transposeUp(Interval.aug4));
				this.allNotes.add(n.transposeUp(Interval.maj6));
				break;
			}
			break;
		}
	}
	public Note getRoot(){
		return this.root;
	}
	public ArrayList<Note> getAllNotes(){
		return this.allNotes;
	}
}