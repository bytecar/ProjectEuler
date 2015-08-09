package net.vkartik.projectEuler.problems.test;

import static org.junit.Assert.*;
import net.vkartik.projectEuler.problems.code.QuadraticPrimes;

import org.junit.Test;

public class QuadraticPrimesTest {

	@Test
	public void testName() throws Exception {
		QuadraticPrimes qp = new QuadraticPrimes();
		assertTrue(qp.run()>50);
	}
}
