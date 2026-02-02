package com.company;

import java.util.StringTokenizer;

public class Tokenizer1 {

	public static void main(String[] args) {
		String s = "Department of Computer Technology";
		StringTokenizer st = new StringTokenizer(s," ");
		while(st.hasMoreTokens() == true) {
			System.out.println(st.nextToken());
		}
		
		

	}

}
