package com.company;
import java.util.Scanner;
public class QueArmStrongNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n= sc.nextInt();
		int temp = n;
		int digits = 0;

        // Step 1: Count number of digits
        while (temp > 0) {
            digits++;
            temp = temp/10;
        }

        temp = n;
        int res = 0; //Stores the sum of digit powers.

        // Step 2: Calculate sum of digits raised to power of digit count
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 1; i <= digits; i++) {
                power = power * digit;
            }

            res = res + power;
            temp = temp / 10;
        }
		if(res == n) {
			System.out.println("Number is armstrong");
		}
		else {
			System.out.println("Number is not armstrong");
		}
		
		sc.close();
		
	}

}
