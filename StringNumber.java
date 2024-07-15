package maratona;

import java.util.Scanner;

public class StringNumber {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		String str = sca.next();
		int valor = Integer.parseInt(str);
		
		System.out.println(valor);
		sca.close();
	}

}
