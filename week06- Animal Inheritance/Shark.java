package week6;

public  class Shark extends Fish {
	
	protected boolean bites = true;
	protected boolean dangerous = true;
	protected int topSpeed = 0;
	protected String name= "";


	/**
	 * constructor 1
	 */
	public Shark(String name, int speed) {
		this.topSpeed = speed;
		this.name = name;
	}
	
	
	
	@Override
	public boolean equals (Object obj){
		//check to make sure object is not pointing at null
		if (obj==null){ 
			return false;
		}
		// check to make sure obj is a Canary object
		if (!(obj instanceof Shark)){ 
			return false;
		}
		// Now we have to *cast* obj to a Canary object
		Shark s = (Shark)obj;

		//test for equality
		if(this.topSpeed ==s.topSpeed && this.name.equals(s.name)){
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
		String sentence = "I am "+this.name+" the Shark; I am a Fish. I have top speed "
				+this.topSpeed+"m/s;";
		return sentence;
	}

}
