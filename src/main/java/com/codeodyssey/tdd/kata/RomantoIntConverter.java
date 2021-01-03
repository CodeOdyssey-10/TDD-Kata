
package com.codeodyssey.tdd.kata;

/**
 * @author codeodyssey
 *
 */
public class RomantoIntConverter {

	public static Integer convertRomantoInt(String input) {

		char[] inputRomanSymbol = input.toCharArray();
		int size = inputRomanSymbol.length;
		int result = 0;
		for (int i = 0; i < size; i++) {
			int numValue = getIntValue(inputRomanSymbol[i]);
			result += numValue;
		}
		return result;
	}

	private static int getIntValue(char inputRoman) {
		if (inputRoman == 'I') {
			return 1;
		}
		if (inputRoman == 'V')
			return 5;
		if (inputRoman == 'X')
			return 10;
		if (inputRoman == 'L')
			return 50;
		if (inputRoman == 'C')
			return 100;
		if (inputRoman == 'D')
			return 500;
		if (inputRoman == 'M')
			return 1000;
		return -1;
	}

}