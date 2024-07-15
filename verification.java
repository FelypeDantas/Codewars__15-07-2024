package maratona;

import java.util.Scanner;

public class verification {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		int n = sca.nextInt();
		int m = sca.nextInt();
		
		if(n > 0 && m > 0) {
			System.out.println(n * m);
		} else {
			System.out.println(0);
		}
		sca.close();

	}

}
