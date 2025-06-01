package com.programs;

public class UntillItBecomesSingleDigit {

	public static void main(String[] args) {

		int no = 98765;
		int total = no;
		int rem = 0;

		while (total > 9) {

			no = total;
			total = 0;

			while (no > 0) {
				rem = no % 10;
				total = rem + total;
				no = no / 10;
			}
		}
		System.out.println("Untill it becomes a Single Digit: " + total);
	}
}