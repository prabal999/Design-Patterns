package com.prabalhub.design.patterns.behavioral.mediator;

public interface ATCMediator {
	
	public void registerRunway(RunwayColleague runway); 
	  
    public void registerFlight(FlightColleague flight); 
  
    public boolean landingAllowed(); 
  
    public void setLandingStatus(boolean status); 
    
}
