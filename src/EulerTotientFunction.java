public class EulerTotientFunction {

	// phi(n) = numbers less than n that are coprime to n
	public static int[] tot = new int[1_000_001];

	public static void calcPhiOptimized() {
		for (int i = 0; i <= 1_000_000; i++) {
			tot[i] = i;
		}
		tot[2] = 1;
		for (int i = 2; i << 1 <= 1_000_000; i++) {
			tot[i << 1] >>= 1;
		}
		for (int i = 3; i < 1_000_000; i++) {
			if (tot[i] == i) {
				tot[i]--;
				for (int j = i+i; j <= 1_000_000; j+=i) {
					tot[j] /= i;
					tot[j] *= i - 1;
				}
			}
		}
	}

	public static void calcPhi() {
		for (int i = 0; i <= 1_000_000; i++) {
			tot[i] = i;
		}
		for (int i = 2; i < 1_000_000; i++) {
			if (tot[i] == i) {
				tot[i]--;
				for (int j = i+i; j <= 1_000_000; j+=i) {
					tot[j] /= i;
					tot[j] *= i - 1;
				}
			}
		}
	}
}