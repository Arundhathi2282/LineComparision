package com.bridgelabz.linecomparision;

import java.util.Scanner;

public class LineComparision {
	public static void main(String args[]) {
		System.out.println("Welcome to the Line Comparision....!");
		Scanner scanner = new Scanner(System.in);
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int a1 = scanner.nextInt();
		int b1 = scanner.nextInt();
		int a2 = scanner.nextInt();
		int b2 = scanner.nextInt();
		double lengthOfFirstLine = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		System.out.println(lengthOfFirstLine);
		double lengthOfSecondLine = Math.sqrt(Math.pow((a2-a1),2) + Math.pow((b2-b1),2));
		System.out.println(lengthOfSecondLine);
		if(lengthOfFirstLine == lengthOfSecondLine) {
			System.out.println("Two Lines are Equal");
		}else {
			System.out.println("Two Lines are not Equal");
		}
	}
}
