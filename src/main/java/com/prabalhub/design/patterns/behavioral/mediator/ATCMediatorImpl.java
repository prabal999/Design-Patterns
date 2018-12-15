package com.prabalhub.design.patterns.behavioral.mediator;

public class ATCMediatorImpl implements ATCMediator {
	private RunwayColleague runway;
	private FlightColleague flight;
	private boolean landing;
	@Override
	public void registerRunway(RunwayColleague runway) {
		this.runway = runway;
	}

	@Override
	public void registerFlight(FlightColleague flight) {
		this.flight = flight;
	}

	@Override
	public boolean landingAllowed() {
		return landing;
	}

	@Override
	public void setLandingStatus(boolean status) {
		this.landing = status;
	}

}
