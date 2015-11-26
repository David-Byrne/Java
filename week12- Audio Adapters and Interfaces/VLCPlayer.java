package week12;

public class VLCPlayer {

	String playState = "";
	
	public void play(AudioFile audio)
	{
		PluginAdapter plugin = new PluginAdapter();
		plugin.play(audio);
	}
	
	public String getPlayState()
	{
		return this.playState;
	}
}
