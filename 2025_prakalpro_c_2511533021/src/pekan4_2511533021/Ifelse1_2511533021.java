package pekan4_2511533021;

import java.util.Scanner;

public class Ifelse1_2511533021 {

	public static void main(String[] args) {
		double IPK;
		Scanner input=new Scanner(System.in);
		System.out.print("input IPK anda = ");
		IPK=input.nextDouble ();
		input.close();
		if (IPK>2.75) {
			System.out.println("Anda Lulus sangat memuaskan dengan IPK " + IPK);
		} else {System.out.println("Anda tidak lulus ");
		}

	}

}
