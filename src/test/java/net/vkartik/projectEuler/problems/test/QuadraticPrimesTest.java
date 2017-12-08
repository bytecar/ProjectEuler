package net.vkartik.projectEuler.problems.test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import net.vkartik.projectEuler.problems.code.QuadraticPrimes;
import org.junit.jupiter.api.Test;


public class QuadraticPrimesTest {

	@Test
	public void testName(){
		QuadraticPrimes qp = new QuadraticPrimes();
		assertTrue(qp.run()>50);
	}
}
