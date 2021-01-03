
package com.codeodyssey.tdd.kata;

/**
 * @author codeodyssey
 *
 */
public class RomantoIntConverter {

	public static Integer convertRomantoInt(String input) {

		char[] inputRomanNumeralArr = input.toCharArray();
		int result = 0;
		for (int i = 0; i < inputRomanNumeralArr.length; i++) {
			result = getIntValue(inputRomanNumeralArr[i]);
		}
		return result;
	}

	private static int getIntValue(char inputRoman) {
		if (inputRoman == 'I') {
			return 1;
		}
		return -1;
	}

}