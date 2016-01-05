package week12.week12;

public class WMAPlugin implements Plugin{

	   @Override
	   public void play(AudioFile audio) {
	      System.out.println("Playing wma file: "+ audio.getFileName());		
	   }
	}
