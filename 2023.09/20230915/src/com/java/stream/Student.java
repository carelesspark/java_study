package com.java.stream;

public class Student implements Comparable<Student>{
	String name;
	int ban;
	int totalScore;
	
	public Student(String name, int ban, int totalScore) {
		super();
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", ban=" + ban + ", totalScore=" + totalScore + "]";
	}

	public String getName() {
		return name;
	}

	public int getBan() {
		return ban;
	}

	public int getTotalScore() {
		return totalScore;
	}

	@Override
	public int compareTo(Student s) {
		return s.totalScore - this.totalScore;		// 성적으로 내림차순 (this가 뒤로오면 내림, 앞에 오면 오름)
	}

	
	
}
