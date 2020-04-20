package com.revature.bean;

public class UNSCSoldier {
	private String name;
	private String rank;
	private int age;
	private int weight;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

	
	@Override
	public String toString() {
		return "UNSCSoldier [name=" + name + ", rank=" + rank + ", age=" + age + ", weight=" + weight + ", height="
				+  "]";
	}
	
	


	public Integer AgeInteger(int age) {
		return age;
		
	}
	public void displayinfo(int choose)
	{
		if(choose == 1)
		{
			System.out.println("You are a UNSC Soldier");
		}
	}
	
	public void displayinfo(String name, String rank) 
	{
		System.out.println("Name: " + name);
		System.out.println("Rank: " + rank);
	}
	public void displayinfo(int age, int weight)
	{
		System.out.println("Age: " + age);
		System.out.println("Weight: " + weight);
	}
}