package week6;

public class Zoo {
	public static void main(String [] args)
	{
		Canary bob = new Canary("bob", 2, 3);
		Ostrich ozzy = new Ostrich("Ozzy", 150, 85);
		Shark bruce = new Shark("Bruce", 20 );
		Salmon sally = new Salmon("Sally", 9966);
		NorwegianBlue lazarus = new NorwegianBlue("Lazarus", 0, 0);
		
		System.out.println(bob.toString());
		System.out.println(ozzy.toString());
		System.out.println(bruce.toString());
		System.out.println(sally.toString());
		System.out.println(lazarus.toString());
		System.out.println("\nIs Sally the Salmon equal to Bob the Canary? "+ sally.equals(bob));
		System.out.println("Is Lazarus the Norwegian Blue equal to Bob the Canary? "+ lazarus.equals(bob));
		System.out.println("Is Bruce the Shark equal to Bruce the Shark? "+ bruce.equals(bruce));
	}
}
