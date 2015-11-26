package week6;

public  class Ostrich extends Bird {
	
	protected int height =0;
	protected int legLength = 0;
	protected String name= "";
	protected boolean flies = false;


	/**
	 * constructor 1
	 */
	public Ostrich(String name, int height, int legLength) {
		this.height = height;
		this.legLength=legLength;
		this.name = name;
	}
	
	
	
	@Override
	public boolean equals (Object obj){
		//check to make sure object is not pointing at null
		if (obj==null){ 
			return false;
		}
		// check to make sure obj is a Canary object
		if (!(obj instanceof Canary)){ 
			return false;
		}
		// Now we have to *cast* obj to a Canary object
		Ostrich o = (Ostrich)obj;

		//test for equality
		if(this.height==o.height && this.legLength==o.legLength ){
			return true;
		}
		return false;
	}

	@Override
	public void move(int length) {
		fly(length);
	}

	@Override
	public void fly(int length) {
		
		stride(length);
	}

	public void stride(int length)
	{
		System.out.println("I can stride " + length + " metres");
	}
	
	@Override
	public String toString(){
		//TODO
		String sentence = "I am "+this.name+" the Ostrich; I am a Bird. I have "
				+ ""+this.legLength+"cm long legs and I'm "+this.height+"cm tall;";
		return sentence;
	}

}
