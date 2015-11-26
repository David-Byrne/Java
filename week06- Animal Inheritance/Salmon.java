package week6;

public  class Salmon extends Fish {
	
	protected boolean edible = true;
	protected int colourCode = 0;//9966
	protected String name= "";
	protected String reproduce= "Swim upriver to lay eggs";


	/**
	 * constructor 1
	 */
	public Salmon(String name, int colour) {
		this.colourCode = colour;
		this.name = name;
	}
	
	
	
	@Override
	public boolean equals (Object obj){
		//check to make sure object is not pointing at null
		if (obj==null){ 
			return false;
		}
		// check to make sure obj is a Canary object
		if (!(obj instanceof Salmon)){ 
			return false;
		}
		// Now we have to *cast* obj to a Canary object
		Salmon s = (Salmon)obj;

		//test for equality
		if(this.colourCode ==s.colourCode && this.name.equals(s.name)){
			return true;
		}
		return false;
	}

	@Override
	public void move(int length) {
		swim(length);
	}

	@Override
	public void swim(int length) {
		System.out.println("I can swim " + length + " metres");
		
	}
	
	@Override
	public String toString(){
		//TODO
		String sentence = "I am "+this.name+" the Salmon; I am a Fish. I have a colour code of "
				+ ""+this.colourCode+" and to reproduce I "+this.reproduce;
		return sentence;
	}

}
