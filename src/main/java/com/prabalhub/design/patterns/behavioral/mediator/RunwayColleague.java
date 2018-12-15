package com.prabalhub.design.patterns.behavioral.mediator;

public class RunwayColleague implements Command {

	private ATCMediator atcMediator;
	
	public RunwayColleague(final ATCMediator atcMediator) {
		this.atcMediator = atcMediator;
	}
	
	@Override
	public void land() {
		System.out.println("Landing permission granted."); 
        atcMediator.setLandingStatus(true); 
	}

}
