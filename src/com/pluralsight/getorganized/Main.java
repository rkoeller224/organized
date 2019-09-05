package com.pluralsight.getorganized;

public class Main {

    public static void main(String [] args) {
	Integer valA = 21;
	Integer valB = 6;
	Integer valC = 3;
	Integer valD = 1;

	Integer result1  = valA - valB / valC;

	Integer result2 = (valA - valB) / valC;

	System.out.println(result1);
	System.out.println(result2);

	Integer result3 = valA / valC * valD + valB;
	Integer result4 = valA / (valC * (valD + valB) );

	System.out.println(result3);
	System.out.println(result4);
    }
}
