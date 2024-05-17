package practice;

import java.util.Scanner;

public class CheckCharIsAlphabet {
public static void main(String[] args) {
	System.out.println("Enter Character to check it is a alphabet or not:");
	Scanner sc=new Scanner(System.in);
	char c=sc.next().charAt(0);
	if(c>='a' && c<='z'|| c>='A' && c<='Z') {
		System.out.println("The given character is a alphabet:");
	}else{
		System.out.println("The given character is not a alphabet");
	}
}
}
