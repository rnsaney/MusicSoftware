package richcode.music;

import java.util.Scanner;
import javax.sound.sampled.*;
import java.net.URL;
import java.io.*;
public class PlayAudioClip
{
	public static Mixer mixer;
	public static Clip audioClip;
	

	
	public static void playAudio (String user_audioClipURL)
	{
		Mixer.Info[] mixerData = AudioSystem.getMixerInfo();
		mixer = AudioSystem.getMixer(mixerData[0]);
		DataLine.Info lineInData = new DataLine.Info(Clip.class, null);
		try 
		{
			audioClip = (Clip)mixer.getLine(lineInData);
		}
		catch (LineUnavailableException luExc)
		{
			luExc.printStackTrace();
		}
		try
		{
		//Fix class reference
			URL audioClipURL = PlayAudioClip.class.getResource(user_audioClipURL);
			AudioInputStream inputAudio = AudioSystem.getAudioInputStream(audioClipURL);
			audioClip.open(inputAudio);
		}
		catch (LineUnavailableException luExc)
		{
			luExc.printStackTrace();
		}
		catch (UnsupportedAudioFileException uafExc)
		{
			uafExc.printStackTrace();
		}
		catch (IOException ioExc)
		{
			ioExc.printStackTrace();
		}
		audioClip.start();
	}
}