package week8.lab8;

public class File extends DataType {
	
	private String name;
	private int size;
	
	
	public File(String nm){
		this.name = nm;
		this.size = nm.length(); // for demo purposes the size of the file is the number of characters in its name
	}
	
	public int getnumFiles()
	{
		return 1;
	}
	
	public int getnumFolders()
	{
		return 0;
	}
	
	public int size()
	{
		return this.size;
	}

}
