package net.vkartik.projectEuler.problems.code;

public class QuadraticPrimes {

	public int run() {
		int max = 0;
		for (int i = -1000; i <= 1000; i++) {
			for (int j = -1000; j <= 1000; j++) {
				for (int k = 0; k < 700; k++) {
					int eqn = equation(k, i, j);
					if (eqn >= 2) {
						if (!checkPrime(eqn)) {
							if (k > max) {
								max = k;
								if (k > 70) {
									System.out.printf("a: %d, b: %d, max:%d",
											i, j, max);
									checkforPrimes(i, j, max);
								}
								break;
							}
							else	{
								break;
							}
						}
					}
					else	{
						break;
					}
				}
			}
		}

		System.out.println(max);

		return max;
	}

	public int equation(int x, int a, int b) {
		return (x * x + a * x + b);
	}

	public boolean checkPrime(int p) {
		for (int i = 2; i <= Math.sqrt(Math.abs(p)); i++) {
			if (p % i == 0) {
				return false;
			}
		}

		return true;
	}

	public boolean checkforPrimes(int a, int b, int max) {
		int num = 0;
		for (int i = 0; i <= max; i++) {
			if (checkPrime(equation(i, a, b))) {
				num++;
			} else {
				System.out.printf("Checked: %d\n", num);
				return false;
			}
		}

		System.out.printf("Checked: %d\n", num);

		return true;
	}
}
