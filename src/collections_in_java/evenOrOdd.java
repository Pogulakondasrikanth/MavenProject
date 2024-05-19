package collections_in_java;

import java.util.Scanner;

public class evenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number to check even or odd");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0) {
		System.out.println("The given number is even:");
		}else
			System.out.println("The given number is odd:");
		}

}
