package week2;

public class casting {

	public static void main(String[] args) {
		int int0 = 88;
		int int1 = 3;
		double double0 = 5.4;
		float float1 = 1.1f;
		float float2 = 150000.1f;
		char char0 = 'a';
		short short1 = 3;
		byte byte1 = 8;
		
		double double1 = (double) int1;
		System.out.println(double1+"\n");
		
		int int2 = (int)double0;
		System.out.println(int2 +"\n");
		//different because the double is rounded down to a whole number to fit into the int variable size
		
		float float3 = (float)int1;
		System.out.println(float3 +"\n");
		
		int int4 = (int)float1;
		System.out.println(int4 +"\n");
		//different because the float is rounded down to a whole number to fit into the int variable size
		
		float float5 = (float)int1;
		System.out.println(float5 +"\n");
		
		int int6 = (int)char0;
		System.out.println(int6 +"\n");
		//turns character into it's ascii integer number to be stored as an int
		
		char char7 = (char)int0;
		System.out.println(char7 +"\n");
		//turns character into it's ascii integer number to be stored as an int
		
		int int8 = (int) short1;
		System.out.println(int8 +"\n");
		
		short short9 = (short) int1;
		System.out.println(short9 +"\n");
		//no change if int1 is small enough to fit into short variable type which it is
		
		short short10 = (short) byte1;
		System.out.println(short10 +"\n");
		
		byte byte11 = (byte) double0;
		System.out.println(byte11 +"\n");
		//double is rounded down to fit into byte
		
		long long12 = (long) int1;
		System.out.println(long12 +"\n");
		
		int int13 = (int) float1;
		System.out.println(int13 +"\n");
		//float is rounded down to fit into byte
		
		short short14 = (short)float2;
		System.out.println(short14 +"\n");
		//float overflows and is rounded down to fit into short
		
		byte byte15 = (byte)float2;
		System.out.println(byte15 +"\n");
		//float overflows and is rounded down to fit into byte
		
		double double16 = (double)char0;
		System.out.println(double16 +"\n");
		//char is turned into ascii notation which is stored as double
		
	}
	
}
