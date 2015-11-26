package week8.lab8;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FileSystemDemoTest {
	Directory documents, music, photos, dylan, band;
	File a,b,c,d,e;
	@Before
	public void setUp() throws Exception {
		documents = new Directory("Documents");
		music = new Directory("Music");
		photos = new Directory("Photos");
		dylan = new Directory("Dylan");
		band = new Directory("Band");
		
		a = new File("assign1.doc");
		b = new File("family.jpg");
		c = new File("tambourine.pm3");
		d = new File("dixie.mp3");
		e = new File("weight.mp3");

		documents.add(a);
		documents.add(music);
		documents.add(photos);
		photos.add(b);
		music.add(dylan);
		music.add(band);
		dylan.add(c);
		band.add(d);
		band.add(e);
	}

	@Test
	public void sizeTest() {
		assertEquals(54 , documents.size());
	}
	
	@Test
	public void numFilesTest()
	{
		assertEquals(5 , documents.getnumFiles());
	}
	
	@Test
	public void numFoldersTest()
	{
		assertEquals(4 , documents.getnumFolders());
	}

}
