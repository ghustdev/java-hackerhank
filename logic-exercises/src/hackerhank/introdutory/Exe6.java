package introdutory;

import java.util.Scanner;

public class Exe6 {
	private static final Scanner sc = new Scanner(System.in);

	static long B, H;
	
	public static void main(String[] args) {
		int T = 1;
		// T = scanner.nextInt();
		// scanner.nextLine();
		
		while (T > 0) {
			solve();
			T--;
		}
	}
	
	
	private  static void solve() {
		B = sc.nextLong();
		H = sc.nextLong();

		if (B <= 0 || H <= 0) System.out.println("java.lang.Exception: Breadth and height must be positive");
		else System.out.println(B*H);
	}
}
