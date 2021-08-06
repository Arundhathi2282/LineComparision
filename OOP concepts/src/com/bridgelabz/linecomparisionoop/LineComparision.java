package com.bridgelabz.linecomparisionoop;

import com.bridgelabz.linecomparisionoop.imp.Length;
import com.bridgelabz.linecomparisionoop.service.UserService;

public class LineComparision {
	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		System.out.println("Welcome to the Line Comparision.....!");
		LineComparision ob = new LineComparision();
		ob.checkLength();
	}

	/**
	 * Checking lengths of two lines that are equal greater or lesser
	 */
	public void checkLength() {
		UserService object = new Length();
		String string1 = String.valueOf(object.lengthOfLineOne());
		String string2 = String.valueOf(object.lengthOfLineTwo());
		int check = string1.compareTo(string2);
		if (check == 0) {
			System.out.println("Two lines are equal");
		} else {
			if (check > 0) {
				System.out.println("First line is longer than second line");
			} else {
				System.out.println("Second line is smaller than First line");
			}
		}
	}
}
