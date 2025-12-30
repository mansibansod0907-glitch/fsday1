package com.inheritence;

public class PlayerApp{
	
	public static void main(String[] args) {
		FootBall fb = new FootBall("Arsh", 30, "Male", 2000, "India", "Tiger", 3,2);
		System.out.println(fb.getName());
		System.out.println(fb.getAge());
		System.out.println(fb.getGender());
		System.out.println(fb.getBestscore());
		System.out.println(fb.getCountry());
		System.out.println(fb.getTeam());
		System.out.println(fb.getGoals());
		System.out.println(fb.getAssist());
	}
}

