package richcode.music;
import java.util.*;
public class Test{

	public static void main(String[] args)
	{		
	
		Note n1 = new Note(NoteName.C,Accidental.FLAT,2);
		
		System.out.println(n1.getSpecs());
		
		Note n2 = new Note(NoteName.B, Accidental.NATURAL, 1);
		
		System.out.println(n2.getSpecs());
	}
}