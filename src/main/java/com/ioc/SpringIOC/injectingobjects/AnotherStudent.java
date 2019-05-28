package com.ioc.SpringIOC.injectingobjects;

public class AnotherStudent {
	private Examcheat cheat;

	private AnotherStudent(Examcheat cheat){
		this.cheat=cheat;
	}

	public void cheatAction(){
		System.out.println("$$$$");
		System.out.println("You can't see me");
		cheat.cheat();
	}
}
