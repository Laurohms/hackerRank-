package com.lauros;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String digitos = "1, 2 , 5, 7";
		int[] numes = Arrays.stream(digitos.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();

		System.out.println(Arrays.toString(numes));
	}
}