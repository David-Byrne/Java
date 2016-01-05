package week12.week12;

public class AudioFile {

	private String audioType; 
	private String fileName;
	
	public AudioFile (String audioType, String fileName){
		this.audioType = audioType;
		this.fileName = fileName;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public String getAudioType() {
		return audioType;
	}
	
}
