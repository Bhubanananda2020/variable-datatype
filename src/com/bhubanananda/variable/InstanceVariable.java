package com.bhubanananda.variable;

/**
 * The Class InstanceVariable.
 * 
 * @ author Bhubanananda
 */
public class InstanceVariable {

	/** The value. */
	Integer value; // Instance variable declared

	/**
	 * Data setup.
	 */
	void dataSetup() {
		value = 100; // assigned a value
		System.out.println(value); // printing value in console
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		new InstanceVariable().dataSetup();
	}
}
