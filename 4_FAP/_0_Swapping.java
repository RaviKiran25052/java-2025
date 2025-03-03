public class _0_Swapping {
	public static void main(String[] args) {

		// Logic - 1 (3rd variable)
		int a = 10;
		int b = 20;
		System.out.printf("\nBefore Swapping a: %d, b: %d.\n", a, b);

		int t = a;
		a = b;
		b = t;
		System.out.printf("After Swapping a: %d, b: %d.\n", a, b);

		// Logic - 2 (using + and -)
		int i = 30;
		int j = 40;
		System.out.printf("\nBefore Swapping i: %d, j: %d.\n", i, j);

		i = i + j;
		j = i - j;
		i = i - j;
		System.out.printf("After Swapping i: %d, j: %d.\n", i, j);

		// Logic - 3 (using * and /)
		int m = 50;
		int n = 60;
		System.out.printf("\nBefore Swapping m: %d, n: %d.\n", m, n);

		m = m * n;
		n = m / n;
		m = m / n;
		System.out.printf("After Swapping m: %d, n: %d.\n", m, n);

		// Logic - 4 (using XOR [^])
		int p = 5;
		int q = 10;
		System.out.printf("\nBefore Swapping p: %d, q: %d.\n", p, q);

		p = p ^ q;
		q = p ^ q;
		p = p ^ q;
		System.out.printf("After Swapping p: %d, q: %d.\n", p, q);

		// Logic - 5 (brackets)
		int x = 21;
		int y = 12;
		System.out.printf("\nBefore Swapping x: %d, y: %d.\n", x, y);

		y = x + y - (x = y);
		System.out.printf("After Swapping x: %d, y: %d.\n", x, y);
	}
}
