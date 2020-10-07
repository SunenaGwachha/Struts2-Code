package org.test.java.actions;

import org.test.java.service.TutorialFinderService;

public class TutorialAction {
		
	public String bestTutorialsSite;
	
	public String language;
	
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public String execute() {		
		
		//TutorialFinderService TurorialFinderService =new TutorialFinderService();
		//System.out.println(getLanguage());
	//	setBestTutorialsSite(TurorialFinderService.getBestTutorialSite(getLanguage()));
		//System.out.println("bestTutorialsSite");
		return "success";
	}
	
	public String someOthermethod() {		
		System.out.println("Some other method executed");
		return "success";
	}
	
	public String getBestTutorialsSite() {
		return bestTutorialsSite;
	}
	public void setBestTutorialsSite(String bestTutorialsSite) {
		this.bestTutorialsSite = bestTutorialsSite;
	}
	
	/*
	public String execute() {
		
		TutorialFinderService TurorialFinderService =new TutorialFinderService();
		String bestTutorialsSite=TurorialFinderService.getBestTutorialSite();
		System.out.println("bestTutorialsSite");
		return "success";
	}*/
	
	/*
	public String execute() {
		System.out.println("Hello from execute");
		return "success";
		
		//return "failure";		
	}
	*/
}
