package com.codeodyssey.tdd.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RomantoIntConverterTests {
	static Map<Character, Integer> chartoIntMap = new HashMap<>();

	@Test
	public void convertRomanItoInt() {
		assertEquals(1, RomantoIntConverter.convertRomantoInt("I", chartoIntMap));
	}

	@Test
	public void convertRomanIItoInt() {
		assertEquals(2, RomantoIntConverter.convertRomantoInt("II",chartoIntMap));
	}

	@Test
	public void convertRomanIIItoInt() {
		assertEquals(3, RomantoIntConverter.convertRomantoInt("III",chartoIntMap));
	}

	@Test
	public void convertRomanVtoInt() {
		assertEquals(5, RomantoIntConverter.convertRomantoInt("V",chartoIntMap));
	}

	@Test
	public void convertRomanXtoInt() {
		assertEquals(10, RomantoIntConverter.convertRomantoInt("X",chartoIntMap));
	}

	@BeforeAll
	public static void setup() {
		chartoIntMap.put('I', 1);
		chartoIntMap.put('V', 5);
		chartoIntMap.put('X', 10);
		chartoIntMap.put('L', 50);
		chartoIntMap.put('C', 100);
		chartoIntMap.put('D', 500);
		chartoIntMap.put('M', 1000);
	}

}
