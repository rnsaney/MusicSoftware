package richcode.music;

public enum ChordQuality{
	MAJ("M"),
	MIN("m"),
	AUG("+"),
	DIM("˚");
	public final String qual;
	ChordQuality(String qual_input){
		this.qual = qual_input;
	}
	public static ChordQuality getRandomTriadQuality(){
		ChordQuality result = ChordQuality.MAJ;
		switch ((int)(Math.random()*4)){
			case 0:
				break;
			case 1:
				result = ChordQuality.MIN;
				break;
			case 2:
				result = ChordQuality.AUG;
				break;
			case 3:
				result = ChordQuality.DIM;
		}
		return result;
	}
}