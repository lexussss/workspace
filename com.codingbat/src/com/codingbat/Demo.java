package com.codingbat;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		/*
		 * Problem 8
		 * 
		 * The four adjacent digits in the 1000-digit number that have the
		 * greatest product are 9 × 9 × 8 × 9 = 5832.
		 * 
		 * 73167176531330624919225119674426574742355349194934
		 * 96983520312774506326239578318016984801869478851843
		 * 85861560789112949495459501737958331952853208805511
		 * 12540698747158523863050715693290963295227443043557
		 * 66896648950445244523161731856403098711121722383113
		 * 62229893423380308135336276614282806444486645238749
		 * 30358907296290491560440772390713810515859307960866
		 * 70172427121883998797908792274921901699720888093776
		 * 65727333001053367881220235421809751254540594752243
		 * 52584907711670556013604839586446706324415722155397
		 * 53697817977846174064955149290862569321978468622482
		 * 83972241375657056057490261407972968652414535100474
		 * 82166370484403199890008895243450658541227588666881
		 * 16427171479924442928230863465674813919123162824586
		 * 17866458359124566529476545682848912883142607690042
		 * 24219022671055626321111109370544217506941658960408
		 * 07198403850962455444362981230987879927244284909188
		 * 84580156166097919133875499200524063689912560717606
		 * 05886116467109405077541002256983155200055935729725
		 * 71636269561882670428252483600823257530420752963450
		 * 
		 * Find the thirteen adjacent digits in the 1000-digit number that have
		 * the greatest product. What is the value of this product?
		 */

		List<Number> number = new ArrayList<>();

		String a = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
		int maxValue = 0;
		int currentMaxValue = 1;

		for (int k = 0; k < 987; k++) {
			currentMaxValue = 1;
			for (int i = k; i <= (k + 13); i++) {
//				System.out.println(a.charAt(i));
				int currentInt = a.charAt(i);
				currentMaxValue = currentMaxValue * (currentInt - 48);
			}
			if (currentMaxValue > maxValue) {
				System.out.println("currmax = " + currentMaxValue);
				System.out.println("max = " + maxValue);
				maxValue = currentMaxValue;
			}
		}

		System.out.println(maxValue);

		/*
		 * Problem 6
		 * 
		 * Find the difference between the sum of the squares of the first one
		 * hundred natural numbers and the square of the sum.
		 */

		// int sumOfSquares = 0;
		// int squareOfSum = 0;
		//
		// for (int i = 1; i<=100; i++){
		// sumOfSquares = sumOfSquares + (i*i);
		// squareOfSum = squareOfSum + i;
		// }
		//
		// squareOfSum = squareOfSum*squareOfSum;
		//
		// int difference = squareOfSum - sumOfSquares;
		// System.out.println(sumOfSquares);
		// System.out.println(squareOfSum);
		// System.out.println(difference);

		/*
		 * Problem 5 2520 is the smallest number that can be divided by each of
		 * the numbers from 1 to 10 without any remainder. What is the smallest
		 * positive number that is evenly divisible by all of the numbers from 1
		 * to 20?
		 */

		// for (int i = 20; i <= 1000000000; i++) {
		// if (i % 1 == 0 && i % 2 == 0 && i % 3 == 0 && i % 4 == 0
		// && i % 5 == 0 && i % 6 == 0 && i % 7 == 0 && i % 8 == 0
		// && i % 9 == 0 && i % 10 == 0 && i % 11 == 0 && i % 12 == 0
		// && i % 13 == 0 && i % 14 == 0 && i % 15 == 0 && i % 16 == 0
		// && i % 17 == 0 && i % 18 == 0 && i % 19 == 0 && i % 20 == 0) {
		// System.out.println(i);
		// break;
		// }
		// }

		// // Problem 4
		// String original = "";
		// String reverse = "";
		//
		// int a;
		// int b;
		//
		// int a1 = 0;
		// int b1 = 0;
		//
		//
		// for (a = 999; a >= 0; a--) {
		// for (b = 999; b >= 0; b--) {
		// Integer multiplyAandB = (a * b);
		// original = multiplyAandB.toString();
		// reverse = "";
		// for (int i = original.length() - 1; i >= 0; i--)
		// reverse = reverse + original.charAt(i);
		//
		// if (original.equals(reverse)) {
		// // System.out.println("Entered string is a palindrome.");
		//
		// if(a*b > a1*b1) {
		// a1 = a;
		// b1 = b;
		// // System.out.println(a1);
		// // System.out.println(b1);
		// }
		// break;
		// }
		// }
		// }
		// System.out.println(a1);
		// System.out.println(b1);

		// //Problem 3
		// long number = 600851475143L;
		// int primeFactor = 0;
		// int i = 2;
		//
		// while (i <= number) {
		// if (number % i == 0) {
		// number = number / i;
		// if (i > primeFactor) primeFactor = i;
		// } else
		// i++;
		// }
		// System.out.println(primeFactor);
	}
}
