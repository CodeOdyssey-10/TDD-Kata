
package com.codeodyssey.tdd.kata;

/**
 * @author codeodyssey
 *
 */
public class RomantoIntConverter {

	public static Integer convertRomantoInt(String input) {

		char[] inputRomanNumeralArr = input.toCharArray();
		for (int i = 0; i < inputRomanNumeralArr.length; i++) {
			if (inputRomanNumeralArr[i] == 'I') {
				return 1;
			}
		}
		return null;

	}

}
