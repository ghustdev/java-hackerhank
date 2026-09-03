package introdutory;

import java.util.Scanner;

public class Exe7 {
    private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int T = 1;
		T = sc.nextInt();
		sc.nextLine();
		
		while (T > 0) {
			solve();
			T--;

		}

        sc.close();
	}
	
	

    
	private  static void solve() {
        try {
            Integer n = sc.nextInt();
            sc.nextLine();
            String convert = n.toString();

            System.out.println("Good job");
        } catch (Exception e) {
            System.out.println("Wrong answer");
        }
	}
}
