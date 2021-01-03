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

}
