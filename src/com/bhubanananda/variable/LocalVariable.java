package com.bhubanananda.variable;

/**
 * The Class LocalVariable.
 * 
 * @ author Bhubanananda
 */
public class LocalVariable {

	/**
	 * Data setup.
	 */
	void dataSetup() {
		Integer value; // Local variable declared
		value = 100; // assigned a value
		System.out.println(value); // printing value in console
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		new LocalVariable().dataSetup();
	}
}
