package com.bridgelabz.linecomparisionoop.imp;

import com.bridgelabz.linecomparisionoop.dto.InputScanner;
import com.bridgelabz.linecomparisionoop.dto.InputUtilities;
import com.bridgelabz.linecomparisionoop.service.UserService;

/**
 * Implemented class
 * 
 * @author Arundathi
 *
 */
public class Length implements UserService {
	InputUtilities obj = new InputUtilities();

	/**
	 * Taking inputs from the user
	 */
	public void userInput() {
		System.out.println("Enter x1 value : ");
		obj.setX1(InputScanner.inputInt());
		System.out.println("Enter y1 value : ");
		obj.setY1(InputScanner.inputInt());
		System.out.println("Enter x2 value : ");
		obj.setX2(InputScanner.inputInt());
		System.out.println("Enter y2 value : ");
		obj.setY2(InputScanner.inputInt());
	}

	/**
	 * Calculating length of first line
	 */
	@Override
	public double lengthOfLineOne() {
		userInput();
		System.out.println(
				Math.sqrt(Math.pow((obj.getX2() - obj.getX1()), 2) + Math.pow((obj.getY2() - obj.getY1()), 2)));
		return Math.sqrt(Math.pow((obj.getX2() - obj.getX1()), 2) + Math.pow((obj.getY2() - obj.getY1()), 2));
	}

	/**
	 * Calculating length of second line
	 */
	@Override
	public double lengthOfLineTwo() {
		userInput();
		System.out.println(
				Math.sqrt(Math.pow((obj.getX2() - obj.getX1()), 2) + Math.pow((obj.getY2() - obj.getY1()), 2)));
		return Math.sqrt(Math.pow((obj.getX2() - obj.getX1()), 2) + Math.pow((obj.getY2() - obj.getY1()), 2));
	}

}
