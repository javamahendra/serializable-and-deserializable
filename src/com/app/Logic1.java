package com.app;

import java.util.Arrays;

public class Logic1 {

	public static void main(String[] args) {

		int arr[] = { 0, 1, 1, 1, 1, 0, 1 };

		char[] ch = new char[arr.length - 1];

		int i = 0;

		Arrays.sort(arr);
		for (int arr1 : arr) {

			i = i + arr1;
		}

		int zeros = arr.length - i;
		int ones = arr.length - zeros;
		System.out.println("zero count : " + zeros);
		System.out.println("ones count :" + ones);
	}

}
