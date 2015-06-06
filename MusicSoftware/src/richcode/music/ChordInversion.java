package richcode.music;

public enum ChordInversion{
	ROOT(""),
	FIRST("1"),
	SECOND("2");
	public final String inv;
	ChordInversion(String inv){
		this.inv = inv;
	}
	public static ChordInversion getRandomTriadInversion(){
		ChordInversion result = ChordInversion.ROOT;
		switch ((int)(Math.random()*3)){
			case 0:
				break;
			case 1:
				result = ChordInversion.FIRST;
				break;
			case 2:
				result = ChordInversion.SECOND;
				break;
		}
		return result;
	}
}