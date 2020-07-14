package com.classofmay;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("please enter the letter: ");
		char letter = input.next().charAt(0);
		
		switch (letter){
		case 'A':
			System.out.println("you entered a vaule");
			break;
		case 'E':
			System.out.println("you entered a vaule");
			break;
		case 'I':
			System.out.println("you entered a vaule");
			break;
		case 'O':
			System.out.println("you entered a vaule");
			break;
		case 'U':
			System.out.println("you entered a vaule");
			break;
		case 'a':
			System.out.println("you entered a vaule");
			break;
		case 'e':
			System.out.println("you entered a vaule");
			break;
		case 'i':
			System.out.println("you entered a vaule");
			break;
		case 'o':
			System.out.println("you entered a vaule");
			break;
		case 'u':
			System.out.println("you entered a vaule");
			break;
			default:
				System.out.println("you entered a consonant");
		}

	}

}
