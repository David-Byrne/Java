package week8.lab8;
import java.util.ArrayList;

public class Directory extends DataType{
	private String name;
	private ArrayList<DataType> contents;
	private int size;
	private boolean isFolder;
	
	
	public Directory(String nm){
		this.name = nm;
		this.contents = new ArrayList<DataType> ();
	}

	
	public int getnumFiles()
	{
		int numFiles = 0;
		for (DataType dt : this.contents)
		{
			numFiles = numFiles + dt.getnumFiles();
			
		}
		return numFiles;
	}
	
	public int getnumFolders()
	{
		int numFolders = 0;
		for (DataType dt : this.contents)
		{
			numFolders = numFolders + dt.getnumFolders();
			if (dt instanceof Directory)//checks if this datatype is a folder
			{
				numFolders++;//adds 1 to the total number of folders
			}
		}
		return numFolders;
	}
	
	public int size()
	{
		int size = 0;
		for (DataType dt : this.contents)
		{
			size = size + dt.size();//the 1 is the folder this is called on
		}
		return size;
	}
	
	public void add(DataType input)
	{
		this.contents.add(input);
	}
}
