package week12.week12;

import static org.junit.Assert.*;

import org.junit.Test;



public class VLCPlayerTest {
	
	VLCPlayer player;

	// test that the OGG plugin is working with the player
		@Test
		public void testOGG() {
			player = new VLCPlayer();
			AudioFile oggFile = new AudioFile("ogg", "C://Music/Amator_Silenti.ogg");
			
			try{
				player.play(oggFile);
			}catch(UnSupportedAudioFormatException e){
				System.out.println(e.getMessage());
			}
			assertTrue(player.getPlayState()); // assert that the Player is playing
			player.stop();
		}

		// test that the MP3 plugin is working with the player
		@Test
		public void testMP3() {
			player = new VLCPlayer();
			AudioFile mp3File = new AudioFile("mp3", "C://Music/Vicissitudes.mp3");
			try{
				player.play(mp3File);
			}catch(UnSupportedAudioFormatException e){
				System.out.println(e.getMessage());
			}
			assertTrue(player.getPlayState()); // assert that the Player is playing
			player.stop();
		}
		
		// test that the Flac plugin is working with the player
		@Test
		public void testWMA() {
			player = new VLCPlayer();
			AudioFile wmaFile = new AudioFile("wma", "C://Music/Lucky_Seven.wma");
			try{
				player.play(wmaFile);

			}catch(UnSupportedAudioFormatException e){
				System.out.println(e.getMessage());
			}
			assertTrue(player.getPlayState()); // assert that the Player is playing
			player.stop();
		}
		
		// test the correct unsupported audio behaviour
		@Test
		public void testUnsupportedAudio() {
			player = new VLCPlayer();
			AudioFile aacFile = new AudioFile("aac", "C://Music/In_Silent_Way.aac");
			try{
				player.play(aacFile);

			}catch(UnSupportedAudioFormatException e){
				System.out.println(e.getMessage());
			}
			assertTrue(!player.getPlayState()); // assert that the Player is not playing
			player.stop();
		}

}
