package com.company;

import java.util.StringTokenizer;

public class ToCountString {

	public static void main(String[] args) {
		String s = "Department of Computer Technology";
		StringTokenizer st = new StringTokenizer(s," ");
		int count = st.countTokens();
			System.out.println(count);
		
		

	}

}
