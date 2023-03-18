package ru.learnup.maven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
class CalculatorTest {

	@Test
	@DisplayName(" Тест суммы 2х чисел")
	void sum() {
		Calculator calculator = new Calculator();
		int actually = calculator.sum(1, 1);
		int expected =2;
		assertEquals(actually, expected);
	}
}