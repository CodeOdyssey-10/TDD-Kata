package com.codeodyssey.tdd.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RomantoIntConverterTests {

	@Test
	public void convertRomanItoInt() {
		assertEquals(1, RomantoIntConverter.convertRomantoInt("I"));
	}

	@Test
	public void convertRomanIItoInt() {
		assertEquals(2, RomantoIntConverter.convertRomantoInt("II"));
	}

	@Test
	public void convertRomanIIItoInt() {
		assertEquals(3, RomantoIntConverter.convertRomantoInt("III"));
	}

	@Test
	public void convertRomanVtoInt() {
		assertEquals(5, RomantoIntConverter.convertRomantoInt("V"));
	}
	
	@Test
	public void convertRomanXtoInt() {
		assertEquals(10, RomantoIntConverter.convertRomantoInt("X"));
	}

}
