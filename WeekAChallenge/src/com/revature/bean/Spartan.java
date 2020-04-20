package com.revature.bean;

public class Spartan {
	private String name;
	private String rank;
	private int spartanTag;
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
	public int getSpartanTag() {
		return spartanTag;
	}
	public void setSpartanTag(int spartanTag) {
		this.spartanTag = spartanTag;
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
		return "Spartan [name=" + name + ", rank=" + rank + ", spartanTag=" + spartanTag + ", age=" + age + ", weight="
				+ weight + "]";
	}
	public void displayinfo(int choose)
	{
		if(choose == 2)
		{
			System.out.println("You are a Spartan");
		}
	}
	public void displayinfo(String name, String rank) 
	{
		System.out.println("Name: " + name);
		System.out.println("Rank: " + rank);
	}
	public void displayinfo(int age, int weight,int tag)
	{
		System.out.println("Age: " + age);
		System.out.println("Weight: " + weight);
		System.out.println("Tag: " + tag);
	}

}
