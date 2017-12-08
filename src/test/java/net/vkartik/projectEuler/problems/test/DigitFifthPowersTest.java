package net.vkartik.projectEuler.problems.test;
import net.vkartik.projectEuler.problems.code.DigitFifthPowers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class DigitFifthPowersTest {

	@Test
	public void test1() throws Exception{
		DigitFifthPowers dfp = new DigitFifthPowers();
		assertTrue(dfp.run()>0);
	}
}
