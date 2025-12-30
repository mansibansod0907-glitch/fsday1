package com.inheritence;

class FootBall extends Player{

	int goals;
	int assist;
	public FootBall(String name, int age, String gender, int bestscore,  String country, String team, int goals,int assist  ) {
		super(name, age, gender, bestscore, country, team);
		this.goals = goals;
		this.assist = assist;
	}
	 
	 public String getName() {
			return name; 
		}
		
		public int getAge() {
			return age; 
		}
		public String getGender() {
			return gender; 
		}
		public int getBestscore() {
			return bestscore; 
		}
		public String getCountry() {
			return country; 
		}
		public String getTeam() {
			return team; 
		
		}
		public int getGoals() {
			return goals; 
		}
		public int getAssist() {
			return assist; 
		}
}