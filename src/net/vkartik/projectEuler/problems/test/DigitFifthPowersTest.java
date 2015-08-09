package net.vkartik.projectEuler.problems.test;

import static org.junit.Assert.*;
import net.vkartik.projectEuler.problems.code.DigitFifthPowers;

import org.junit.Test;

public class DigitFifthPowersTest {

	@Test
	public void test1() throws Exception {
		DigitFifthPowers dfp = new DigitFifthPowers();
		assertTrue(dfp.run()>0);
	}
}
