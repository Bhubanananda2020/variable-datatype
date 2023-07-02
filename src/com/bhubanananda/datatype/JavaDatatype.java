package com.bhubanananda.datatype;

/**
 * The Class JavaDatatype.
 * 
 * @ author Bhubanananda
 */
public class JavaDatatype {

	/**
	 * Data setup.
	 */
//	Primitive data types:
	void dataSetup() {
		boolean booleanValue = false;
		byte byteValue = 10;
		char charValue = 'B';
		short shortValue = 15;
		int intValue = 100;
		long longValue = 120L;
		float floatValue = 100.0f;
		double doubleValue = 100.00;

		System.out.println(booleanValue);
		System.out.println(byteValue);
		System.out.println(charValue);
		System.out.println(shortValue);
		System.out.println(intValue);
		System.out.println(longValue);
		System.out.println(floatValue);
		System.out.println(doubleValue);
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		new JavaDatatype().dataSetup();
	}
}
