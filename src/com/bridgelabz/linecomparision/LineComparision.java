package com.bridgelabz.linecomparision;

import java.util.Scanner;

class Line {
	static final Scanner scanner = new Scanner(System.in);
	int x1 = scanner.nextInt();
	int y1 = scanner.nextInt();
	int x2 = scanner.nextInt();
	int y2 = scanner.nextInt();
	int a1 = scanner.nextInt();
	int b1= scanner.nextInt();
	int a2 = scanner.nextInt();
	int b2 = scanner.nextInt();
	double lengthOfFirstLine;
	double lengthOfSecondLine;
	String string1;
	String string2;
	
	/**
	 * Calculating length of line 
	 */
	public void calculatingLengthOfLine() {
		lengthOfFirstLine = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1),2));
		lengthOfSecondLine = Math.sqrt(Math.pow((a2-a1),2)+Math.pow((b2-b1),2));
	}
	
	/**
	 * Converting integer to string format and comparing them using CompareTo method
	 */
	public void compareMethod() {
		calculatingLengthOfLine();
		String string1 = String.valueOf(lengthOfFirstLine);
		String string2 = String.valueOf(lengthOfSecondLine);
		int check = string1.compareTo(string2);
		if(check == 0) {
			System.out.println("Two lines are equal");
		}else {
			if(check > 0) {
				System.out.println("First line is longer than second line");
			}else {
				System.out.println("Second line is longer than First line");
			}
		}
	}
}
public class LineComparision {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison....!");
		Line object = new Line();
		object.compareMethod();
	}
}
