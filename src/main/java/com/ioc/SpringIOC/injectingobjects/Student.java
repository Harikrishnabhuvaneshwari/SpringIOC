package com.ioc.SpringIOC.injectingobjects;

public class Student {
	
	private int studentId;
	private Examcheat cheat;
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Examcheat getCheat() {
		return cheat;
	}

	public void setCheat(Examcheat cheat) {
		this.cheat = cheat;
	}

	public void cheatAction(){
		System.out.println("---------");
		System.out.println("My Id is "+studentId+" and I'm a culprit");
		cheat.cheat();
	}
	
}
