package com.classofmay;

public class loopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 2 3 4 5

		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}

		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5

		System.out.println();
		System.out.println();

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}

		System.out.println();
		System.out.println();

		// 1
		// 1 2
		// 1 2 3
		// 1 2 3 4
		// 1 2 3 4 5

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}

		System.out.println();
		System.out.println();

		// *
		// **
		// ***
		// ****
		// *****

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*" + "");
			}

			System.out.println();
		}

		// ****
		// ****
		// ****
		// ****
		// ****

		System.out.println();
		System.out.println();

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				System.out.print("*" + " ");
			}

			System.out.println();
		}

		// *****
		// *   *
		// *   *
		// *****
		System.out.println();
		System.out.println();

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {

				if (i == 1 || i == 5 || j == 1 || j == 5) {
					System.out.print("*" + " ");
				} else

					System.out.print(" " + " ");
			}
			System.out.println();
		}

		
		
		
		
		System.out.println();
		System.out.println();
		
		// 1
		// 1 2
		// 1 2 3
		// 1 2 3 4
		// 1 2 3 4 5

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				if(j<=i) {
				System.out.print(j + " ");
			}
				else System.out.print(" ");
			}

			System.out.println();
		}
	
		}
	}



