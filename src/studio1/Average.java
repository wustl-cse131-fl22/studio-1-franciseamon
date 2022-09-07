package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is n1?");
		int n1 = in.nextInt();
		System.out.println("What is n2?");
		int n2 = in.nextInt();
		System.out.println(((double) n1 + (double) n2)/2);
	}

}
