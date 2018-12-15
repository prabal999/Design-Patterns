package com.prabalhub.design.patterns.behavioral.mediator;

public class FlightColleague implements Command {
	private ATCMediator atcMediator;

	public FlightColleague(ATCMediator atcMediator) {
		this.atcMediator = atcMediator;
	}

	@Override
	public void land() {
		if (atcMediator.landingAllowed()) {
			atcMediator.setLandingStatus(false);
			System.out.println("Successfully Landed.");
			atcMediator.setLandingStatus(true);
		} else {
			System.out.println("Waiting for landing.");
		}

	}

}
