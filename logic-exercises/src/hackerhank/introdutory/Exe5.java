package introdutory;

import java.io.IOException;
import java.util.Scanner;

public class Exe5 {
    private static final Scanner sc = new Scanner(System.in);
	private static double inf = 9.22 * Math.pow(10, 18);

	public static void main(String[] args) throws IOException {
		int T = 1;
		// T = sc.nextInt();
		// sc.nextLine();
		
		while (T > 0) {
			solve();
			T--;
			// System.out.println(-(inf-1));
		}

		sc.close();
    }


	private static void solve() {
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
				System.out.println(x+" can be fitted in:");
				if(x>=-128 && x<=127)System.out.println("* byte");
				// short -> 2 bytes
				if(x>=-32_768 && x<=32_767)System.out.println("* short");
				// int -> 4 bytes
				if(x>=-2_147_483_648 && x<=2_147_483_647)System.out.println("* int");
				// long -> 8 bytes
				if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)System.out.println("* long"); 
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
	} 
}
