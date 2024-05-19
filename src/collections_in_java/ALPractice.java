package collections_in_java;

import java.util.ArrayList;
import java.util.Scanner;

public class ALPractice {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		System.out.println("Enter the number of names you want to store:");
		Scanner sc=new Scanner(System.in);
		Integer numberofNames=sc.nextInt();
		System.out.println("Enter Names to store into the database:");
		for(int i=0;i<=numberofNames;i++) {
			String name=sc.nextLine();
			al.add(name);
		}
		for (String string : al) {
			System.out.println(string);
		}
		
		
		
	}

}
