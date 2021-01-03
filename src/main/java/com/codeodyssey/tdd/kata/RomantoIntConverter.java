
package com.codeodyssey.tdd.kata;

import java.util.HashMap;
import java.util.Map;

/**
 * @author codeodyssey
 *
 */
public class RomantoIntConverter {

	public static Integer convertRomantoInt(String input,Map<Character, Integer> romanNumeralsMap) {

		char[] inputRomanSymbol = input.toCharArray();
		int size = inputRomanSymbol.length;
		int result = 0;
		for (int i = 0; i < size; i++) {
		
			int numValue = 	romanNumeralsMap.get(inputRomanSymbol[i]);
			result += numValue;
		}
		return result;
	}

}