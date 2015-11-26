package week11.lab10;



public abstract class Currency implements Comparable<Currency> {

	protected  String country; // e.g. Canada
	protected  String currencyName; // Canadian Dollar
	protected double amount; // e.g. 100.0
	protected double euroValue; // e.g. 70.03 (the value in euros)
	protected Converter converter = new Converter();

	
	public String getCountry(){
		return this.country;
	}
	
	public String getCurrencyName(){
		return this.currencyName;
	}
	
	public double getAmount(){
		return amount;
	}
	
	public void setAmount(double amt){
		this.amount = amt;
	}
	public  double getEuroValue(){
		//converter.setEuroValue(this); moved to when we add currencies to wallet
		return this.euroValue;
	}
	
	public void setEuroValue(double val){
		this.euroValue = val;
	}
	
	@Override
	public int compareTo(Currency o) {	
		if (this.getEuroValue() > o.getEuroValue()) return 1;
		if (this.getEuroValue() < o.getEuroValue()) return -1;
		return 0;
	}
	
}
