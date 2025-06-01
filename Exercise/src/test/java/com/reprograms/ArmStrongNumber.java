package com.reprograms;

public class ArmStrongNumber {

	public static void main(String[] args) {

		int no = 153;
		int temp = no;
		int r, sum = 0;

		while (no > 0) {
			r = no % 10;
			no = no / 10;
			sum = sum + r * r * r;
		}
		if (temp == sum) {
			System.out.println("ArmStrong Number");
		} else {
			System.out.println("Not an ArmStrong Number");
		}
	}
}