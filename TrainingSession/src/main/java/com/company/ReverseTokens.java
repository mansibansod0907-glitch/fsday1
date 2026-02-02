package com.company;

import java.util.StringTokenizer;

public class ReverseTokens {

	public static void main(String[] args) {
		String s = "I am Iron Man";
		System.out.println("Original: " + s);

		StringTokenizer st = new StringTokenizer(s," ");
		char c[] = s.toCharArray();
		
		for(int i=c.length-1; i>=0; i--) {
			System.out.print(c[i]);
		}
		System.out.println();
		
		while(st.hasMoreElements()) {
			String word = st.nextToken();
			for(int i = word.length()-1; i>=0; i--) {
				System.out.print(word.charAt(i));
			}
			System.out.print(" ");
		}
		System.out.println();

		StringTokenizer st2 = new StringTokenizer(s, " ");
		String[] words = new String[st2.countTokens()];
        int index = 0;
		
		while(st2.hasMoreTokens()) {
			words[index++] = st2.nextToken();
		}
			
		for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
			}
	}
	


