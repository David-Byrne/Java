package week11.lab10;

import java.util.ArrayList;
import java.util.Collections;

public class Wallet {
	private String name;
	private ArrayList<Currency> monies;
	
	public Wallet(String string) {
		monies = new ArrayList<Currency>();
		this.name = string;
	}

	public void addCurrency(Currency currency){
		Converter converter = new Converter();
		converter.setEuroValue(currency);//can either convert to euro here or in Currency.getEuroValue()
		monies.add(currency);
	}
	
	/*
	 * This method calculates and returns the total Euro value of 
	 * each currency in the wallet
	*/
	public double getTotalEuroValue(){
		double value = 0;
		for (Currency money : this.monies)
		{
			value += money.getEuroValue();
		}
		return value;
	}
	
	/*
	 * This method sorts the currencies in ascending order according to their euro Values
	*/
	public void sort(){
		Collections.sort(monies);
	}
	
	@Override
	/*
	 * The toString() method returns a String value of each currency and its amount in the wallet
	 * each currency- amount pair is separated by a comma
	 * e.g. USD:100,CAD:250,GBP:99,AUD:123
	 * 
	*/
	public String toString(){
		String string = "";
		for (Currency money : this.monies)
		{
			string +=money.getCurrencyName()+":";
			string +=money.getAmount()+",";
			
		}
		return string;
	}
	
}
